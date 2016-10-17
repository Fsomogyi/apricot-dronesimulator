package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InstructionOfInstructMessageMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InstructionOfInstructMessageMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate InstructionOfInstructMessageMatcher in a type-safe way.
 * 
 * @see InstructionOfInstructMessageMatcher
 * @see InstructionOfInstructMessageMatch
 * 
 */
@SuppressWarnings("all")
public final class InstructionOfInstructMessageQuerySpecification extends BaseGeneratedEMFQuerySpecification<InstructionOfInstructMessageMatcher> {
  private InstructionOfInstructMessageQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InstructionOfInstructMessageQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InstructionOfInstructMessageMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InstructionOfInstructMessageMatcher.on(engine);
  }
  
  @Override
  public InstructionOfInstructMessageMatch newEmptyMatch() {
    return InstructionOfInstructMessageMatch.newEmptyMatch();
  }
  
  @Override
  public InstructionOfInstructMessageMatch newMatch(final Object... parameters) {
    return InstructionOfInstructMessageMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.Instruction) parameters[0], (hu.bme.mit.mdsd.dns2016.behaviour.Instruct) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InstructionOfInstructMessageQuerySpecification INSTANCE = make();
    
    public static InstructionOfInstructMessageQuerySpecification make() {
      return new InstructionOfInstructMessageQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InstructionOfInstructMessageQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.instructionOfInstructMessage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ins","m");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("ins", "hu.bme.mit.mdsd.dns2016.behaviour.Instruction"),new PParameter("m", "hu.bme.mit.mdsd.dns2016.behaviour.Instruct"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_ins = body.getOrCreateVariableByName("ins");
      		PVariable var_m = body.getOrCreateVariableByName("m");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_ins, "ins"),
      		   new ExportedParameter(body, var_m, "m")
      		));
      		// 	Instruct.instructions(m, ins)
      		new TypeConstraint(body, new FlatTuple(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Instruct")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_m, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Instruct", "instructions")));
      		new Equality(body, var__virtual_0_, var_ins);
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
