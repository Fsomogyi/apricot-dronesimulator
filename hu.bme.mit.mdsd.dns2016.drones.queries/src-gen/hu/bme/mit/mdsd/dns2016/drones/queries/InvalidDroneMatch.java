package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidDroneQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidDrone pattern,
 * to be used in conjunction with {@link InvalidDroneMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidDroneMatcher
 * @see InvalidDroneProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidDroneMatch extends BasePatternMatch {
  private Drone fD;
  
  private static List<String> parameterNames = makeImmutableList("d");
  
  private InvalidDroneMatch(final Drone pD) {
    this.fD = pD;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("d".equals(parameterName)) return this.fD;
    return null;
  }
  
  public Drone getD() {
    return this.fD;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("d".equals(parameterName) ) {
    	this.fD = (hu.bme.mit.mdsd.dns2016.drones.Drone) newValue;
    	return true;
    }
    return false;
  }
  
  public void setD(final Drone pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidDrone";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidDroneMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fD};
  }
  
  @Override
  public InvalidDroneMatch toImmutable() {
    return isMutable() ? newMatch(fD) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"d\"=" + prettyPrintValue(fD)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fD == null) ? 0 : fD.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidDroneMatch)) { // this should be infrequent
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
    InvalidDroneMatch other = (InvalidDroneMatch) obj;
    if (fD == null) {if (other.fD != null) return false;}
    else if (!fD.equals(other.fD)) return false;
    return true;
  }
  
  @Override
  public InvalidDroneQuerySpecification specification() {
    try {
    	return InvalidDroneQuerySpecification.instance();
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
  public static InvalidDroneMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidDroneMatch newMutableMatch(final Drone pD) {
    return new Mutable(pD);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidDroneMatch newMatch(final Drone pD) {
    return new Immutable(pD);
  }
  
  private static final class Mutable extends InvalidDroneMatch {
    Mutable(final Drone pD) {
      super(pD);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidDroneMatch {
    Immutable(final Drone pD) {
      super(pD);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
