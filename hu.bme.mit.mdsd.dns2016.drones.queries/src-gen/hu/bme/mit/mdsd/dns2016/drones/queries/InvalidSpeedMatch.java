package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidSpeedQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidSpeed pattern,
 * to be used in conjunction with {@link InvalidSpeedMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidSpeedMatcher
 * @see InvalidSpeedProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidSpeedMatch extends BasePatternMatch {
  private Drone fD;
  
  private Float fMinSpeed;
  
  private Float fMaxSpeed;
  
  private static List<String> parameterNames = makeImmutableList("d", "minSpeed", "maxSpeed");
  
  private InvalidSpeedMatch(final Drone pD, final Float pMinSpeed, final Float pMaxSpeed) {
    this.fD = pD;
    this.fMinSpeed = pMinSpeed;
    this.fMaxSpeed = pMaxSpeed;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("d".equals(parameterName)) return this.fD;
    if ("minSpeed".equals(parameterName)) return this.fMinSpeed;
    if ("maxSpeed".equals(parameterName)) return this.fMaxSpeed;
    return null;
  }
  
  public Drone getD() {
    return this.fD;
  }
  
  public Float getMinSpeed() {
    return this.fMinSpeed;
  }
  
  public Float getMaxSpeed() {
    return this.fMaxSpeed;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("d".equals(parameterName) ) {
    	this.fD = (hu.bme.mit.mdsd.dns2016.drones.Drone) newValue;
    	return true;
    }
    if ("minSpeed".equals(parameterName) ) {
    	this.fMinSpeed = (java.lang.Float) newValue;
    	return true;
    }
    if ("maxSpeed".equals(parameterName) ) {
    	this.fMaxSpeed = (java.lang.Float) newValue;
    	return true;
    }
    return false;
  }
  
  public void setD(final Drone pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  public void setMinSpeed(final Float pMinSpeed) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMinSpeed = pMinSpeed;
  }
  
  public void setMaxSpeed(final Float pMaxSpeed) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMaxSpeed = pMaxSpeed;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidSpeed";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidSpeedMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fD, fMinSpeed, fMaxSpeed};
  }
  
  @Override
  public InvalidSpeedMatch toImmutable() {
    return isMutable() ? newMatch(fD, fMinSpeed, fMaxSpeed) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"d\"=" + prettyPrintValue(fD) + ", ");
    
    result.append("\"minSpeed\"=" + prettyPrintValue(fMinSpeed) + ", ");
    
    result.append("\"maxSpeed\"=" + prettyPrintValue(fMaxSpeed)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fD == null) ? 0 : fD.hashCode());
    result = prime * result + ((fMinSpeed == null) ? 0 : fMinSpeed.hashCode());
    result = prime * result + ((fMaxSpeed == null) ? 0 : fMaxSpeed.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidSpeedMatch)) { // this should be infrequent
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
    InvalidSpeedMatch other = (InvalidSpeedMatch) obj;
    if (fD == null) {if (other.fD != null) return false;}
    else if (!fD.equals(other.fD)) return false;
    if (fMinSpeed == null) {if (other.fMinSpeed != null) return false;}
    else if (!fMinSpeed.equals(other.fMinSpeed)) return false;
    if (fMaxSpeed == null) {if (other.fMaxSpeed != null) return false;}
    else if (!fMaxSpeed.equals(other.fMaxSpeed)) return false;
    return true;
  }
  
  @Override
  public InvalidSpeedQuerySpecification specification() {
    try {
    	return InvalidSpeedQuerySpecification.instance();
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
  public static InvalidSpeedMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMinSpeed the fixed value of pattern parameter minSpeed, or null if not bound.
   * @param pMaxSpeed the fixed value of pattern parameter maxSpeed, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidSpeedMatch newMutableMatch(final Drone pD, final Float pMinSpeed, final Float pMaxSpeed) {
    return new Mutable(pD, pMinSpeed, pMaxSpeed);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMinSpeed the fixed value of pattern parameter minSpeed, or null if not bound.
   * @param pMaxSpeed the fixed value of pattern parameter maxSpeed, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidSpeedMatch newMatch(final Drone pD, final Float pMinSpeed, final Float pMaxSpeed) {
    return new Immutable(pD, pMinSpeed, pMaxSpeed);
  }
  
  private static final class Mutable extends InvalidSpeedMatch {
    Mutable(final Drone pD, final Float pMinSpeed, final Float pMaxSpeed) {
      super(pD, pMinSpeed, pMaxSpeed);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidSpeedMatch {
    Immutable(final Drone pD, final Float pMinSpeed, final Float pMaxSpeed) {
      super(pD, pMinSpeed, pMaxSpeed);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
