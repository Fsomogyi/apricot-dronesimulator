package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidRechargeRateMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidRechargeRateQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidRechargeRate pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidRechargeRateMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"b", "rechargeRate"}, targetEditorId = "", severity = "error", message = "Invalid recharge time of battery!") 
 * pattern invalidRechargeRate(b : Battery, rechargeRate) {
 * 	Battery.rechargeRate(b, rechargeRate);
 * 	check(rechargeRate {@literal <}= 0);
 * }
 * </pre></code>
 * 
 * @see InvalidRechargeRateMatch
 * @see InvalidRechargeRateProcessor
 * @see InvalidRechargeRateQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidRechargeRateMatcher extends BaseMatcher<InvalidRechargeRateMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidRechargeRateMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidRechargeRateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidRechargeRateMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_B = 0;
  
  private final static int POSITION_RECHARGERATE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidRechargeRateMatcher.class);
  
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
  public InvalidRechargeRateMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidRechargeRateMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @return matches represented as a InvalidRechargeRateMatch object.
   * 
   */
  public Collection<InvalidRechargeRateMatch> getAllMatches(final Battery pB, final Float pRechargeRate) {
    return rawGetAllMatches(new Object[]{pB, pRechargeRate});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @return a match represented as a InvalidRechargeRateMatch object, or null if no match is found.
   * 
   */
  public InvalidRechargeRateMatch getOneArbitraryMatch(final Battery pB, final Float pRechargeRate) {
    return rawGetOneArbitraryMatch(new Object[]{pB, pRechargeRate});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Battery pB, final Float pRechargeRate) {
    return rawHasMatch(new Object[]{pB, pRechargeRate});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Battery pB, final Float pRechargeRate) {
    return rawCountMatches(new Object[]{pB, pRechargeRate});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Battery pB, final Float pRechargeRate, final IMatchProcessor<? super InvalidRechargeRateMatch> processor) {
    rawForEachMatch(new Object[]{pB, pRechargeRate}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Battery pB, final Float pRechargeRate, final IMatchProcessor<? super InvalidRechargeRateMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pB, pRechargeRate}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidRechargeRateMatch newMatch(final Battery pB, final Float pRechargeRate) {
    return InvalidRechargeRateMatch.newMatch(pB, pRechargeRate);
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
  public Set<Battery> getAllValuesOfb(final InvalidRechargeRateMatch partialMatch) {
    return rawAccumulateAllValuesOfb(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Battery> getAllValuesOfb(final Float pRechargeRate) {
    return rawAccumulateAllValuesOfb(new Object[]{
    null, 
    pRechargeRate
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for rechargeRate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Float> rawAccumulateAllValuesOfrechargeRate(final Object[] parameters) {
    Set<Float> results = new HashSet<Float>();
    rawAccumulateAllValues(POSITION_RECHARGERATE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for rechargeRate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfrechargeRate() {
    return rawAccumulateAllValuesOfrechargeRate(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rechargeRate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfrechargeRate(final InvalidRechargeRateMatch partialMatch) {
    return rawAccumulateAllValuesOfrechargeRate(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rechargeRate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfrechargeRate(final Battery pB) {
    return rawAccumulateAllValuesOfrechargeRate(new Object[]{
    pB, 
    null
    });
  }
  
  @Override
  protected InvalidRechargeRateMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidRechargeRateMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) t.get(POSITION_B), (java.lang.Float) t.get(POSITION_RECHARGERATE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidRechargeRateMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidRechargeRateMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) match[POSITION_B], (java.lang.Float) match[POSITION_RECHARGERATE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidRechargeRateMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidRechargeRateMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) match[POSITION_B], (java.lang.Float) match[POSITION_RECHARGERATE]);
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
  public static IQuerySpecification<InvalidRechargeRateMatcher> querySpecification() throws IncQueryException {
    return InvalidRechargeRateQuerySpecification.instance();
  }
}
