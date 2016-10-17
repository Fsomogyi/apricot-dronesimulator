package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.behaviour.Pause;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

public class IdleEvent extends InstructionEvent {
	private static Logger logger = Logger.getLogger(IdleEvent.class);

	public IdleEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		
		this.nextInstruction = this;
		
		this.batteryDrainAmount = 1.5f;
	}
	
	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		super.eventRoutine(who);
		
		if (this.shouldInterrupt) {
			logger.info(who.getName() + " is idle and got an interrupt");
			return;
		}
		
		logger.debug(who.getName() + " is idle");
		
		this.scheduleNextInstructionEvent(who, new TimeSpan(3.0f));
	}


}
