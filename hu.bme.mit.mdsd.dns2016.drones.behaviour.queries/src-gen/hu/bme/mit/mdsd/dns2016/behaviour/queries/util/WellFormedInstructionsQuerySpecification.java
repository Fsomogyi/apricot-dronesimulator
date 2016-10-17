package hu.bme.mit.mdsd.dns2016.behaviour.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedInstructionsMatch;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedInstructionsMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidLiftInstructionQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidPauseDurationQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidWaitForMessageTimeoutQuerySpecification;
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
 * A pattern-specific query specification that can instantiate WellFormedInstructionsMatcher in a type-safe way.
 * 
 * @see WellFormedInstructionsMatcher
 * @see WellFormedInstructionsMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedInstructionsQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedInstructionsMatcher> {
  private WellFormedInstructionsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedInstructionsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedInstructionsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedInstructionsMatcher.on(engine);
  }
  
  @Override
  public WellFormedInstructionsMatch newEmptyMatch() {
    return WellFormedInstructionsMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedInstructionsMatch newMatch(final Object... parameters) {
    return WellFormedInstructionsMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedInstructionsQuerySpecification INSTANCE = make();
    
    public static WellFormedInstructionsQuerySpecification make() {
      return new WellFormedInstructionsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedInstructionsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.behaviour.queries.wellFormedInstructions";
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
      		// 	neg find invalidLiftInstruction(_)
      		new NegativePatternCall(body, new FlatTuple(var___0_), InvalidLiftInstructionQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find invalidPauseDuration(_)
      		new NegativePatternCall(body, new FlatTuple(var___1_), InvalidPauseDurationQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find invalidWaitForMessageTimeout(_)
      		new NegativePatternCall(body, new FlatTuple(var___2_), InvalidWaitForMessageTimeoutQuerySpecification.instance().getInternalQueryRepresentation());
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
