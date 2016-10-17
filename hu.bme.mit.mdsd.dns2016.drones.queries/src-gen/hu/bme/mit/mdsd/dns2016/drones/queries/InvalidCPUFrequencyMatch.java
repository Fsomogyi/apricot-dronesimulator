package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidCPUFrequencyQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidCPUFrequency pattern,
 * to be used in conjunction with {@link InvalidCPUFrequencyMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidCPUFrequencyMatcher
 * @see InvalidCPUFrequencyProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidCPUFrequencyMatch extends BasePatternMatch {
  private Drone fD;
  
  private Integer fFreq;
  
  private static List<String> parameterNames = makeImmutableList("d", "freq");
  
  private InvalidCPUFrequencyMatch(final Drone pD, final Integer pFreq) {
    this.fD = pD;
    this.fFreq = pFreq;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("d".equals(parameterName)) return this.fD;
    if ("freq".equals(parameterName)) return this.fFreq;
    return null;
  }
  
  public Drone getD() {
    return this.fD;
  }
  
  public Integer getFreq() {
    return this.fFreq;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("d".equals(parameterName) ) {
    	this.fD = (hu.bme.mit.mdsd.dns2016.drones.Drone) newValue;
    	return true;
    }
    if ("freq".equals(parameterName) ) {
    	this.fFreq = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
  }
  
  public void setD(final Drone pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  public void setFreq(final Integer pFreq) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFreq = pFreq;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidCPUFrequency";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidCPUFrequencyMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fD, fFreq};
  }
  
  @Override
  public InvalidCPUFrequencyMatch toImmutable() {
    return isMutable() ? newMatch(fD, fFreq) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"d\"=" + prettyPrintValue(fD) + ", ");
    
    result.append("\"freq\"=" + prettyPrintValue(fFreq)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fD == null) ? 0 : fD.hashCode());
    result = prime * result + ((fFreq == null) ? 0 : fFreq.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidCPUFrequencyMatch)) { // this should be infrequent
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
    InvalidCPUFrequencyMatch other = (InvalidCPUFrequencyMatch) obj;
    if (fD == null) {if (other.fD != null) return false;}
    else if (!fD.equals(other.fD)) return false;
    if (fFreq == null) {if (other.fFreq != null) return false;}
    else if (!fFreq.equals(other.fFreq)) return false;
    return true;
  }
  
  @Override
  public InvalidCPUFrequencyQuerySpecification specification() {
    try {
    	return InvalidCPUFrequencyQuerySpecification.instance();
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
  public static InvalidCPUFrequencyMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidCPUFrequencyMatch newMutableMatch(final Drone pD, final Integer pFreq) {
    return new Mutable(pD, pFreq);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @param pFreq the fixed value of pattern parameter freq, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidCPUFrequencyMatch newMatch(final Drone pD, final Integer pFreq) {
    return new Immutable(pD, pFreq);
  }
  
  private static final class Mutable extends InvalidCPUFrequencyMatch {
    Mutable(final Drone pD, final Integer pFreq) {
      super(pD, pFreq);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidCPUFrequencyMatch {
    Immutable(final Drone pD, final Integer pFreq) {
      super(pD, pFreq);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
