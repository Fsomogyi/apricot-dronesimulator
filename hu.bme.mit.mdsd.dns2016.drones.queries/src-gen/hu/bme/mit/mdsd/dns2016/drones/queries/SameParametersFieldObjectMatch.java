package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Parameter;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.SameParametersFieldObjectQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.drones.queries.sameParametersFieldObject pattern,
 * to be used in conjunction with {@link SameParametersFieldObjectMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SameParametersFieldObjectMatcher
 * @see SameParametersFieldObjectProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SameParametersFieldObjectMatch extends BasePatternMatch {
  private FieldObject fF;
  
  private Parameter fP1;
  
  private Parameter fP2;
  
  private static List<String> parameterNames = makeImmutableList("f", "p1", "p2");
  
  private SameParametersFieldObjectMatch(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
    this.fF = pF;
    this.fP1 = pP1;
    this.fP2 = pP2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("f".equals(parameterName)) return this.fF;
    if ("p1".equals(parameterName)) return this.fP1;
    if ("p2".equals(parameterName)) return this.fP2;
    return null;
  }
  
  public FieldObject getF() {
    return this.fF;
  }
  
  public Parameter getP1() {
    return this.fP1;
  }
  
  public Parameter getP2() {
    return this.fP2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("f".equals(parameterName) ) {
    	this.fF = (hu.bme.mit.mdsd.dns2016.drones.FieldObject) newValue;
    	return true;
    }
    if ("p1".equals(parameterName) ) {
    	this.fP1 = (hu.bme.mit.mdsd.dns2016.drones.Parameter) newValue;
    	return true;
    }
    if ("p2".equals(parameterName) ) {
    	this.fP2 = (hu.bme.mit.mdsd.dns2016.drones.Parameter) newValue;
    	return true;
    }
    return false;
  }
  
  public void setF(final FieldObject pF) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fF = pF;
  }
  
  public void setP1(final Parameter pP1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP1 = pP1;
  }
  
  public void setP2(final Parameter pP2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP2 = pP2;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.drones.queries.sameParametersFieldObject";
  }
  
  @Override
  public List<String> parameterNames() {
    return SameParametersFieldObjectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fF, fP1, fP2};
  }
  
  @Override
  public SameParametersFieldObjectMatch toImmutable() {
    return isMutable() ? newMatch(fF, fP1, fP2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"f\"=" + prettyPrintValue(fF) + ", ");
    
    result.append("\"p1\"=" + prettyPrintValue(fP1) + ", ");
    
    result.append("\"p2\"=" + prettyPrintValue(fP2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fF == null) ? 0 : fF.hashCode());
    result = prime * result + ((fP1 == null) ? 0 : fP1.hashCode());
    result = prime * result + ((fP2 == null) ? 0 : fP2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SameParametersFieldObjectMatch)) { // this should be infrequent
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
    SameParametersFieldObjectMatch other = (SameParametersFieldObjectMatch) obj;
    if (fF == null) {if (other.fF != null) return false;}
    else if (!fF.equals(other.fF)) return false;
    if (fP1 == null) {if (other.fP1 != null) return false;}
    else if (!fP1.equals(other.fP1)) return false;
    if (fP2 == null) {if (other.fP2 != null) return false;}
    else if (!fP2.equals(other.fP2)) return false;
    return true;
  }
  
  @Override
  public SameParametersFieldObjectQuerySpecification specification() {
    try {
    	return SameParametersFieldObjectQuerySpecification.instance();
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
  public static SameParametersFieldObjectMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SameParametersFieldObjectMatch newMutableMatch(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
    return new Mutable(pF, pP1, pP2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SameParametersFieldObjectMatch newMatch(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
    return new Immutable(pF, pP1, pP2);
  }
  
  private static final class Mutable extends SameParametersFieldObjectMatch {
    Mutable(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
      super(pF, pP1, pP2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SameParametersFieldObjectMatch {
    Immutable(final FieldObject pF, final Parameter pP1, final Parameter pP2) {
      super(pF, pP1, pP2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
