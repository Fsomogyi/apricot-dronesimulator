package hu.bme.mit.mdsd.dns2016.drones.simulation.helpers;

import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.FieldObjectEntity;

public final class MathHelper {
	
	private MathHelper() {}
	
	public static float centerDistance(DroneEntity a, DroneEntity b) {
		return a.getDroneLocation().getDistance(b.getDroneLocation());
	}
	
	public static float centerDistance(DroneEntity a, FieldObjectEntity b) {
		return a.getDroneLocation().getDistance(b.getFieldObjectLocation());
	}
	
	public static float surfaceDistance(DroneEntity a, DroneEntity b) {
		float distX = Math.abs(a.drone.getX() - b.drone.getX()) - a.drone.getLength() / 2 - b.drone.getLength() / 2;
		if (distX < 0.0f)
			distX = 0.0f;
		float distY = Math.abs(a.drone.getY() - b.drone.getY()) - a.drone.getHeight() / 2 - b.drone.getHeight() / 2;
		if (distY < 0.0f)
			distY = 0.0f;
		float distZ = Math.abs(a.drone.getZ() - b.drone.getZ()) - a.drone.getWidth() / 2 - b.drone.getWidth() / 2;
		if (distZ < 0.0f)
			distZ = 0.0f;
		
		Vec3f surfaceDistanceVector = new Vec3f(distX, distY, distZ);
		
		return surfaceDistanceVector.getLength();
	}
	
	public static float surfaceDistance(DroneEntity a, FieldObjectEntity b) {
		float distX = Math.abs(a.drone.getX() - b.fieldObject.getX()) - a.drone.getLength() / 2 - b.fieldObject.getLength() / 2;
		if (distX < 0.0f)
			distX = 0.0f;
		float distY = Math.abs(a.drone.getY() - b.fieldObject.getY()) - a.drone.getHeight() / 2 - b.fieldObject.getHeight() / 2;
		if (distY < 0.0f)
			distY = 0.0f;
		float distZ = Math.abs(a.drone.getZ() - b.fieldObject.getZ()) - a.drone.getWidth() / 2 - b.fieldObject.getWidth() / 2;
		if (distZ < 0.0f)
			distZ = 0.0f;
		
		Vec3f surfaceDistanceVector = new Vec3f(distX, distY, distZ);
		
		return surfaceDistanceVector.getLength();
	}
}
