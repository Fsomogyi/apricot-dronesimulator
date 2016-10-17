package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidRemLifeTimeMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidRemLifeTimeQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidRemLifeTime pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidRemLifeTimeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"b", "remLifeTime"}, targetEditorId = "", severity = "error", message = "Invalid remaining life time of battery!") 
 * pattern invalidRemLifeTime(b : Battery, remLifeTime) {
 * 	Battery.lifeTime(b, lifeTime);
 * 	Battery.remainingLifeTime(b, remLifeTime);
 * 	check(remLifeTime {@literal <} 0 || remLifeTime {@literal >} lifeTime);
 * }
 * </pre></code>
 * 
 * @see InvalidRemLifeTimeMatch
 * @see InvalidRemLifeTimeProcessor
 * @see InvalidRemLifeTimeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidRemLifeTimeMatcher extends BaseMatcher<InvalidRemLifeTimeMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidRemLifeTimeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidRemLifeTimeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidRemLifeTimeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_B = 0;
  
  private final static int POSITION_REMLIFETIME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidRemLifeTimeMatcher.class);
  
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
  public InvalidRemLifeTimeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidRemLifeTimeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @return matches represented as a InvalidRemLifeTimeMatch object.
   * 
   */
  public Collection<InvalidRemLifeTimeMatch> getAllMatches(final Battery pB, final Float pRemLifeTime) {
    return rawGetAllMatches(new Object[]{pB, pRemLifeTime});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @return a match represented as a InvalidRemLifeTimeMatch object, or null if no match is found.
   * 
   */
  public InvalidRemLifeTimeMatch getOneArbitraryMatch(final Battery pB, final Float pRemLifeTime) {
    return rawGetOneArbitraryMatch(new Object[]{pB, pRemLifeTime});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Battery pB, final Float pRemLifeTime) {
    return rawHasMatch(new Object[]{pB, pRemLifeTime});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Battery pB, final Float pRemLifeTime) {
    return rawCountMatches(new Object[]{pB, pRemLifeTime});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Battery pB, final Float pRemLifeTime, final IMatchProcessor<? super InvalidRemLifeTimeMatch> processor) {
    rawForEachMatch(new Object[]{pB, pRemLifeTime}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Battery pB, final Float pRemLifeTime, final IMatchProcessor<? super InvalidRemLifeTimeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pB, pRemLifeTime}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidRemLifeTimeMatch newMatch(final Battery pB, final Float pRemLifeTime) {
    return InvalidRemLifeTimeMatch.newMatch(pB, pRemLifeTime);
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Battery> rawAccumulateAllValuesOfb(final Object[] parameters) {
    Set<Battery> results = new HashSet<Battery>();
    rawAccumulateAllValues(POSITION_B, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Battery> getAllValuesOfb() {
    return rawAccumulateAllValuesOfb(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Battery> getAllValuesOfb(final InvalidRemLifeTimeMatch partialMatch) {
    return rawAccumulateAllValuesOfb(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Battery> getAllValuesOfb(final Float pRemLifeTime) {
    return rawAccumulateAllValuesOfb(new Object[]{
    null, 
    pRemLifeTime
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for remLifeTime.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Float> rawAccumulateAllValuesOfremLifeTime(final Object[] parameters) {
    Set<Float> results = new HashSet<Float>();
    rawAccumulateAllValues(POSITION_REMLIFETIME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for remLifeTime.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfremLifeTime() {
    return rawAccumulateAllValuesOfremLifeTime(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for remLifeTime.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfremLifeTime(final InvalidRemLifeTimeMatch partialMatch) {
    return rawAccumulateAllValuesOfremLifeTime(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for remLifeTime.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfremLifeTime(final Battery pB) {
    return rawAccumulateAllValuesOfremLifeTime(new Object[]{
    pB, 
    null
    });
  }
  
  @Override
  protected InvalidRemLifeTimeMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidRemLifeTimeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) t.get(POSITION_B), (java.lang.Float) t.get(POSITION_REMLIFETIME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidRemLifeTimeMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidRemLifeTimeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) match[POSITION_B], (java.lang.Float) match[POSITION_REMLIFETIME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidRemLifeTimeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidRemLifeTimeMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) match[POSITION_B], (java.lang.Float) match[POSITION_REMLIFETIME]);
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
  public static IQuerySpecification<InvalidRemLifeTimeMatcher> querySpecification() throws IncQueryException {
    return InvalidRemLifeTimeQuerySpecification.instance();
  }
}
