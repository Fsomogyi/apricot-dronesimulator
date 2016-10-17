package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidPauseDurationMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidPauseDurationMatcher;
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
 * A pattern-specific query specification that can instantiate InvalidPauseDurationMatcher in a type-safe way.
 * 
 * @see InvalidPauseDurationMatcher
 * @see InvalidPauseDurationMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidPauseDurationQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidPauseDurationMatcher> {
  private InvalidPauseDurationQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidPauseDurationQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidPauseDurationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidPauseDurationMatcher.on(engine);
  }
  
  @Override
  public InvalidPauseDurationMatch newEmptyMatch() {
    return InvalidPauseDurationMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidPauseDurationMatch newMatch(final Object... parameters) {
    return InvalidPauseDurationMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.Pause) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static InvalidPauseDurationQuerySpecification INSTANCE = make();
    
    public static InvalidPauseDurationQuerySpecification make() {
      return new InvalidPauseDurationQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidPauseDurationQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidPauseDuration";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("p");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("p", "hu.bme.mit.mdsd.dns2016.behaviour.Pause"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_p = body.getOrCreateVariableByName("p");
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		new TypeConstraint(body, new FlatTuple(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Pause")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_p, "p")
      		));
      		// 	Pause.duration(p, d)
      		new TypeConstraint(body, new FlatTuple(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Pause")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_p, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Pause", "duration")));
      		new Equality(body, var__virtual_0_, var_d);
      		// 	check(d <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern invalidPauseDuration";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("d");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float d = (java.lang.Float) provider.getValue("d");
      		                                    return evaluateExpression_1_1(d);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Invalid duration of instruction!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "p"
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
  
  private static boolean evaluateExpression_1_1(final Float d) {
    return ((d).floatValue() <= 0);
  }
}
