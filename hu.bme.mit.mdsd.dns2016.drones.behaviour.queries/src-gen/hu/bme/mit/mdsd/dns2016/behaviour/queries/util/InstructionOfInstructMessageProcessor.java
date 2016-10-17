package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.Instruct;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruction;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InstructionOfInstructMessageMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.instructionOfInstructMessage pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InstructionOfInstructMessageProcessor implements IMatchProcessor<InstructionOfInstructMessageMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pIns the value of pattern parameter ins in the currently processed match
   * @param pM the value of pattern parameter m in the currently processed match
   * 
   */
  public abstract void process(final Instruction pIns, final Instruct pM);
  
  @Override
  public void process(final InstructionOfInstructMessageMatch match) {
    process(match.getIns(), match.getM());
  }
}
