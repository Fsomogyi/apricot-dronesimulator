package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.PlaceObject;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.AllPlaceObjectInstructionsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.allPlaceObjectInstructions pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllPlaceObjectInstructionsProcessor implements IMatchProcessor<AllPlaceObjectInstructionsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPo the value of pattern parameter po in the currently processed match
   * 
   */
  public abstract void process(final PlaceObject pPo);
  
  @Override
  public void process(final AllPlaceObjectInstructionsMatch match) {
    process(match.getPo());
  }
}
