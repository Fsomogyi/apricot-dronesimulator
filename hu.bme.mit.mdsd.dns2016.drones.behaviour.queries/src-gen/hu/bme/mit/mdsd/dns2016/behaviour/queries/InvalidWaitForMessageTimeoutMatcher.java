package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidWaitForMessageTimeoutMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidWaitForMessageTimeoutQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidWaitForMessageTimeout pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidWaitForMessageTimeoutMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"wfm"}, targetEditorId = "", severity = "error", message = "Invalid timeout of instruction!") 
 * pattern invalidWaitForMessageTimeout(wfm: WaitForMessage) {
 * 	WaitForMessage.timeout(wfm, to);
 * 	check(to {@literal <}= 0);
 * }
 * </pre></code>
 * 
 * @see InvalidWaitForMessageTimeoutMatch
 * @see InvalidWaitForMessageTimeoutProcessor
 * @see InvalidWaitForMessageTimeoutQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidWaitForMessageTimeoutMatcher extends BaseMatcher<InvalidWaitForMessageTimeoutMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidWaitForMessageTimeoutMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidWaitForMessageTimeoutMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidWaitForMessageTimeoutMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_WFM = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidWaitForMessageTimeoutMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public InvalidWaitForMessageTimeoutMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public InvalidWaitForMessageTimeoutMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @return matches represented as a InvalidWaitForMessageTimeoutMatch object.
   * 
   */
  public Collection<InvalidWaitForMessageTimeoutMatch> getAllMatches(final WaitForMessage pWfm) {
    return rawGetAllMatches(new Object[]{pWfm});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @return a match represented as a InvalidWaitForMessageTimeoutMatch object, or null if no match is found.
   * 
   */
  public InvalidWaitForMessageTimeoutMatch getOneArbitraryMatch(final WaitForMessage pWfm) {
    return rawGetOneArbitraryMatch(new Object[]{pWfm});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final WaitForMessage pWfm) {
    return rawHasMatch(new Object[]{pWfm});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final WaitForMessage pWfm) {
    return rawCountMatches(new Object[]{pWfm});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final WaitForMessage pWfm, final IMatchProcessor<? super InvalidWaitForMessageTimeoutMatch> processor) {
    rawForEachMatch(new Object[]{pWfm}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final WaitForMessage pWfm, final IMatchProcessor<? super InvalidWaitForMessageTimeoutMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pWfm}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidWaitForMessageTimeoutMatch newMatch(final WaitForMessage pWfm) {
    return InvalidWaitForMessageTimeoutMatch.newMatch(pWfm);
  }
  
  /**
   * Retrieve the set of values that occur in matches for wfm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<WaitForMessage> rawAccumulateAllValuesOfwfm(final Object[] parameters) {
    Set<WaitForMessage> results = new HashSet<WaitForMessage>();
    rawAccumulateAllValues(POSITION_WFM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wfm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WaitForMessage> getAllValuesOfwfm() {
    return rawAccumulateAllValuesOfwfm(emptyArray());
  }
  
  @Override
  protected InvalidWaitForMessageTimeoutMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidWaitForMessageTimeoutMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage) t.get(POSITION_WFM));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidWaitForMessageTimeoutMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidWaitForMessageTimeoutMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage) match[POSITION_WFM]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidWaitForMessageTimeoutMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidWaitForMessageTimeoutMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage) match[POSITION_WFM]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<InvalidWaitForMessageTimeoutMatcher> querySpecification() throws IncQueryException {
    return InvalidWaitForMessageTimeoutQuerySpecification.instance();
  }
}
