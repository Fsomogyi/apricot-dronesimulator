package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.charge pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ChargeProcessor implements IMatchProcessor<ChargeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pB the value of pattern parameter b in the currently processed match
   * @param pC the value of pattern parameter C in the currently processed match
   * 
   */
  public abstract void process(final Battery pB, final Float pC);
  
  @Override
  public void process(final ChargeMatch match) {
    process(match.getB(), match.getC());
  }
}
