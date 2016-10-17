package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.List;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.behaviour.While;
import hu.bme.mit.mdsd.dns2016.drones.simulation.ConditionEvaluator;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

public class WhileEvent extends InstructionEvent{
	private static Logger logger = Logger.getLogger(WhileEvent.class);
	
	private While instruction;
	private List<InstructionEvent> loopInstructions;

	public WhileEvent(Model owner, String name, boolean showInTrace, While instruction, List<InstructionEvent> loopInstructions) {
		super(owner, name, showInTrace);
		
		this.instruction = instruction;
		this.loopInstructions = loopInstructions;
		
		this.batteryDrainAmount = 0.0f;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {	
		super.eventRoutine(who);
		
		if (this.shouldInterrupt)
			return;
		
		ConditionEvaluator eval = ConditionEvaluator.getInstance(this.model.getMission());
		
		if (eval.evaluate(instruction.getCondition())) {
			logger.info("While condition " + eval.conditionToString(instruction.getCondition()) + " is true");
			
			loopInstructions.get(loopInstructions.size() - 1).setNextInstruction(this);
			loopInstructions.get(0).schedule(who);
		}
		else {
			logger.info("While condition " + eval.conditionToString(instruction.getCondition()) + " is false");
			
			this.scheduleNextInstructionEvent(who);
		}
	}
}
