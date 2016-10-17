package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidWeightMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidWeightMatcher;
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
 * A pattern-specific query specification that can instantiate InvalidWeightMatcher in a type-safe way.
 * 
 * @see InvalidWeightMatcher
 * @see InvalidWeightMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidWeightQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidWeightMatcher> {
  private InvalidWeightQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidWeightQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidWeightMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidWeightMatcher.on(engine);
  }
  
  @Override
  public InvalidWeightMatch newEmptyMatch() {
    return InvalidWeightMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidWeightMatch newMatch(final Object... parameters) {
    return InvalidWeightMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.MovableObject) parameters[0], (java.lang.Float) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InvalidWeightQuerySpecification INSTANCE = make();
    
    public static InvalidWeightQuerySpecification make() {
      return new InvalidWeightQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidWeightQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidWeight";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("mo","w");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("mo", "hu.bme.mit.mdsd.dns2016.drones.MovableObject"),new PParameter("w", "java.lang.Float"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_mo = body.getOrCreateVariableByName("mo");
      		PVariable var_w = body.getOrCreateVariableByName("w");
      		new TypeConstraint(body, new FlatTuple(var_mo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "MovableObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_mo, "mo"),
      		   new ExportedParameter(body, var_w, "w")
      		));
      		//  	MovableObject.weight(mo, w)
      		new TypeConstraint(body, new FlatTuple(var_mo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "MovableObject")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_mo, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "MovableObject", "weight")));
      		new Equality(body, var__virtual_0_, var_w);
      		//  	check(w < 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern invalidWeight";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("w");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float w = (java.lang.Float) provider.getValue("w");
      		                                    return evaluateExpression_1_1(w);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Invalid weight ($w$) of movable object $mo$!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "mo", 
      		                "w"
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
  
  private static boolean evaluateExpression_1_1(final Float w) {
    return ((w).floatValue() < 0);
  }
}
