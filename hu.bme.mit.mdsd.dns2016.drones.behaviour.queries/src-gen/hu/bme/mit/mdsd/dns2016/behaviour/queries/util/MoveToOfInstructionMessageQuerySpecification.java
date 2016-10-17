package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.MoveToOfInstructionMessageMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.MoveToOfInstructionMessageMatcher;
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
 * A pattern-specific query specification that can instantiate MoveToOfInstructionMessageMatcher in a type-safe way.
 * 
 * @see MoveToOfInstructionMessageMatcher
 * @see MoveToOfInstructionMessageMatch
 * 
 */
@SuppressWarnings("all")
public final class MoveToOfInstructionMessageQuerySpecification extends BaseGeneratedEMFQuerySpecification<MoveToOfInstructionMessageMatcher> {
  private MoveToOfInstructionMessageQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MoveToOfInstructionMessageQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoveToOfInstructionMessageMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MoveToOfInstructionMessageMatcher.on(engine);
  }
  
  @Override
  public MoveToOfInstructionMessageMatch newEmptyMatch() {
    return MoveToOfInstructionMessageMatch.newEmptyMatch();
  }
  
  @Override
  public MoveToOfInstructionMessageMatch newMatch(final Object... parameters) {
    return MoveToOfInstructionMessageMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.MoveTo) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static MoveToOfInstructionMessageQuerySpecification INSTANCE = make();
    
    public static MoveToOfInstructionMessageQuerySpecification make() {
      return new MoveToOfInstructionMessageQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MoveToOfInstructionMessageQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.moveToOfInstructionMessage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("mt");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("mt", "hu.bme.mit.mdsd.dns2016.behaviour.MoveTo"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_mt = body.getOrCreateVariableByName("mt");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_mt, "mt")
      		));
      		// 	MoveTo(mt)
      		new TypeConstraint(body, new FlatTuple(var_mt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "MoveTo")));
      		// 	Instruct.instructions(_, mt)
      		new TypeConstraint(body, new FlatTuple(var___0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Instruct")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var___0_, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Instruct", "instructions")));
      		new Equality(body, var__virtual_0_, var_mt);
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
