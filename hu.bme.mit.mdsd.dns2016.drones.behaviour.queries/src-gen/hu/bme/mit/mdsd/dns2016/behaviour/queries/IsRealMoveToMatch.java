package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.MoveTo;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.IsRealMoveToQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.isRealMoveTo pattern,
 * to be used in conjunction with {@link IsRealMoveToMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see IsRealMoveToMatcher
 * @see IsRealMoveToProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class IsRealMoveToMatch extends BasePatternMatch {
  private MoveTo fMt;
  
  private static List<String> parameterNames = makeImmutableList("mt");
  
  private IsRealMoveToMatch(final MoveTo pMt) {
    this.fMt = pMt;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("mt".equals(parameterName)) return this.fMt;
    return null;
  }
  
  public MoveTo getMt() {
    return this.fMt;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("mt".equals(parameterName) ) {
    	this.fMt = (hu.bme.mit.mdsd.dns2016.behaviour.MoveTo) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMt(final MoveTo pMt) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMt = pMt;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.isRealMoveTo";
  }
  
  @Override
  public List<String> parameterNames() {
    return IsRealMoveToMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMt};
  }
  
  @Override
  public IsRealMoveToMatch toImmutable() {
    return isMutable() ? newMatch(fMt) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"mt\"=" + prettyPrintValue(fMt)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMt == null) ? 0 : fMt.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof IsRealMoveToMatch)) { // this should be infrequent
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
    IsRealMoveToMatch other = (IsRealMoveToMatch) obj;
    if (fMt == null) {if (other.fMt != null) return false;}
    else if (!fMt.equals(other.fMt)) return false;
    return true;
  }
  
  @Override
  public IsRealMoveToQuerySpecification specification() {
    try {
    	return IsRealMoveToQuerySpecification.instance();
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
  public static IsRealMoveToMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static IsRealMoveToMatch newMutableMatch(final MoveTo pMt) {
    return new Mutable(pMt);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMt the fixed value of pattern parameter mt, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static IsRealMoveToMatch newMatch(final MoveTo pMt) {
    return new Immutable(pMt);
  }
  
  private static final class Mutable extends IsRealMoveToMatch {
    Mutable(final MoveTo pMt) {
      super(pMt);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends IsRealMoveToMatch {
    Immutable(final MoveTo pMt) {
      super(pMt);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
