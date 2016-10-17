package hu.bme.mit.mdsd.dns2016.drones.simulation.entities;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.Vec3f;

public class FieldObjectEntity extends Entity {
	
	public FieldObject fieldObject;
	
	public FieldObjectEntity(FieldObject fieldObject, Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);

		this.fieldObject = fieldObject;
	}
	
	public Vec3f getFieldObjectLocation(){
		return new Vec3f(fieldObject.getX(), fieldObject.getY(), fieldObject.getZ());
	}
}
