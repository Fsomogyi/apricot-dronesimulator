package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

public class PlaceObjectEvent extends InstructionEvent{
	private static Logger logger = Logger.getLogger(PlaceObjectEvent.class);
	
	public PlaceObjectEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);

		this.batteryDrainAmount = 5.0f;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		super.eventRoutine(who);
		
		if (this.shouldInterrupt) 
			return;

		if (who.getPayload() != null) {
			logger.info(who.getName() + " is placing object '" + who.getPayload() + "'");
		} else {
			logger.info(who.getName() + " is trying to place its payload, but it is carrying nothing!");
		}

		who.setPayload(null);
		
		this.scheduleNextInstructionEvent(who);
	}

}
