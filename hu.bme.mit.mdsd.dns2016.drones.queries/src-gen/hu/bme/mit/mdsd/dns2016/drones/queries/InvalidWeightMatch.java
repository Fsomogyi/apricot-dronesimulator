package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidWeightQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.invalidWeight pattern,
 * to be used in conjunction with {@link InvalidWeightMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidWeightMatcher
 * @see InvalidWeightProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidWeightMatch extends BasePatternMatch {
  private MovableObject fMo;
  
  private Float fW;
  
  private static List<String> parameterNames = makeImmutableList("mo", "w");
  
  private InvalidWeightMatch(final MovableObject pMo, final Float pW) {
    this.fMo = pMo;
    this.fW = pW;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("mo".equals(parameterName)) return this.fMo;
    if ("w".equals(parameterName)) return this.fW;
    return null;
  }
  
  public MovableObject getMo() {
    return this.fMo;
  }
  
  public Float getW() {
    return this.fW;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("mo".equals(parameterName) ) {
    	this.fMo = (hu.bme.mit.mdsd.dns2016.drones.MovableObject) newValue;
    	return true;
    }
    if ("w".equals(parameterName) ) {
    	this.fW = (java.lang.Float) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMo(final MovableObject pMo) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMo = pMo;
  }
  
  public void setW(final Float pW) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fW = pW;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.invalidWeight";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidWeightMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMo, fW};
  }
  
  @Override
  public InvalidWeightMatch toImmutable() {
    return isMutable() ? newMatch(fMo, fW) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"mo\"=" + prettyPrintValue(fMo) + ", ");
    
    result.append("\"w\"=" + prettyPrintValue(fW)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMo == null) ? 0 : fMo.hashCode());
    result = prime * result + ((fW == null) ? 0 : fW.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidWeightMatch)) { // this should be infrequent
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
    InvalidWeightMatch other = (InvalidWeightMatch) obj;
    if (fMo == null) {if (other.fMo != null) return false;}
    else if (!fMo.equals(other.fMo)) return false;
    if (fW == null) {if (other.fW != null) return false;}
    else if (!fW.equals(other.fW)) return false;
    return true;
  }
  
  @Override
  public InvalidWeightQuerySpecification specification() {
    try {
    	return InvalidWeightQuerySpecification.instance();
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
  public static InvalidWeightMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidWeightMatch newMutableMatch(final MovableObject pMo, final Float pW) {
    return new Mutable(pMo, pW);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMo the fixed value of pattern parameter mo, or null if not bound.
   * @param pW the fixed value of pattern parameter w, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidWeightMatch newMatch(final MovableObject pMo, final Float pW) {
    return new Immutable(pMo, pW);
  }
  
  private static final class Mutable extends InvalidWeightMatch {
    Mutable(final MovableObject pMo, final Float pW) {
      super(pMo, pW);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidWeightMatch {
    Immutable(final MovableObject pMo, final Float pW) {
      super(pMo, pW);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
