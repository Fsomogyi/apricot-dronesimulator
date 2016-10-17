package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.List;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

public class WaitForMessageTimedOutEvent extends Event<DroneEntity> {
	private WaitForMessageEvent initiator;
	private static Logger logger = Logger.getLogger(WaitForMessageTimedOutEvent.class);
	private List<InstructionEvent> whenLostInstructions;
	
	public WaitForMessageTimedOutEvent(Model owner, String name, boolean showInTrace, WaitForMessageEvent initiator, 
			List<InstructionEvent> whenLostInstructions) {
		super(owner, name, showInTrace);
		
		this.initiator = initiator;
		this.whenLostInstructions = whenLostInstructions;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		logger.info("Message delivery timeout occured");
		this.initiator.stop();

		logger.info("Scheduling whenLost branch of WaitForMessage " + this.initiator);
		if (whenLostInstructions != null && !whenLostInstructions.isEmpty()) {
			whenLostInstructions.get(0).schedule(who);
			whenLostInstructions.get(whenLostInstructions.size() - 1).nextInstruction = initiator.nextInstruction;	// TODO: not needed?
		}
	}

}
