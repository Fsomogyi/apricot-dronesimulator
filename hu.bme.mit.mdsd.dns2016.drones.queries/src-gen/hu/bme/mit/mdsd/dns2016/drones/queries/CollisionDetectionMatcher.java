package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.CollisionDetectionMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.CollisionDetectionQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.collisionDetection pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CollisionDetectionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"se1", "se2"}, symmetric = {"se1", "se2"}, targetEditorId = "", severity = "error", message = "Collision detected between elements $se1$ and $se2$!")
 *  pattern collisionDetection(se1 : SizedElement, se2 : SizedElement) {
 *  	se1 != se2;
 *  	
 *  	neg find chargeStationOfDrone(se1, se2);
 *  	neg find chargeStationOfDrone(se2, se1);
 *  	
 *  	neg find sizeZero(se1);
 *  	neg find sizeZero(se2);
 *  	
 *  	SizedElement.x(se1, x1);
 *  	SizedElement.y(se1, y1);
 *  	SizedElement.z(se1, z1);
 *  	SizedElement.x(se2, x2);
 *  	SizedElement.y(se2, y2);
 *  	SizedElement.z(se2, z2);
 *  	
 *  	SizedElement.height(se1, h1);
 *  	SizedElement.length(se1, l1);
 *  	SizedElement.width(se1, w1);
 *  	SizedElement.height(se2, h2);
 *  	SizedElement.length(se2, l2);
 *  	SizedElement.width(se2, w2);
 *  	
 *  	check( (((x1 {@literal >}= x2) && ((x1 - x2) {@literal <} (l1 + l2)/2)) || ((x2 {@literal >} x1) && ((x2 - x1) {@literal <} (l1 + l2)/2))) &&
 *  		   (((y1 {@literal >}= y2) && ((y1 - y2) {@literal <} (h1 + h2)/2)) || ((y2 {@literal >} y1) && ((y2 - y1) {@literal <} (h1 + h2)/2))) &&
 *  		   (((z1 {@literal >}= z2) && ((z1 - z2) {@literal <} (w1 + w2)/2)) || ((z2 {@literal >} z1) && ((z2 - z1) {@literal <} (w1 + w2)/2))));
 *  }
 * </pre></code>
 * 
 * @see CollisionDetectionMatch
 * @see CollisionDetectionProcessor
 * @see CollisionDetectionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CollisionDetectionMatcher extends BaseMatcher<CollisionDetectionMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CollisionDetectionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CollisionDetectionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CollisionDetectionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SE1 = 0;
  
  private final static int POSITION_SE2 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CollisionDetectionMatcher.class);
  
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
  public CollisionDetectionMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CollisionDetectionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @return matches represented as a CollisionDetectionMatch object.
   * 
   */
  public Collection<CollisionDetectionMatch> getAllMatches(final SizedElement pSe1, final SizedElement pSe2) {
    return rawGetAllMatches(new Object[]{pSe1, pSe2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @return a match represented as a CollisionDetectionMatch object, or null if no match is found.
   * 
   */
  public CollisionDetectionMatch getOneArbitraryMatch(final SizedElement pSe1, final SizedElement pSe2) {
    return rawGetOneArbitraryMatch(new Object[]{pSe1, pSe2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SizedElement pSe1, final SizedElement pSe2) {
    return rawHasMatch(new Object[]{pSe1, pSe2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SizedElement pSe1, final SizedElement pSe2) {
    return rawCountMatches(new Object[]{pSe1, pSe2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SizedElement pSe1, final SizedElement pSe2, final IMatchProcessor<? super CollisionDetectionMatch> processor) {
    rawForEachMatch(new Object[]{pSe1, pSe2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SizedElement pSe1, final SizedElement pSe2, final IMatchProcessor<? super CollisionDetectionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSe1, pSe2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CollisionDetectionMatch newMatch(final SizedElement pSe1, final SizedElement pSe2) {
    return CollisionDetectionMatch.newMatch(pSe1, pSe2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for se1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SizedElement> rawAccumulateAllValuesOfse1(final Object[] parameters) {
    Set<SizedElement> results = new HashSet<SizedElement>();
    rawAccumulateAllValues(POSITION_SE1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for se1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SizedElement> getAllValuesOfse1() {
    return rawAccumulateAllValuesOfse1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for se1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SizedElement> getAllValuesOfse1(final CollisionDetectionMatch partialMatch) {
    return rawAccumulateAllValuesOfse1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for se1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SizedElement> getAllValuesOfse1(final SizedElement pSe2) {
    return rawAccumulateAllValuesOfse1(new Object[]{
    null, 
    pSe2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for se2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SizedElement> rawAccumulateAllValuesOfse2(final Object[] parameters) {
    Set<SizedElement> results = new HashSet<SizedElement>();
    rawAccumulateAllValues(POSITION_SE2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for se2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SizedElement> getAllValuesOfse2() {
    return rawAccumulateAllValuesOfse2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for se2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SizedElement> getAllValuesOfse2(final CollisionDetectionMatch partialMatch) {
    return rawAccumulateAllValuesOfse2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for se2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SizedElement> getAllValuesOfse2(final SizedElement pSe1) {
    return rawAccumulateAllValuesOfse2(new Object[]{
    pSe1, 
    null
    });
  }
  
  @Override
  protected CollisionDetectionMatch tupleToMatch(final Tuple t) {
    try {
    	return CollisionDetectionMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.SizedElement) t.get(POSITION_SE1), (hu.bme.mit.mdsd.dns2016.drones.SizedElement) t.get(POSITION_SE2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CollisionDetectionMatch arrayToMatch(final Object[] match) {
    try {
    	return CollisionDetectionMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.SizedElement) match[POSITION_SE1], (hu.bme.mit.mdsd.dns2016.drones.SizedElement) match[POSITION_SE2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CollisionDetectionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CollisionDetectionMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.SizedElement) match[POSITION_SE1], (hu.bme.mit.mdsd.dns2016.drones.SizedElement) match[POSITION_SE2]);
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
  public static IQuerySpecification<CollisionDetectionMatcher> querySpecification() throws IncQueryException {
    return CollisionDetectionQuerySpecification.instance();
  }
}
