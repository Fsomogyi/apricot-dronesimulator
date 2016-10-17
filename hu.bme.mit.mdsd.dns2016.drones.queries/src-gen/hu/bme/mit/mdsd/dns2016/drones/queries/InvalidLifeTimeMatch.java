package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidLifeTimeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidLifeTime pattern,
 * to be used in conjunction with {@link InvalidLifeTimeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidLifeTimeMatcher
 * @see InvalidLifeTimeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidLifeTimeMatch extends BasePatternMatch {
  private Battery fB;
  
  private Float fLifeTime;
  
  private static List<String> parameterNames = makeImmutableList("b", "lifeTime");
  
  private InvalidLifeTimeMatch(final Battery pB, final Float pLifeTime) {
    this.fB = pB;
    this.fLifeTime = pLifeTime;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("b".equals(parameterName)) return this.fB;
    if ("lifeTime".equals(parameterName)) return this.fLifeTime;
    return null;
  }
  
  public Battery getB() {
    return this.fB;
  }
  
  public Float getLifeTime() {
    return this.fLifeTime;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("b".equals(parameterName) ) {
    	this.fB = (hu.bme.mit.mdsd.dns2016.drones.Battery) newValue;
    	return true;
    }
    if ("lifeTime".equals(parameterName) ) {
    	this.fLifeTime = (java.lang.Float) newValue;
    	return true;
    }
    return false;
  }
  
  public void setB(final Battery pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
  }
  
  public void setLifeTime(final Float pLifeTime) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fLifeTime = pLifeTime;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidLifeTime";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidLifeTimeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fB, fLifeTime};
  }
  
  @Override
  public InvalidLifeTimeMatch toImmutable() {
    return isMutable() ? newMatch(fB, fLifeTime) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"b\"=" + prettyPrintValue(fB) + ", ");
    
    result.append("\"lifeTime\"=" + prettyPrintValue(fLifeTime)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fB == null) ? 0 : fB.hashCode());
    result = prime * result + ((fLifeTime == null) ? 0 : fLifeTime.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidLifeTimeMatch)) { // this should be infrequent
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
    InvalidLifeTimeMatch other = (InvalidLifeTimeMatch) obj;
    if (fB == null) {if (other.fB != null) return false;}
    else if (!fB.equals(other.fB)) return false;
    if (fLifeTime == null) {if (other.fLifeTime != null) return false;}
    else if (!fLifeTime.equals(other.fLifeTime)) return false;
    return true;
  }
  
  @Override
  public InvalidLifeTimeQuerySpecification specification() {
    try {
    	return InvalidLifeTimeQuerySpecification.instance();
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
  public static InvalidLifeTimeMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidLifeTimeMatch newMutableMatch(final Battery pB, final Float pLifeTime) {
    return new Mutable(pB, pLifeTime);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pLifeTime the fixed value of pattern parameter lifeTime, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidLifeTimeMatch newMatch(final Battery pB, final Float pLifeTime) {
    return new Immutable(pB, pLifeTime);
  }
  
  private static final class Mutable extends InvalidLifeTimeMatch {
    Mutable(final Battery pB, final Float pLifeTime) {
      super(pB, pLifeTime);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidLifeTimeMatch {
    Immutable(final Battery pB, final Float pLifeTime) {
      super(pB, pLifeTime);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
