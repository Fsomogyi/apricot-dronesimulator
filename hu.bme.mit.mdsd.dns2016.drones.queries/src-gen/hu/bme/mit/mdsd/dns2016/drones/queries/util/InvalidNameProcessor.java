package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.NamedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidNameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.invalidName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidNameProcessor implements IMatchProcessor<InvalidNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pNe the value of pattern parameter ne in the currently processed match
   * 
   */
  public abstract void process(final NamedElement pNe);
  
  @Override
  public void process(final InvalidNameMatch match) {
    process(match.getNe());
  }
}
