package hu.bme.mit.mdsd.dns2016.drones.simulation;

import java.util.List;

import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.drones.Mission;

public class InstanceModel {
	private Mission staticModel;
	private List<DroneBehaviour> behaviouralModels;
	
	public InstanceModel() {
		
	}


	public Mission getMission() {
		return staticModel;
	}

	public void setMission(Mission staticModel) {
		this.staticModel = staticModel;
	}

	public List<DroneBehaviour> getDronePrograms() {
		return behaviouralModels;
	}

	public void setDronePrograms(List<DroneBehaviour> behaviouralModels) {
		this.behaviouralModels = behaviouralModels;
	}
	
	
}
