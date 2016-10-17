package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidBatteryMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidBatteryMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidLifeTimeQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidRechargeRateQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidRemLifeTimeQuerySpecification;
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
 * A pattern-specific query specification that can instantiate InvalidBatteryMatcher in a type-safe way.
 * 
 * @see InvalidBatteryMatcher
 * @see InvalidBatteryMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidBatteryQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidBatteryMatcher> {
  private InvalidBatteryQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidBatteryQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidBatteryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidBatteryMatcher.on(engine);
  }
  
  @Override
  public InvalidBatteryMatch newEmptyMatch() {
    return InvalidBatteryMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidBatteryMatch newMatch(final Object... parameters) {
    return InvalidBatteryMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static InvalidBatteryQuerySpecification INSTANCE = make();
    
    public static InvalidBatteryQuerySpecification make() {
      return new InvalidBatteryQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidBatteryQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidBattery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("b");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("b", "hu.bme.mit.mdsd.dns2016.drones.Battery"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_b = body.getOrCreateVariableByName("b");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_b, "b")
      		));
      		// 	find invalidLifeTime(b, _)
      		new PositivePatternCall(body, new FlatTuple(var_b, var___0_), InvalidLifeTimeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_b = body.getOrCreateVariableByName("b");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_b, "b")
      		));
      		// 	find invalidRechargeRate(b, _)
      		new PositivePatternCall(body, new FlatTuple(var_b, var___0_), InvalidRechargeRateQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_b = body.getOrCreateVariableByName("b");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_b, "b")
      		));
      		// 	find invalidRemLifeTime(b, _)
      		new PositivePatternCall(body, new FlatTuple(var_b, var___0_), InvalidRemLifeTimeQuerySpecification.instance().getInternalQueryRepresentation());
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
