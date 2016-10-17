package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidRemLifeTimeMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidRemLifeTime pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidRemLifeTimeProcessor implements IMatchProcessor<InvalidRemLifeTimeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pB the value of pattern parameter b in the currently processed match
   * @param pRemLifeTime the value of pattern parameter remLifeTime in the currently processed match
   * 
   */
  public abstract void process(final Battery pB, final Float pRemLifeTime);
  
  @Override
  public void process(final InvalidRemLifeTimeMatch match) {
    process(match.getB(), match.getRemLifeTime());
  }
}
