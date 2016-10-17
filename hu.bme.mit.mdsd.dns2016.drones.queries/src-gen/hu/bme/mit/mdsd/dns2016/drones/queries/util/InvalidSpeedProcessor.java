package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSpeedMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidSpeed pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidSpeedProcessor implements IMatchProcessor<InvalidSpeedMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pD the value of pattern parameter d in the currently processed match
   * @param pMinSpeed the value of pattern parameter minSpeed in the currently processed match
   * @param pMaxSpeed the value of pattern parameter maxSpeed in the currently processed match
   * 
   */
  public abstract void process(final Drone pD, final Float pMinSpeed, final Float pMaxSpeed);
  
  @Override
  public void process(final InvalidSpeedMatch match) {
    process(match.getD(), match.getMinSpeed(), match.getMaxSpeed());
  }
}
