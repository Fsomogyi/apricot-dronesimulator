package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.AllLiftInstructionsMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.AllLiftInstructionsMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InstructionOfInstructMessageQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate AllLiftInstructionsMatcher in a type-safe way.
 * 
 * @see AllLiftInstructionsMatcher
 * @see AllLiftInstructionsMatch
 * 
 */
@SuppressWarnings("all")
public final class AllLiftInstructionsQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllLiftInstructionsMatcher> {
  private AllLiftInstructionsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllLiftInstructionsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllLiftInstructionsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllLiftInstructionsMatcher.on(engine);
  }
  
  @Override
  public AllLiftInstructionsMatch newEmptyMatch() {
    return AllLiftInstructionsMatch.newEmptyMatch();
  }
  
  @Override
  public AllLiftInstructionsMatch newMatch(final Object... parameters) {
    return AllLiftInstructionsMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.Lift) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static AllLiftInstructionsQuerySpecification INSTANCE = make();
    
    public static AllLiftInstructionsQuerySpecification make() {
      return new AllLiftInstructionsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllLiftInstructionsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.allLiftInstructions";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("l");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("l", "hu.bme.mit.mdsd.dns2016.behaviour.Lift"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_l = body.getOrCreateVariableByName("l");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_l, "l")
      		));
      		// 	Lift(l)
      		new TypeConstraint(body, new FlatTuple(var_l), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Lift")));
      		// 	neg find instructionOfInstructMessage(l, _)
      		new NegativePatternCall(body, new FlatTuple(var_l, var___0_), InstructionOfInstructMessageQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
