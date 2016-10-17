package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.Lift;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidLiftInstructionMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidLiftInstructionQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidLiftInstruction pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidLiftInstructionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"lift"}, targetEditorId = "", severity = "error", message = "Invalid Lift instruction - weight is greater than the max payload of the drone(s)!")
 * pattern invalidLiftInstruction(lift : Lift) {
 * 	DroneBehaviour.drones(db, d);
 * 	DroneBehaviour.instructions(db, lift);
 * 	Lift.target(lift, target);
 * 	MovableObject.weight(target, w);
 * 	Drone.maxPayload(d, mp);
 * 	check(mp {@literal <} w);
 * }
 * </pre></code>
 * 
 * @see InvalidLiftInstructionMatch
 * @see InvalidLiftInstructionProcessor
 * @see InvalidLiftInstructionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidLiftInstructionMatcher extends BaseMatcher<InvalidLiftInstructionMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidLiftInstructionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidLiftInstructionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidLiftInstructionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_LIFT = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidLiftInstructionMatcher.class);
  
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
  public InvalidLiftInstructionMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidLiftInstructionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @return matches represented as a InvalidLiftInstructionMatch object.
   * 
   */
  public Collection<InvalidLiftInstructionMatch> getAllMatches(final Lift pLift) {
    return rawGetAllMatches(new Object[]{pLift});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @return a match represented as a InvalidLiftInstructionMatch object, or null if no match is found.
   * 
   */
  public InvalidLiftInstructionMatch getOneArbitraryMatch(final Lift pLift) {
    return rawGetOneArbitraryMatch(new Object[]{pLift});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Lift pLift) {
    return rawHasMatch(new Object[]{pLift});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Lift pLift) {
    return rawCountMatches(new Object[]{pLift});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Lift pLift, final IMatchProcessor<? super InvalidLiftInstructionMatch> processor) {
    rawForEachMatch(new Object[]{pLift}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Lift pLift, final IMatchProcessor<? super InvalidLiftInstructionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pLift}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidLiftInstructionMatch newMatch(final Lift pLift) {
    return InvalidLiftInstructionMatch.newMatch(pLift);
  }
  
  /**
   * Retrieve the set of values that occur in matches for lift.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Lift> rawAccumulateAllValuesOflift(final Object[] parameters) {
    Set<Lift> results = new HashSet<Lift>();
    rawAccumulateAllValues(POSITION_LIFT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for lift.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Lift> getAllValuesOflift() {
    return rawAccumulateAllValuesOflift(emptyArray());
  }
  
  @Override
  protected InvalidLiftInstructionMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidLiftInstructionMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.Lift) t.get(POSITION_LIFT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidLiftInstructionMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidLiftInstructionMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.Lift) match[POSITION_LIFT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidLiftInstructionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidLiftInstructionMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.behaviour.Lift) match[POSITION_LIFT]);
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
  public static IQuerySpecification<InvalidLiftInstructionMatcher> querySpecification() throws IncQueryException {
    return InvalidLiftInstructionQuerySpecification.instance();
  }
}
