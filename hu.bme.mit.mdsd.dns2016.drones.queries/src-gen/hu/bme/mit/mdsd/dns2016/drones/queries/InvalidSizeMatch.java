package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidSizeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidSize pattern,
 * to be used in conjunction with {@link InvalidSizeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidSizeMatcher
 * @see InvalidSizeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidSizeMatch extends BasePatternMatch {
  private SizedElement fS;
  
  private static List<String> parameterNames = makeImmutableList("s");
  
  private InvalidSizeMatch(final SizedElement pS) {
    this.fS = pS;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("s".equals(parameterName)) return this.fS;
    return null;
  }
  
  public SizedElement getS() {
    return this.fS;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("s".equals(parameterName) ) {
    	this.fS = (hu.bme.mit.mdsd.dns2016.drones.SizedElement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setS(final SizedElement pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidSize";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidSizeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS};
  }
  
  @Override
  public InvalidSizeMatch toImmutable() {
    return isMutable() ? newMatch(fS) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"s\"=" + prettyPrintValue(fS)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidSizeMatch)) { // this should be infrequent
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
    InvalidSizeMatch other = (InvalidSizeMatch) obj;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    return true;
  }
  
  @Override
  public InvalidSizeQuerySpecification specification() {
    try {
    	return InvalidSizeQuerySpecification.instance();
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
  public static InvalidSizeMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidSizeMatch newMutableMatch(final SizedElement pS) {
    return new Mutable(pS);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS the fixed value of pattern parameter s, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidSizeMatch newMatch(final SizedElement pS) {
    return new Immutable(pS);
  }
  
  private static final class Mutable extends InvalidSizeMatch {
    Mutable(final SizedElement pS) {
      super(pS);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidSizeMatch {
    Immutable(final SizedElement pS) {
      super(pS);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
