package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.behaviour.MoveTo;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.Vec3f;

public class MoveStartedEvent extends InstructionEvent {
	private MoveTo instruction;
	private DronesSimulationModel model;
	private static Logger logger = Logger.getLogger(MoveStartedEvent.class);

	public MoveStartedEvent(Model owner, String name, boolean showInTrace, MoveTo instruction) {
		super(owner, name, showInTrace);

		model = (DronesSimulationModel) owner;
		this.instruction = instruction;
		this.batteryDrainAmount = 0.0f;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {	
		super.eventRoutine(who);

		if (this.shouldInterrupt) 
			return;

		FieldObject target = instruction.getFieldObject();

		// calculate move speed by using the model's speed modifier rng
		// move speed is in the range of the drone's min-max speed
		float droneMinSpeed = who.get().getMinSpeed();
		float droneMaxSpeed = who.get().getMaxSpeed();
		float droneSpeedModifier = model.getDroneSpeedModifier().sample().floatValue();
		float moveSpeed = droneMinSpeed + droneSpeedModifier * (droneMaxSpeed - droneMinSpeed);

		MoveByDeltaEvent startMoving = new MoveByDeltaEvent(this.getModel(), who.getName() + " is moving", true, target, moveSpeed);
		startMoving.setNextInstruction(nextInstruction);
		startMoving.schedule(who);

		logger.info(who.getName() + " started moving to "
				+ target.getName()
				+ " [" + String.format("%.2f", target.getX()) + ", "
				+ String.format("%.2f", target.getY()) + ", "
				+ String.format("%.2f", target.getZ()) + "]"
				+ " with speed " + String.format("%.2f", moveSpeed));

		logger.info("Currently at position [" + String.format("%.2f", who.get().getX()) + ", "
				+ String.format("%.2f", who.get().getY()) + ", "
				+ String.format("%.2f", who.get().getZ()) + "]");
	}
}
