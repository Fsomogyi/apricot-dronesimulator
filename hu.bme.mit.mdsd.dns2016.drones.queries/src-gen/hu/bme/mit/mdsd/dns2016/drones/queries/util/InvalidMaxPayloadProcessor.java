package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMaxPayloadMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidMaxPayload pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidMaxPayloadProcessor implements IMatchProcessor<InvalidMaxPayloadMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pD the value of pattern parameter d in the currently processed match
   * @param pMaxPayload the value of pattern parameter maxPayload in the currently processed match
   * 
   */
  public abstract void process(final Drone pD, final Float pMaxPayload);
  
  @Override
  public void process(final InvalidMaxPayloadMatch match) {
    process(match.getD(), match.getMaxPayload());
  }
}
