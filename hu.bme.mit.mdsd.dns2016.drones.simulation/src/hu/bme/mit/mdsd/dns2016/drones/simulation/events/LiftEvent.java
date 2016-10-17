package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.behaviour.Lift;
import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.MovableObjectEntity;

public class LiftEvent extends InstructionEvent {
	private static Logger logger = Logger.getLogger(LiftEvent.class);
	
	private Lift instruction;
	
	public LiftEvent(Model owner, String name, boolean showInTrace, Lift instruction) {
		super(owner, name, showInTrace);
		
		this.instruction = instruction;
		
		this.batteryDrainAmount = 1.0f + instruction.getTarget().getWeight() / 2.0f;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		super.eventRoutine(who);
		
		if (this.shouldInterrupt) 
			return;
		
		if (who.getPayload() == null) {
			MovableObject target = (MovableObject) instruction.getTarget();
			MovableObjectEntity payload = new MovableObjectEntity(target, this.getModel(), target.getName(), true);
			who.setPayload(payload);
			
			logger.info(who.getName() + " is lifting " + target.getName());
		}
		else {
			logger.info(who.getName() + " is attempting to lift an object but it already has payload!");
		}
		
		this.scheduleNextInstructionEvent(who);
	}
}
