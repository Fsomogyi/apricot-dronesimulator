package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeStationOfDroneMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeStationOfDroneMatcher;
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
 * A pattern-specific query specification that can instantiate ChargeStationOfDroneMatcher in a type-safe way.
 * 
 * @see ChargeStationOfDroneMatcher
 * @see ChargeStationOfDroneMatch
 * 
 */
@SuppressWarnings("all")
public final class ChargeStationOfDroneQuerySpecification extends BaseGeneratedEMFQuerySpecification<ChargeStationOfDroneMatcher> {
  private ChargeStationOfDroneQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ChargeStationOfDroneQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChargeStationOfDroneMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ChargeStationOfDroneMatcher.on(engine);
  }
  
  @Override
  public ChargeStationOfDroneMatch newEmptyMatch() {
    return ChargeStationOfDroneMatch.newEmptyMatch();
  }
  
  @Override
  public ChargeStationOfDroneMatch newMatch(final Object... parameters) {
    return ChargeStationOfDroneMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) parameters[0], (hu.bme.mit.mdsd.dns2016.drones.ChargeStation) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ChargeStationOfDroneQuerySpecification INSTANCE = make();
    
    public static ChargeStationOfDroneQuerySpecification make() {
      return new ChargeStationOfDroneQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ChargeStationOfDroneQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.chargeStationOfDrone";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("d","cs");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("d", "hu.bme.mit.mdsd.dns2016.drones.Drone"),new PParameter("cs", "hu.bme.mit.mdsd.dns2016.drones.ChargeStation"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var_cs = body.getOrCreateVariableByName("cs");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		new TypeConstraint(body, new FlatTuple(var_cs), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "ChargeStation")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d"),
      		   new ExportedParameter(body, var_cs, "cs")
      		));
      		//  	Drone.chargeStation(d, cs)
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_d, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone", "chargeStation")));
      		new Equality(body, var__virtual_0_, var_cs);
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
