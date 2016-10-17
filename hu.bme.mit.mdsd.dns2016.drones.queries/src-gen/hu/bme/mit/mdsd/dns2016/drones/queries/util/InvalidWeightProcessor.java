package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidWeightMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidWeight pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidWeightProcessor implements IMatchProcessor<InvalidWeightMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMo the value of pattern parameter mo in the currently processed match
   * @param pW the value of pattern parameter w in the currently processed match
   * 
   */
  public abstract void process(final MovableObject pMo, final Float pW);
  
  @Override
  public void process(final InvalidWeightMatch match) {
    process(match.getMo(), match.getW());
  }
}
