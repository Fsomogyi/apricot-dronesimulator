package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidRechargeRateQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidRechargeRate pattern,
 * to be used in conjunction with {@link InvalidRechargeRateMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidRechargeRateMatcher
 * @see InvalidRechargeRateProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidRechargeRateMatch extends BasePatternMatch {
  private Battery fB;
  
  private Float fRechargeRate;
  
  private static List<String> parameterNames = makeImmutableList("b", "rechargeRate");
  
  private InvalidRechargeRateMatch(final Battery pB, final Float pRechargeRate) {
    this.fB = pB;
    this.fRechargeRate = pRechargeRate;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("b".equals(parameterName)) return this.fB;
    if ("rechargeRate".equals(parameterName)) return this.fRechargeRate;
    return null;
  }
  
  public Battery getB() {
    return this.fB;
  }
  
  public Float getRechargeRate() {
    return this.fRechargeRate;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("b".equals(parameterName) ) {
    	this.fB = (hu.bme.mit.mdsd.dns2016.drones.Battery) newValue;
    	return true;
    }
    if ("rechargeRate".equals(parameterName) ) {
    	this.fRechargeRate = (java.lang.Float) newValue;
    	return true;
    }
    return false;
  }
  
  public void setB(final Battery pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
  }
  
  public void setRechargeRate(final Float pRechargeRate) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRechargeRate = pRechargeRate;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidRechargeRate";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidRechargeRateMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fB, fRechargeRate};
  }
  
  @Override
  public InvalidRechargeRateMatch toImmutable() {
    return isMutable() ? newMatch(fB, fRechargeRate) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"b\"=" + prettyPrintValue(fB) + ", ");
    
    result.append("\"rechargeRate\"=" + prettyPrintValue(fRechargeRate)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fB == null) ? 0 : fB.hashCode());
    result = prime * result + ((fRechargeRate == null) ? 0 : fRechargeRate.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidRechargeRateMatch)) { // this should be infrequent
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
    InvalidRechargeRateMatch other = (InvalidRechargeRateMatch) obj;
    if (fB == null) {if (other.fB != null) return false;}
    else if (!fB.equals(other.fB)) return false;
    if (fRechargeRate == null) {if (other.fRechargeRate != null) return false;}
    else if (!fRechargeRate.equals(other.fRechargeRate)) return false;
    return true;
  }
  
  @Override
  public InvalidRechargeRateQuerySpecification specification() {
    try {
    	return InvalidRechargeRateQuerySpecification.instance();
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
  public static InvalidRechargeRateMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidRechargeRateMatch newMutableMatch(final Battery pB, final Float pRechargeRate) {
    return new Mutable(pB, pRechargeRate);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pRechargeRate the fixed value of pattern parameter rechargeRate, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidRechargeRateMatch newMatch(final Battery pB, final Float pRechargeRate) {
    return new Immutable(pB, pRechargeRate);
  }
  
  private static final class Mutable extends InvalidRechargeRateMatch {
    Mutable(final Battery pB, final Float pRechargeRate) {
      super(pB, pRechargeRate);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidRechargeRateMatch {
    Immutable(final Battery pB, final Float pRechargeRate) {
      super(pB, pRechargeRate);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
