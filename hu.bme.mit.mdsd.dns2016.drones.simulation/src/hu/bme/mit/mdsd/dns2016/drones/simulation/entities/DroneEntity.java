package hu.bme.mit.mdsd.dns2016.drones.simulation.entities;

import org.eclipse.incquery.runtime.exception.IncQueryException;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.Queue;
import desmoj.core.simulator.QueueBased;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.DroneBatteryDepletedEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.IncQueryHelper;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.Vec3f;

public class DroneEntity extends Entity {
	public DroneBehaviour behaviour; 
	public Drone drone;
	private MovableObjectEntity payload;
	private Queue<DroneMessageEntity> message_queue;
	
	private FieldObjectEntity chargeStationEntity;
	
	private boolean isDepleted = false;
	private boolean isCrashed = false;
	
	public DroneEntity(Drone drone, Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.drone = drone;
		
		this.message_queue = new Queue<DroneMessageEntity>(this.getModel(), "Message queue of " + name, QueueBased.FIFO, this.drone.getMemory() / 100, true, false);	
		this.chargeStationEntity = new FieldObjectEntity(this.drone.getChargeStation(), owner, "Charge station of " + name, false);
	}
	
	public String getName() {
		return drone.getName();
	}

	public Drone get() {
		return drone;
	}
	
	public Vec3f getDroneLocation(){
		return new Vec3f(drone.getX(), drone.getY(), drone.getZ());
	}
	
	public boolean hasPayload() {
		return (payload != null);
	}

	public MovableObjectEntity getPayload() {
		return payload;
	}

	public void setPayload(MovableObjectEntity payload) {
		this.payload = payload;
	}
	
	public void move(Vec3f moveTarget) {
		
		if (payload != null) {
			// move payload below the carrying drone
			Vec3f payloadMoveTarget = new Vec3f(moveTarget.x, moveTarget.y - drone.getHeight() / 2 - payload.movableObject.getHeight() / 2, moveTarget.z);
			drone.setX(moveTarget.x);
			drone.setY(moveTarget.y);
			drone.setZ(moveTarget.z);
			payload.move(payloadMoveTarget);
		} else {
			drone.setX(moveTarget.x);
			drone.setY(moveTarget.y);
			drone.setZ(moveTarget.z);
		}
	}

	public Queue<DroneMessageEntity> getMessageQueue() {
		return message_queue;
	}

	public boolean isDepleted() {
		return isDepleted;
	}

	public void setDepleted(boolean isDepleted) {
		this.isDepleted = isDepleted;
	}
	
	public boolean isCrashed() {
		return isCrashed;
	}

	public void setCrashed(boolean isCrashed) {
		this.isCrashed = isCrashed;
	}

	public float getDroneCharge() {
		return IncQueryHelper.getDroneBatteryCharge(((DronesSimulationModel) this.getModel()).getMission(), drone);
	}

	public FieldObjectEntity getChargeStationEntity() {
		return chargeStationEntity;
	}
	
}
