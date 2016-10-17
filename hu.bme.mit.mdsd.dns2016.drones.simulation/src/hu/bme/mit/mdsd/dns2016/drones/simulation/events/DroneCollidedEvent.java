package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.List;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.NamedElement;
import hu.bme.mit.mdsd.dns2016.drones.SizedElement;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;

public class DroneCollidedEvent extends Event<DroneEntity> {

	private List<SizedElement> collisions;

	private static Logger logger = Logger.getLogger(DroneCollidedEvent.class);

	public DroneCollidedEvent(List<SizedElement> collisions, Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);

		this.collisions = collisions;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {

		logger.info(who.getName() + " crashed into " + ((NamedElement) collisions.get(0)).getName());

		DronesSimulationModel sim = (DronesSimulationModel) this.getModel();

		sim.getActiveDrones().remove(who);
		sim.getInactiveDrones().insert(who);
		sim.getCollisionCount().update();
	}

}
