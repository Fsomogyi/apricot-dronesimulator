package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.DroneOfBehaviourMatch;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.droneOfBehaviour pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DroneOfBehaviourProcessor implements IMatchProcessor<DroneOfBehaviourMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDb the value of pattern parameter db in the currently processed match
   * @param pD the value of pattern parameter d in the currently processed match
   * 
   */
  public abstract void process(final DroneBehaviour pDb, final Drone pD);
  
  @Override
  public void process(final DroneOfBehaviourMatch match) {
    process(match.getDb(), match.getD());
  }
}
