package hu.bme.mit.mdsd.dns2016.drones.simulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.apache.log4j.*;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage;
import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.drones.DronesPackage;
import hu.bme.mit.mdsd.dns2016.drones.Mission;
import hu.bme.mit.mdsd.dns2016.drones.queries.*;
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.InvalidBehaviourException;
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.InvalidMissionException;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.IncQueryHelper;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.*;

// TODO: Refactor IncQuery validation methods to re-use the common code segments
public class InstanceModelBuilder {
	private ResourceSet resSet;
	private Mission staticModel;
	private List<DroneBehaviour> behaviouralModels;
	
	private static Logger logger = Logger.getLogger(InstanceModelBuilder.class);
	
	public InstanceModelBuilder() {
		resSet = new ResourceSetImpl();
		// Register a resource factory for the "drones" file extension
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("drones", new XMIResourceFactoryImpl());
		
		// Register a resource factory for the "behaviour" file extension
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("behaviour", new XMIResourceFactoryImpl());

		DronesPackage.eINSTANCE.eClass();
		BehaviourPackage.eINSTANCE.eClass();
		
		staticModel = null;
		this.behaviouralModels = new ArrayList<DroneBehaviour>();
	}
	
	InstanceModel build(String[] behavFiles) throws IOException, InvalidBehaviourException, IncQueryException, InvalidMissionException {
		// Add all behavior instances to the resource set from file
		for (String behavFile : behavFiles) {
			File f = new File(behavFile);
			if (f.exists()) {
				if (behavFile.endsWith(".behaviour")) {
					URI fileURI = URI.createFileURI(f.getAbsolutePath());
					resSet.getResource(fileURI, true);
				} else {
					throw new FileNotFoundException("The file at " + behavFile + " is not of type .behaviour");
				}
			} else {
				throw new FileNotFoundException("The file at " + behavFile + " does not exist");
			}
		}

		// Resolve proxies in all loaded behavior instances (creates Mission instance in the resource set)
		EcoreUtil.resolveAll(this.resSet);
		
		// Extract instances from the resource set and validate them
		boolean missionAlreadyLoaded = false;
		for (Resource resource : resSet.getResources()) {
			if (resource.getContents().get(0) instanceof DroneBehaviour) {
				DroneBehaviour droneBehav = (DroneBehaviour) resource.getContents().get(0);
				IncQueryHelper.validateBehaviour(droneBehav, resSet);
				this.behaviouralModels.add(droneBehav);
			} else if (resource.getContents().get(0) instanceof Mission) {
				if (!missionAlreadyLoaded) {
					Mission mission = (Mission) resource.getContents().get(0);
					IncQueryHelper.validateMission(mission);
					this.staticModel = mission;
					missionAlreadyLoaded = true;
				} else {
					throw new InvalidBehaviourException("Behaviour instances shouldn't reference multiple Mission instances");
				}
			}
		}

		InstanceModel instance = new InstanceModel();

		instance.setDronePrograms(this.behaviouralModels);
		instance.setMission(this.staticModel);

		return instance;
	}
}
