package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.QueueBased;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneInstructMessageEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneMessageEntity;

public class MessageDeliveredEvent extends EventOf2Entities<DroneEntity, DroneMessageEntity> {
	private static Logger logger = Logger.getLogger(MessageDeliveredEvent.class);
	private volatile int retries = 5;
	
	public MessageDeliveredEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		
	}

	@Override
	public void eventRoutine(DroneEntity target, DroneMessageEntity message) {
		if (target.getMessageQueue().insert(message)) {
			logger.info("Message delivered: " + message.getType());
			if (!message.getType().equals(DroneInstructMessageEntity.TYPE_DESCRIPTION))
				target.getMessageQueue().notifyObservers(target.getMessageQueue(), QueueBased.QueueAction.ITEM_ADDED);
		} else {
			new MessageDroppedEvent(this.getModel(), "Message to " + target.getName() + " dropped", false).schedule(target, message);
			if (retries > 0) {
				this.schedule(target, message, new TimeSpan(1.5));
				retries--;
			}
		}
	}
}
