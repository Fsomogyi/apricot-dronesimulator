package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.Instruct;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruction;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InstructionOfInstructMessageQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.dns2016.behaviour.queries.instructionOfInstructMessage pattern,
 * to be used in conjunction with {@link InstructionOfInstructMessageMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InstructionOfInstructMessageMatcher
 * @see InstructionOfInstructMessageProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InstructionOfInstructMessageMatch extends BasePatternMatch {
  private Instruction fIns;
  
  private Instruct fM;
  
  private static List<String> parameterNames = makeImmutableList("ins", "m");
  
  private InstructionOfInstructMessageMatch(final Instruction pIns, final Instruct pM) {
    this.fIns = pIns;
    this.fM = pM;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ins".equals(parameterName)) return this.fIns;
    if ("m".equals(parameterName)) return this.fM;
    return null;
  }
  
  public Instruction getIns() {
    return this.fIns;
  }
  
  public Instruct getM() {
    return this.fM;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ins".equals(parameterName) ) {
    	this.fIns = (hu.bme.mit.mdsd.dns2016.behaviour.Instruction) newValue;
    	return true;
    }
    if ("m".equals(parameterName) ) {
    	this.fM = (hu.bme.mit.mdsd.dns2016.behaviour.Instruct) newValue;
    	return true;
    }
    return false;
  }
  
  public void setIns(final Instruction pIns) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fIns = pIns;
  }
  
  public void setM(final Instruct pM) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fM = pM;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.dns2016.behaviour.queries.instructionOfInstructMessage";
  }
  
  @Override
  public List<String> parameterNames() {
    return InstructionOfInstructMessageMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fIns, fM};
  }
  
  @Override
  public InstructionOfInstructMessageMatch toImmutable() {
    return isMutable() ? newMatch(fIns, fM) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ins\"=" + prettyPrintValue(fIns) + ", ");
    
    result.append("\"m\"=" + prettyPrintValue(fM)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fIns == null) ? 0 : fIns.hashCode());
    result = prime * result + ((fM == null) ? 0 : fM.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InstructionOfInstructMessageMatch)) { // this should be infrequent
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
    InstructionOfInstructMessageMatch other = (InstructionOfInstructMessageMatch) obj;
    if (fIns == null) {if (other.fIns != null) return false;}
    else if (!fIns.equals(other.fIns)) return false;
    if (fM == null) {if (other.fM != null) return false;}
    else if (!fM.equals(other.fM)) return false;
    return true;
  }
  
  @Override
  public InstructionOfInstructMessageQuerySpecification specification() {
    try {
    	return InstructionOfInstructMessageQuerySpecification.instance();
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
  public static InstructionOfInstructMessageMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InstructionOfInstructMessageMatch newMutableMatch(final Instruction pIns, final Instruct pM) {
    return new Mutable(pIns, pM);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pIns the fixed value of pattern parameter ins, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InstructionOfInstructMessageMatch newMatch(final Instruction pIns, final Instruct pM) {
    return new Immutable(pIns, pM);
  }
  
  private static final class Mutable extends InstructionOfInstructMessageMatch {
    Mutable(final Instruction pIns, final Instruct pM) {
      super(pIns, pM);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InstructionOfInstructMessageMatch {
    Immutable(final Instruction pIns, final Instruct pM) {
      super(pIns, pM);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
