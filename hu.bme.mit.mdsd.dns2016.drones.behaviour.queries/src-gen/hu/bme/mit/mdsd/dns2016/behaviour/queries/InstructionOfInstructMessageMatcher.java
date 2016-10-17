package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.Instruct;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruction;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InstructionOfInstructMessageMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InstructionOfInstructMessageQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.dns2016.behaviour.queries.instructionOfInstructMessage pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InstructionOfInstructMessageMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern instructionOfInstructMessage(ins, m) {
 * 	Instruct.instructions(m, ins);
 * }
 * </pre></code>
 * 
 * @see InstructionOfInstructMessageMatch
 * @see InstructionOfInstructMessageProcessor
 * @see InstructionOfInstructMessageQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InstructionOfInstructMessageMatcher extends BaseMatcher<InstructionOfInstructMessageMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InstructionOfInstructMessageMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    InstructionOfInstructMessageMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new InstructionOfInstructMessageMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_INS = 0;
  
  private final static int POSITION_M = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(InstructionOfInstructMessageMatcher.class);
  
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
  public InstructionOfInstructMessageMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InstructionOfInstructMessageMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return matches represented as a InstructionOfInstructMessageMatch object.
   * 
   */
  public Collection<InstructionOfInstructMessageMatch> getAllMatches(final Instruction pIns, final Instruct pM) {
    return rawGetAllMatches(new Object[]{pIns, pM});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return a match represented as a InstructionOfInstructMessageMatch object, or null if no match is found.
   * 
   */
  public InstructionOfInstructMessageMatch getOneArbitraryMatch(final Instruction pIns, final Instruct pM) {
    return rawGetOneArbitraryMatch(new Object[]{pIns, pM});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Instruction pIns, final Instruct pM) {
    return rawHasMatch(new Object[]{pIns, pM});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Instruction pIns, final Instruct pM) {
    return rawCountMatches(new Object[]{pIns, pM});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Instruction pIns, final Instruct pM, final IMatchProcessor<? super InstructionOfInstructMessageMatch> processor) {
    rawForEachMatch(new Object[]{pIns, pM}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Instruction pIns, final Instruct pM, final IMatchProcessor<? super InstructionOfInstructMessageMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pIns, pM}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InstructionOfInstructMessageMatch newMatch(final Instruction pIns, final Instruct pM) {
    return InstructionOfInstructMessageMatch.newMatch(pIns, pM);
  }
  
  /**
   * Retrieve the set of values that occur in matches for ins.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Instruction> rawAccumulateAllValuesOfins(final Object[] parameters) {
    Set<Instruction> results = new HashSet<Instruction>();
    rawAccumulateAllValues(POSITION_INS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ins.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruction> getAllValuesOfins() {
    return rawAccumulateAllValuesOfins(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ins.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruction> getAllValuesOfins(final InstructionOfInstructMessageMatch partialMatch) {
    return rawAccumulateAllValuesOfins(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ins.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruction> getAllValuesOfins(final Instruct pM) {
    return rawAccumulateAllValuesOfins(new Object[]{
    null, 
    pM
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Instruct> rawAccumulateAllValuesOfm(final Object[] parameters) {
    Set<Instruct> results = new HashSet<Instruct>();
    rawAccumulateAllValues(POSITION_M, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruct> getAllValuesOfm() {
    return rawAccumulateAllValuesOfm(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruct> getAllValuesOfm(final InstructionOfInstructMessageMatch partialMatch) {
    return rawAccumulateAllValuesOfm(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruct> getAllValuesOfm(final Instruction pIns) {
    return rawAccumulateAllValuesOfm(new Object[]{
    pIns, 
    null
    });
  }
  
  @Override
  protected InstructionOfInstructMessageMatch tupleToMatch(final Tuple t) {
    try {
    	return InstructionOfInstructMessageMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.Instruction) t.get(POSITION_INS), (hu.bme.mit.mdsd.dns2016.behaviour.Instruct) t.get(POSITION_M));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InstructionOfInstructMessageMatch arrayToMatch(final Object[] match) {
    try {
    	return InstructionOfInstructMessageMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.Instruction) match[POSITION_INS], (hu.bme.mit.mdsd.dns2016.behaviour.Instruct) match[POSITION_M]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected InstructionOfInstructMessageMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return InstructionOfInstructMessageMatch.newMutableMatch((hu.bme.mit.mdsd.dns2016.behaviour.Instruction) match[POSITION_INS], (hu.bme.mit.mdsd.dns2016.behaviour.Instruct) match[POSITION_M]);
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
  public static IQuerySpecification<InstructionOfInstructMessageMatcher> querySpecification() throws IncQueryException {
    return InstructionOfInstructMessageQuerySpecification.instance();
  }
}
