package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.Pause;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidPauseDurationMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidPauseDuration pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidPauseDurationProcessor implements IMatchProcessor<InvalidPauseDurationMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP the value of pattern parameter p in the currently processed match
   * 
   */
  public abstract void process(final Pause pP);
  
  @Override
  public void process(final InvalidPauseDurationMatch match) {
    process(match.getP());
  }
}
