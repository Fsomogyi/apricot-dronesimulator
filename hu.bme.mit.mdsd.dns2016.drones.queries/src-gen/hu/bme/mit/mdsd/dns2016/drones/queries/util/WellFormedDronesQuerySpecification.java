package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedDronesMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedDronesMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidDroneQuerySpecification;
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
 * A pattern-specific query specification that can instantiate WellFormedDronesMatcher in a type-safe way.
 * 
 * @see WellFormedDronesMatcher
 * @see WellFormedDronesMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedDronesQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedDronesMatcher> {
  private WellFormedDronesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedDronesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedDronesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedDronesMatcher.on(engine);
  }
  
  @Override
  public WellFormedDronesMatch newEmptyMatch() {
    return WellFormedDronesMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedDronesMatch newMatch(final Object... parameters) {
    return WellFormedDronesMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedDronesQuerySpecification INSTANCE = make();
    
    public static WellFormedDronesQuerySpecification make() {
      return new WellFormedDronesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedDronesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.wellFormedDrones";
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
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		));
      		// 	neg find invalidDrone(_)
      		new NegativePatternCall(body, new FlatTuple(var___0_), InvalidDroneQuerySpecification.instance().getInternalQueryRepresentation());
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
