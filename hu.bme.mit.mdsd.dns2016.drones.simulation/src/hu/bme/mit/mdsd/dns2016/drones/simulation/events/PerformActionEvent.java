package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.behaviour.PerformAction;
import hu.bme.mit.mdsd.dns2016.drones.simulation.ActionExecuter;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.FieldObjectEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.MathHelper;

public class PerformActionEvent extends InstructionEvent{
	private PerformAction instruction;
	private static Logger logger = Logger.getLogger(PerformActionEvent.class);
	
	public PerformActionEvent(Model owner, String name, boolean showInTrace, PerformAction instruction) {
		super(owner, name, showInTrace);
		
		this.instruction = instruction;
		
		// TODO: scale this somehow, e.g. CPU?
		this.batteryDrainAmount = 10.0f;
	}
	
	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		super.eventRoutine(who);
		
		if (this.shouldInterrupt) 
			return;

		if (MathHelper.surfaceDistance(who, new FieldObjectEntity(instruction.getTarget(), model, "valami", true))
				<= instruction.getAction().getRange()) {
			logger.info(who.getName() + " is performing action '" + instruction.getAction().getName() + "' on " + 
					instruction.getTarget().getName());
			
			ActionExecuter.getInstance(model.getMission()).execute(instruction, who.get());
		} else {
			logger.info(who.getName() + " is trying to perform action '" + instruction.getAction().getName() + "' on " + 
					instruction.getTarget().getName() + ", but it is OUT OF RANGE!");
		}
		
		
		this.scheduleNextInstructionEvent(who);
	}
}
