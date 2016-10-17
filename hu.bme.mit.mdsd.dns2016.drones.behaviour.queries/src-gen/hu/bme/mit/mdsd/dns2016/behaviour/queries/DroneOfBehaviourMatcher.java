package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.DroneOfBehaviourMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.DroneOfBehaviourQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.behaviour.queries.droneOfBehaviour pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DroneOfBehaviourMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern droneOfBehaviour(db : DroneBehaviour, d : Drone) {
 * 	DroneBehaviour.drones(db, d);
 * }
 * </pre></code>
 * 
 * @see DroneOfBehaviourMatch
 * @see DroneOfBehaviourProcessor
 * @see DroneOfBehaviourQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DroneOfBehaviourMatcher extends BaseMatcher<DroneOfBehaviourMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DroneOfBehaviourMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    DroneOfBehaviourMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new DroneOfBehaviourMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DB = 0;
  
  private final static int POSITION_D = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(DroneOfBehaviourMatcher.class);
  
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
  public DroneOfBehaviourMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public DroneOfBehaviourMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return matches represented as a DroneOfBehaviourMatch object.
   * 
   */
  public Collection<DroneOfBehaviourMatch> getAllMatches(final DroneBehaviour pDb, final Drone pD) {
    return rawGetAllMatches(new Object[]{pDb, pD});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return a match represented as a DroneOfBehaviourMatch object, or null if no match is found.
   * 
   */
  public DroneOfBehaviourMatch getOneArbitraryMatch(final DroneBehaviour pDb, final Drone pD) {
    return rawGetOneArbitraryMatch(new Object[]{pDb, pD});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DroneBehaviour pDb, final Drone pD) {
    return rawHasMatch(new Object[]{pDb, pD});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DroneBehaviour pDb, final Drone pD) {
    return rawCountMatches(new Object[]{pDb, pD});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DroneBehaviour pDb, final Drone pD, final IMatchProcessor<? super DroneOfBehaviourMatch> processor) {
    rawForEachMatch(new Object[]{pDb, pD}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DroneBehaviour pDb, final Drone pD, final IMatchProcessor<? super DroneOfBehaviourMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDb, pD}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DroneOfBehaviourMatch newMatch(final DroneBehaviour pDb, final Drone pD) {
    return DroneOfBehaviourMatch.newMatch(pDb, pD);
  }
  
  /**
   * Retrieve the set of values that occur in matches for db.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DroneBehaviour> rawAccumulateAllValuesOfdb(final Object[] parameters) {
    Set<DroneBehaviour> results = new HashSet<DroneBehaviour>();
    rawAccumulateAllValues(POSITION_DB, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for db.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneBehaviour> getAllValuesOfdb() {
    return rawAccumulateAllValuesOfdb(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for db.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneBehaviour> getAllValuesOfdb(final DroneOfBehaviourMatch partialMatch) {
    return rawAccumulateAllValuesOfdb(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for db.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneBehaviour> getAllValuesOfdb(final Drone pD) {
    return rawAccumulateAllValuesOfdb(new Object[]{
    null, 
    pD
    });
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
  public Set<Drone> getAllValuesOfd(final DroneOfBehaviourMatch partialMatch) {
    return rawAccumulateAllValuesOfd(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for d.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Drone> getAllValuesOfd(final DroneBehaviour pDb) {
    return rawAccumulateAllValuesOfd(new Object[]{
    pDb, 
    null
    });
  }
  
  @Override
  protected DroneOfBehaviourMatch tupleToMatch(final Tuple t) {
    try {
    	return DroneOfBehaviourMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour) t.get(POSITION_DB), (hu.bme.mit.mdsd.dns2016.drones.Drone) t.get(POSITION_D));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DroneOfBehaviourMatch arrayToMatch(final Object[] match) {
    try {
    	return DroneOfBehaviourMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour) match[POSITION_DB], (hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DroneOfBehaviourMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return DroneOfBehaviourMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour) match[POSITION_DB], (hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D]);
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
  public static IQuerySpecification<DroneOfBehaviourMatcher> querySpecification() throws IncQueryException {
    return DroneOfBehaviourQuerySpecification.instance();
  }
}
