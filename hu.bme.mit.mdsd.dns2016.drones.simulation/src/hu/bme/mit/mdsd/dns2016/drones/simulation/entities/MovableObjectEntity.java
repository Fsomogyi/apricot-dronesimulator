package hu.bme.mit.mdsd.dns2016.drones.simulation.entities;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.Vec3f;

public class MovableObjectEntity extends Entity {
	
	public MovableObject movableObject;
	boolean isLifted = false;
	
	public MovableObjectEntity(MovableObject movableObject, Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		
		this.movableObject = movableObject;
	}
	
	public Vec3f getFieldObjectLocation(){
		return new Vec3f(movableObject.getX(), movableObject.getY(), movableObject.getZ());
	}
	
	public void move(Vec3f moveTarget) {
		movableObject.setX(moveTarget.x);
		movableObject.setY(moveTarget.y);
		movableObject.setZ(moveTarget.z);
	}

}
