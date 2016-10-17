package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidCommRangeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidCommRange pattern,
 * to be used in conjunction with {@link InvalidCommRangeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidCommRangeMatcher
 * @see InvalidCommRangeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidCommRangeMatch extends BasePatternMatch {
  private Drone fD;
  
  private Float fCommRange;
  
  private static List<String> parameterNames = makeImmutableList("d", "commRange");
  
  private InvalidCommRangeMatch(final Drone pD, final Float pCommRange) {
    this.fD = pD;
    this.fCommRange = pCommRange;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("d".equals(parameterName)) return this.fD;
    if ("commRange".equals(parameterName)) return this.fCommRange;
    return null;
  }
  
  public Drone getD() {
    return this.fD;
  }
  
  public Float getCommRange() {
    return this.fCommRange;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("d".equals(parameterName) ) {
    	this.fD = (hu.bme.mit.mdsd.dns2016.drones.Drone) newValue;
    	return true;
    }
    if ("commRange".equals(parameterName) ) {
    	this.fCommRange = (java.lang.Float) newValue;
    	return true;
    }
    return false;
  }
  
  public void setD(final Drone pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  public void setCommRange(final Float pCommRange) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCommRange = pCommRange;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidCommRange";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidCommRangeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fD, fCommRange};
  }
  
  @Override
  public InvalidCommRangeMatch toImmutable() {
    return isMutable() ? newMatch(fD, fCommRange) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"d\"=" + prettyPrintValue(fD) + ", ");
    
    result.append("\"commRange\"=" + prettyPrintValue(fCommRange)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fD == null) ? 0 : fD.hashCode());
    result = prime * result + ((fCommRange == null) ? 0 : fCommRange.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidCommRangeMatch)) { // this should be infrequent
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
    InvalidCommRangeMatch other = (InvalidCommRangeMatch) obj;
    if (fD == null) {if (other.fD != null) return false;}
    else if (!fD.equals(other.fD)) return false;
    if (fCommRange == null) {if (other.fCommRange != null) return false;}
    else if (!fCommRange.equals(other.fCommRange)) return false;
    return true;
  }
  
  @Override
  public InvalidCommRangeQuerySpecification specification() {
    try {
    	return InvalidCommRangeQuerySpecification.instance();
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
  public static InvalidCommRangeMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidCommRangeMatch newMutableMatch(final Drone pD, final Float pCommRange) {
    return new Mutable(pD, pCommRange);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCommRange the fixed value of pattern parameter commRange, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidCommRangeMatch newMatch(final Drone pD, final Float pCommRange) {
    return new Immutable(pD, pCommRange);
  }
  
  private static final class Mutable extends InvalidCommRangeMatch {
    Mutable(final Drone pD, final Float pCommRange) {
      super(pD, pCommRange);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidCommRangeMatch {
    Immutable(final Drone pD, final Float pCommRange) {
      super(pD, pCommRange);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
