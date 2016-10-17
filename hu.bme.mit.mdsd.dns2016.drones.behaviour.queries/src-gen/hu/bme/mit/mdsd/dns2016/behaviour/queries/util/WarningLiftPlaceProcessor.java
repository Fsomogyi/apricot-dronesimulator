package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WarningLiftPlaceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.warningLiftPlace pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WarningLiftPlaceProcessor implements IMatchProcessor<WarningLiftPlaceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDb the value of pattern parameter db in the currently processed match
   * 
   */
  public abstract void process(final DroneBehaviour pDb);
  
  @Override
  public void process(final WarningLiftPlaceMatch match) {
    process(match.getDb());
  }
}
