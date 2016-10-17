package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.SameParametersFieldObjectMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.SameParametersFieldObjectMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SameParametersFieldObjectMatcher in a type-safe way.
 * 
 * @see SameParametersFieldObjectMatcher
 * @see SameParametersFieldObjectMatch
 * 
 */
@SuppressWarnings("all")
public final class SameParametersFieldObjectQuerySpecification extends BaseGeneratedEMFQuerySpecification<SameParametersFieldObjectMatcher> {
  private SameParametersFieldObjectQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SameParametersFieldObjectQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SameParametersFieldObjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SameParametersFieldObjectMatcher.on(engine);
  }
  
  @Override
  public SameParametersFieldObjectMatch newEmptyMatch() {
    return SameParametersFieldObjectMatch.newEmptyMatch();
  }
  
  @Override
  public SameParametersFieldObjectMatch newMatch(final Object... parameters) {
    return SameParametersFieldObjectMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.FieldObject) parameters[0], (hu.bme.mit.mdsd.dns2016.drones.Parameter) parameters[1], (hu.bme.mit.mdsd.dns2016.drones.Parameter) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static SameParametersFieldObjectQuerySpecification INSTANCE = make();
    
    public static SameParametersFieldObjectQuerySpecification make() {
      return new SameParametersFieldObjectQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SameParametersFieldObjectQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.sameParametersFieldObject";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("f","p1","p2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("f", "hu.bme.mit.mdsd.dns2016.drones.FieldObject"),new PParameter("p1", "hu.bme.mit.mdsd.dns2016.drones.Parameter"),new PParameter("p2", "hu.bme.mit.mdsd.dns2016.drones.Parameter"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_f = body.getOrCreateVariableByName("f");
      		PVariable var_p1 = body.getOrCreateVariableByName("p1");
      		PVariable var_p2 = body.getOrCreateVariableByName("p2");
      		PVariable var_k1 = body.getOrCreateVariableByName("k1");
      		PVariable var_k2 = body.getOrCreateVariableByName("k2");
      		new TypeConstraint(body, new FlatTuple(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "FieldObject")));
      		new TypeConstraint(body, new FlatTuple(var_p1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Parameter")));
      		new TypeConstraint(body, new FlatTuple(var_p2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Parameter")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_f, "f"),
      		   new ExportedParameter(body, var_p1, "p1"),
      		   new ExportedParameter(body, var_p2, "p2")
      		));
      		// 	p1 != p2
      		new Inequality(body, var_p1, var_p2);
      		// 		FieldObject.parameters(f, p1)
      		new TypeConstraint(body, new FlatTuple(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "FieldObject")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_f, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "FieldObject", "parameters")));
      		new Equality(body, var__virtual_0_, var_p1);
      		// 	FieldObject.parameters(f, p2)
      		new TypeConstraint(body, new FlatTuple(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "FieldObject")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_f, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "FieldObject", "parameters")));
      		new Equality(body, var__virtual_1_, var_p2);
      		// 	Parameter.key(p1, k1)
      		new TypeConstraint(body, new FlatTuple(var_p1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Parameter")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_p1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Parameter", "key")));
      		new Equality(body, var__virtual_2_, var_k1);
      		// 	Parameter.key(p2, k2)
      		new TypeConstraint(body, new FlatTuple(var_p2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Parameter")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_p2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Parameter", "key")));
      		new Equality(body, var__virtual_3_, var_k2);
      		// 	k1 == k2
      		new Equality(body, var_k1, var_k2);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Duplicate parameter keys at field object $f$!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "f", 
      		                "p1", 
      		                "p2"
      		                }));
      		annotation.addAttribute("symmetric", Arrays.asList(new Object[] {
      		                "p1", 
      		                "p2"
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
