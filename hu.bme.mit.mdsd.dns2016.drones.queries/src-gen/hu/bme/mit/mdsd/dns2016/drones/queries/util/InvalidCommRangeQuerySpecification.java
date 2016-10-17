package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCommRangeMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCommRangeMatcher;
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
 * A pattern-specific query specification that can instantiate InvalidCommRangeMatcher in a type-safe way.
 * 
 * @see InvalidCommRangeMatcher
 * @see InvalidCommRangeMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidCommRangeQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidCommRangeMatcher> {
  private InvalidCommRangeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidCommRangeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidCommRangeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidCommRangeMatcher.on(engine);
  }
  
  @Override
  public InvalidCommRangeMatch newEmptyMatch() {
    return InvalidCommRangeMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidCommRangeMatch newMatch(final Object... parameters) {
    return InvalidCommRangeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Drone) parameters[0], (java.lang.Float) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InvalidCommRangeQuerySpecification INSTANCE = make();
    
    public static InvalidCommRangeQuerySpecification make() {
      return new InvalidCommRangeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidCommRangeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidCommRange";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("d","commRange");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("d", "hu.bme.mit.mdsd.dns2016.drones.Drone"),new PParameter("commRange", "java.lang.Float"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var_commRange = body.getOrCreateVariableByName("commRange");
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_d, "d"),
      		   new ExportedParameter(body, var_commRange, "commRange")
      		));
      		// 	Drone.communicationRange(d, commRange)
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_d, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone", "communicationRange")));
      		new Equality(body, var__virtual_0_, var_commRange);
      		// 	check(commRange < 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern invalidCommRange";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("commRange");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float commRange = (java.lang.Float) provider.getValue("commRange");
      		                                    return evaluateExpression_1_1(commRange);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Invalid communication range of drone ($d$)!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "d", 
      		                "commRange"
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
  
  private static boolean evaluateExpression_1_1(final Float commRange) {
    return ((commRange).floatValue() < 0);
  }
}
