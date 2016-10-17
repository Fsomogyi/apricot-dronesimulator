package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidLifeTimeMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidLifeTimeQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidLifeTime pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidLifeTimeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"b", "lifeTime"}, targetEditorId = "", severity = "error", message = "Invalid life time of battery!") 
 * pattern invalidLifeTime(b : Battery, lifeTime) {
 * 	Battery.lifeTime(b, lifeTime);
 * 	check(lifeTime {@literal <}= 0);
 * }
 * </pre></code>
 * 
 * @see InvalidLifeTimeMatch
 * @see InvalidLifeTimeProcessor
 * @see InvalidLifeTimeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidLifeTimeMatcher extends BaseMatcher<InvalidLifeTimeMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidLifeTimeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidLifeTimeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidLifeTimeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_B = 0;
  
  private final static int POSITION_LIFETIME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidLifeTimeMatcher.class);
  
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
  public InvalidLifeTimeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidLifeTimeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @return matches represented as a InvalidLifeTimeMatch object.
   * 
   */
  public Collection<InvalidLifeTimeMatch> getAllMatches(final Battery pB, final Float pLifeTime) {
    return rawGetAllMatches(new Object[]{pB, pLifeTime});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @return a match represented as a InvalidLifeTimeMatch object, or null if no match is found.
   * 
   */
  public InvalidLifeTimeMatch getOneArbitraryMatch(final Battery pB, final Float pLifeTime) {
    return rawGetOneArbitraryMatch(new Object[]{pB, pLifeTime});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Battery pB, final Float pLifeTime) {
    return rawHasMatch(new Object[]{pB, pLifeTime});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Battery pB, final Float pLifeTime) {
    return rawCountMatches(new Object[]{pB, pLifeTime});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Battery pB, final Float pLifeTime, final IMatchProcessor<? super InvalidLifeTimeMatch> processor) {
    rawForEachMatch(new Object[]{pB, pLifeTime}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Battery pB, final Float pLifeTime, final IMatchProcessor<? super InvalidLifeTimeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pB, pLifeTime}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidLifeTimeMatch newMatch(final Battery pB, final Float pLifeTime) {
    return InvalidLifeTimeMatch.newMatch(pB, pLifeTime);
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
  public Set<Battery> getAllValuesOfb(final InvalidLifeTimeMatch partialMatch) {
    return rawAccumulateAllValuesOfb(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Battery> getAllValuesOfb(final Float pLifeTime) {
    return rawAccumulateAllValuesOfb(new Object[]{
    null, 
    pLifeTime
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for lifeTime.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Float> rawAccumulateAllValuesOflifeTime(final Object[] parameters) {
    Set<Float> results = new HashSet<Float>();
    rawAccumulateAllValues(POSITION_LIFETIME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for lifeTime.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOflifeTime() {
    return rawAccumulateAllValuesOflifeTime(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for lifeTime.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOflifeTime(final InvalidLifeTimeMatch partialMatch) {
    return rawAccumulateAllValuesOflifeTime(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for lifeTime.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOflifeTime(final Battery pB) {
    return rawAccumulateAllValuesOflifeTime(new Object[]{
    pB, 
    null
    });
  }
  
  @Override
  protected InvalidLifeTimeMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidLifeTimeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) t.get(POSITION_B), (java.lang.Float) t.get(POSITION_LIFETIME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidLifeTimeMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidLifeTimeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) match[POSITION_B], (java.lang.Float) match[POSITION_LIFETIME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidLifeTimeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidLifeTimeMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) match[POSITION_B], (java.lang.Float) match[POSITION_LIFETIME]);
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
  public static IQuerySpecification<InvalidLifeTimeMatcher> querySpecification() throws IncQueryException {
    return InvalidLifeTimeQuerySpecification.instance();
  }
}
