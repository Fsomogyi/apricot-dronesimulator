package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneMessageEntity;

public class MessageDroppedEvent extends EventOf2Entities<DroneEntity, DroneMessageEntity> {
	private static Logger logger = Logger.getLogger(MessageDroppedEvent.class);

	public MessageDroppedEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		
	}

	@Override
	public void eventRoutine(DroneEntity target, DroneMessageEntity message) {
		logger.info("Message dropped: " + message);
		DronesSimulationModel sim = (DronesSimulationModel) this.getModel();
		
		sim.getDroppedMessageCount().update();
	}
}