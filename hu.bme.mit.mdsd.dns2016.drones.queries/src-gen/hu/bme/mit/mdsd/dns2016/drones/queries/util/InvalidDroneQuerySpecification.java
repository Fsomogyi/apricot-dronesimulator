package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidDroneMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidDroneMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidCPUFrequencyQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidCommRangeQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidMaxPayloadQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidMemoryQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidSpeedQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate InvalidDroneMatcher in a type-safe way.
 * 
 * @see InvalidDroneMatcher
 * @see InvalidDroneMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidDroneQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidDroneMatcher> {
  private InvalidDroneQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidDroneQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidDroneMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidDroneMatcher.on(engine);
  }
  
  @Override
  public InvalidDroneMatch newEmptyMatch() {
    return InvalidDroneMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidDroneMatch newMatch(final Object... parameters) {
    return InvalidDroneMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static InvalidDroneQuerySpecification INSTANCE = make();
    
    public static InvalidDroneQuerySpecification make() {
      return new InvalidDroneQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidDroneQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidDrone";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("d");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("d", "hu.bme.mit.mdsd.dns2016.drones.Drone"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d")
      		));
      		// 	find invalidSpeed(d, _, _)
      		new PositivePatternCall(body, new FlatTuple(var_d, var___0_, var___1_), InvalidSpeedQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d")
      		));
      		// 	find invalidCPUFrequency(d, _)
      		new PositivePatternCall(body, new FlatTuple(var_d, var___0_), InvalidCPUFrequencyQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d")
      		));
      		// 	find invalidMemory(d, _)
      		new PositivePatternCall(body, new FlatTuple(var_d, var___0_), InvalidMemoryQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d")
      		));
      		// 	find invalidCommRange(d, _)
      		new PositivePatternCall(body, new FlatTuple(var_d, var___0_), InvalidCommRangeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d")
      		));
      		// 	find invalidMaxPayload(d, _)
      		new PositivePatternCall(body, new FlatTuple(var_d, var___0_), InvalidMaxPayloadQuerySpecification.instance().getInternalQueryRepresentation());
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
