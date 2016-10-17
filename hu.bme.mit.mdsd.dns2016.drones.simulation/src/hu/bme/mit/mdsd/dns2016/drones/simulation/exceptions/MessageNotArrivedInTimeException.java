package hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions;

public class MessageNotArrivedInTimeException extends Exception {
	public MessageNotArrivedInTimeException() {
		
	}
	
	public MessageNotArrivedInTimeException(String message) {
		super(message);
	}
}
