package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.List;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruct;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneInstructMessageEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.MathHelper;

public class SendInstructionEvent extends InstructionEvent {
	private Instruct instruction;
	private static Logger logger = Logger.getLogger(SendInstructionEvent.class);
	private int messagesDelivered = 0;
	private List<InstructionEvent> nextEvents;

	public SendInstructionEvent(Model owner, String name, boolean showInTrace, Instruct instruction, List<InstructionEvent> nextEvents, 
			DroneEntity sender) {
		super(owner, name, showInTrace);
		
		this.instruction = instruction;
		this.nextEvents = nextEvents;
		
		this.batteryDrainAmount = 1.0f + sender.drone.getCommunicationRange() / 20.0f;
	}
	
	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		super.eventRoutine(who);
		
		if (this.shouldInterrupt) 
			return;
		
		logger.info("Instruction message event occured");
		
		DroneInstructMessageEntity message = new DroneInstructMessageEntity(this.model, "Drone Instruction Message Entity " + this.instruction, false, this.nextEvents);
		
		DronesSimulationModel sim = (DronesSimulationModel) this.getModel();
		
		for (DroneEntity de : sim.getActiveDrones()) {
			if (de != who &&
					MathHelper.centerDistance(who, de) <= who.get().getCommunicationRange()) {
				deliver(who, de, message);
			}
		}
		
		sim.getDroppedMessageCount().update(sim.getActiveDrones().size() - 1 - this.messagesDelivered);
		
		logger.info("Instruct message has reached " + this.messagesDelivered + " drones out of " + (sim.getActiveDrones().size() - 1));
		
		this.scheduleNextInstructionEvent(who);
	}
	
	private void deliver(DroneEntity sender, DroneEntity target, DroneInstructMessageEntity message) {
		logger.info("Instruction Message delivery: " + sender + " -> " + target.get());
		MessageDeliveredEvent delivery = new MessageDeliveredEvent(this.getModel(), "Instruction Message delivered from " + sender.get() + " to " + target.get().getName(), false);
		DronesSimulationModel sim = (DronesSimulationModel) this.getModel();
		this.messagesDelivered++;
		delivery.schedule(target, message, new TimeSpan(sim.getMessageDeliveryTime().sample().floatValue()));
	}
}
