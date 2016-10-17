package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSizeMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidSizeQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidSize pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidSizeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"s"}, targetEditorId = "", severity = "error", message = "Invalid size of element $s$!")
 *  pattern invalidSize(s : SizedElement) {
 *  	SizedElement.height(s, h);
 *  	SizedElement.length(s, l);
 *  	SizedElement.width(s, w);
 *  	check(h {@literal <} 0 || l {@literal <} 0 || w {@literal <} 0);
 *  }
 * </pre></code>
 * 
 * @see InvalidSizeMatch
 * @see InvalidSizeProcessor
 * @see InvalidSizeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidSizeMatcher extends BaseMatcher<InvalidSizeMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidSizeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidSizeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidSizeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_S = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidSizeMatcher.class);
  
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
  public InvalidSizeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidSizeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return matches represented as a InvalidSizeMatch object.
   * 
   */
  public Collection<InvalidSizeMatch> getAllMatches(final SizedElement pS) {
    return rawGetAllMatches(new Object[]{pS});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return a match represented as a InvalidSizeMatch object, or null if no match is found.
   * 
   */
  public InvalidSizeMatch getOneArbitraryMatch(final SizedElement pS) {
    return rawGetOneArbitraryMatch(new Object[]{pS});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SizedElement pS) {
    return rawHasMatch(new Object[]{pS});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SizedElement pS) {
    return rawCountMatches(new Object[]{pS});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SizedElement pS, final IMatchProcessor<? super InvalidSizeMatch> processor) {
    rawForEachMatch(new Object[]{pS}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SizedElement pS, final IMatchProcessor<? super InvalidSizeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidSizeMatch newMatch(final SizedElement pS) {
    return InvalidSizeMatch.newMatch(pS);
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SizedElement> rawAccumulateAllValuesOfs(final Object[] parameters) {
    Set<SizedElement> results = new HashSet<SizedElement>();
    rawAccumulateAllValues(POSITION_S, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SizedElement> getAllValuesOfs() {
    return rawAccumulateAllValuesOfs(emptyArray());
  }
  
  @Override
  protected InvalidSizeMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidSizeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.SizedElement) t.get(POSITION_S));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidSizeMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidSizeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.SizedElement) match[POSITION_S]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidSizeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidSizeMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.SizedElement) match[POSITION_S]);
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
  public static IQuerySpecification<InvalidSizeMatcher> querySpecification() throws IncQueryException {
    return InvalidSizeQuerySpecification.instance();
  }
}
