package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMemoryMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidMemoryQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidMemory pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidMemoryMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"d", "memory"}, targetEditorId = "", severity = "error", message = "Invalid memory of drone ($d$)!")
 * pattern invalidMemory(d : Drone, memory) {
 * 	Drone.memory(d, memory);
 * 	check(memory {@literal <}= 0);
 * }
 * </pre></code>
 * 
 * @see InvalidMemoryMatch
 * @see InvalidMemoryProcessor
 * @see InvalidMemoryQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidMemoryMatcher extends BaseMatcher<InvalidMemoryMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidMemoryMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidMemoryMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidMemoryMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_D = 0;
  
  private final static int POSITION_MEMORY = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidMemoryMatcher.class);
  
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
  public InvalidMemoryMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidMemoryMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @return matches represented as a InvalidMemoryMatch object.
   * 
   */
  public Collection<InvalidMemoryMatch> getAllMatches(final Drone pD, final Integer pMemory) {
    return rawGetAllMatches(new Object[]{pD, pMemory});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @return a match represented as a InvalidMemoryMatch object, or null if no match is found.
   * 
   */
  public InvalidMemoryMatch getOneArbitraryMatch(final Drone pD, final Integer pMemory) {
    return rawGetOneArbitraryMatch(new Object[]{pD, pMemory});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Drone pD, final Integer pMemory) {
    return rawHasMatch(new Object[]{pD, pMemory});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Drone pD, final Integer pMemory) {
    return rawCountMatches(new Object[]{pD, pMemory});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Drone pD, final Integer pMemory, final IMatchProcessor<? super InvalidMemoryMatch> processor) {
    rawForEachMatch(new Object[]{pD, pMemory}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Drone pD, final Integer pMemory, final IMatchProcessor<? super InvalidMemoryMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pD, pMemory}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidMemoryMatch newMatch(final Drone pD, final Integer pMemory) {
    return InvalidMemoryMatch.newMatch(pD, pMemory);
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
  public Set<Drone> getAllValuesOfd(final InvalidMemoryMatch partialMatch) {
    return rawAccumulateAllValuesOfd(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for d.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Drone> getAllValuesOfd(final Integer pMemory) {
    return rawAccumulateAllValuesOfd(new Object[]{
    null, 
    pMemory
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for memory.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfmemory(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_MEMORY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for memory.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfmemory() {
    return rawAccumulateAllValuesOfmemory(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for memory.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfmemory(final InvalidMemoryMatch partialMatch) {
    return rawAccumulateAllValuesOfmemory(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for memory.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfmemory(final Drone pD) {
    return rawAccumulateAllValuesOfmemory(new Object[]{
    pD, 
    null
    });
  }
  
  @Override
  protected InvalidMemoryMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidMemoryMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) t.get(POSITION_D), (java.lang.Integer) t.get(POSITION_MEMORY));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidMemoryMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidMemoryMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D], (java.lang.Integer) match[POSITION_MEMORY]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidMemoryMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidMemoryMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D], (java.lang.Integer) match[POSITION_MEMORY]);
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
  public static IQuerySpecification<InvalidMemoryMatcher> querySpecification() throws IncQueryException {
    return InvalidMemoryQuerySpecification.instance();
  }
}
