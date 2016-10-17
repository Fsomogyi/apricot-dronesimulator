package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidMemoryQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidMemory pattern,
 * to be used in conjunction with {@link InvalidMemoryMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidMemoryMatcher
 * @see InvalidMemoryProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidMemoryMatch extends BasePatternMatch {
  private Drone fD;
  
  private Integer fMemory;
  
  private static List<String> parameterNames = makeImmutableList("d", "memory");
  
  private InvalidMemoryMatch(final Drone pD, final Integer pMemory) {
    this.fD = pD;
    this.fMemory = pMemory;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("d".equals(parameterName)) return this.fD;
    if ("memory".equals(parameterName)) return this.fMemory;
    return null;
  }
  
  public Drone getD() {
    return this.fD;
  }
  
  public Integer getMemory() {
    return this.fMemory;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("d".equals(parameterName) ) {
    	this.fD = (hu.bme.mit.mdsd.dns2016.drones.Drone) newValue;
    	return true;
    }
    if ("memory".equals(parameterName) ) {
    	this.fMemory = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
  }
  
  public void setD(final Drone pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  public void setMemory(final Integer pMemory) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMemory = pMemory;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidMemory";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidMemoryMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fD, fMemory};
  }
  
  @Override
  public InvalidMemoryMatch toImmutable() {
    return isMutable() ? newMatch(fD, fMemory) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"d\"=" + prettyPrintValue(fD) + ", ");
    
    result.append("\"memory\"=" + prettyPrintValue(fMemory)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fD == null) ? 0 : fD.hashCode());
    result = prime * result + ((fMemory == null) ? 0 : fMemory.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidMemoryMatch)) { // this should be infrequent
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
    InvalidMemoryMatch other = (InvalidMemoryMatch) obj;
    if (fD == null) {if (other.fD != null) return false;}
    else if (!fD.equals(other.fD)) return false;
    if (fMemory == null) {if (other.fMemory != null) return false;}
    else if (!fMemory.equals(other.fMemory)) return false;
    return true;
  }
  
  @Override
  public InvalidMemoryQuerySpecification specification() {
    try {
    	return InvalidMemoryQuerySpecification.instance();
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
  public static InvalidMemoryMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidMemoryMatch newMutableMatch(final Drone pD, final Integer pMemory) {
    return new Mutable(pD, pMemory);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pMemory the fixed value of pattern parameter memory, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidMemoryMatch newMatch(final Drone pD, final Integer pMemory) {
    return new Immutable(pD, pMemory);
  }
  
  private static final class Mutable extends InvalidMemoryMatch {
    Mutable(final Drone pD, final Integer pMemory) {
      super(pD, pMemory);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidMemoryMatch {
    Immutable(final Drone pD, final Integer pMemory) {
      super(pD, pMemory);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
