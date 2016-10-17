package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.Lift;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.AllLiftInstructionsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.allLiftInstructions pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllLiftInstructionsProcessor implements IMatchProcessor<AllLiftInstructionsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pL the value of pattern parameter l in the currently processed match
   * 
   */
  public abstract void process(final Lift pL);
  
  @Override
  public void process(final AllLiftInstructionsMatch match) {
    process(match.getL());
  }
}
