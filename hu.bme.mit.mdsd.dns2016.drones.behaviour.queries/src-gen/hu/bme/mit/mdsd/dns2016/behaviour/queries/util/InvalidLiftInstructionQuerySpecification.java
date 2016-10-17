package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidLiftInstructionMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidLiftInstructionMatcher;
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
 * A pattern-specific query specification that can instantiate InvalidLiftInstructionMatcher in a type-safe way.
 * 
 * @see InvalidLiftInstructionMatcher
 * @see InvalidLiftInstructionMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidLiftInstructionQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidLiftInstructionMatcher> {
  private InvalidLiftInstructionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidLiftInstructionQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidLiftInstructionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidLiftInstructionMatcher.on(engine);
  }
  
  @Override
  public InvalidLiftInstructionMatch newEmptyMatch() {
    return InvalidLiftInstructionMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidLiftInstructionMatch newMatch(final Object... parameters) {
    return InvalidLiftInstructionMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.Lift) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static InvalidLiftInstructionQuerySpecification INSTANCE = make();
    
    public static InvalidLiftInstructionQuerySpecification make() {
      return new InvalidLiftInstructionQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidLiftInstructionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidLiftInstruction";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("lift");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("lift", "hu.bme.mit.mdsd.dns2016.behaviour.Lift"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_lift = body.getOrCreateVariableByName("lift");
      		PVariable var_db = body.getOrCreateVariableByName("db");
      		PVariable var_d = body.getOrCreateVariableByName("d");
      		PVariable var_target = body.getOrCreateVariableByName("target");
      		PVariable var_w = body.getOrCreateVariableByName("w");
      		PVariable var_mp = body.getOrCreateVariableByName("mp");
      		new TypeConstraint(body, new FlatTuple(var_lift), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Lift")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_lift, "lift")
      		));
      		// 	DroneBehaviour.drones(db, d)
      		new TypeConstraint(body, new FlatTuple(var_db), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_db, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour", "drones")));
      		new Equality(body, var__virtual_0_, var_d);
      		// 	DroneBehaviour.instructions(db, lift)
      		new TypeConstraint(body, new FlatTuple(var_db), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_db, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour", "instructions")));
      		new Equality(body, var__virtual_1_, var_lift);
      		// 	Lift.target(lift, target)
      		new TypeConstraint(body, new FlatTuple(var_lift), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Lift")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_lift, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "Lift", "target")));
      		new Equality(body, var__virtual_2_, var_target);
      		// 	MovableObject.weight(target, w)
      		new TypeConstraint(body, new FlatTuple(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "MovableObject")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_target, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "MovableObject", "weight")));
      		new Equality(body, var__virtual_3_, var_w);
      		// 	Drone.maxPayload(d, mp)
      		new TypeConstraint(body, new FlatTuple(var_d), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_d, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Drone", "maxPayload")));
      		new Equality(body, var__virtual_4_, var_mp);
      		// 	check(mp < w)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern invalidLiftInstruction";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("mp", "w");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float mp = (java.lang.Float) provider.getValue("mp");
      		                                    java.lang.Float w = (java.lang.Float) provider.getValue("w");
      		                                    return evaluateExpression_1_1(mp, w);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Invalid Lift instruction - weight is greater than the max payload of the drone(s)!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "lift"
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
  
  private static boolean evaluateExpression_1_1(final Float mp, final Float w) {
    boolean _lessThan = (mp.compareTo(w) < 0);
    return _lessThan;
  }
}
