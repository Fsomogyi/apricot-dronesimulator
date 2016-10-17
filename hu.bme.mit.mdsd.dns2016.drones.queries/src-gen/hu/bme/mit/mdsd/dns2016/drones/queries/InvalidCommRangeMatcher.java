package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCommRangeMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidCommRangeQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidCommRange pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidCommRangeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"d", "commRange"}, targetEditorId = "", severity = "error", message = "Invalid communication range of drone ($d$)!")
 * pattern invalidCommRange(d : Drone, commRange) {
 * 	Drone.communicationRange(d, commRange);
 * 	check(commRange {@literal <} 0);
 * }
 * </pre></code>
 * 
 * @see InvalidCommRangeMatch
 * @see InvalidCommRangeProcessor
 * @see InvalidCommRangeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidCommRangeMatcher extends BaseMatcher<InvalidCommRangeMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidCommRangeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidCommRangeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidCommRangeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_D = 0;
  
  private final static int POSITION_COMMRANGE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidCommRangeMatcher.class);
  
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
  public InvalidCommRangeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidCommRangeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @return matches represented as a InvalidCommRangeMatch object.
   * 
   */
  public Collection<InvalidCommRangeMatch> getAllMatches(final Drone pD, final Float pCommRange) {
    return rawGetAllMatches(new Object[]{pD, pCommRange});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @return a match represented as a InvalidCommRangeMatch object, or null if no match is found.
   * 
   */
  public InvalidCommRangeMatch getOneArbitraryMatch(final Drone pD, final Float pCommRange) {
    return rawGetOneArbitraryMatch(new Object[]{pD, pCommRange});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Drone pD, final Float pCommRange) {
    return rawHasMatch(new Object[]{pD, pCommRange});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Drone pD, final Float pCommRange) {
    return rawCountMatches(new Object[]{pD, pCommRange});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Drone pD, final Float pCommRange, final IMatchProcessor<? super InvalidCommRangeMatch> processor) {
    rawForEachMatch(new Object[]{pD, pCommRange}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Drone pD, final Float pCommRange, final IMatchProcessor<? super InvalidCommRangeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pD, pCommRange}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidCommRangeMatch newMatch(final Drone pD, final Float pCommRange) {
    return InvalidCommRangeMatch.newMatch(pD, pCommRange);
  }
  
  /**
   * Retrieve the set of values that occur in matches for d.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Drone> rawAccumulateAllValuesOfd(final Object[] parameters) {
    Set<Drone> results = new HashSet<Drone>();
    rawAccumulateAllValues(POSITION_D, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for d.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Drone> getAllValuesOfd() {
    return rawAccumulateAllValuesOfd(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for d.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Drone> getAllValuesOfd(final InvalidCommRangeMatch partialMatch) {
    return rawAccumulateAllValuesOfd(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for d.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Drone> getAllValuesOfd(final Float pCommRange) {
    return rawAccumulateAllValuesOfd(new Object[]{
    null, 
    pCommRange
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for commRange.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Float> rawAccumulateAllValuesOfcommRange(final Object[] parameters) {
    Set<Float> results = new HashSet<Float>();
    rawAccumulateAllValues(POSITION_COMMRANGE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for commRange.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfcommRange() {
    return rawAccumulateAllValuesOfcommRange(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for commRange.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfcommRange(final InvalidCommRangeMatch partialMatch) {
    return rawAccumulateAllValuesOfcommRange(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for commRange.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfcommRange(final Drone pD) {
    return rawAccumulateAllValuesOfcommRange(new Object[]{
    pD, 
    null
    });
  }
  
  @Override
  protected InvalidCommRangeMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidCommRangeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) t.get(POSITION_D), (java.lang.Float) t.get(POSITION_COMMRANGE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidCommRangeMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidCommRangeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D], (java.lang.Float) match[POSITION_COMMRANGE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidCommRangeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidCommRangeMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D], (java.lang.Float) match[POSITION_COMMRANGE]);
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
  public static IQuerySpecification<InvalidCommRangeMatcher> querySpecification() throws IncQueryException {
    return InvalidCommRangeQuerySpecification.instance();
  }
}
