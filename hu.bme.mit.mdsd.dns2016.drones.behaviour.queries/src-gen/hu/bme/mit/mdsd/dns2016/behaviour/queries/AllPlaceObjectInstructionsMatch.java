package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.PlaceObject;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.AllPlaceObjectInstructionsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.allPlaceObjectInstructions pattern,
 * to be used in conjunction with {@link AllPlaceObjectInstructionsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllPlaceObjectInstructionsMatcher
 * @see AllPlaceObjectInstructionsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllPlaceObjectInstructionsMatch extends BasePatternMatch {
  private PlaceObject fPo;
  
  private static List<String> parameterNames = makeImmutableList("po");
  
  private AllPlaceObjectInstructionsMatch(final PlaceObject pPo) {
    this.fPo = pPo;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("po".equals(parameterName)) return this.fPo;
    return null;
  }
  
  public PlaceObject getPo() {
    return this.fPo;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("po".equals(parameterName) ) {
    	this.fPo = (hu.bme.mit.mdsd.dns2016.behaviour.PlaceObject) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPo(final PlaceObject pPo) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPo = pPo;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.allPlaceObjectInstructions";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllPlaceObjectInstructionsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPo};
  }
  
  @Override
  public AllPlaceObjectInstructionsMatch toImmutable() {
    return isMutable() ? newMatch(fPo) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"po\"=" + prettyPrintValue(fPo)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPo == null) ? 0 : fPo.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AllPlaceObjectInstructionsMatch)) { // this should be infrequent
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
    AllPlaceObjectInstructionsMatch other = (AllPlaceObjectInstructionsMatch) obj;
    if (fPo == null) {if (other.fPo != null) return false;}
    else if (!fPo.equals(other.fPo)) return false;
    return true;
  }
  
  @Override
  public AllPlaceObjectInstructionsQuerySpecification specification() {
    try {
    	return AllPlaceObjectInstructionsQuerySpecification.instance();
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
  public static AllPlaceObjectInstructionsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPo the fixed value of pattern parameter po, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllPlaceObjectInstructionsMatch newMutableMatch(final PlaceObject pPo) {
    return new Mutable(pPo);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPo the fixed value of pattern parameter po, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllPlaceObjectInstructionsMatch newMatch(final PlaceObject pPo) {
    return new Immutable(pPo);
  }
  
  private static final class Mutable extends AllPlaceObjectInstructionsMatch {
    Mutable(final PlaceObject pPo) {
      super(pPo);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllPlaceObjectInstructionsMatch {
    Immutable(final PlaceObject pPo) {
      super(pPo);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
