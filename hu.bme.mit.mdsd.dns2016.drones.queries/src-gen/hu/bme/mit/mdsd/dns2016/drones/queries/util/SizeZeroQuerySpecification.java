package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.SizeZeroMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.SizeZeroMatcher;
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
 * A pattern-specific query specification that can instantiate SizeZeroMatcher in a type-safe way.
 * 
 * @see SizeZeroMatcher
 * @see SizeZeroMatch
 * 
 */
@SuppressWarnings("all")
public final class SizeZeroQuerySpecification extends BaseGeneratedEMFQuerySpecification<SizeZeroMatcher> {
  private SizeZeroQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SizeZeroQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SizeZeroMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SizeZeroMatcher.on(engine);
  }
  
  @Override
  public SizeZeroMatch newEmptyMatch() {
    return SizeZeroMatch.newEmptyMatch();
  }
  
  @Override
  public SizeZeroMatch newMatch(final Object... parameters) {
    return SizeZeroMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.SizedElement) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static SizeZeroQuerySpecification INSTANCE = make();
    
    public static SizeZeroQuerySpecification make() {
      return new SizeZeroQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SizeZeroQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.sizeZero";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("s");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("s", "hu.bme.mit.mdsd.dns2016.drones.SizedElement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_s = body.getOrCreateVariableByName("s");
      		PVariable var_h = body.getOrCreateVariableByName("h");
      		PVariable var_l = body.getOrCreateVariableByName("l");
      		PVariable var_w = body.getOrCreateVariableByName("w");
      		new TypeConstraint(body, new FlatTuple(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_s, "s")
      		));
      		//  	SizedElement.height(s, h)
      		new TypeConstraint(body, new FlatTuple(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_s, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "height")));
      		new Equality(body, var__virtual_0_, var_h);
      		//  	SizedElement.length(s, l)
      		new TypeConstraint(body, new FlatTuple(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_s, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "length")));
      		new Equality(body, var__virtual_1_, var_l);
      		//  	SizedElement.width(s, w)
      		new TypeConstraint(body, new FlatTuple(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_s, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "width")));
      		new Equality(body, var__virtual_2_, var_w);
      		//  	check(h == 0 && l == 0 && w == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern sizeZero";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("h", "l", "w");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float h = (java.lang.Float) provider.getValue("h");
      		                                    java.lang.Float l = (java.lang.Float) provider.getValue("l");
      		                                    java.lang.Float w = (java.lang.Float) provider.getValue("w");
      		                                    return evaluateExpression_1_1(h, l, w);
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
  
  private static boolean evaluateExpression_1_1(final Float h, final Float l, final Float w) {
    return ((((h).floatValue() == 0) && ((l).floatValue() == 0)) && ((w).floatValue() == 0));
  }
}
