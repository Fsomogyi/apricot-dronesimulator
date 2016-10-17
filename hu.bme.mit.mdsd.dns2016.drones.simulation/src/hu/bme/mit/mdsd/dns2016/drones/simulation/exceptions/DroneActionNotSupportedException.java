package hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions;

public class DroneActionNotSupportedException extends Exception {
	public DroneActionNotSupportedException() {
		
	}
	
	public DroneActionNotSupportedException(String message) {
		super(message);
	}
}
