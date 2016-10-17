package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.Lift;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidLiftInstructionQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidLiftInstruction pattern,
 * to be used in conjunction with {@link InvalidLiftInstructionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidLiftInstructionMatcher
 * @see InvalidLiftInstructionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidLiftInstructionMatch extends BasePatternMatch {
  private Lift fLift;
  
  private static List<String> parameterNames = makeImmutableList("lift");
  
  private InvalidLiftInstructionMatch(final Lift pLift) {
    this.fLift = pLift;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("lift".equals(parameterName)) return this.fLift;
    return null;
  }
  
  public Lift getLift() {
    return this.fLift;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("lift".equals(parameterName) ) {
    	this.fLift = (hu.bme.mit.mdsd.dns2016.behaviour.Lift) newValue;
    	return true;
    }
    return false;
  }
  
  public void setLift(final Lift pLift) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fLift = pLift;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidLiftInstruction";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidLiftInstructionMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fLift};
  }
  
  @Override
  public InvalidLiftInstructionMatch toImmutable() {
    return isMutable() ? newMatch(fLift) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"lift\"=" + prettyPrintValue(fLift)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fLift == null) ? 0 : fLift.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidLiftInstructionMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    InvalidLiftInstructionMatch other = (InvalidLiftInstructionMatch) obj;
    if (fLift == null) {if (other.fLift != null) return false;}
    else if (!fLift.equals(other.fLift)) return false;
    return true;
  }
  
  @Override
  public InvalidLiftInstructionQuerySpecification specification() {
    try {
    	return InvalidLiftInstructionQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static InvalidLiftInstructionMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidLiftInstructionMatch newMutableMatch(final Lift pLift) {
    return new Mutable(pLift);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pLift the fixed value of pattern parameter lift, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidLiftInstructionMatch newMatch(final Lift pLift) {
    return new Immutable(pLift);
  }
  
  private static final class Mutable extends InvalidLiftInstructionMatch {
    Mutable(final Lift pLift) {
      super(pLift);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidLiftInstructionMatch {
    Immutable(final Lift pLift) {
      super(pLift);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
