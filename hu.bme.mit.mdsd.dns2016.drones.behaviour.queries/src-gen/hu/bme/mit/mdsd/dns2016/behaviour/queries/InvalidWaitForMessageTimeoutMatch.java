package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidWaitForMessageTimeoutQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidWaitForMessageTimeout pattern,
 * to be used in conjunction with {@link InvalidWaitForMessageTimeoutMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidWaitForMessageTimeoutMatcher
 * @see InvalidWaitForMessageTimeoutProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidWaitForMessageTimeoutMatch extends BasePatternMatch {
  private WaitForMessage fWfm;
  
  private static List<String> parameterNames = makeImmutableList("wfm");
  
  private InvalidWaitForMessageTimeoutMatch(final WaitForMessage pWfm) {
    this.fWfm = pWfm;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("wfm".equals(parameterName)) return this.fWfm;
    return null;
  }
  
  public WaitForMessage getWfm() {
    return this.fWfm;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("wfm".equals(parameterName) ) {
    	this.fWfm = (hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage) newValue;
    	return true;
    }
    return false;
  }
  
  public void setWfm(final WaitForMessage pWfm) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fWfm = pWfm;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidWaitForMessageTimeout";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidWaitForMessageTimeoutMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fWfm};
  }
  
  @Override
  public InvalidWaitForMessageTimeoutMatch toImmutable() {
    return isMutable() ? newMatch(fWfm) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"wfm\"=" + prettyPrintValue(fWfm)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fWfm == null) ? 0 : fWfm.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidWaitForMessageTimeoutMatch)) { // this should be infrequent
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
    InvalidWaitForMessageTimeoutMatch other = (InvalidWaitForMessageTimeoutMatch) obj;
    if (fWfm == null) {if (other.fWfm != null) return false;}
    else if (!fWfm.equals(other.fWfm)) return false;
    return true;
  }
  
  @Override
  public InvalidWaitForMessageTimeoutQuerySpecification specification() {
    try {
    	return InvalidWaitForMessageTimeoutQuerySpecification.instance();
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
  public static InvalidWaitForMessageTimeoutMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidWaitForMessageTimeoutMatch newMutableMatch(final WaitForMessage pWfm) {
    return new Mutable(pWfm);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pWfm the fixed value of pattern parameter wfm, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidWaitForMessageTimeoutMatch newMatch(final WaitForMessage pWfm) {
    return new Immutable(pWfm);
  }
  
  private static final class Mutable extends InvalidWaitForMessageTimeoutMatch {
    Mutable(final WaitForMessage pWfm) {
      super(pWfm);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidWaitForMessageTimeoutMatch {
    Immutable(final WaitForMessage pWfm) {
      super(pWfm);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
