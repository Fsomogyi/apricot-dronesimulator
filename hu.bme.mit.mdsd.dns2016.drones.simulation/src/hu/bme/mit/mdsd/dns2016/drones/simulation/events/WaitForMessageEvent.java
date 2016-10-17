package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.List;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;

import desmoj.core.observer.Observer;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.QueueBased;
import desmoj.core.simulator.QueueBased.QueueAction;
import desmoj.core.simulator.TimeSpan;


import hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneMessageEntity;

public class WaitForMessageEvent extends InstructionEvent implements Observer<QueueBased, QueueAction> {
	private WaitForMessage instruction;
	private DroneEntity receiver;
	private static Logger logger = Logger.getLogger(WaitForMessageEvent.class);
	private WaitForMessageTimedOutEvent timeoutEvent;
	
	private List<InstructionEvent> whenArrivedInstructions;
	private List<InstructionEvent> whenLostInstructions;
	
	public WaitForMessageEvent(Model owner, String name, boolean showInTrace, WaitForMessage instruction, DroneEntity receiver,
			List<InstructionEvent> whenArrivedInstructions, List<InstructionEvent> whenLostInstructions) {
		super(owner, name, showInTrace);
		
		this.instruction = instruction;
		this.receiver = receiver;
		this.whenArrivedInstructions = whenArrivedInstructions;
		this.whenLostInstructions = whenLostInstructions;
		
		this.batteryDrainAmount = 2.0f;
	}

	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		logger.info(who.getName() + " waiting for message - event routine");

		this.receiver.getMessageQueue().addObserver(this);

		if (this.instruction.getTimeout() > 0.0) {
			if (timeoutEvent == null) {
				timeoutEvent = new WaitForMessageTimedOutEvent(this.getModel(), "Message wait timed out " + this.instruction, true, this,
						whenLostInstructions);
				
				timeoutEvent.schedule(who, new TimeSpan(this.instruction.getTimeout()));
			}
		}
	}

	private boolean receive(DroneMessageEntity message) {
		if (message.getType().equals(this.instruction.getType())) {
			logger.info("Wait for message timeout cancelled");
			this.timeoutEvent.cancel();
			this.receiver.getMessageQueue().remove(message);
			logger.info("Message received: " + message);
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public void update(QueueBased subject, QueueAction eventObject) {
		for (DroneMessageEntity message : this.receiver.getMessageQueue()) {
			if (receive(message)) {
				logger.info("Scheduling whenArrived branch of WaitForMessage " + this.getInstruction());
				if (whenArrivedInstructions != null && !whenArrivedInstructions.isEmpty()) {
					whenArrivedInstructions.get(0).schedule(receiver);
					whenArrivedInstructions.get(whenArrivedInstructions.size() - 1).nextInstruction = this.nextInstruction;	// TODO: might not be needed?
				}
				break;
			}
		}
	}

	void stop() {
		this.receiver.getMessageQueue().deleteObserver(this);
	}
	
	public WaitForMessage getInstruction() {
		return this.instruction;
	}
}
