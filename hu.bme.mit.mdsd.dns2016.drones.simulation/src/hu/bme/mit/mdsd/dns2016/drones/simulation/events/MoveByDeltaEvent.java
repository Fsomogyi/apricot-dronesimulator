package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.IncQueryHelper;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.Vec3f;

public class MoveByDeltaEvent extends InstructionEvent {

	private FieldObject target;
	private float moveSpeed;
	private final float delta = 0.1f; // delta time step of move TODO: should be around 0.01f
	private static Logger logger = Logger.getLogger(MoveByDeltaEvent.class);

	public MoveByDeltaEvent(Model owner, String name, boolean showInTrace, FieldObject target, float moveSpeed) {
		super(owner, name, showInTrace);

		this.target = target;
		this.moveSpeed = moveSpeed;
		
		this.batteryDrainAmount = moveSpeed * delta;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {	
		super.eventRoutine(who);

		if (this.shouldInterrupt) 
			return;

		// modify target location so the drone sits right on top of the target object (factoring in payload too)
		float targetCorrection = target.getHeight() / 2  + who.drone.getHeight() / 2;
		if (who.hasPayload()) {
			targetCorrection += who.getPayload().movableObject.getHeight();
		}
		Vec3f correctedTargetLocation = new Vec3f(target.getX(), target.getY() + targetCorrection, target.getZ());
		Vec3f droneToTargetUnitVector = Vec3f.getDirectionVector(who.getDroneLocation(), correctedTargetLocation);
		Vec3f moveVector = Vec3f.scaleVector(droneToTargetUnitVector, moveSpeed * delta);
		Vec3f interimTarget = Vec3f.addVectors(who.getDroneLocation(), moveVector);

		float droneToInterimDist = who.getDroneLocation().getDistance(interimTarget);
		float droneToTargetDist = who.getDroneLocation().getDistance(correctedTargetLocation);
		if (droneToInterimDist < droneToTargetDist) {
			who.move(interimTarget);
			collisionDetection(who);
			if (!who.isCrashed()) {
				this.schedule(who, new TimeSpan(delta * 1000.0f, TimeUnit.MILLISECONDS));
			}
		} else {
			who.move(correctedTargetLocation);
			collisionDetection(who);
			if (!who.isCrashed()) {
				MoveFinishedEvent arrivalEvent = new MoveFinishedEvent(this.getModel(), "Arrived", true, target);
				arrivalEvent.setNextInstruction(nextInstruction);
				arrivalEvent.schedule(who, new TimeSpan((droneToTargetDist / droneToInterimDist) * 1000.0f, TimeUnit.MILLISECONDS));
			}
		}

		logger.debug("Drone " + who.getName() + " moving to " + target.getName() + "[" + String.format("%.2f", target.getX()) + ", "
				+ String.format("%.2f", target.getY()) + ", "
				+ String.format("%.2f", target.getZ()) + "]");
		logger.debug("Currently at position [" + String.format("%.2f", who.get().getX()) + ", "
				+ String.format("%.2f", who.get().getY()) + ", "
				+ String.format("%.2f", who.get().getZ()) + "]");
		logger.debug("Distance to target " + String.format("%.3f", who.getDroneLocation().getDistance(correctedTargetLocation)));
	}

	private void collisionDetection(DroneEntity who){
		DronesSimulationModel sim = (DronesSimulationModel) this.getModel();
		Map<Drone, List<SizedElement>> collisions = 
				IncQueryHelper.performCollisionDetection(sim.getMission());

		// Schedule crash event if current drone collided
		if (collisions.containsKey(who.drone)) {
			DroneCollidedEvent collisionEvent = new DroneCollidedEvent(collisions.get(who.drone),
					this.getModel(), who.getName() + " crashed", true);
			collisionEvent.schedule(who);
			who.setCrashed(true);
			
			// Log collision info
			String msg = who.getName() + " is colliding with: ";
			for (SizedElement element : collisions.get(who.drone)) {
				if (element instanceof FieldObject) {
					FieldObject fieldObject = (FieldObject) element;
					msg += fieldObject.getName() + " ";
				} else if (element instanceof Drone) {
					Drone drone = (Drone) element;
					msg += drone.getName() + " ";
				}
			}
			logger.debug(msg);
			logger.debug("Position: [" + String.format("%.2f", who.get().getX()) + ", "
					+ String.format("%.2f", who.get().getY()) + ", "
					+ String.format("%.2f", who.get().getZ()) + "]");
		}
	}
}
