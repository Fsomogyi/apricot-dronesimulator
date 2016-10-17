package hu.bme.mit.mdsd.dns2016.drones.simulation.entities;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.behaviour.SendMessage;

public class DroneMessageEntity extends Entity {
	private SendMessage initiator;
	
	public DroneMessageEntity(Model owner, String name, boolean showInTrace, SendMessage initiator) {
		super(owner, name, showInTrace);
		
		this.initiator = initiator;
	}
	
	public String getType() {
		if (this.initiator == null) {
			return "";
		}
		return this.initiator.getMessageType();
	}
}
