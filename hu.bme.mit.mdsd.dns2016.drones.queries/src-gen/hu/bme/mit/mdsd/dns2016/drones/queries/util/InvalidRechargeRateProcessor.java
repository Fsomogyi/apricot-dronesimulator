package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidRechargeRateMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidRechargeRate pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidRechargeRateProcessor implements IMatchProcessor<InvalidRechargeRateMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pB the value of pattern parameter b in the currently processed match
   * @param pRechargeRate the value of pattern parameter rechargeRate in the currently processed match
   * 
   */
  public abstract void process(final Battery pB, final Float pRechargeRate);
  
  @Override
  public void process(final InvalidRechargeRateMatch match) {
    process(match.getB(), match.getRechargeRate());
  }
}
