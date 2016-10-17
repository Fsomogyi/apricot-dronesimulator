package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.CollisionDetectionQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.collisionDetection pattern,
 * to be used in conjunction with {@link CollisionDetectionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CollisionDetectionMatcher
 * @see CollisionDetectionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CollisionDetectionMatch extends BasePatternMatch {
  private SizedElement fSe1;
  
  private SizedElement fSe2;
  
  private static List<String> parameterNames = makeImmutableList("se1", "se2");
  
  private CollisionDetectionMatch(final SizedElement pSe1, final SizedElement pSe2) {
    this.fSe1 = pSe1;
    this.fSe2 = pSe2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("se1".equals(parameterName)) return this.fSe1;
    if ("se2".equals(parameterName)) return this.fSe2;
    return null;
  }
  
  public SizedElement getSe1() {
    return this.fSe1;
  }
  
  public SizedElement getSe2() {
    return this.fSe2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("se1".equals(parameterName) ) {
    	this.fSe1 = (hu.bme.mit.mdsd.dns2016.drones.SizedElement) newValue;
    	return true;
    }
    if ("se2".equals(parameterName) ) {
    	this.fSe2 = (hu.bme.mit.mdsd.dns2016.drones.SizedElement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSe1(final SizedElement pSe1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSe1 = pSe1;
  }
  
  public void setSe2(final SizedElement pSe2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSe2 = pSe2;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.collisionDetection";
  }
  
  @Override
  public List<String> parameterNames() {
    return CollisionDetectionMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSe1, fSe2};
  }
  
  @Override
  public CollisionDetectionMatch toImmutable() {
    return isMutable() ? newMatch(fSe1, fSe2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"se1\"=" + prettyPrintValue(fSe1) + ", ");
    
    result.append("\"se2\"=" + prettyPrintValue(fSe2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSe1 == null) ? 0 : fSe1.hashCode());
    result = prime * result + ((fSe2 == null) ? 0 : fSe2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CollisionDetectionMatch)) { // this should be infrequent
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
    CollisionDetectionMatch other = (CollisionDetectionMatch) obj;
    if (fSe1 == null) {if (other.fSe1 != null) return false;}
    else if (!fSe1.equals(other.fSe1)) return false;
    if (fSe2 == null) {if (other.fSe2 != null) return false;}
    else if (!fSe2.equals(other.fSe2)) return false;
    return true;
  }
  
  @Override
  public CollisionDetectionQuerySpecification specification() {
    try {
    	return CollisionDetectionQuerySpecification.instance();
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
  public static CollisionDetectionMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CollisionDetectionMatch newMutableMatch(final SizedElement pSe1, final SizedElement pSe2) {
    return new Mutable(pSe1, pSe2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSe1 the fixed value of pattern parameter se1, or null if not bound.
   * @param pSe2 the fixed value of pattern parameter se2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CollisionDetectionMatch newMatch(final SizedElement pSe1, final SizedElement pSe2) {
    return new Immutable(pSe1, pSe2);
  }
  
  private static final class Mutable extends CollisionDetectionMatch {
    Mutable(final SizedElement pSe1, final SizedElement pSe2) {
      super(pSe1, pSe2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CollisionDetectionMatch {
    Immutable(final SizedElement pSe1, final SizedElement pSe2) {
      super(pSe1, pSe2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
