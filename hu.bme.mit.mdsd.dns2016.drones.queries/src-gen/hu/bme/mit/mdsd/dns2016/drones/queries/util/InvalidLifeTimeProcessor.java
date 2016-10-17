package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidLifeTimeMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidLifeTime pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidLifeTimeProcessor implements IMatchProcessor<InvalidLifeTimeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pB the value of pattern parameter b in the currently processed match
   * @param pLifeTime the value of pattern parameter lifeTime in the currently processed match
   * 
   */
  public abstract void process(final Battery pB, final Float pLifeTime);
  
  @Override
  public void process(final InvalidLifeTimeMatch match) {
    process(match.getB(), match.getLifeTime());
  }
}
