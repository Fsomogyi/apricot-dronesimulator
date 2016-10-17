package hu.bme.mit.mdsd.dns2016.drones.simulation.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidLiftInstructionMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidPauseDurationMatcher;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidWaitForMessageTimeoutMatcher;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.Mission;
import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.CollisionDetectionMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.CollisionDetectionMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCPUFrequencyMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidCommRangeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidLifeTimeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMaxPayloadMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidMemoryMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidRechargeRateMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidRemLifeTimeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSizeMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidSpeedMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.InvalidWeightMatcher;
import hu.bme.mit.mdsd.dns2016.drones.queries.SameParametersFieldObjectMatcher;
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.InvalidBehaviourException;
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.InvalidMissionException;

public final class IncQueryHelper {

	private static Logger logger = Logger.getLogger(IncQueryHelper.class);

	private IncQueryHelper () {}

	public static void validateMission(Mission mission) throws IncQueryException, InvalidMissionException {
		logger.info("Starting IncQuery validation for mission " + mission.getName());

		//TODO: Investigate NPE, possible connection with Drone.getCharge NPE
		//Diagnostic validate = Diagnostician.INSTANCE.validate(mission);

		// Initialize IncQuery engine
		IncQueryEngine engine = IncQueryEngine.on(new EMFScope(mission));

		hu.bme.mit.mdsd.dns2016.drones.queries.Queries.instance().prepare(engine);

		hu.bme.mit.mdsd.dns2016.drones.queries.InvalidNameMatcher.on(engine);
		InvalidCPUFrequencyMatcher.on(engine);
		InvalidMemoryMatcher.on(engine);
		InvalidMaxPayloadMatcher.on(engine);
		InvalidCommRangeMatcher.on(engine);
		InvalidSpeedMatcher.on(engine);
		InvalidLifeTimeMatcher.on(engine);
		InvalidRechargeRateMatcher.on(engine);
		InvalidRemLifeTimeMatcher.on(engine);
		SameParametersFieldObjectMatcher.on(engine);
		InvalidWeightMatcher.on(engine);
		InvalidSizeMatcher.on(engine);
		CollisionDetectionMatcher.on(engine);

		// Collect invalid matches
		Collection<IPatternMatch> allInvalidMatches = new ArrayList<IPatternMatch>();
		for (IncQueryMatcher<? extends IPatternMatch> incQueryMatcher : engine.getCurrentMatchers()) {
			if (incQueryMatcher.countMatches() > 0) {
				allInvalidMatches.addAll(incQueryMatcher.getAllMatches());
			}
		}
		// Throw Exception with detailed info if there are any invalid matches
		// TODO: Handle duplicate matches
		if (allInvalidMatches.size() > 0) {
			String errorMsg = new String();
			for (IPatternMatch iPatternMatch : allInvalidMatches) {
				String patternName = iPatternMatch.patternName();
				String params = iPatternMatch.prettyPrint();
				errorMsg += "\n" + patternName.substring(patternName.lastIndexOf('.') + 1) + " at: " + params;
			}
			throw new InvalidMissionException("\nInvalid Mission:" + errorMsg);
		}
	}

	public static void validateBehaviour(DroneBehaviour program, ResourceSet inWhat) throws IncQueryException, InvalidBehaviourException {
		logger.info("Starting IncQuery validation for behaviour " + program.getName());

		//TODO: Investigate NPE, possible connection with Drone.getCharge NPE
		//Diagnostic validate = Diagnostician.INSTANCE.validate(mission);

		// Initialize IncQuery engine
		IncQueryEngine engine = IncQueryEngine.on(new EMFScope(inWhat));

		hu.bme.mit.mdsd.dns2016.behaviour.queries.Queries.instance().prepare(engine);

		InvalidLiftInstructionMatcher.on(engine);
		InvalidPauseDurationMatcher.on(engine);
		InvalidWaitForMessageTimeoutMatcher.on(engine);
		hu.bme.mit.mdsd.dns2016.behaviour.queries.InvalidNameMatcher.on(engine);

		// Collect invalid matches
		Collection<IPatternMatch> allInvalidMatches = new ArrayList<IPatternMatch>();
		for (IncQueryMatcher<? extends IPatternMatch> incQueryMatcher : engine.getCurrentMatchers()) {
			if (incQueryMatcher.countMatches() > 0) {
				allInvalidMatches.addAll(incQueryMatcher.getAllMatches());
			}
		}
		// Throw Exception with detailed info if there are any invalid matches
		// TODO: Handle duplicate matches
		if (allInvalidMatches.size() > 0) {
			String errorMsg = new String();
			for (IPatternMatch iPatternMatch : allInvalidMatches) {
				String patternName = iPatternMatch.patternName();
				String params = iPatternMatch.prettyPrint();
				errorMsg += "\n" + patternName.substring(patternName.lastIndexOf('.') + 1) + " at: " + params;
			}
			throw new InvalidBehaviourException("\nInvalid Behaviour:" + errorMsg);
		}
	}

	// TODO: investigate Drone.getCharge NPE
	public static float getDroneBatteryCharge(Mission mission, Drone drone) {
		float charge = 0.0f;

		try {
			// Initialize IncQuery engine
			IncQueryEngine engine;
			engine = IncQueryEngine.on(new EMFScope(mission));

			hu.bme.mit.mdsd.dns2016.drones.queries.Queries.instance().prepare(engine);

			ChargeMatcher.on(engine);

			ChargeMatcher chargeMatcher = engine.getMatcher(ChargeMatcher.querySpecification());
			for (ChargeMatch chargeMatch : chargeMatcher.getAllMatches()) {
				if (chargeMatch.getB().equals(drone.getBattery())) {
					charge = chargeMatch.getC();
				}
			}
		} catch (IncQueryException e) {
			e.printStackTrace();
		}
		return charge;
	}

	/**
	 * Performs collision detection on a Mission and returns a Map that contains
	 * for each colliding Drone the objects it collides with.
	 * 
	 * @param mission - the Mission the collision detection is performed on
	 * @return a Map that contains for each colliding Drone the objects it collides with
	 */
	public static Map<Drone, List<SizedElement>> performCollisionDetection(Mission mission) {

		// collisions contains for each colliding Drone the objects it collides with
		Map<Drone, List<SizedElement>> collisions = new HashMap<Drone, List<SizedElement>>();

		try {
			// Initialize IncQuery engine
			IncQueryEngine engine;
			engine = IncQueryEngine.on(new EMFScope(mission));

			hu.bme.mit.mdsd.dns2016.drones.queries.Queries.instance().prepare(engine);

			CollisionDetectionMatcher collisionDetectionMatcher = engine.getMatcher(CollisionDetectionMatcher.querySpecification());
			for (CollisionDetectionMatch collisionDetectionMatch : collisionDetectionMatcher.getAllMatches()) {
				SizedElement collidingObject = collisionDetectionMatch.getSe1();
				SizedElement collisionObject = collisionDetectionMatch.getSe2();
				if (collidingObject instanceof Drone) {
					if (collisions.containsKey(collidingObject)) {
						collisions.get(collidingObject).add(collisionObject);
					} else {
						List<SizedElement> collisionObjectList = new ArrayList<SizedElement>();
						collisionObjectList.add(collisionObject);
						collisions.put((Drone) collidingObject, collisionObjectList);
					}
				}
			}
		} catch (IncQueryException e) {
			e.printStackTrace();
		}

		return collisions;
	}
}
