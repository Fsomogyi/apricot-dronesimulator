package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidRemLifeTimeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidRemLifeTime pattern,
 * to be used in conjunction with {@link InvalidRemLifeTimeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidRemLifeTimeMatcher
 * @see InvalidRemLifeTimeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidRemLifeTimeMatch extends BasePatternMatch {
  private Battery fB;
  
  private Float fRemLifeTime;
  
  private static List<String> parameterNames = makeImmutableList("b", "remLifeTime");
  
  private InvalidRemLifeTimeMatch(final Battery pB, final Float pRemLifeTime) {
    this.fB = pB;
    this.fRemLifeTime = pRemLifeTime;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("b".equals(parameterName)) return this.fB;
    if ("remLifeTime".equals(parameterName)) return this.fRemLifeTime;
    return null;
  }
  
  public Battery getB() {
    return this.fB;
  }
  
  public Float getRemLifeTime() {
    return this.fRemLifeTime;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("b".equals(parameterName) ) {
    	this.fB = (hu.bme.mit.mdsd.dns2016.drones.Battery) newValue;
    	return true;
    }
    if ("remLifeTime".equals(parameterName) ) {
    	this.fRemLifeTime = (java.lang.Float) newValue;
    	return true;
    }
    return false;
  }
  
  public void setB(final Battery pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
  }
  
  public void setRemLifeTime(final Float pRemLifeTime) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRemLifeTime = pRemLifeTime;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidRemLifeTime";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidRemLifeTimeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fB, fRemLifeTime};
  }
  
  @Override
  public InvalidRemLifeTimeMatch toImmutable() {
    return isMutable() ? newMatch(fB, fRemLifeTime) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"b\"=" + prettyPrintValue(fB) + ", ");
    
    result.append("\"remLifeTime\"=" + prettyPrintValue(fRemLifeTime)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fB == null) ? 0 : fB.hashCode());
    result = prime * result + ((fRemLifeTime == null) ? 0 : fRemLifeTime.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidRemLifeTimeMatch)) { // this should be infrequent
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
    InvalidRemLifeTimeMatch other = (InvalidRemLifeTimeMatch) obj;
    if (fB == null) {if (other.fB != null) return false;}
    else if (!fB.equals(other.fB)) return false;
    if (fRemLifeTime == null) {if (other.fRemLifeTime != null) return false;}
    else if (!fRemLifeTime.equals(other.fRemLifeTime)) return false;
    return true;
  }
  
  @Override
  public InvalidRemLifeTimeQuerySpecification specification() {
    try {
    	return InvalidRemLifeTimeQuerySpecification.instance();
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
  public static InvalidRemLifeTimeMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidRemLifeTimeMatch newMutableMatch(final Battery pB, final Float pRemLifeTime) {
    return new Mutable(pB, pRemLifeTime);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRemLifeTime the fixed value of pattern parameter remLifeTime, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidRemLifeTimeMatch newMatch(final Battery pB, final Float pRemLifeTime) {
    return new Immutable(pB, pRemLifeTime);
  }
  
  private static final class Mutable extends InvalidRemLifeTimeMatch {
    Mutable(final Battery pB, final Float pRemLifeTime) {
      super(pB, pRemLifeTime);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidRemLifeTimeMatch {
    Immutable(final Battery pB, final Float pRemLifeTime) {
      super(pB, pRemLifeTime);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
