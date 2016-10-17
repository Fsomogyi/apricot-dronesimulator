package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidWeightMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidWeightQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidWeight pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvalidWeightMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"mo", "w"}, targetEditorId = "", severity = "error", message = "Invalid weight ($w$) of movable object $mo$!") 
 *  pattern invalidWeight(mo : MovableObject, w) {
 *  	MovableObject.weight(mo, w);
 *  	check(w {@literal <} 0);
 *  }
 * </pre></code>
 * 
 * @see InvalidWeightMatch
 * @see InvalidWeightProcessor
 * @see InvalidWeightQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvalidWeightMatcher extends BaseMatcher<InvalidWeightMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvalidWeightMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InvalidWeightMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InvalidWeightMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_MO = 0;
  
  private final static int POSITION_W = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InvalidWeightMatcher.class);
  
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
  public InvalidWeightMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidWeightMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @return matches represented as a InvalidWeightMatch object.
   * 
   */
  public Collection<InvalidWeightMatch> getAllMatches(final MovableObject pMo, final Float pW) {
    return rawGetAllMatches(new Object[]{pMo, pW});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @return a match represented as a InvalidWeightMatch object, or null if no match is found.
   * 
   */
  public InvalidWeightMatch getOneArbitraryMatch(final MovableObject pMo, final Float pW) {
    return rawGetOneArbitraryMatch(new Object[]{pMo, pW});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MovableObject pMo, final Float pW) {
    return rawHasMatch(new Object[]{pMo, pW});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MovableObject pMo, final Float pW) {
    return rawCountMatches(new Object[]{pMo, pW});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MovableObject pMo, final Float pW, final IMatchProcessor<? super InvalidWeightMatch> processor) {
    rawForEachMatch(new Object[]{pMo, pW}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MovableObject pMo, final Float pW, final IMatchProcessor<? super InvalidWeightMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMo, pW}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidWeightMatch newMatch(final MovableObject pMo, final Float pW) {
    return InvalidWeightMatch.newMatch(pMo, pW);
  }
  
  /**
   * Retrieve the set of values that occur in matches for mo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MovableObject> rawAccumulateAllValuesOfmo(final Object[] parameters) {
    Set<MovableObject> results = new HashSet<MovableObject>();
    rawAccumulateAllValues(POSITION_MO, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for mo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MovableObject> getAllValuesOfmo() {
    return rawAccumulateAllValuesOfmo(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MovableObject> getAllValuesOfmo(final InvalidWeightMatch partialMatch) {
    return rawAccumulateAllValuesOfmo(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MovableObject> getAllValuesOfmo(final Float pW) {
    return rawAccumulateAllValuesOfmo(new Object[]{
    null, 
    pW
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for w.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Float> rawAccumulateAllValuesOfw(final Object[] parameters) {
    Set<Float> results = new HashSet<Float>();
    rawAccumulateAllValues(POSITION_W, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for w.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfw() {
    return rawAccumulateAllValuesOfw(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for w.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfw(final InvalidWeightMatch partialMatch) {
    return rawAccumulateAllValuesOfw(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for w.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Float> getAllValuesOfw(final MovableObject pMo) {
    return rawAccumulateAllValuesOfw(new Object[]{
    pMo, 
    null
    });
  }
  
  @Override
  protected InvalidWeightMatch tupleToMatch(final Tuple t) {
    try {
    	return InvalidWeightMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.MovableObject) t.get(POSITION_MO), (java.lang.Float) t.get(POSITION_W));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidWeightMatch arrayToMatch(final Object[] match) {
    try {
    	return InvalidWeightMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.MovableObject) match[POSITION_MO], (java.lang.Float) match[POSITION_W]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InvalidWeightMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InvalidWeightMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.MovableObject) match[POSITION_MO], (java.lang.Float) match[POSITION_W]);
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
  public static IQuerySpecification<InvalidWeightMatcher> querySpecification() throws IncQueryException {
    return InvalidWeightQuerySpecification.instance();
  }
}
