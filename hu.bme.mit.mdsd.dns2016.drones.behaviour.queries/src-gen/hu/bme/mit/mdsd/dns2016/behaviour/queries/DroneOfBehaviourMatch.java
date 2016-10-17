package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.DroneOfBehaviourQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.droneOfBehaviour pattern,
 * to be used in conjunction with {@link DroneOfBehaviourMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DroneOfBehaviourMatcher
 * @see DroneOfBehaviourProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DroneOfBehaviourMatch extends BasePatternMatch {
  private DroneBehaviour fDb;
  
  private Drone fD;
  
  private static List<String> parameterNames = makeImmutableList("db", "d");
  
  private DroneOfBehaviourMatch(final DroneBehaviour pDb, final Drone pD) {
    this.fDb = pDb;
    this.fD = pD;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("db".equals(parameterName)) return this.fDb;
    if ("d".equals(parameterName)) return this.fD;
    return null;
  }
  
  public DroneBehaviour getDb() {
    return this.fDb;
  }
  
  public Drone getD() {
    return this.fD;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("db".equals(parameterName) ) {
    	this.fDb = (hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour) newValue;
    	return true;
    }
    if ("d".equals(parameterName) ) {
    	this.fD = (hu.bme.mit.mdsd.dns2016.drones.Drone) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDb(final DroneBehaviour pDb) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDb = pDb;
  }
  
  public void setD(final Drone pD) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fD = pD;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.droneOfBehaviour";
  }
  
  @Override
  public List<String> parameterNames() {
    return DroneOfBehaviourMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDb, fD};
  }
  
  @Override
  public DroneOfBehaviourMatch toImmutable() {
    return isMutable() ? newMatch(fDb, fD) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"db\"=" + prettyPrintValue(fDb) + ", ");
    
    result.append("\"d\"=" + prettyPrintValue(fD)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDb == null) ? 0 : fDb.hashCode());
    result = prime * result + ((fD == null) ? 0 : fD.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DroneOfBehaviourMatch)) { // this should be infrequent
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
    DroneOfBehaviourMatch other = (DroneOfBehaviourMatch) obj;
    if (fDb == null) {if (other.fDb != null) return false;}
    else if (!fDb.equals(other.fDb)) return false;
    if (fD == null) {if (other.fD != null) return false;}
    else if (!fD.equals(other.fD)) return false;
    return true;
  }
  
  @Override
  public DroneOfBehaviourQuerySpecification specification() {
    try {
    	return DroneOfBehaviourQuerySpecification.instance();
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
  public static DroneOfBehaviourMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DroneOfBehaviourMatch newMutableMatch(final DroneBehaviour pDb, final Drone pD) {
    return new Mutable(pDb, pD);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDb the fixed value of pattern parameter db, or null if not bound.
   * @param pD the fixed value of pattern parameter d, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DroneOfBehaviourMatch newMatch(final DroneBehaviour pDb, final Drone pD) {
    return new Immutable(pDb, pD);
  }
  
  private static final class Mutable extends DroneOfBehaviourMatch {
    Mutable(final DroneBehaviour pDb, final Drone pD) {
      super(pDb, pD);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DroneOfBehaviourMatch {
    Immutable(final DroneBehaviour pDb, final Drone pD) {
      super(pDb, pD);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
