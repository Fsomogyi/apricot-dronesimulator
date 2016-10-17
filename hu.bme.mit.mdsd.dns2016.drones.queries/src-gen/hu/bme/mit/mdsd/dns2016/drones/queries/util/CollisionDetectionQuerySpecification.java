package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.CollisionDetectionMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.CollisionDetectionMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.ChargeStationOfDroneQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.SizeZeroQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CollisionDetectionMatcher in a type-safe way.
 * 
 * @see CollisionDetectionMatcher
 * @see CollisionDetectionMatch
 * 
 */
@SuppressWarnings("all")
public final class CollisionDetectionQuerySpecification extends BaseGeneratedEMFQuerySpecification<CollisionDetectionMatcher> {
  private CollisionDetectionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CollisionDetectionQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CollisionDetectionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CollisionDetectionMatcher.on(engine);
  }
  
  @Override
  public CollisionDetectionMatch newEmptyMatch() {
    return CollisionDetectionMatch.newEmptyMatch();
  }
  
  @Override
  public CollisionDetectionMatch newMatch(final Object... parameters) {
    return CollisionDetectionMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.SizedElement) parameters[0], (hu.bme.mit.mdsd.dns2016.drones.SizedElement) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CollisionDetectionQuerySpecification INSTANCE = make();
    
    public static CollisionDetectionQuerySpecification make() {
      return new CollisionDetectionQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CollisionDetectionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.collisionDetection";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("se1","se2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("se1", "hu.bme.mit.mdsd.dns2016.drones.SizedElement"),new PParameter("se2", "hu.bme.mit.mdsd.dns2016.drones.SizedElement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_se1 = body.getOrCreateVariableByName("se1");
      		PVariable var_se2 = body.getOrCreateVariableByName("se2");
      		PVariable var_x1 = body.getOrCreateVariableByName("x1");
      		PVariable var_y1 = body.getOrCreateVariableByName("y1");
      		PVariable var_z1 = body.getOrCreateVariableByName("z1");
      		PVariable var_x2 = body.getOrCreateVariableByName("x2");
      		PVariable var_y2 = body.getOrCreateVariableByName("y2");
      		PVariable var_z2 = body.getOrCreateVariableByName("z2");
      		PVariable var_h1 = body.getOrCreateVariableByName("h1");
      		PVariable var_l1 = body.getOrCreateVariableByName("l1");
      		PVariable var_w1 = body.getOrCreateVariableByName("w1");
      		PVariable var_h2 = body.getOrCreateVariableByName("h2");
      		PVariable var_l2 = body.getOrCreateVariableByName("l2");
      		PVariable var_w2 = body.getOrCreateVariableByName("w2");
      		new TypeConstraint(body, new FlatTuple(var_se1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		new TypeConstraint(body, new FlatTuple(var_se2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_se1, "se1"),
      		   new ExportedParameter(body, var_se2, "se2")
      		));
      		//  	se1 != se2
      		new Inequality(body, var_se1, var_se2);
      		//  	 	neg find chargeStationOfDrone(se1, se2)
      		new NegativePatternCall(body, new FlatTuple(var_se1, var_se2), ChargeStationOfDroneQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	neg find chargeStationOfDrone(se2, se1)
      		new NegativePatternCall(body, new FlatTuple(var_se2, var_se1), ChargeStationOfDroneQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	 	neg find sizeZero(se1)
      		new NegativePatternCall(body, new FlatTuple(var_se1), SizeZeroQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	neg find sizeZero(se2)
      		new NegativePatternCall(body, new FlatTuple(var_se2), SizeZeroQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	 	SizedElement.x(se1, x1)
      		new TypeConstraint(body, new FlatTuple(var_se1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_se1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "x")));
      		new Equality(body, var__virtual_0_, var_x1);
      		//  	SizedElement.y(se1, y1)
      		new TypeConstraint(body, new FlatTuple(var_se1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_se1, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "y")));
      		new Equality(body, var__virtual_1_, var_y1);
      		//  	SizedElement.z(se1, z1)
      		new TypeConstraint(body, new FlatTuple(var_se1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_se1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "z")));
      		new Equality(body, var__virtual_2_, var_z1);
      		//  	SizedElement.x(se2, x2)
      		new TypeConstraint(body, new FlatTuple(var_se2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_se2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "x")));
      		new Equality(body, var__virtual_3_, var_x2);
      		//  	SizedElement.y(se2, y2)
      		new TypeConstraint(body, new FlatTuple(var_se2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_se2, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "y")));
      		new Equality(body, var__virtual_4_, var_y2);
      		//  	SizedElement.z(se2, z2)
      		new TypeConstraint(body, new FlatTuple(var_se2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_se2, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "z")));
      		new Equality(body, var__virtual_5_, var_z2);
      		//  	 	SizedElement.height(se1, h1)
      		new TypeConstraint(body, new FlatTuple(var_se1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_se1, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "height")));
      		new Equality(body, var__virtual_6_, var_h1);
      		//  	SizedElement.length(se1, l1)
      		new TypeConstraint(body, new FlatTuple(var_se1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var_se1, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "length")));
      		new Equality(body, var__virtual_7_, var_l1);
      		//  	SizedElement.width(se1, w1)
      		new TypeConstraint(body, new FlatTuple(var_se1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var_se1, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "width")));
      		new Equality(body, var__virtual_8_, var_w1);
      		//  	SizedElement.height(se2, h2)
      		new TypeConstraint(body, new FlatTuple(var_se2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var_se2, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "height")));
      		new Equality(body, var__virtual_9_, var_h2);
      		//  	SizedElement.length(se2, l2)
      		new TypeConstraint(body, new FlatTuple(var_se2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_se2, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "length")));
      		new Equality(body, var__virtual_10_, var_l2);
      		//  	SizedElement.width(se2, w2)
      		new TypeConstraint(body, new FlatTuple(var_se2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var_se2, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "SizedElement", "width")));
      		new Equality(body, var__virtual_11_, var_w2);
      		//  	 	check( (((x1 >= x2) && ((x1 - x2) < (l1 + l2)/2)) || ((x2 > x1) && ((x2 - x1) < (l1 + l2)/2))) && 		   (((y1 >= y2) && ((y1 - y2) < (h1 + h2)/2)) || ((y2 > y1) && ((y2 - y1) < (h1 + h2)/2))) && 		   (((z1 >= z2) && ((z1 - z2) < (w1 + w2)/2)) || ((z2 > z1) && ((z2 - z1) < (w1 + w2)/2))))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern collisionDetection";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("h1", "h2", "l1", "l2", "w1", "w2", "x1", "x2", "y1", "y2", "z1", "z2");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float h1 = (java.lang.Float) provider.getValue("h1");
      		                                    java.lang.Float h2 = (java.lang.Float) provider.getValue("h2");
      		                                    java.lang.Float l1 = (java.lang.Float) provider.getValue("l1");
      		                                    java.lang.Float l2 = (java.lang.Float) provider.getValue("l2");
      		                                    java.lang.Float w1 = (java.lang.Float) provider.getValue("w1");
      		                                    java.lang.Float w2 = (java.lang.Float) provider.getValue("w2");
      		                                    java.lang.Float x1 = (java.lang.Float) provider.getValue("x1");
      		                                    java.lang.Float x2 = (java.lang.Float) provider.getValue("x2");
      		                                    java.lang.Float y1 = (java.lang.Float) provider.getValue("y1");
      		                                    java.lang.Float y2 = (java.lang.Float) provider.getValue("y2");
      		                                    java.lang.Float z1 = (java.lang.Float) provider.getValue("z1");
      		                                    java.lang.Float z2 = (java.lang.Float) provider.getValue("z2");
      		                                    return evaluateExpression_1_1(h1, h2, l1, l2, w1, w2, x1, x2, y1, y2, z1, z2);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Collision detected between elements $se1$ and $se2$!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "se1", 
      		                "se2"
      		                }));
      		annotation.addAttribute("symmetric", Arrays.asList(new Object[] {
      		                "se1", 
      		                "se2"
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
  
  private static boolean evaluateExpression_1_1(final Float h1, final Float h2, final Float l1, final Float l2, final Float w1, final Float w2, final Float x1, final Float x2, final Float y1, final Float y2, final Float z1, final Float z2) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _or = false;
    boolean _and_2 = false;
    boolean _greaterEqualsThan = (x1.compareTo(x2) >= 0);
    if (!_greaterEqualsThan) {
      _and_2 = false;
    } else {
      _and_2 = (((x1).floatValue() - (x2).floatValue()) < (((l1).floatValue() + (l2).floatValue()) / 2));
    }
    if (_and_2) {
      _or = true;
    } else {
      boolean _and_3 = false;
      boolean _greaterThan = (x2.compareTo(x1) > 0);
      if (!_greaterThan) {
        _and_3 = false;
      } else {
        _and_3 = (((x2).floatValue() - (x1).floatValue()) < (((l1).floatValue() + (l2).floatValue()) / 2));
      }
      _or = _and_3;
    }
    if (!_or) {
      _and_1 = false;
    } else {
      boolean _or_1 = false;
      boolean _and_4 = false;
      boolean _greaterEqualsThan_1 = (y1.compareTo(y2) >= 0);
      if (!_greaterEqualsThan_1) {
        _and_4 = false;
      } else {
        _and_4 = (((y1).floatValue() - (y2).floatValue()) < (((h1).floatValue() + (h2).floatValue()) / 2));
      }
      if (_and_4) {
        _or_1 = true;
      } else {
        boolean _and_5 = false;
        boolean _greaterThan_1 = (y2.compareTo(y1) > 0);
        if (!_greaterThan_1) {
          _and_5 = false;
        } else {
          _and_5 = (((y2).floatValue() - (y1).floatValue()) < (((h1).floatValue() + (h2).floatValue()) / 2));
        }
        _or_1 = _and_5;
      }
      _and_1 = _or_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _or_2 = false;
      boolean _and_6 = false;
      boolean _greaterEqualsThan_2 = (z1.compareTo(z2) >= 0);
      if (!_greaterEqualsThan_2) {
        _and_6 = false;
      } else {
        _and_6 = (((z1).floatValue() - (z2).floatValue()) < (((w1).floatValue() + (w2).floatValue()) / 2));
      }
      if (_and_6) {
        _or_2 = true;
      } else {
        boolean _and_7 = false;
        boolean _greaterThan_2 = (z2.compareTo(z1) > 0);
        if (!_greaterThan_2) {
          _and_7 = false;
        } else {
          _and_7 = (((z2).floatValue() - (z1).floatValue()) < (((w1).floatValue() + (w2).floatValue()) / 2));
        }
        _or_2 = _and_7;
      }
      _and = _or_2;
    }
    return _and;
  }
}
