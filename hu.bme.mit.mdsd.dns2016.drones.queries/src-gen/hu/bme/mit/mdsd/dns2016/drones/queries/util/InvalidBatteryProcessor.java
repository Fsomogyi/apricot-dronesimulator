package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidBatteryMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidBattery pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidBatteryProcessor implements IMatchProcessor<InvalidBatteryMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pB the value of pattern parameter b in the currently processed match
   * 
   */
  public abstract void process(final Battery pB);
  
  @Override
  public void process(final InvalidBatteryMatch match) {
    process(match.getB());
  }
}
