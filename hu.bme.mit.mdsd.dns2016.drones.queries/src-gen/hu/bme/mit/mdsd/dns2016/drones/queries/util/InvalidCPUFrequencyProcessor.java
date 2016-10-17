package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCPUFrequencyMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidCPUFrequency pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidCPUFrequencyProcessor implements IMatchProcessor<InvalidCPUFrequencyMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pD the value of pattern parameter d in the currently processed match
   * @param pFreq the value of pattern parameter freq in the currently processed match
   * 
   */
  public abstract void process(final Drone pD, final Integer pFreq);
  
  @Override
  public void process(final InvalidCPUFrequencyMatch match) {
    process(match.getD(), match.getFreq());
  }
}
