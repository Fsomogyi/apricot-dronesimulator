package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.List;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneInstructMessageEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneMessageEntity;

public class InstructionEvent extends Event<DroneEntity> {
	protected DronesSimulationModel model;
	protected InstructionEvent nextInstruction;
	private static Logger logger = Logger.getLogger(InstructionEvent.class);
	protected float batteryDrainAmount = 2.0f;

	protected boolean shouldInterrupt = false;

	public InstructionEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);

		this.model = (DronesSimulationModel) owner;
	}

	public void setNextInstruction(InstructionEvent nextInstruction) {
		this.nextInstruction = nextInstruction;
	}

	protected void drainBattery(DroneEntity who) {
		who.drone.getBattery().setRemainingLifeTime(
				who.drone.getBattery().getRemainingLifeTime() - this.batteryDrainAmount
		);
	}
	
	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		shouldInterrupt = false;
		
		drainBattery(who);
		
		logger.debug(who + " remaining battery life: " + who.drone.getBattery().getRemainingLifeTime());
		logger.debug(who + " remaining battery charge: " + who.getDroneCharge());
		
		if (who.getDroneCharge() <= 0.0) {
			new DroneBatteryDepletedEvent(model, "Drone " + who.getName() + " depleted", true).schedule(who);
			shouldInterrupt = true;
			return;
		}

		if (!who.getMessageQueue().isEmpty() && who.behaviour.isCanBeInterrupted()) {
			logger.info(who + " Message queue has " + who.getMessageQueue().size() + " element(s)");
			DroneInstructMessageEntity elem = null;
			for (DroneMessageEntity ent : who.getMessageQueue()) {
				if (ent.getType().equals(DroneInstructMessageEntity.TYPE_DESCRIPTION)) {
					elem = (DroneInstructMessageEntity) ent; // we want the last one
				}
			}
			if (elem != null) {
				who.getMessageQueue().remove(elem);
				List<InstructionEvent> _list = elem.getInstructionEvents();
				_list.get(_list.size() - 1).nextInstruction = this;
				logger.info("Scheduling first instruction from Instruct message: " + _list.get(0));
				_list.get(0).schedule(who);
	
				shouldInterrupt = true;
			}
		} else {
			logger.debug(who + " Message queue is empty");
		}
		
		// Only execute this if we did not get an interrupt
		if (!shouldInterrupt)
			model.getExecutedInstructionCount().update();
	}
	
	
	public void scheduleNextInstructionEvent(DroneEntity who) {
		if (who.isDepleted()) {
			this.nextInstruction = null;
			this.shouldInterrupt = true;
			return;
		}
		
		if (this.nextInstruction != null) {
			this.nextInstruction.schedule(who, new TimeSpan(this.getInstructionTimeCost(who)));
		} else {
			logger.info(who.getName() + " finished its program and is now idle");
			this.nextInstruction = new IdleEvent(this.getModel(), "Idle event", true);
			this.nextInstruction.schedule(who);
		}
	}
	
	public void scheduleNextInstructionEvent(DroneEntity who, TimeSpan ts) {
		if (who.isDepleted()) {
			this.nextInstruction = null;
			this.shouldInterrupt = true;
			return;
		}
		
		if (this.nextInstruction != null) {
			this.nextInstruction.schedule(who, ts);
		} else {
			logger.info(who.getName() + " finished its program and is now idle");
			this.nextInstruction = new IdleEvent(this.getModel(), "Idle event", true);
			this.nextInstruction.schedule(who);
		}
	}
	
	protected float getInstructionTimeCost(DroneEntity forWho) {
		return 0.5f + 75 * (1.0f / forWho.get().getCpuFrequency());
	}
}
