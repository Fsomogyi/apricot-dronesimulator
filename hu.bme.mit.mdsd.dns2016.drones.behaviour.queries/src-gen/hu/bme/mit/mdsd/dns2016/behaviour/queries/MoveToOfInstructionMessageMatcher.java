package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.MoveTo;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.MoveToOfInstructionMessageMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.MoveToOfInstructionMessageQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.behaviour.queries.moveToOfInstructionMessage pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MoveToOfInstructionMessageMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern moveToOfInstructionMessage(mt) {
 * 	MoveTo(mt);
 * 	Instruct.instructions(_, mt);
 * }
 * </pre></code>
 * 
 * @see MoveToOfInstructionMessageMatch
 * @see MoveToOfInstructionMessageProcessor
 * @see MoveToOfInstructionMessageQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MoveToOfInstructionMessageMatcher extends BaseMatcher<MoveToOfInstructionMessageMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MoveToOfInstructionMessageMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MoveToOfInstructionMessageMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MoveToOfInstructionMessageMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_MT = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MoveToOfInstructionMessageMatcher.class);
  
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
  public MoveToOfInstructionMessageMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MoveToOfInstructionMessageMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @return matches represented as a MoveToOfInstructionMessageMatch object.
   * 
   */
  public Collection<MoveToOfInstructionMessageMatch> getAllMatches(final MoveTo pMt) {
    return rawGetAllMatches(new Object[]{pMt});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @return a match represented as a MoveToOfInstructionMessageMatch object, or null if no match is found.
   * 
   */
  public MoveToOfInstructionMessageMatch getOneArbitraryMatch(final MoveTo pMt) {
    return rawGetOneArbitraryMatch(new Object[]{pMt});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MoveTo pMt) {
    return rawHasMatch(new Object[]{pMt});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MoveTo pMt) {
    return rawCountMatches(new Object[]{pMt});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MoveTo pMt, final IMatchProcessor<? super MoveToOfInstructionMessageMatch> processor) {
    rawForEachMatch(new Object[]{pMt}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MoveTo pMt, final IMatchProcessor<? super MoveToOfInstructionMessageMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMt}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MoveToOfInstructionMessageMatch newMatch(final MoveTo pMt) {
    return MoveToOfInstructionMessageMatch.newMatch(pMt);
  }
  
  /**
   * Retrieve the set of values that occur in matches for mt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MoveTo> rawAccumulateAllValuesOfmt(final Object[] parameters) {
    Set<MoveTo> results = new HashSet<MoveTo>();
    rawAccumulateAllValues(POSITION_MT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for mt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MoveTo> getAllValuesOfmt() {
    return rawAccumulateAllValuesOfmt(emptyArray());
  }
  
  @Override
  protected MoveToOfInstructionMessageMatch tupleToMatch(final Tuple t) {
    try {
    	return MoveToOfInstructionMessageMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.MoveTo) t.get(POSITION_MT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MoveToOfInstructionMessageMatch arrayToMatch(final Object[] match) {
    try {
    	return MoveToOfInstructionMessageMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.MoveTo) match[POSITION_MT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MoveToOfInstructionMessageMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MoveToOfInstructionMessageMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.behaviour.MoveTo) match[POSITION_MT]);
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
  public static IQuerySpecification<MoveToOfInstructionMessageMatcher> querySpecification() throws IncQueryException {
    return MoveToOfInstructionMessageQuerySpecification.instance();
  }
}
