package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSizeMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidSize pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidSizeProcessor implements IMatchProcessor<InvalidSizeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS the value of pattern parameter s in the currently processed match
   * 
   */
  public abstract void process(final SizedElement pS);
  
  @Override
  public void process(final InvalidSizeMatch match) {
    process(match.getS());
  }
}
