package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCPUFrequencyMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidCPUFrequencyQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidCPUFrequency pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidCPUFrequencyMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"d", "freq"}, targetEditorId = "", severity = "error", message = "Invalid CPU frequency of drone ($d$)!")
 * pattern invalidCPUFrequency(d : Drone, freq) {
 * 	Drone.cpuFrequency(d, freq);
 * 	check(freq {@literal <}= 0);
 * }
 * </pre></code>
 * 
 * @see InvalidCPUFrequencyMatch
 * @see InvalidCPUFrequencyProcessor
 * @see InvalidCPUFrequencyQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidCPUFrequencyMatcher extends BaseMatcher<InvalidCPUFrequencyMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidCPUFrequencyMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidCPUFrequencyMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidCPUFrequencyMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_D = 0;
  
  private final static int POSITION_FREQ = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidCPUFrequencyMatcher.class);
  
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
  public InvalidCPUFrequencyMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidCPUFrequencyMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @return matches represented as a InvalidCPUFrequencyMatch object.
   * 
   */
  public Collection<InvalidCPUFrequencyMatch> getAllMatches(final Drone pD, final Integer pFreq) {
    return rawGetAllMatches(new Object[]{pD, pFreq});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @return a match represented as a InvalidCPUFrequencyMatch object, or null if no match is found.
   * 
   */
  public InvalidCPUFrequencyMatch getOneArbitraryMatch(final Drone pD, final Integer pFreq) {
    return rawGetOneArbitraryMatch(new Object[]{pD, pFreq});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Drone pD, final Integer pFreq) {
    return rawHasMatch(new Object[]{pD, pFreq});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Drone pD, final Integer pFreq) {
    return rawCountMatches(new Object[]{pD, pFreq});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Drone pD, final Integer pFreq, final IMatchProcessor<? super InvalidCPUFrequencyMatch> processor) {
    rawForEachMatch(new Object[]{pD, pFreq}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Drone pD, final Integer pFreq, final IMatchProcessor<? super InvalidCPUFrequencyMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pD, pFreq}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidCPUFrequencyMatch newMatch(final Drone pD, final Integer pFreq) {
    return InvalidCPUFrequencyMatch.newMatch(pD, pFreq);
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
  public Set<Drone> getAllValuesOfd(final InvalidCPUFrequencyMatch partialMatch) {
    return rawAccumulateAllValuesOfd(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for d.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Drone> getAllValuesOfd(final Integer pFreq) {
    return rawAccumulateAllValuesOfd(new Object[]{
    null, 
    pFreq
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for freq.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOffreq(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_FREQ, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for freq.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOffreq() {
    return rawAccumulateAllValuesOffreq(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for freq.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOffreq(final InvalidCPUFrequencyMatch partialMatch) {
    return rawAccumulateAllValuesOffreq(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for freq.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOffreq(final Drone pD) {
    return rawAccumulateAllValuesOffreq(new Object[]{
    pD, 
    null
    });
  }
  
  @Override
  protected InvalidCPUFrequencyMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidCPUFrequencyMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) t.get(POSITION_D), (java.lang.Integer) t.get(POSITION_FREQ));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidCPUFrequencyMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidCPUFrequencyMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D], (java.lang.Integer) match[POSITION_FREQ]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidCPUFrequencyMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidCPUFrequencyMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) match[POSITION_D], (java.lang.Integer) match[POSITION_FREQ]);
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
  public static IQuerySpecification<InvalidCPUFrequencyMatcher> querySpecification() throws IncQueryException {
    return InvalidCPUFrequencyQuerySpecification.instance();
  }
}
