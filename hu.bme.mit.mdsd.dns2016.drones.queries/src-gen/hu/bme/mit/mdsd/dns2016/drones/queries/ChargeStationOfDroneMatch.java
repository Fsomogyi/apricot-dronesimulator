package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.ChargeStation;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.ChargeStationOfDroneQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.chargeStationOfDrone pattern,
 * to be used in conjunction with {@link ChargeStationOfDroneMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ChargeStationOfDroneMatcher
 * @see ChargeStationOfDroneProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ChargeStationOfDroneMatch extends BasePatternMatch {
  private Drone fD;
  
  private ChargeStation fCs;
  
  private static List<String> parameterNames = makeImmutableList("d", "cs");
  
  private ChargeStationOfDroneMatch(final Drone pD, final ChargeStation pCs) {
    this.fD = pD;
    this.fCs = pCs;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("d".equals(parameterName)) return this.fD;
    if ("cs".equals(parameterName)) return this.fCs;
    return null;
  }
  
  public Drone getD() {
    return this.fD;
  }
  
  public ChargeStation getCs() {
    return this.fCs;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("d".equals(parameterName) ) {
    	this.fD = (hu.bme.mit.mdsd.dns2016.drones.Drone) newValue;
    	return true;
    }
    if ("cs".equals(parameterName) ) {
    	this.fCs = (hu.bme.mit.mdsd.dns2016.drones.ChargeStation) newValue;
    	return true;
    }
    return false;
  }
  
  public void setD(final Drone pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  public void setCs(final ChargeStation pCs) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCs = pCs;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.chargeStationOfDrone";
  }
  
  @Override
  public List<String> parameterNames() {
    return ChargeStationOfDroneMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fD, fCs};
  }
  
  @Override
  public ChargeStationOfDroneMatch toImmutable() {
    return isMutable() ? newMatch(fD, fCs) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"d\"=" + prettyPrintValue(fD) + ", ");
    
    result.append("\"cs\"=" + prettyPrintValue(fCs)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fD == null) ? 0 : fD.hashCode());
    result = prime * result + ((fCs == null) ? 0 : fCs.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ChargeStationOfDroneMatch)) { // this should be infrequent
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
    ChargeStationOfDroneMatch other = (ChargeStationOfDroneMatch) obj;
    if (fD == null) {if (other.fD != null) return false;}
    else if (!fD.equals(other.fD)) return false;
    if (fCs == null) {if (other.fCs != null) return false;}
    else if (!fCs.equals(other.fCs)) return false;
    return true;
  }
  
  @Override
  public ChargeStationOfDroneQuerySpecification specification() {
    try {
    	return ChargeStationOfDroneQuerySpecification.instance();
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
  public static ChargeStationOfDroneMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ChargeStationOfDroneMatch newMutableMatch(final Drone pD, final ChargeStation pCs) {
    return new Mutable(pD, pCs);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pCs the fixed value of pattern parameter cs, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ChargeStationOfDroneMatch newMatch(final Drone pD, final ChargeStation pCs) {
    return new Immutable(pD, pCs);
  }
  
  private static final class Mutable extends ChargeStationOfDroneMatch {
    Mutable(final Drone pD, final ChargeStation pCs) {
      super(pD, pCs);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ChargeStationOfDroneMatch {
    Immutable(final Drone pD, final ChargeStation pCs) {
      super(pD, pCs);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
