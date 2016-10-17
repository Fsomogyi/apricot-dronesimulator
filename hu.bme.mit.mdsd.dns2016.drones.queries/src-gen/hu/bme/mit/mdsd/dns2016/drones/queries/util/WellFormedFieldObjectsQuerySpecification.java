package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedFieldObjectsMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedFieldObjectsMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidWeightQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.SameParametersFieldObjectQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate WellFormedFieldObjectsMatcher in a type-safe way.
 * 
 * @see WellFormedFieldObjectsMatcher
 * @see WellFormedFieldObjectsMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedFieldObjectsQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedFieldObjectsMatcher> {
  private WellFormedFieldObjectsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedFieldObjectsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedFieldObjectsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedFieldObjectsMatcher.on(engine);
  }
  
  @Override
  public WellFormedFieldObjectsMatch newEmptyMatch() {
    return WellFormedFieldObjectsMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedFieldObjectsMatch newMatch(final Object... parameters) {
    return WellFormedFieldObjectsMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedFieldObjectsQuerySpecification INSTANCE = make();
    
    public static WellFormedFieldObjectsQuerySpecification make() {
      return new WellFormedFieldObjectsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedFieldObjectsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.wellFormedFieldObjects";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList();
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList();
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
      		PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
      		PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		));
      		//   	neg find sameParametersFieldObject(_, _, _)
      		new NegativePatternCall(body, new FlatTuple(var___0_, var___1_, var___2_), SameParametersFieldObjectQuerySpecification.instance().getInternalQueryRepresentation());
      		//   	neg find invalidWeight(_, _)
      		new NegativePatternCall(body, new FlatTuple(var___3_, var___4_), InvalidWeightQuerySpecification.instance().getInternalQueryRepresentation());
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
