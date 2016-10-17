package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSpeedMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSpeedMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate InvalidSpeedMatcher in a type-safe way.
 * 
 * @see InvalidSpeedMatcher
 * @see InvalidSpeedMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidSpeedQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidSpeedMatcher> {
  private InvalidSpeedQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidSpeedQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidSpeedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidSpeedMatcher.on(engine);
  }
  
  @Override
  public InvalidSpeedMatch newEmptyMatch() {
    return InvalidSpeedMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidSpeedMatch newMatch(final Object... parameters) {
    return InvalidSpeedMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) parameters[0], (java.lang.Float) parameters[1], (java.lang.Float) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static InvalidSpeedQuerySpecification INSTANCE = make();
    
    public static InvalidSpeedQuerySpecification make() {
      return new InvalidSpeedQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidSpeedQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidSpeed";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("d","minSpeed","maxSpeed");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("d", "hu.bme.mit.mdsd.dns2016.drones.Drone"),new PParameter("minSpeed", "java.lang.Float"),new PParameter("maxSpeed", "java.lang.Float"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var_minSpeed = body.getOrCreateVariableByName("minSpeed");
      		PVariable var_maxSpeed = body.getOrCreateVariableByName("maxSpeed");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d"),
      		   new ExportedParameter(body, var_minSpeed, "minSpeed"),
      		   new ExportedParameter(body, var_maxSpeed, "maxSpeed")
      		));
      		// 	Drone.minSpeed(d, minSpeed)
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_d, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone", "minSpeed")));
      		new Equality(body, var__virtual_0_, var_minSpeed);
      		// 	Drone.maxSpeed(d, maxSpeed)
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_d, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone", "maxSpeed")));
      		new Equality(body, var__virtual_1_, var_maxSpeed);
      		// 		check (minSpeed > maxSpeed || minSpeed < 0 || maxSpeed < 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern invalidSpeed";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("maxSpeed", "minSpeed");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float maxSpeed = (java.lang.Float) provider.getValue("maxSpeed");
      		                                    java.lang.Float minSpeed = (java.lang.Float) provider.getValue("minSpeed");
      		                                    return evaluateExpression_1_1(maxSpeed, minSpeed);
      		                                }
      		
      		                        },  null); 
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
  
  private static boolean evaluateExpression_1_1(final Float maxSpeed, final Float minSpeed) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _greaterThan = (minSpeed.compareTo(maxSpeed) > 0);
    if (_greaterThan) {
      _or_1 = true;
    } else {
      _or_1 = ((minSpeed).floatValue() < 0);
    }
    if (_or_1) {
      _or = true;
    } else {
      _or = ((maxSpeed).floatValue() < 0);
    }
    return _or;
  }
}
