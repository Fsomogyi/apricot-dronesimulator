package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Parameter;
import hu.bme.mit.mdsd.dns2016.drones.queries.SameParametersFieldObjectMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.SameParametersFieldObjectQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.drones.queries.sameParametersFieldObject pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SameParametersFieldObjectMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(key = {"f", "p1", "p2"}, symmetric = {"p1", "p2"}, targetEditorId = "", severity = "error", message = "Duplicate parameter keys at field object $f$!")   
 * pattern sameParametersFieldObject(f : FieldObject, p1 : Parameter, p2 : Parameter) {
 * 	p1 != p2;
 * 	
 * 	FieldObject.parameters(f, p1);
 * 	FieldObject.parameters(f, p2);
 * 
 * 	Parameter.key(p1, k1);
 * 	Parameter.key(p2, k2);
 * 
 * 	k1 == k2;
 * }
 * </pre></code>
 * 
 * @see SameParametersFieldObjectMatch
 * @see SameParametersFieldObjectProcessor
 * @see SameParametersFieldObjectQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SameParametersFieldObjectMatcher extends BaseMatcher<SameParametersFieldObjectMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SameParametersFieldObjectMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SameParametersFieldObjectMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SameParametersFieldObjectMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_F = 0;
  
  private final static int POSITION_P1 = 1;
  
  private final static int POSITION_P2 = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SameParametersFieldObjectMatcher.class);
  
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
  public SameParametersFieldObjectMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SameParametersFieldObjectMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @return matches represented as a SameParametersFieldObjectMatch object.
   * 
   */
  public Collection<SameParametersFieldObjectMatch> getAllMatches(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
    return rawGetAllMatches(new Object[]{pF, pP1, pP2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @return a match represented as a SameParametersFieldObjectMatch object, or null if no match is found.
   * 
   */
  public SameParametersFieldObjectMatch getOneArbitraryMatch(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
    return rawGetOneArbitraryMatch(new Object[]{pF, pP1, pP2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
    return rawHasMatch(new Object[]{pF, pP1, pP2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
    return rawCountMatches(new Object[]{pF, pP1, pP2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final FieldObject pF, final Parameter pP1, final Parameter pP2, final IMatchProcessor<? super SameParametersFieldObjectMatch> processor) {
    rawForEachMatch(new Object[]{pF, pP1, pP2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final FieldObject pF, final Parameter pP1, final Parameter pP2, final IMatchProcessor<? super SameParametersFieldObjectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pF, pP1, pP2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SameParametersFieldObjectMatch newMatch(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
    return SameParametersFieldObjectMatch.newMatch(pF, pP1, pP2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for f.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<FieldObject> rawAccumulateAllValuesOff(final Object[] parameters) {
    Set<FieldObject> results = new HashSet<FieldObject>();
    rawAccumulateAllValues(POSITION_F, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for f.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<FieldObject> getAllValuesOff() {
    return rawAccumulateAllValuesOff(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for f.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<FieldObject> getAllValuesOff(final SameParametersFieldObjectMatch partialMatch) {
    return rawAccumulateAllValuesOff(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for f.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<FieldObject> getAllValuesOff(final Parameter pP1, final Parameter pP2) {
    return rawAccumulateAllValuesOff(new Object[]{
    null, 
    pP1, 
    pP2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Parameter> rawAccumulateAllValuesOfp1(final Object[] parameters) {
    Set<Parameter> results = new HashSet<Parameter>();
    rawAccumulateAllValues(POSITION_P1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Parameter> getAllValuesOfp1() {
    return rawAccumulateAllValuesOfp1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Parameter> getAllValuesOfp1(final SameParametersFieldObjectMatch partialMatch) {
    return rawAccumulateAllValuesOfp1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Parameter> getAllValuesOfp1(final FieldObject pF, final Parameter pP2) {
    return rawAccumulateAllValuesOfp1(new Object[]{
    pF, 
    null, 
    pP2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Parameter> rawAccumulateAllValuesOfp2(final Object[] parameters) {
    Set<Parameter> results = new HashSet<Parameter>();
    rawAccumulateAllValues(POSITION_P2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Parameter> getAllValuesOfp2() {
    return rawAccumulateAllValuesOfp2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Parameter> getAllValuesOfp2(final SameParametersFieldObjectMatch partialMatch) {
    return rawAccumulateAllValuesOfp2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Parameter> getAllValuesOfp2(final FieldObject pF, final Parameter pP1) {
    return rawAccumulateAllValuesOfp2(new Object[]{
    pF, 
    pP1, 
    null
    });
  }
  
  @Override
  protected SameParametersFieldObjectMatch tupleToMatch(final Tuple t) {
    try {
    	return SameParametersFieldObjectMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.FieldObject) t.get(POSITION_F), (hu.bme.mit.mdsd.dns2016.drones.Parameter) t.get(POSITION_P1), (hu.bme.mit.mdsd.dns2016.drones.Parameter) t.get(POSITION_P2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameParametersFieldObjectMatch arrayToMatch(final Object[] match) {
    try {
    	return SameParametersFieldObjectMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.FieldObject) match[POSITION_F], (hu.bme.mit.mdsd.dns2016.drones.Parameter) match[POSITION_P1], (hu.bme.mit.mdsd.dns2016.drones.Parameter) match[POSITION_P2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameParametersFieldObjectMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SameParametersFieldObjectMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.drones.FieldObject) match[POSITION_F], (hu.bme.mit.mdsd.dns2016.drones.Parameter) match[POSITION_P1], (hu.bme.mit.mdsd.dns2016.drones.Parameter) match[POSITION_P2]);
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
  public static IQuerySpecification<SameParametersFieldObjectMatcher> querySpecification() throws IncQueryException {
    return SameParametersFieldObjectQuerySpecification.instance();
  }
}
