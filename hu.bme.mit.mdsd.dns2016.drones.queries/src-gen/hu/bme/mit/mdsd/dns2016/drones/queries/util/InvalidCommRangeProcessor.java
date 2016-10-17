package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCommRangeMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidCommRange pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidCommRangeProcessor implements IMatchProcessor<InvalidCommRangeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pD the value of pattern parameter d in the currently processed match
   * @param pCommRange the value of pattern parameter commRange in the currently processed match
   * 
   */
  public abstract void process(final Drone pD, final Float pCommRange);
  
  @Override
  public void process(final InvalidCommRangeMatch match) {
    process(match.getD(), match.getCommRange());
  }
}
