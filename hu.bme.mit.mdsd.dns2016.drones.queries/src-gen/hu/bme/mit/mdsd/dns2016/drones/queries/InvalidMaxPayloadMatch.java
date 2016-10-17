package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidMaxPayloadQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidMaxPayload pattern,
 * to be used in conjunction with {@link InvalidMaxPayloadMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidMaxPayloadMatcher
 * @see InvalidMaxPayloadProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidMaxPayloadMatch extends BasePatternMatch {
  private Drone fD;
  
  private Float fMaxPayload;
  
  private static List<String> parameterNames = makeImmutableList("d", "maxPayload");
  
  private InvalidMaxPayloadMatch(final Drone pD, final Float pMaxPayload) {
    this.fD = pD;
    this.fMaxPayload = pMaxPayload;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("d".equals(parameterName)) return this.fD;
    if ("maxPayload".equals(parameterName)) return this.fMaxPayload;
    return null;
  }
  
  public Drone getD() {
    return this.fD;
  }
  
  public Float getMaxPayload() {
    return this.fMaxPayload;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("d".equals(parameterName) ) {
    	this.fD = (hu.bme.mit.mdsd.dns2016.drones.Drone) newValue;
    	return true;
    }
    if ("maxPayload".equals(parameterName) ) {
    	this.fMaxPayload = (java.lang.Float) newValue;
    	return true;
    }
    return false;
  }
  
  public void setD(final Drone pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  public void setMaxPayload(final Float pMaxPayload) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMaxPayload = pMaxPayload;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidMaxPayload";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidMaxPayloadMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fD, fMaxPayload};
  }
  
  @Override
  public InvalidMaxPayloadMatch toImmutable() {
    return isMutable() ? newMatch(fD, fMaxPayload) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"d\"=" + prettyPrintValue(fD) + ", ");
    
    result.append("\"maxPayload\"=" + prettyPrintValue(fMaxPayload)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fD == null) ? 0 : fD.hashCode());
    result = prime * result + ((fMaxPayload == null) ? 0 : fMaxPayload.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidMaxPayloadMatch)) { // this should be infrequent
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
    InvalidMaxPayloadMatch other = (InvalidMaxPayloadMatch) obj;
    if (fD == null) {if (other.fD != null) return false;}
    else if (!fD.equals(other.fD)) return false;
    if (fMaxPayload == null) {if (other.fMaxPayload != null) return false;}
    else if (!fMaxPayload.equals(other.fMaxPayload)) return false;
    return true;
  }
  
  @Override
  public InvalidMaxPayloadQuerySpecification specification() {
    try {
    	return InvalidMaxPayloadQuerySpecification.instance();
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
  public static InvalidMaxPayloadMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMaxPayload the fixed value of pattern parameter maxPayload, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidMaxPayloadMatch newMutableMatch(final Drone pD, final Float pMaxPayload) {
    return new Mutable(pD, pMaxPayload);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMaxPayload the fixed value of pattern parameter maxPayload, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidMaxPayloadMatch newMatch(final Drone pD, final Float pMaxPayload) {
    return new Immutable(pD, pMaxPayload);
  }
  
  private static final class Mutable extends InvalidMaxPayloadMatch {
    Mutable(final Drone pD, final Float pMaxPayload) {
      super(pD, pMaxPayload);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidMaxPayloadMatch {
    Immutable(final Drone pD, final Float pMaxPayload) {
      super(pD, pMaxPayload);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
