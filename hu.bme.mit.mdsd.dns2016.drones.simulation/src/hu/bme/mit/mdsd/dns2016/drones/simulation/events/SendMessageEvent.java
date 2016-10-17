package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.behaviour.SendMessage;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneMessageEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.MathHelper;

public class SendMessageEvent extends InstructionEvent {
	private static Logger logger = Logger.getLogger(SendMessageEvent.class);
	
	private SendMessage instruction;
	private DroneEntity sender;

	public SendMessageEvent(Model owner, String name, boolean showInTrace, SendMessage instruction, DroneEntity sender) {
		super(owner, name, showInTrace);

		this.instruction = instruction;
		this.sender = sender;
		
		this.batteryDrainAmount = 1.0f + sender.drone.getCommunicationRange() / 20.0f;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		super.eventRoutine(who);
		
		if (shouldInterrupt) 
			return;
		
		DroneMessageEntity message = new DroneMessageEntity(this.model, "Drone Message Entity " + this.instruction, false, this.instruction);

		DronesSimulationModel sim = (DronesSimulationModel) this.getModel();
		
		for (DroneEntity de : sim.getActiveDrones()) {
			if (de != who &&
					MathHelper.centerDistance(who, de) <= who.get().getCommunicationRange()) {
				deliver(de, message);
			}
		}

		this.scheduleNextInstructionEvent(who);
	}

	private void deliver(DroneEntity target, DroneMessageEntity message) {
		logger.info("Message delivery: " + this.sender + " -> " + target.getName() + " message type: " + message.getType());
		MessageDeliveredEvent delivery = new MessageDeliveredEvent(this.getModel(), "Message delivered from " + this.sender.get() + " to " + target.get(), false);
		DronesSimulationModel sim = (DronesSimulationModel) this.getModel();
		
		delivery.schedule(target, message, new TimeSpan(sim.getMessageDeliveryTime().sample().floatValue()));
	}	
}
