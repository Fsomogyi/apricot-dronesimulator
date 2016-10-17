package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.IsRealMoveToMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.IsRealMoveToMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.MoveToOfInstructionMessageQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate IsRealMoveToMatcher in a type-safe way.
 * 
 * @see IsRealMoveToMatcher
 * @see IsRealMoveToMatch
 * 
 */
@SuppressWarnings("all")
public final class IsRealMoveToQuerySpecification extends BaseGeneratedEMFQuerySpecification<IsRealMoveToMatcher> {
  private IsRealMoveToQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IsRealMoveToQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IsRealMoveToMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IsRealMoveToMatcher.on(engine);
  }
  
  @Override
  public IsRealMoveToMatch newEmptyMatch() {
    return IsRealMoveToMatch.newEmptyMatch();
  }
  
  @Override
  public IsRealMoveToMatch newMatch(final Object... parameters) {
    return IsRealMoveToMatch.newMatch((hu.bme.mit.mdsd.dns2016.behaviour.MoveTo) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static IsRealMoveToQuerySpecification INSTANCE = make();
    
    public static IsRealMoveToQuerySpecification make() {
      return new IsRealMoveToQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static IsRealMoveToQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.isRealMoveTo";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("mt");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("mt", "hu.bme.mit.mdsd.dns2016.behaviour.MoveTo"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_mt = body.getOrCreateVariableByName("mt");
      		new TypeConstraint(body, new FlatTuple(var_mt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones.behaviour", "MoveTo")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_mt, "mt")
      		));
      		// 	neg find moveToOfInstructionMessage(mt)
      		new NegativePatternCall(body, new FlatTuple(var_mt), MoveToOfInstructionMessageQuerySpecification.instance().getInternalQueryRepresentation());
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
}
