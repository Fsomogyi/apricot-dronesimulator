package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.WarningDroneRechargeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.warningDroneRecharge pattern,
 * to be used in conjunction with {@link WarningDroneRechargeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WarningDroneRechargeMatcher
 * @see WarningDroneRechargeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WarningDroneRechargeMatch extends BasePatternMatch {
  private DroneBehaviour fDb;
  
  private static List<String> parameterNames = makeImmutableList("db");
  
  private WarningDroneRechargeMatch(final DroneBehaviour pDb) {
    this.fDb = pDb;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("db".equals(parameterName)) return this.fDb;
    return null;
  }
  
  public DroneBehaviour getDb() {
    return this.fDb;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("db".equals(parameterName) ) {
    	this.fDb = (hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDb(final DroneBehaviour pDb) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDb = pDb;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.warningDroneRecharge";
  }
  
  @Override
  public List<String> parameterNames() {
    return WarningDroneRechargeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDb};
  }
  
  @Override
  public WarningDroneRechargeMatch toImmutable() {
    return isMutable() ? newMatch(fDb) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"db\"=" + prettyPrintValue(fDb)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDb == null) ? 0 : fDb.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WarningDroneRechargeMatch)) { // this should be infrequent
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
    WarningDroneRechargeMatch other = (WarningDroneRechargeMatch) obj;
    if (fDb == null) {if (other.fDb != null) return false;}
    else if (!fDb.equals(other.fDb)) return false;
    return true;
  }
  
  @Override
  public WarningDroneRechargeQuerySpecification specification() {
    try {
    	return WarningDroneRechargeQuerySpecification.instance();
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
  public static WarningDroneRechargeMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WarningDroneRechargeMatch newMutableMatch(final DroneBehaviour pDb) {
    return new Mutable(pDb);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WarningDroneRechargeMatch newMatch(final DroneBehaviour pDb) {
    return new Immutable(pDb);
  }
  
  private static final class Mutable extends WarningDroneRechargeMatch {
    Mutable(final DroneBehaviour pDb) {
      super(pDb);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WarningDroneRechargeMatch {
    Immutable(final DroneBehaviour pDb) {
      super(pDb);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
