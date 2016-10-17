package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.List;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.behaviour.Choice;
import hu.bme.mit.mdsd.dns2016.drones.simulation.ConditionEvaluator;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

public class ChoiceEvent extends InstructionEvent {
	private static Logger logger = Logger.getLogger(ChoiceEvent.class);
	
	private Choice instruction;
	private List<InstructionEvent> trueInstructions;
	private List<InstructionEvent> falseInstructions;

	public ChoiceEvent(Model owner, String name, boolean showInTrace, Choice instruction, List<InstructionEvent> trueInstructions,
			List<InstructionEvent> falseInstructions) {
		super(owner, name, showInTrace);

		this.instruction = instruction;
		this.trueInstructions = trueInstructions;
		this.falseInstructions = falseInstructions;
		
		this.batteryDrainAmount = 0.0f;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		super.eventRoutine(who);

		if (this.shouldInterrupt)
			return;
		
		ConditionEvaluator eval = ConditionEvaluator.getInstance(this.model.getMission());

		if (eval.evaluate(instruction.getCondition())) {
			logger.info("Choice condition " + eval.conditionToString(instruction.getCondition()) + " is true");
			
			trueInstructions.get(0).schedule(who);
			trueInstructions.get(trueInstructions.size() - 1).setNextInstruction(nextInstruction);
		}
		else {
			logger.info("Choice condition " + eval.conditionToString(instruction.getCondition()) + " is false");
			
			if (falseInstructions.size() > 0) {
				falseInstructions.get(0).schedule(who);
				falseInstructions.get(falseInstructions.size() - 1).setNextInstruction(nextInstruction);
			} else {
				this.scheduleNextInstructionEvent(who);
			}
		}
	}

}
