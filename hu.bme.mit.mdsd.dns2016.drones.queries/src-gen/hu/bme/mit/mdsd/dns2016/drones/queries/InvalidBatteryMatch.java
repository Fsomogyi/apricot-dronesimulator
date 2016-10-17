package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidBatteryQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidBattery pattern,
 * to be used in conjunction with {@link InvalidBatteryMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidBatteryMatcher
 * @see InvalidBatteryProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidBatteryMatch extends BasePatternMatch {
  private Battery fB;
  
  private static List<String> parameterNames = makeImmutableList("b");
  
  private InvalidBatteryMatch(final Battery pB) {
    this.fB = pB;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("b".equals(parameterName)) return this.fB;
    return null;
  }
  
  public Battery getB() {
    return this.fB;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("b".equals(parameterName) ) {
    	this.fB = (hu.bme.mit.mdsd.dns2016.drones.Battery) newValue;
    	return true;
    }
    return false;
  }
  
  public void setB(final Battery pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidBattery";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidBatteryMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fB};
  }
  
  @Override
  public InvalidBatteryMatch toImmutable() {
    return isMutable() ? newMatch(fB) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"b\"=" + prettyPrintValue(fB)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fB == null) ? 0 : fB.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidBatteryMatch)) { // this should be infrequent
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
    InvalidBatteryMatch other = (InvalidBatteryMatch) obj;
    if (fB == null) {if (other.fB != null) return false;}
    else if (!fB.equals(other.fB)) return false;
    return true;
  }
  
  @Override
  public InvalidBatteryQuerySpecification specification() {
    try {
    	return InvalidBatteryQuerySpecification.instance();
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
  public static InvalidBatteryMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidBatteryMatch newMutableMatch(final Battery pB) {
    return new Mutable(pB);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidBatteryMatch newMatch(final Battery pB) {
    return new Immutable(pB);
  }
  
  private static final class Mutable extends InvalidBatteryMatch {
    Mutable(final Battery pB) {
      super(pB);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidBatteryMatch {
    Immutable(final Battery pB) {
      super(pB);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
