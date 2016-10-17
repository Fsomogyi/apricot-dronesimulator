package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.behaviour.Pause;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

public class PauseEvent extends InstructionEvent {
	private static Logger logger = Logger.getLogger(PauseEvent.class);
	
	private Pause instruction;
	
	public PauseEvent(Model owner, String name, boolean showInTrace, Pause instruction) {
		super(owner, name, showInTrace);
		
		this.instruction = instruction;
		
		if (this.instruction != null) {
			this.batteryDrainAmount = 0.5f * instruction.getDuration();
		} else {
			this.batteryDrainAmount = 0.25f;
		}
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {		
		super.eventRoutine(who);
		
		if (this.shouldInterrupt) {
			logger.info(who.getName() + " is idle and got an interrupt");
			return;
		}
		
		logger.info(who.getName() + " pausing for " + instruction.getDuration());
		
		this.scheduleNextInstructionEvent(who, new TimeSpan(this.instruction.getDuration()));
	}

}
