package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Parameter;
import hu.bme.mit.mdsd.dns2016.drones.queries.SameParametersFieldObjectMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.sameParametersFieldObject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SameParametersFieldObjectProcessor implements IMatchProcessor<SameParametersFieldObjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pF the value of pattern parameter f in the currently processed match
   * @param pP1 the value of pattern parameter p1 in the currently processed match
   * @param pP2 the value of pattern parameter p2 in the currently processed match
   * 
   */
  public abstract void process(final FieldObject pF, final Parameter pP1, final Parameter pP2);
  
  @Override
  public void process(final SameParametersFieldObjectMatch match) {
    process(match.getF(), match.getP1(), match.getP2());
  }
}
