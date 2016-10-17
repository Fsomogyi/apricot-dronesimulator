package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WarningLiftPlaceMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WarningLiftPlaceMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.AllLiftInstructionsQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.AllPlaceObjectInstructionsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate WarningLiftPlaceMatcher in a type-safe way.
 * 
 * @see WarningLiftPlaceMatcher
 * @see WarningLiftPlaceMatch
 * 
 */
@SuppressWarnings("all")
public final class WarningLiftPlaceQuerySpecification extends BaseGeneratedEMFQuerySpecification<WarningLiftPlaceMatcher> {
  private WarningLiftPlaceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WarningLiftPlaceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WarningLiftPlaceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WarningLiftPlaceMatcher.on(engine);
  }
  
  @Override
  public WarningLiftPlaceMatch newEmptyMatch() {
    return WarningLiftPlaceMatch.newEmptyMatch();
  }
  
  @Override
  public WarningLiftPlaceMatch newMatch(final Object... parameters) {
    return WarningLiftPlaceMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static WarningLiftPlaceQuerySpecification INSTANCE = make();
    
    public static WarningLiftPlaceQuerySpecification make() {
      return new WarningLiftPlaceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WarningLiftPlaceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.warningLiftPlace";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("db");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("db", "hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_db = body.getOrCreateVariableByName("db");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		new TypeConstraint(body, new FlatTuple(var_db), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_db, "db")
      		));
      		// 	DroneBehaviour(db)
      		new TypeConstraint(body, new FlatTuple(var_db), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "DroneBehaviour")));
      		// 	count find allLiftInstructions(_) != count find allPlaceObjectInstructions(_)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new PatternMatchCounter(body, new FlatTuple(var___0_), AllLiftInstructionsQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_0_);
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var___1_), AllPlaceObjectInstructionsQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Inequality(body, var__virtual_0_, var__virtual_1_);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "warning");
      		annotation.addAttribute("message", "Not every Lift instruction is followed by a PlaceObject instruction!");
      		annotation.addAttribute("targetEditorId", "*");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "db"
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
