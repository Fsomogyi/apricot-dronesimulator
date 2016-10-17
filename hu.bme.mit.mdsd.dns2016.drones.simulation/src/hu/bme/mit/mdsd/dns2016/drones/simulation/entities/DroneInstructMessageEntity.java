package hu.bme.mit.mdsd.dns2016.drones.simulation.entities;

import java.util.List;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.InstructionEvent;

public class DroneInstructMessageEntity extends DroneMessageEntity {
	public static final String TYPE_DESCRIPTION = "__instruction__";
	private List<InstructionEvent> instructionEvents;

	public DroneInstructMessageEntity(Model owner, String name, boolean showInTrace, List<InstructionEvent> ievents) {
		super(owner, name, showInTrace, null);
		this.instructionEvents = ievents;
	}

	public List<InstructionEvent> getInstructionEvents() {
		return instructionEvents;
	}
	
	@Override
	public String getType() {
		return TYPE_DESCRIPTION;
	}
}
