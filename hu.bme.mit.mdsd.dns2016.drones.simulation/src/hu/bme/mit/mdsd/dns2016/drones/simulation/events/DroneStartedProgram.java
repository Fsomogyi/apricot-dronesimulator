package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import hu.bme.mit.mdsd.dns2016.drones.simulation.BehaviourEventGenerator;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

import org.apache.log4j.Logger;

import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;


public class DroneStartedProgram extends Event<DroneEntity> {
	private static Logger logger = Logger.getLogger(DroneStartedProgram.class);
	
	private DronesSimulationModel _model;
	
	public DroneStartedProgram(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		
		this._model = (DronesSimulationModel) owner;
	}

	@Override
	public void eventRoutine(DroneEntity who) {
		logger.debug("Drone " + who.getName() + " started its program");
		
		BehaviourEventGenerator runner = new BehaviourEventGenerator(this._model, who);
		InstructionEvent first = runner.getFirstEvent();
		first.schedule(who);
		
		new DroneBatteryChargeEvent(this.getModel(), "Drone battery charge", true).schedule(who, new TimeSpan(1.0));;
	}

}
