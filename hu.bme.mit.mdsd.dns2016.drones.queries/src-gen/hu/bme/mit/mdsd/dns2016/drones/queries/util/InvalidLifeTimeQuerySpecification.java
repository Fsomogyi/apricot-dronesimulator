package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidLifeTimeMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidLifeTimeMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate InvalidLifeTimeMatcher in a type-safe way.
 * 
 * @see InvalidLifeTimeMatcher
 * @see InvalidLifeTimeMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidLifeTimeQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidLifeTimeMatcher> {
  private InvalidLifeTimeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidLifeTimeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidLifeTimeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidLifeTimeMatcher.on(engine);
  }
  
  @Override
  public InvalidLifeTimeMatch newEmptyMatch() {
    return InvalidLifeTimeMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidLifeTimeMatch newMatch(final Object... parameters) {
    return InvalidLifeTimeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) parameters[0], (java.lang.Float) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InvalidLifeTimeQuerySpecification INSTANCE = make();
    
    public static InvalidLifeTimeQuerySpecification make() {
      return new InvalidLifeTimeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidLifeTimeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidLifeTime";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("b","lifeTime");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("b", "hu.bme.mit.mdsd.dns2016.drones.Battery"),new PParameter("lifeTime", "java.lang.Float"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_b = body.getOrCreateVariableByName("b");
      		PVariable var_lifeTime = body.getOrCreateVariableByName("lifeTime");
      		new TypeConstraint(body, new FlatTuple(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_b, "b"),
      		   new ExportedParameter(body, var_lifeTime, "lifeTime")
      		));
      		// 	Battery.lifeTime(b, lifeTime)
      		new TypeConstraint(body, new FlatTuple(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_b, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery", "lifeTime")));
      		new Equality(body, var__virtual_0_, var_lifeTime);
      		// 	check(lifeTime <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern invalidLifeTime";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("lifeTime");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float lifeTime = (java.lang.Float) provider.getValue("lifeTime");
      		                                    return evaluateExpression_1_1(lifeTime);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Invalid life time of battery!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "b", 
      		                "lifeTime"
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
  
  private static boolean evaluateExpression_1_1(final Float lifeTime) {
    return ((lifeTime).floatValue() <= 0);
  }
}
