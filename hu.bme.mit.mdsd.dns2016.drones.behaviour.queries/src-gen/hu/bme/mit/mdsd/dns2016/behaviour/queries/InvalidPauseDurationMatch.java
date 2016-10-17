package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.Pause;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidPauseDurationQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidPauseDuration pattern,
 * to be used in conjunction with {@link InvalidPauseDurationMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidPauseDurationMatcher
 * @see InvalidPauseDurationProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidPauseDurationMatch extends BasePatternMatch {
  private Pause fP;
  
  private static List<String> parameterNames = makeImmutableList("p");
  
  private InvalidPauseDurationMatch(final Pause pP) {
    this.fP = pP;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("p".equals(parameterName)) return this.fP;
    return null;
  }
  
  public Pause getP() {
    return this.fP;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("p".equals(parameterName) ) {
    	this.fP = (hu.bme.mit.mdsd.dns2016.behaviour.Pause) newValue;
    	return true;
    }
    return false;
  }
  
  public void setP(final Pause pP) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP = pP;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.invalidPauseDuration";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidPauseDurationMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP};
  }
  
  @Override
  public InvalidPauseDurationMatch toImmutable() {
    return isMutable() ? newMatch(fP) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"p\"=" + prettyPrintValue(fP)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP == null) ? 0 : fP.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidPauseDurationMatch)) { // this should be infrequent
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
    InvalidPauseDurationMatch other = (InvalidPauseDurationMatch) obj;
    if (fP == null) {if (other.fP != null) return false;}
    else if (!fP.equals(other.fP)) return false;
    return true;
  }
  
  @Override
  public InvalidPauseDurationQuerySpecification specification() {
    try {
    	return InvalidPauseDurationQuerySpecification.instance();
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
  public static InvalidPauseDurationMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidPauseDurationMatch newMutableMatch(final Pause pP) {
    return new Mutable(pP);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidPauseDurationMatch newMatch(final Pause pP) {
    return new Immutable(pP);
  }
  
  private static final class Mutable extends InvalidPauseDurationMatch {
    Mutable(final Pause pP) {
      super(pP);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidPauseDurationMatch {
    Immutable(final Pause pP) {
      super(pP);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
