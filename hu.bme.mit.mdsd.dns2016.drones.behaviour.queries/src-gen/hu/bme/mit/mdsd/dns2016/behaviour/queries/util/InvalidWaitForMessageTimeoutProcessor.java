package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidWaitForMessageTimeoutMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidWaitForMessageTimeout pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidWaitForMessageTimeoutProcessor implements IMatchProcessor<InvalidWaitForMessageTimeoutMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pWfm the value of pattern parameter wfm in the currently processed match
   * 
   */
  public abstract void process(final WaitForMessage pWfm);
  
  @Override
  public void process(final InvalidWaitForMessageTimeoutMatch match) {
    process(match.getWfm());
  }
}
