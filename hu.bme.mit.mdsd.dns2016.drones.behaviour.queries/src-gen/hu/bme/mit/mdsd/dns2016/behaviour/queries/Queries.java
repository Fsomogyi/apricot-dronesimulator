package hu.bme.mit.mdsd.dns2016.behaviour.queries;

import hu.bme.mit.mdsd.dns2016.behaviour.queries.AllLiftInstructionsMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.AllPlaceObjectInstructionsMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.DroneOfBehaviourMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InstructionOfInstructMessageMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidLiftInstructionMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidNameMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidPauseDurationMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidWaitForMessageTimeoutMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.IsRealMoveToMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.MoveToChargeStationMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.MoveToOfInstructionMessageMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WarningDroneRechargeMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WarningLiftPlaceMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedBehaviourModelMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedInstructionsMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedNamesMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.AllLiftInstructionsQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.AllPlaceObjectInstructionsQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.DroneOfBehaviourQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InstructionOfInstructMessageQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidLiftInstructionQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidNameQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidPauseDurationQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.InvalidWaitForMessageTimeoutQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.IsRealMoveToQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.MoveToChargeStationQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.MoveToOfInstructionMessageQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.WarningDroneRechargeQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.WarningLiftPlaceQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.WellFormedBehaviourModelQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.WellFormedInstructionsQuerySpecification;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.util.WellFormedNamesQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in queries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file queries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.mdsd.dns2016.behaviour.queries, the group contains the definition of the following patterns: <ul>
 * <li>invalidName</li>
 * <li>instructionOfInstructMessage</li>
 * <li>invalidPauseDuration</li>
 * <li>invalidWaitForMessageTimeout</li>
 * <li>moveToOfInstructionMessage</li>
 * <li>isRealMoveTo</li>
 * <li>moveToChargeStation</li>
 * <li>warningDroneRecharge</li>
 * <li>invalidLiftInstruction</li>
 * <li>allLiftInstructions</li>
 * <li>allPlaceObjectInstructions</li>
 * <li>warningLiftPlace</li>
 * <li>droneOfBehaviour</li>
 * <li>wellFormedNames</li>
 * <li>wellFormedInstructions</li>
 * <li>wellFormedBehaviourModel</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() throws IncQueryException {
    querySpecifications.add(InvalidNameQuerySpecification.instance());
    querySpecifications.add(InstructionOfInstructMessageQuerySpecification.instance());
    querySpecifications.add(InvalidPauseDurationQuerySpecification.instance());
    querySpecifications.add(InvalidWaitForMessageTimeoutQuerySpecification.instance());
    querySpecifications.add(MoveToOfInstructionMessageQuerySpecification.instance());
    querySpecifications.add(IsRealMoveToQuerySpecification.instance());
    querySpecifications.add(MoveToChargeStationQuerySpecification.instance());
    querySpecifications.add(WarningDroneRechargeQuerySpecification.instance());
    querySpecifications.add(InvalidLiftInstructionQuerySpecification.instance());
    querySpecifications.add(AllLiftInstructionsQuerySpecification.instance());
    querySpecifications.add(AllPlaceObjectInstructionsQuerySpecification.instance());
    querySpecifications.add(WarningLiftPlaceQuerySpecification.instance());
    querySpecifications.add(DroneOfBehaviourQuerySpecification.instance());
    querySpecifications.add(WellFormedNamesQuerySpecification.instance());
    querySpecifications.add(WellFormedInstructionsQuerySpecification.instance());
    querySpecifications.add(WellFormedBehaviourModelQuerySpecification.instance());
  }
  
  public InvalidNameQuerySpecification getInvalidName() throws IncQueryException {
    return InvalidNameQuerySpecification.instance();
  }
  
  public InvalidNameMatcher getInvalidName(final IncQueryEngine engine) throws IncQueryException {
    return InvalidNameMatcher.on(engine);
  }
  
  public InstructionOfInstructMessageQuerySpecification getInstructionOfInstructMessage() throws IncQueryException {
    return InstructionOfInstructMessageQuerySpecification.instance();
  }
  
  public InstructionOfInstructMessageMatcher getInstructionOfInstructMessage(final IncQueryEngine engine) throws IncQueryException {
    return InstructionOfInstructMessageMatcher.on(engine);
  }
  
  public InvalidPauseDurationQuerySpecification getInvalidPauseDuration() throws IncQueryException {
    return InvalidPauseDurationQuerySpecification.instance();
  }
  
  public InvalidPauseDurationMatcher getInvalidPauseDuration(final IncQueryEngine engine) throws IncQueryException {
    return InvalidPauseDurationMatcher.on(engine);
  }
  
  public InvalidWaitForMessageTimeoutQuerySpecification getInvalidWaitForMessageTimeout() throws IncQueryException {
    return InvalidWaitForMessageTimeoutQuerySpecification.instance();
  }
  
  public InvalidWaitForMessageTimeoutMatcher getInvalidWaitForMessageTimeout(final IncQueryEngine engine) throws IncQueryException {
    return InvalidWaitForMessageTimeoutMatcher.on(engine);
  }
  
  public MoveToOfInstructionMessageQuerySpecification getMoveToOfInstructionMessage() throws IncQueryException {
    return MoveToOfInstructionMessageQuerySpecification.instance();
  }
  
  public MoveToOfInstructionMessageMatcher getMoveToOfInstructionMessage(final IncQueryEngine engine) throws IncQueryException {
    return MoveToOfInstructionMessageMatcher.on(engine);
  }
  
  public IsRealMoveToQuerySpecification getIsRealMoveTo() throws IncQueryException {
    return IsRealMoveToQuerySpecification.instance();
  }
  
  public IsRealMoveToMatcher getIsRealMoveTo(final IncQueryEngine engine) throws IncQueryException {
    return IsRealMoveToMatcher.on(engine);
  }
  
  public MoveToChargeStationQuerySpecification getMoveToChargeStation() throws IncQueryException {
    return MoveToChargeStationQuerySpecification.instance();
  }
  
  public MoveToChargeStationMatcher getMoveToChargeStation(final IncQueryEngine engine) throws IncQueryException {
    return MoveToChargeStationMatcher.on(engine);
  }
  
  public WarningDroneRechargeQuerySpecification getWarningDroneRecharge() throws IncQueryException {
    return WarningDroneRechargeQuerySpecification.instance();
  }
  
  public WarningDroneRechargeMatcher getWarningDroneRecharge(final IncQueryEngine engine) throws IncQueryException {
    return WarningDroneRechargeMatcher.on(engine);
  }
  
  public InvalidLiftInstructionQuerySpecification getInvalidLiftInstruction() throws IncQueryException {
    return InvalidLiftInstructionQuerySpecification.instance();
  }
  
  public InvalidLiftInstructionMatcher getInvalidLiftInstruction(final IncQueryEngine engine) throws IncQueryException {
    return InvalidLiftInstructionMatcher.on(engine);
  }
  
  public AllLiftInstructionsQuerySpecification getAllLiftInstructions() throws IncQueryException {
    return AllLiftInstructionsQuerySpecification.instance();
  }
  
  public AllLiftInstructionsMatcher getAllLiftInstructions(final IncQueryEngine engine) throws IncQueryException {
    return AllLiftInstructionsMatcher.on(engine);
  }
  
  public AllPlaceObjectInstructionsQuerySpecification getAllPlaceObjectInstructions() throws IncQueryException {
    return AllPlaceObjectInstructionsQuerySpecification.instance();
  }
  
  public AllPlaceObjectInstructionsMatcher getAllPlaceObjectInstructions(final IncQueryEngine engine) throws IncQueryException {
    return AllPlaceObjectInstructionsMatcher.on(engine);
  }
  
  public WarningLiftPlaceQuerySpecification getWarningLiftPlace() throws IncQueryException {
    return WarningLiftPlaceQuerySpecification.instance();
  }
  
  public WarningLiftPlaceMatcher getWarningLiftPlace(final IncQueryEngine engine) throws IncQueryException {
    return WarningLiftPlaceMatcher.on(engine);
  }
  
  public DroneOfBehaviourQuerySpecification getDroneOfBehaviour() throws IncQueryException {
    return DroneOfBehaviourQuerySpecification.instance();
  }
  
  public DroneOfBehaviourMatcher getDroneOfBehaviour(final IncQueryEngine engine) throws IncQueryException {
    return DroneOfBehaviourMatcher.on(engine);
  }
  
  public WellFormedNamesQuerySpecification getWellFormedNames() throws IncQueryException {
    return WellFormedNamesQuerySpecification.instance();
  }
  
  public WellFormedNamesMatcher getWellFormedNames(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedNamesMatcher.on(engine);
  }
  
  public WellFormedInstructionsQuerySpecification getWellFormedInstructions() throws IncQueryException {
    return WellFormedInstructionsQuerySpecification.instance();
  }
  
  public WellFormedInstructionsMatcher getWellFormedInstructions(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedInstructionsMatcher.on(engine);
  }
  
  public WellFormedBehaviourModelQuerySpecification getWellFormedBehaviourModel() throws IncQueryException {
    return WellFormedBehaviourModelQuerySpecification.instance();
  }
  
  public WellFormedBehaviourModelMatcher getWellFormedBehaviourModel(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedBehaviourModelMatcher.on(engine);
  }
}
