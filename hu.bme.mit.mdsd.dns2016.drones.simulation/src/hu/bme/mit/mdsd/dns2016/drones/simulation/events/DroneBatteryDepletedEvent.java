package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

import org.apache.log4j.Logger;

public class DroneBatteryDepletedEvent extends Event<DroneEntity> {
	private static Logger logger = Logger.getLogger(DroneBatteryDepletedEvent.class);
	
	public DroneBatteryDepletedEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		logger.info("Battery of " + who + " depleted");
		
		DronesSimulationModel sim = (DronesSimulationModel) this.getModel();
		
		// "What is dead, may never die..."
		sim.getActiveDrones().remove(who);
		sim.getInactiveDrones().insert(who);
		sim.getBatteryDeathCount().update();
		who.setDepleted(true);
	}

	
}
