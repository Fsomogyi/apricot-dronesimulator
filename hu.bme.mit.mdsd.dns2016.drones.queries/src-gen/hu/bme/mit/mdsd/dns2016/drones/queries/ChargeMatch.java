package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.ChargeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.charge pattern,
 * to be used in conjunction with {@link ChargeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ChargeMatcher
 * @see ChargeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ChargeMatch extends BasePatternMatch {
  private Battery fB;
  
  private Float fC;
  
  private static List<String> parameterNames = makeImmutableList("b", "C");
  
  private ChargeMatch(final Battery pB, final Float pC) {
    this.fB = pB;
    this.fC = pC;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("b".equals(parameterName)) return this.fB;
    if ("C".equals(parameterName)) return this.fC;
    return null;
  }
  
  public Battery getB() {
    return this.fB;
  }
  
  public Float getC() {
    return this.fC;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("b".equals(parameterName) ) {
    	this.fB = (hu.bme.mit.mdsd.dns2016.drones.Battery) newValue;
    	return true;
    }
    if ("C".equals(parameterName) ) {
    	this.fC = (java.lang.Float) newValue;
    	return true;
    }
    return false;
  }
  
  public void setB(final Battery pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
  }
  
  public void setC(final Float pC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fC = pC;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.charge";
  }
  
  @Override
  public List<String> parameterNames() {
    return ChargeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fB, fC};
  }
  
  @Override
  public ChargeMatch toImmutable() {
    return isMutable() ? newMatch(fB, fC) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"b\"=" + prettyPrintValue(fB) + ", ");
    
    result.append("\"C\"=" + prettyPrintValue(fC)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fB == null) ? 0 : fB.hashCode());
    result = prime * result + ((fC == null) ? 0 : fC.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ChargeMatch)) { // this should be infrequent
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
    ChargeMatch other = (ChargeMatch) obj;
    if (fB == null) {if (other.fB != null) return false;}
    else if (!fB.equals(other.fB)) return false;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    return true;
  }
  
  @Override
  public ChargeQuerySpecification specification() {
    try {
    	return ChargeQuerySpecification.instance();
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
  public static ChargeMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ChargeMatch newMutableMatch(final Battery pB, final Float pC) {
    return new Mutable(pB, pC);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ChargeMatch newMatch(final Battery pB, final Float pC) {
    return new Immutable(pB, pC);
  }
  
  private static final class Mutable extends ChargeMatch {
    Mutable(final Battery pB, final Float pC) {
      super(pB, pC);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ChargeMatch {
    Immutable(final Battery pB, final Float pC) {
      super(pB, pC);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
