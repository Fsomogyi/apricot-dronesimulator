package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedSizesAndCollisionsMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedSizesAndCollisionsMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.CollisionDetectionQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidSizeQuerySpecification;
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
 * A pattern-specific query specification that can instantiate WellFormedSizesAndCollisionsMatcher in a type-safe way.
 * 
 * @see WellFormedSizesAndCollisionsMatcher
 * @see WellFormedSizesAndCollisionsMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedSizesAndCollisionsQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedSizesAndCollisionsMatcher> {
  private WellFormedSizesAndCollisionsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedSizesAndCollisionsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedSizesAndCollisionsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedSizesAndCollisionsMatcher.on(engine);
  }
  
  @Override
  public WellFormedSizesAndCollisionsMatch newEmptyMatch() {
    return WellFormedSizesAndCollisionsMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedSizesAndCollisionsMatch newMatch(final Object... parameters) {
    return WellFormedSizesAndCollisionsMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedSizesAndCollisionsQuerySpecification INSTANCE = make();
    
    public static WellFormedSizesAndCollisionsQuerySpecification make() {
      return new WellFormedSizesAndCollisionsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedSizesAndCollisionsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.wellFormedSizesAndCollisions";
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
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		));
      		//  	neg find invalidSize(_)
      		new NegativePatternCall(body, new FlatTuple(var___0_), InvalidSizeQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	neg find collisionDetection(_, _)
      		new NegativePatternCall(body, new FlatTuple(var___1_, var___2_), CollisionDetectionQuerySpecification.instance().getInternalQueryRepresentation());
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
