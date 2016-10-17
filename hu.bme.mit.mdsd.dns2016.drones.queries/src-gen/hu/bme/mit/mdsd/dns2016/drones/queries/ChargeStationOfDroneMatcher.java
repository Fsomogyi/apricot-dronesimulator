package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.ChargeStation;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeStationOfDroneMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.ChargeStationOfDroneQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.chargeStationOfDrone pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ChargeStationOfDroneMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern chargeStationOfDrone(d : Drone, cs : ChargeStation) {
 *  	Drone.chargeStation(d, cs);
 *  }
 * </pre></code>
 * 
 * @see ChargeStationOfDroneMatch
 * @see ChargeStationOfDroneProcessor
 * @see ChargeStationOfDroneQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ChargeStationOfDroneMatcher extends BaseMatcher<ChargeStationOfDroneMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ChargeStationOfDroneMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ChargeStationOfDroneMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ChargeStationOfDroneMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_D = 0;
  
  private final static int POSITION_CS = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ChargeStationOfDroneMatcher.class);
  
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
  public ChargeStationOfDroneMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ChargeStationOfDroneMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @return matches represented as a ChargeStationOfDroneMatch object.
   * 
   */
  public Collection<ChargeStationOfDroneMatch> getAllMatches(final Drone pD, final ChargeStation pCs) {
    return rawGetAllMatches(new Object[]{pD, pCs});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @return a match represented as a ChargeStationOfDroneMatch object, or null if no match is found.
   * 
   */
  public ChargeStationOfDroneMatch getOneArbitraryMatch(final Drone pD, final ChargeStation pCs) {
    return rawGetOneArbitraryMatch(new Object[]{pD, pCs});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Drone pD, final ChargeStation pCs) {
    return rawHasMatch(new Object[]{pD, pCs});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Drone pD, final ChargeStation pCs) {
    return rawCountMatches(new Object[]{pD, pCs});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Drone pD, final ChargeStation pCs, final IMatchProcessor<? super ChargeStationOfDroneMatch> processor) {
    rawForEachMatch(new Object[]{pD, pCs}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Drone pD, final ChargeStation pCs, final IMatchProcessor<? super ChargeStationOfDroneMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pD, pCs}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ChargeStationOfDroneMatch newMatch(final Drone pD, final ChargeStation pCs) {
    return ChargeStationOfDroneMatch.newMatch(pD, pCs);
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
  public Set<Drone> getAllValuesOfd(final ChargeStationOfDroneMatch partialMatch) {
    return rawAccumulateAllValuesOfd(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for d.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Drone> getAllValuesOfd(final ChargeStation pCs) {
    return rawAccumulateAllValuesOfd(new Object[]{
    null, 
    pCs
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for cs.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ChargeStation> rawAccumulateAllValuesOfcs(final Object[] parameters) {
    Set<ChargeStation> results = new HashSet<ChargeStation>();
    rawAccumulateAllValues(POSITION_CS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for cs.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ChargeStation> getAllValuesOfcs() {
    return rawAccumulateAllValuesOfcs(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cs.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ChargeStation> getAllValuesOfcs(final ChargeStationOfDroneMatch partialMatch) {
    return rawAccumulateAllValuesOfcs(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cs.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ChargeStation> getAllValuesOfcs(final Drone pD) {
    return rawAccumulateAllValuesOfcs(new Object[]{
    pD, 
    null
    });
  }
  
  @Override
  protected ChargeStationOfDroneMatch tupleToMatch(final Tuple t) {
    try {
    	return ChargeStationOfDroneMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) t.get(POSITION_D), (hu.bme.mit.mdsd.dns2016.drones.ChargeStation) t.get(POSITION_CS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ChargeStationOfDroneMatch arrayToMatch(final Object[] match) {
    try {
    	return ChargeStationOfDroneMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D], (hu.bme.mit.mdsd.dns2016.drones.ChargeStation) match[POSITION_CS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ChargeStationOfDroneMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ChargeStationOfDroneMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D], (hu.bme.mit.mdsd.dns2016.drones.ChargeStation) match[POSITION_CS]);
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
  public static IQuerySpecification<ChargeStationOfDroneMatcher> querySpecification() throws IncQueryException {
    return ChargeStationOfDroneQuerySpecification.instance();
  }
}
