package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

public class MoveFinishedEvent extends InstructionEvent {

	private FieldObject target;
	private static Logger logger = Logger.getLogger(MoveFinishedEvent.class);

	public MoveFinishedEvent(Model owner, String name, boolean showInTrace, FieldObject target) {
		super(owner, name, showInTrace);

		this.target = target;
		this.batteryDrainAmount = 0.0f;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {	
		super.eventRoutine(who);

		if (this.shouldInterrupt) 
			return;

		this.scheduleNextInstructionEvent(who);

		logger.info(who.getName() + " arrived at location "
				+ target.getName()
				+ " [" + String.format("%.2f", who.get().getX()) + ", "
				+ String.format("%.2f", who.get().getY()) + ", "
				+ String.format("%.2f", who.get().getZ()) + "]");
	}
}
