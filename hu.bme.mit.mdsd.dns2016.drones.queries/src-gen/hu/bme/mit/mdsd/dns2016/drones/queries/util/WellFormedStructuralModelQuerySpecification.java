package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedStructuralModelMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedStructuralModelMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedBatteriesQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedDronesQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedFieldObjectsQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedNamesQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedSizesAndCollisionsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate WellFormedStructuralModelMatcher in a type-safe way.
 * 
 * @see WellFormedStructuralModelMatcher
 * @see WellFormedStructuralModelMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedStructuralModelQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedStructuralModelMatcher> {
  private WellFormedStructuralModelQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedStructuralModelQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedStructuralModelMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedStructuralModelMatcher.on(engine);
  }
  
  @Override
  public WellFormedStructuralModelMatch newEmptyMatch() {
    return WellFormedStructuralModelMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedStructuralModelMatch newMatch(final Object... parameters) {
    return WellFormedStructuralModelMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedStructuralModelQuerySpecification INSTANCE = make();
    
    public static WellFormedStructuralModelQuerySpecification make() {
      return new WellFormedStructuralModelQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedStructuralModelQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.wellFormedStructuralModel";
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
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		));
      		//  	find wellFormedNames()
      		new PositivePatternCall(body, new FlatTuple(), WellFormedNamesQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	find wellFormedDrones()
      		new PositivePatternCall(body, new FlatTuple(), WellFormedDronesQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	find wellFormedBatteries()
      		new PositivePatternCall(body, new FlatTuple(), WellFormedBatteriesQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	find wellFormedFieldObjects()
      		new PositivePatternCall(body, new FlatTuple(), WellFormedFieldObjectsQuerySpecification.instance().getInternalQueryRepresentation());
      		//  	find wellFormedSizesAndCollisions()
      		new PositivePatternCall(body, new FlatTuple(), WellFormedSizesAndCollisionsQuerySpecification.instance().getInternalQueryRepresentation());
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
