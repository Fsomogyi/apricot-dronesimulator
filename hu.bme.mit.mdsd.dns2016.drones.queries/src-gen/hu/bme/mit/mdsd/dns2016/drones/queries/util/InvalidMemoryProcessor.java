package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMemoryMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidMemory pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidMemoryProcessor implements IMatchProcessor<InvalidMemoryMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pD the value of pattern parameter d in the currently processed match
   * @param pMemory the value of pattern parameter memory in the currently processed match
   * 
   */
  public abstract void process(final Drone pD, final Integer pMemory);
  
  @Override
  public void process(final InvalidMemoryMatch match) {
    process(match.getD(), match.getMemory());
  }
}
