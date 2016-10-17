package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedBatteriesMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedBatteriesMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidBatteryQuerySpecification;
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
 * A pattern-specific query specification that can instantiate WellFormedBatteriesMatcher in a type-safe way.
 * 
 * @see WellFormedBatteriesMatcher
 * @see WellFormedBatteriesMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedBatteriesQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedBatteriesMatcher> {
  private WellFormedBatteriesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedBatteriesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedBatteriesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedBatteriesMatcher.on(engine);
  }
  
  @Override
  public WellFormedBatteriesMatch newEmptyMatch() {
    return WellFormedBatteriesMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedBatteriesMatch newMatch(final Object... parameters) {
    return WellFormedBatteriesMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedBatteriesQuerySpecification INSTANCE = make();
    
    public static WellFormedBatteriesQuerySpecification make() {
      return new WellFormedBatteriesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedBatteriesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.wellFormedBatteries";
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
      		// 	neg find invalidBattery(_)
      		new NegativePatternCall(body, new FlatTuple(var___0_), InvalidBatteryQuerySpecification.instance().getInternalQueryRepresentation());
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
