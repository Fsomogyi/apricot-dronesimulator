package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.Lift;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidLiftInstructionMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidLiftInstruction pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidLiftInstructionProcessor implements IMatchProcessor<InvalidLiftInstructionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pLift the value of pattern parameter lift in the currently processed match
   * 
   */
  public abstract void process(final Lift pLift);
  
  @Override
  public void process(final InvalidLiftInstructionMatch match) {
    process(match.getLift());
  }
}
