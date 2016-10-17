package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMaxPayloadMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMaxPayloadMatcher;
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
 * A pattern-specific query specification that can instantiate InvalidMaxPayloadMatcher in a type-safe way.
 * 
 * @see InvalidMaxPayloadMatcher
 * @see InvalidMaxPayloadMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidMaxPayloadQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidMaxPayloadMatcher> {
  private InvalidMaxPayloadQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidMaxPayloadQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidMaxPayloadMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidMaxPayloadMatcher.on(engine);
  }
  
  @Override
  public InvalidMaxPayloadMatch newEmptyMatch() {
    return InvalidMaxPayloadMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidMaxPayloadMatch newMatch(final Object... parameters) {
    return InvalidMaxPayloadMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) parameters[0], (java.lang.Float) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InvalidMaxPayloadQuerySpecification INSTANCE = make();
    
    public static InvalidMaxPayloadQuerySpecification make() {
      return new InvalidMaxPayloadQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidMaxPayloadQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidMaxPayload";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("d","maxPayload");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("d", "hu.bme.mit.mdsd.dns2016.drones.Drone"),new PParameter("maxPayload", "java.lang.Float"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var_maxPayload = body.getOrCreateVariableByName("maxPayload");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d"),
      		   new ExportedParameter(body, var_maxPayload, "maxPayload")
      		));
      		// 	Drone.maxPayload(d, maxPayload)
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_d, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone", "maxPayload")));
      		new Equality(body, var__virtual_0_, var_maxPayload);
      		// 	check(maxPayload < 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern invalidMaxPayload";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("maxPayload");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float maxPayload = (java.lang.Float) provider.getValue("maxPayload");
      		                                    return evaluateExpression_1_1(maxPayload);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Invalid maximum payload of drone ($d$)!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "d", 
      		                "maxPayload"
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
  
  private static boolean evaluateExpression_1_1(final Float maxPayload) {
    return ((maxPayload).floatValue() < 0);
  }
}
