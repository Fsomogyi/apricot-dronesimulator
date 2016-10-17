package hu.bme.mit.mdsd.dns2016.drones.queries;

import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeStationOfDroneMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.CollisionDetectionMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidBatteryMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCPUFrequencyMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCommRangeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidDroneMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidLifeTimeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMaxPayloadMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMemoryMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidNameMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidRechargeRateMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidRemLifeTimeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSizeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSpeedMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidWeightMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.SameParametersFieldObjectMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.SizeZeroMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedBatteriesMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedDronesMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedFieldObjectsMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedNamesMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedSizesAndCollisionsMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.WellFormedStructuralModelMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.ChargeQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.ChargeStationOfDroneQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.CollisionDetectionQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidBatteryQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidCPUFrequencyQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidCommRangeQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidDroneQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidLifeTimeQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidMaxPayloadQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidMemoryQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidNameQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidRechargeRateQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidRemLifeTimeQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidSizeQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidSpeedQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.InvalidWeightQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.SameParametersFieldObjectQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.SizeZeroQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedBatteriesQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedDronesQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedFieldObjectsQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedNamesQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedSizesAndCollisionsQuerySpecification;
import hu.bme.mit.mdsd.dns2016.drones.queries.util.WellFormedStructuralModelQuerySpecification;
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
 * <p> From package hu.bme.mit.mdsd.dns2016.drones.queries, the group contains the definition of the following patterns: <ul>
 * <li>invalidName</li>
 * <li>invalidCPUFrequency</li>
 * <li>invalidMemory</li>
 * <li>invalidMaxPayload</li>
 * <li>invalidCommRange</li>
 * <li>invalidSpeed</li>
 * <li>invalidDrone</li>
 * <li>invalidLifeTime</li>
 * <li>invalidRechargeRate</li>
 * <li>invalidRemLifeTime</li>
 * <li>invalidBattery</li>
 * <li>sameParametersFieldObject</li>
 * <li>invalidWeight</li>
 * <li>invalidSize</li>
 * <li>sizeZero</li>
 * <li>chargeStationOfDrone</li>
 * <li>collisionDetection</li>
 * <li>charge</li>
 * <li>wellFormedNames</li>
 * <li>wellFormedDrones</li>
 * <li>wellFormedBatteries</li>
 * <li>wellFormedFieldObjects</li>
 * <li>wellFormedSizesAndCollisions</li>
 * <li>wellFormedStructuralModel</li>
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
    querySpecifications.add(InvalidCPUFrequencyQuerySpecification.instance());
    querySpecifications.add(InvalidMemoryQuerySpecification.instance());
    querySpecifications.add(InvalidMaxPayloadQuerySpecification.instance());
    querySpecifications.add(InvalidCommRangeQuerySpecification.instance());
    querySpecifications.add(InvalidSpeedQuerySpecification.instance());
    querySpecifications.add(InvalidDroneQuerySpecification.instance());
    querySpecifications.add(InvalidLifeTimeQuerySpecification.instance());
    querySpecifications.add(InvalidRechargeRateQuerySpecification.instance());
    querySpecifications.add(InvalidRemLifeTimeQuerySpecification.instance());
    querySpecifications.add(InvalidBatteryQuerySpecification.instance());
    querySpecifications.add(SameParametersFieldObjectQuerySpecification.instance());
    querySpecifications.add(InvalidWeightQuerySpecification.instance());
    querySpecifications.add(InvalidSizeQuerySpecification.instance());
    querySpecifications.add(SizeZeroQuerySpecification.instance());
    querySpecifications.add(ChargeStationOfDroneQuerySpecification.instance());
    querySpecifications.add(CollisionDetectionQuerySpecification.instance());
    querySpecifications.add(ChargeQuerySpecification.instance());
    querySpecifications.add(WellFormedNamesQuerySpecification.instance());
    querySpecifications.add(WellFormedDronesQuerySpecification.instance());
    querySpecifications.add(WellFormedBatteriesQuerySpecification.instance());
    querySpecifications.add(WellFormedFieldObjectsQuerySpecification.instance());
    querySpecifications.add(WellFormedSizesAndCollisionsQuerySpecification.instance());
    querySpecifications.add(WellFormedStructuralModelQuerySpecification.instance());
  }
  
  public InvalidNameQuerySpecification getInvalidName() throws IncQueryException {
    return InvalidNameQuerySpecification.instance();
  }
  
  public InvalidNameMatcher getInvalidName(final IncQueryEngine engine) throws IncQueryException {
    return InvalidNameMatcher.on(engine);
  }
  
  public InvalidCPUFrequencyQuerySpecification getInvalidCPUFrequency() throws IncQueryException {
    return InvalidCPUFrequencyQuerySpecification.instance();
  }
  
  public InvalidCPUFrequencyMatcher getInvalidCPUFrequency(final IncQueryEngine engine) throws IncQueryException {
    return InvalidCPUFrequencyMatcher.on(engine);
  }
  
  public InvalidMemoryQuerySpecification getInvalidMemory() throws IncQueryException {
    return InvalidMemoryQuerySpecification.instance();
  }
  
  public InvalidMemoryMatcher getInvalidMemory(final IncQueryEngine engine) throws IncQueryException {
    return InvalidMemoryMatcher.on(engine);
  }
  
  public InvalidMaxPayloadQuerySpecification getInvalidMaxPayload() throws IncQueryException {
    return InvalidMaxPayloadQuerySpecification.instance();
  }
  
  public InvalidMaxPayloadMatcher getInvalidMaxPayload(final IncQueryEngine engine) throws IncQueryException {
    return InvalidMaxPayloadMatcher.on(engine);
  }
  
  public InvalidCommRangeQuerySpecification getInvalidCommRange() throws IncQueryException {
    return InvalidCommRangeQuerySpecification.instance();
  }
  
  public InvalidCommRangeMatcher getInvalidCommRange(final IncQueryEngine engine) throws IncQueryException {
    return InvalidCommRangeMatcher.on(engine);
  }
  
  public InvalidSpeedQuerySpecification getInvalidSpeed() throws IncQueryException {
    return InvalidSpeedQuerySpecification.instance();
  }
  
  public InvalidSpeedMatcher getInvalidSpeed(final IncQueryEngine engine) throws IncQueryException {
    return InvalidSpeedMatcher.on(engine);
  }
  
  public InvalidDroneQuerySpecification getInvalidDrone() throws IncQueryException {
    return InvalidDroneQuerySpecification.instance();
  }
  
  public InvalidDroneMatcher getInvalidDrone(final IncQueryEngine engine) throws IncQueryException {
    return InvalidDroneMatcher.on(engine);
  }
  
  public InvalidLifeTimeQuerySpecification getInvalidLifeTime() throws IncQueryException {
    return InvalidLifeTimeQuerySpecification.instance();
  }
  
  public InvalidLifeTimeMatcher getInvalidLifeTime(final IncQueryEngine engine) throws IncQueryException {
    return InvalidLifeTimeMatcher.on(engine);
  }
  
  public InvalidRechargeRateQuerySpecification getInvalidRechargeRate() throws IncQueryException {
    return InvalidRechargeRateQuerySpecification.instance();
  }
  
  public InvalidRechargeRateMatcher getInvalidRechargeRate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidRechargeRateMatcher.on(engine);
  }
  
  public InvalidRemLifeTimeQuerySpecification getInvalidRemLifeTime() throws IncQueryException {
    return InvalidRemLifeTimeQuerySpecification.instance();
  }
  
  public InvalidRemLifeTimeMatcher getInvalidRemLifeTime(final IncQueryEngine engine) throws IncQueryException {
    return InvalidRemLifeTimeMatcher.on(engine);
  }
  
  public InvalidBatteryQuerySpecification getInvalidBattery() throws IncQueryException {
    return InvalidBatteryQuerySpecification.instance();
  }
  
  public InvalidBatteryMatcher getInvalidBattery(final IncQueryEngine engine) throws IncQueryException {
    return InvalidBatteryMatcher.on(engine);
  }
  
  public SameParametersFieldObjectQuerySpecification getSameParametersFieldObject() throws IncQueryException {
    return SameParametersFieldObjectQuerySpecification.instance();
  }
  
  public SameParametersFieldObjectMatcher getSameParametersFieldObject(final IncQueryEngine engine) throws IncQueryException {
    return SameParametersFieldObjectMatcher.on(engine);
  }
  
  public InvalidWeightQuerySpecification getInvalidWeight() throws IncQueryException {
    return InvalidWeightQuerySpecification.instance();
  }
  
  public InvalidWeightMatcher getInvalidWeight(final IncQueryEngine engine) throws IncQueryException {
    return InvalidWeightMatcher.on(engine);
  }
  
  public InvalidSizeQuerySpecification getInvalidSize() throws IncQueryException {
    return InvalidSizeQuerySpecification.instance();
  }
  
  public InvalidSizeMatcher getInvalidSize(final IncQueryEngine engine) throws IncQueryException {
    return InvalidSizeMatcher.on(engine);
  }
  
  public SizeZeroQuerySpecification getSizeZero() throws IncQueryException {
    return SizeZeroQuerySpecification.instance();
  }
  
  public SizeZeroMatcher getSizeZero(final IncQueryEngine engine) throws IncQueryException {
    return SizeZeroMatcher.on(engine);
  }
  
  public ChargeStationOfDroneQuerySpecification getChargeStationOfDrone() throws IncQueryException {
    return ChargeStationOfDroneQuerySpecification.instance();
  }
  
  public ChargeStationOfDroneMatcher getChargeStationOfDrone(final IncQueryEngine engine) throws IncQueryException {
    return ChargeStationOfDroneMatcher.on(engine);
  }
  
  public CollisionDetectionQuerySpecification getCollisionDetection() throws IncQueryException {
    return CollisionDetectionQuerySpecification.instance();
  }
  
  public CollisionDetectionMatcher getCollisionDetection(final IncQueryEngine engine) throws IncQueryException {
    return CollisionDetectionMatcher.on(engine);
  }
  
  public ChargeQuerySpecification getCharge() throws IncQueryException {
    return ChargeQuerySpecification.instance();
  }
  
  public ChargeMatcher getCharge(final IncQueryEngine engine) throws IncQueryException {
    return ChargeMatcher.on(engine);
  }
  
  public WellFormedNamesQuerySpecification getWellFormedNames() throws IncQueryException {
    return WellFormedNamesQuerySpecification.instance();
  }
  
  public WellFormedNamesMatcher getWellFormedNames(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedNamesMatcher.on(engine);
  }
  
  public WellFormedDronesQuerySpecification getWellFormedDrones() throws IncQueryException {
    return WellFormedDronesQuerySpecification.instance();
  }
  
  public WellFormedDronesMatcher getWellFormedDrones(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedDronesMatcher.on(engine);
  }
  
  public WellFormedBatteriesQuerySpecification getWellFormedBatteries() throws IncQueryException {
    return WellFormedBatteriesQuerySpecification.instance();
  }
  
  public WellFormedBatteriesMatcher getWellFormedBatteries(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedBatteriesMatcher.on(engine);
  }
  
  public WellFormedFieldObjectsQuerySpecification getWellFormedFieldObjects() throws IncQueryException {
    return WellFormedFieldObjectsQuerySpecification.instance();
  }
  
  public WellFormedFieldObjectsMatcher getWellFormedFieldObjects(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedFieldObjectsMatcher.on(engine);
  }
  
  public WellFormedSizesAndCollisionsQuerySpecification getWellFormedSizesAndCollisions() throws IncQueryException {
    return WellFormedSizesAndCollisionsQuerySpecification.instance();
  }
  
  public WellFormedSizesAndCollisionsMatcher getWellFormedSizesAndCollisions(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedSizesAndCollisionsMatcher.on(engine);
  }
  
  public WellFormedStructuralModelQuerySpecification getWellFormedStructuralModel() throws IncQueryException {
    return WellFormedStructuralModelQuerySpecification.instance();
  }
  
  public WellFormedStructuralModelMatcher getWellFormedStructuralModel(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedStructuralModelMatcher.on(engine);
  }
}
