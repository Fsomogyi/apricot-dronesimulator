package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.CollisionDetectionMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.collisionDetection pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CollisionDetectionProcessor implements IMatchProcessor<CollisionDetectionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSe1 the value of pattern parameter se1 in the currently processed match
   * @param pSe2 the value of pattern parameter se2 in the currently processed match
   * 
   */
  public abstract void process(final SizedElement pSe1, final SizedElement pSe2);
  
  @Override
  public void process(final CollisionDetectionMatch match) {
    process(match.getSe1(), match.getSe2());
  }
}
