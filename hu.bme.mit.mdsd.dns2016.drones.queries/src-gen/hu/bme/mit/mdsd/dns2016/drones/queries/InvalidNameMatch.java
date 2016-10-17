package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.NamedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidName pattern,
 * to be used in conjunction with {@link InvalidNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidNameMatcher
 * @see InvalidNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidNameMatch extends BasePatternMatch {
  private NamedElement fNe;
  
  private static List<String> parameterNames = makeImmutableList("ne");
  
  private InvalidNameMatch(final NamedElement pNe) {
    this.fNe = pNe;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ne".equals(parameterName)) return this.fNe;
    return null;
  }
  
  public NamedElement getNe() {
    return this.fNe;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ne".equals(parameterName) ) {
    	this.fNe = (hu.bme.mit.mdsd.dns2016.drones.NamedElement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setNe(final NamedElement pNe) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fNe = pNe;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidName";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fNe};
  }
  
  @Override
  public InvalidNameMatch toImmutable() {
    return isMutable() ? newMatch(fNe) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ne\"=" + prettyPrintValue(fNe)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fNe == null) ? 0 : fNe.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidNameMatch)) { // this should be infrequent
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
    InvalidNameMatch other = (InvalidNameMatch) obj;
    if (fNe == null) {if (other.fNe != null) return false;}
    else if (!fNe.equals(other.fNe)) return false;
    return true;
  }
  
  @Override
  public InvalidNameQuerySpecification specification() {
    try {
    	return InvalidNameQuerySpecification.instance();
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
  public static InvalidNameMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pNe the fixed value of pattern parameter ne, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidNameMatch newMutableMatch(final NamedElement pNe) {
    return new Mutable(pNe);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pNe the fixed value of pattern parameter ne, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidNameMatch newMatch(final NamedElement pNe) {
    return new Immutable(pNe);
  }
  
  private static final class Mutable extends InvalidNameMatch {
    Mutable(final NamedElement pNe) {
      super(pNe);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidNameMatch {
    Immutable(final NamedElement pNe) {
      super(pNe);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
