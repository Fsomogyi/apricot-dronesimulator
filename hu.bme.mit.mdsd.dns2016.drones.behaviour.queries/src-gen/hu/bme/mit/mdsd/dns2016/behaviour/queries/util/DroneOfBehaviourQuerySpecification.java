package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.DroneOfBehaviourMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.DroneOfBehaviourMatcher;
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
 * A pattern-specific query specification that can instantiate DroneOfBehaviourMatcher in a type-safe way.
 * 
 * @see DroneOfBehaviourMatcher
 * @see DroneOfBehaviourMatch
 * 
 */
@SuppressWarnings("all")
public final class DroneOfBehaviourQuerySpecification extends BaseGeneratedEMFQuerySpecification<DroneOfBehaviourMatcher> {
  private DroneOfBehaviourQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DroneOfBehaviourQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DroneOfBehaviourMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DroneOfBehaviourMatcher.on(engine);
  }
  
  @Override
  public DroneOfBehaviourMatch newEmptyMatch() {
    return DroneOfBehaviourMatch.newEmptyMatch();
  }
  
  @Override
  public DroneOfBehaviourMatch newMatch(final Object... parameters) {
    return DroneOfBehaviourMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour) parameters[0], (hu.bme.mit.mdsd.dns2016.drones.Drone) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static DroneOfBehaviourQuerySpecification INSTANCE = make();
    
    public static DroneOfBehaviourQuerySpecification make() {
      return new DroneOfBehaviourQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DroneOfBehaviourQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.droneOfBehaviour";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("db","d");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("db", "hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour"),new PParameter("d", "hu.bme.mit.mdsd.dns2016.drones.Drone"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_db = body.getOrCreateVariableByName("db");
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		new TypeConstraint(body, new FlatTuple(var_db), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour")));
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_db, "db"),
      		   new ExportedParameter(body, var_d, "d")
      		));
      		// 	DroneBehaviour.drones(db, d)
      		new TypeConstraint(body, new FlatTuple(var_db), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_db, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour", "drones")));
      		new Equality(body, var__virtual_0_, var_d);
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
