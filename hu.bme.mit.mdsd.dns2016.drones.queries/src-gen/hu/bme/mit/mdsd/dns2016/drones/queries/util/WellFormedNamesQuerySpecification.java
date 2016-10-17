package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedNamesMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedNamesMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidNameQuerySpecification;
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
 * A pattern-specific query specification that can instantiate WellFormedNamesMatcher in a type-safe way.
 * 
 * @see WellFormedNamesMatcher
 * @see WellFormedNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedNamesMatcher> {
  private WellFormedNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedNamesMatcher.on(engine);
  }
  
  @Override
  public WellFormedNamesMatch newEmptyMatch() {
    return WellFormedNamesMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedNamesMatch newMatch(final Object... parameters) {
    return WellFormedNamesMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedNamesQuerySpecification INSTANCE = make();
    
    public static WellFormedNamesQuerySpecification make() {
      return new WellFormedNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.wellFormedNames";
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
      		//  	neg find invalidName(_)
      		new NegativePatternCall(body, new FlatTuple(var___0_), InvalidNameQuerySpecification.instance().getInternalQueryRepresentation());
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
