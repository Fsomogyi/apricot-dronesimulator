package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.MoveToChargeStationMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.MoveToChargeStationMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.IsRealMoveToQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MoveToChargeStationMatcher in a type-safe way.
 * 
 * @see MoveToChargeStationMatcher
 * @see MoveToChargeStationMatch
 * 
 */
@SuppressWarnings("all")
public final class MoveToChargeStationQuerySpecification extends BaseGeneratedEMFQuerySpecification<MoveToChargeStationMatcher> {
  private MoveToChargeStationQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MoveToChargeStationQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoveToChargeStationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MoveToChargeStationMatcher.on(engine);
  }
  
  @Override
  public MoveToChargeStationMatch newEmptyMatch() {
    return MoveToChargeStationMatch.newEmptyMatch();
  }
  
  @Override
  public MoveToChargeStationMatch newMatch(final Object... parameters) {
    return MoveToChargeStationMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.MoveTo) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static MoveToChargeStationQuerySpecification INSTANCE = make();
    
    public static MoveToChargeStationQuerySpecification make() {
      return new MoveToChargeStationQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MoveToChargeStationQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.moveToChargeStation";
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
      		PVariable var_cs = body.getOrCreateVariableByName("cs");
      		new TypeConstraint(body, new FlatTuple(var_mt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "MoveTo")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_mt, "mt")
      		));
      		// 	ChargeStation(cs)
      		new TypeConstraint(body, new FlatTuple(var_cs), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "ChargeStation")));
      		// 	MoveTo.fieldObject(mt, cs)
      		new TypeConstraint(body, new FlatTuple(var_mt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "MoveTo")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_mt, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "MoveTo", "fieldObject")));
      		new Equality(body, var__virtual_0_, var_cs);
      		// 	find isRealMoveTo(mt)
      		new PositivePatternCall(body, new FlatTuple(var_mt), IsRealMoveToQuerySpecification.instance().getInternalQueryRepresentation());
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
