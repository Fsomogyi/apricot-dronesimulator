package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedBehaviourModelMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedBehaviourModelMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.WellFormedInstructionsQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.WellFormedNamesQuerySpecification;
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
 * A pattern-specific query specification that can instantiate WellFormedBehaviourModelMatcher in a type-safe way.
 * 
 * @see WellFormedBehaviourModelMatcher
 * @see WellFormedBehaviourModelMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedBehaviourModelQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedBehaviourModelMatcher> {
  private WellFormedBehaviourModelQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedBehaviourModelQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedBehaviourModelMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedBehaviourModelMatcher.on(engine);
  }
  
  @Override
  public WellFormedBehaviourModelMatch newEmptyMatch() {
    return WellFormedBehaviourModelMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedBehaviourModelMatch newMatch(final Object... parameters) {
    return WellFormedBehaviourModelMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedBehaviourModelQuerySpecification INSTANCE = make();
    
    public static WellFormedBehaviourModelQuerySpecification make() {
      return new WellFormedBehaviourModelQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedBehaviourModelQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.wellFormedBehaviourModel";
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
      		// 	find wellFormedNames()
      		new PositivePatternCall(body, new FlatTuple(), WellFormedNamesQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find wellFormedInstructions()
      		new PositivePatternCall(body, new FlatTuple(), WellFormedInstructionsQuerySpecification.instance().getInternalQueryRepresentation());
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
