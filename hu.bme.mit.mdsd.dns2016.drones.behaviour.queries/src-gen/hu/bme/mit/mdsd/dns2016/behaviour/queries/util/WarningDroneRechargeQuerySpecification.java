package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WarningDroneRechargeMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WarningDroneRechargeMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.MoveToChargeStationQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate WarningDroneRechargeMatcher in a type-safe way.
 * 
 * @see WarningDroneRechargeMatcher
 * @see WarningDroneRechargeMatch
 * 
 */
@SuppressWarnings("all")
public final class WarningDroneRechargeQuerySpecification extends BaseGeneratedEMFQuerySpecification<WarningDroneRechargeMatcher> {
  private WarningDroneRechargeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WarningDroneRechargeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WarningDroneRechargeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WarningDroneRechargeMatcher.on(engine);
  }
  
  @Override
  public WarningDroneRechargeMatch newEmptyMatch() {
    return WarningDroneRechargeMatch.newEmptyMatch();
  }
  
  @Override
  public WarningDroneRechargeMatch newMatch(final Object... parameters) {
    return WarningDroneRechargeMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static WarningDroneRechargeQuerySpecification INSTANCE = make();
    
    public static WarningDroneRechargeQuerySpecification make() {
      return new WarningDroneRechargeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WarningDroneRechargeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.warningDroneRecharge";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("db");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("db", "hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_db = body.getOrCreateVariableByName("db");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_db), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_db, "db")
      		));
      		// 	DroneBehaviour(db)
      		new TypeConstraint(body, new FlatTuple(var_db), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour")));
      		// 	neg find moveToChargeStation(_)
      		new NegativePatternCall(body, new FlatTuple(var___0_), MoveToChargeStationQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "warning");
      		annotation.addAttribute("message", "There is no instruction that moves the drone to a charging station -- your drone might get depleted before completion!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "db"
      		                }));
      		addAnnotation(annotation);
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
