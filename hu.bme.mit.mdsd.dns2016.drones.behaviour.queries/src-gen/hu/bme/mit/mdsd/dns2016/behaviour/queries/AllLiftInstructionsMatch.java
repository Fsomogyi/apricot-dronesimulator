package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.Lift;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.AllLiftInstructionsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.allLiftInstructions pattern,
 * to be used in conjunction with {@link AllLiftInstructionsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllLiftInstructionsMatcher
 * @see AllLiftInstructionsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllLiftInstructionsMatch extends BasePatternMatch {
  private Lift fL;
  
  private static List<String> parameterNames = makeImmutableList("l");
  
  private AllLiftInstructionsMatch(final Lift pL) {
    this.fL = pL;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("l".equals(parameterName)) return this.fL;
    return null;
  }
  
  public Lift getL() {
    return this.fL;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("l".equals(parameterName) ) {
    	this.fL = (hu.bme.mit.mdsd.dns2016.behaviour.Lift) newValue;
    	return true;
    }
    return false;
  }
  
  public void setL(final Lift pL) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fL = pL;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.allLiftInstructions";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllLiftInstructionsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fL};
  }
  
  @Override
  public AllLiftInstructionsMatch toImmutable() {
    return isMutable() ? newMatch(fL) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"l\"=" + prettyPrintValue(fL)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fL == null) ? 0 : fL.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AllLiftInstructionsMatch)) { // this should be infrequent
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
    AllLiftInstructionsMatch other = (AllLiftInstructionsMatch) obj;
    if (fL == null) {if (other.fL != null) return false;}
    else if (!fL.equals(other.fL)) return false;
    return true;
  }
  
  @Override
  public AllLiftInstructionsQuerySpecification specification() {
    try {
    	return AllLiftInstructionsQuerySpecification.instance();
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
  public static AllLiftInstructionsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pL the fixed value of pattern parameter l, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllLiftInstructionsMatch newMutableMatch(final Lift pL) {
    return new Mutable(pL);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pL the fixed value of pattern parameter l, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllLiftInstructionsMatch newMatch(final Lift pL) {
    return new Immutable(pL);
  }
  
  private static final class Mutable extends AllLiftInstructionsMatch {
    Mutable(final Lift pL) {
      super(pL);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllLiftInstructionsMatch {
    Immutable(final Lift pL) {
      super(pL);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
