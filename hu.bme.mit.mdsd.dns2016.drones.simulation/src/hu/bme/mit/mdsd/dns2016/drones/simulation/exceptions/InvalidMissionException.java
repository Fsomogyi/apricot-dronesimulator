package hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions;

public class InvalidMissionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4447686784455044914L;
	
	public InvalidMissionException() {}
	
	public InvalidMissionException(String message) {
		super(message);
	}

}
