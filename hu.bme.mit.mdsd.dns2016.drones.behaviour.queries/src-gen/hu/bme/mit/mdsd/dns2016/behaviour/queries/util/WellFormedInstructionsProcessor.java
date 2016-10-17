package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedInstructionsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.wellFormedInstructions pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WellFormedInstructionsProcessor implements IMatchProcessor<WellFormedInstructionsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * 
   */
  public abstract void process();
  
  @Override
  public void process(final WellFormedInstructionsMatch match) {
    process();
  }
}
