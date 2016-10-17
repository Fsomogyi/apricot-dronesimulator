package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidWaitForMessageTimeoutMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidWaitForMessageTimeoutMatcher;
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
 * A pattern-specific query specification that can instantiate InvalidWaitForMessageTimeoutMatcher in a type-safe way.
 * 
 * @see InvalidWaitForMessageTimeoutMatcher
 * @see InvalidWaitForMessageTimeoutMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidWaitForMessageTimeoutQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidWaitForMessageTimeoutMatcher> {
  private InvalidWaitForMessageTimeoutQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidWaitForMessageTimeoutQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidWaitForMessageTimeoutMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidWaitForMessageTimeoutMatcher.on(engine);
  }
  
  @Override
  public InvalidWaitForMessageTimeoutMatch newEmptyMatch() {
    return InvalidWaitForMessageTimeoutMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidWaitForMessageTimeoutMatch newMatch(final Object... parameters) {
    return InvalidWaitForMessageTimeoutMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static InvalidWaitForMessageTimeoutQuerySpecification INSTANCE = make();
    
    public static InvalidWaitForMessageTimeoutQuerySpecification make() {
      return new InvalidWaitForMessageTimeoutQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidWaitForMessageTimeoutQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidWaitForMessageTimeout";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("wfm");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("wfm", "hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_wfm = body.getOrCreateVariableByName("wfm");
      		PVariable var_to = body.getOrCreateVariableByName("to");
      		new TypeConstraint(body, new FlatTuple(var_wfm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "WaitForMessage")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_wfm, "wfm")
      		));
      		// 	WaitForMessage.timeout(wfm, to)
      		new TypeConstraint(body, new FlatTuple(var_wfm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "WaitForMessage")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_wfm, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "WaitForMessage", "timeout")));
      		new Equality(body, var__virtual_0_, var_to);
      		// 	check(to <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern invalidWaitForMessageTimeout";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("to");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float to = (java.lang.Float) provider.getValue("to");
      		                                    return evaluateExpression_1_1(to);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Invalid timeout of instruction!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "wfm"
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
  
  private static boolean evaluateExpression_1_1(final Float to) {
    return ((to).floatValue() <= 0);
  }
}
