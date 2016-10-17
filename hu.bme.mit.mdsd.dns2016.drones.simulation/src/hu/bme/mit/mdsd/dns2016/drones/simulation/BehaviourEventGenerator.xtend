package hu.bme.mit.mdsd.dns2016.drones.simulation

import org.apache.log4j.Logger

import hu.bme.mit.mdsd.dns2016.behaviour.Choice
import hu.bme.mit.mdsd.dns2016.behaviour.Instruct
import hu.bme.mit.mdsd.dns2016.behaviour.Instruction
import hu.bme.mit.mdsd.dns2016.behaviour.Lift
import hu.bme.mit.mdsd.dns2016.behaviour.MoveTo
import hu.bme.mit.mdsd.dns2016.behaviour.Pause
import hu.bme.mit.mdsd.dns2016.behaviour.PlaceObject
import hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage
import hu.bme.mit.mdsd.dns2016.behaviour.While
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity
import java.util.ListIterator
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.InstructionEvent
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.LiftEvent
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.PauseEvent
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.WhileEvent
import java.util.List
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.ChoiceEvent
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.WaitForMessageEvent
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.PlaceObjectEvent
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.MoveStartedEvent
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.SendInstructionEvent
import hu.bme.mit.mdsd.dns2016.behaviour.SendMessage
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.SendMessageEvent
import hu.bme.mit.mdsd.dns2016.behaviour.PerformAction
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.PerformActionEvent

class BehaviourEventGenerator {
	ListIterator<Instruction> _ip
	DronesSimulationModel _model
	DroneEntity _drone
	
	private static Logger logger = Logger.getLogger(BehaviourEventGenerator)

	new(DronesSimulationModel owner, DroneEntity de) {
		this._ip = de.behaviour.getInstructions().listIterator
		this._model = owner
		this._drone = de
	}

	def public InstructionEvent getFirstEvent() {
		val firstEvent = buildEvent(getNextInstruction())
		return firstEvent
	}

	def InstructionEvent buildEvent(Instruction i) {
		if (i == null) {
			return null
		}
		
		val event = this.getEvent(i)	
		event.nextInstruction = buildEvent(getNextInstruction())

		return event
	}

	def Instruction getNextInstruction() {
		var Instruction nextInstruction = null
		
		if(_ip.hasNext())
			nextInstruction = _ip.next()
			
		return nextInstruction
	}
	
	def List<InstructionEvent> getEventBlock(List<Instruction> source) {
		val List<InstructionEvent> result = newArrayList
		var InstructionEvent prev = null
		
		for (i : source) {
			val event = getEvent(i)
			
			if (prev != null)
				prev.nextInstruction = event
				
			result.add(event)
			prev = event
		}
		
		result
	}

	def dispatch InstructionEvent getEvent(MoveTo i) {
		logger.debug(
			'''«_drone.get.name» MoveTo fieldObject "«i.fieldObject.name»" at («i.fieldObject.x», «i.fieldObject.y», «i.fieldObject.z»)'''
		)
		
		new MoveStartedEvent(_model, _drone.get.name + " move to " + i.fieldObject.name, true, i)
	}
	
	def dispatch InstructionEvent getEvent(Lift i) {
		logger.debug(
			'''«_drone.get.name» Attempting to Lift fieldObject "«i.target.name»" at («i.target.x», «i.target.y», «i.target.z»)'''
		)
		
		new LiftEvent(_model, _drone.get.name + " lift " + i.target.name, true, i)
	}
	
	def dispatch InstructionEvent getEvent(Pause i) {
		logger.debug(
			'''«_drone.get.name» pausing for «i.duration»'''
		)
		
		new PauseEvent(_model, _drone.get.name + " pause " + i.duration, true, i)
	}
	
	def dispatch InstructionEvent getEvent(Choice i) {
		logger.debug(
			'''«_drone.get.name» Evaluating condition '''
		)

		val List<InstructionEvent> trueInstructions = getEventBlock(i.trueBranch)
		val List<InstructionEvent> falseInstructions = getEventBlock(i.falseBranch)		
		new ChoiceEvent(_model, _drone.get.name + " choice ", true, i, trueInstructions, falseInstructions)
	}
	
	def dispatch InstructionEvent getEvent(While i) {
		logger.debug(
			'''«_drone.get.name» While loop '''
		)
		
		var List<InstructionEvent> loopInstructions = getEventBlock(i.instructions)
		new WhileEvent(_model, _drone.get.name + " while ", true, i, loopInstructions)
	}
	
	def dispatch InstructionEvent getEvent(Instruct i) {
		logger.debug(
			'''«_drone.get.name» Sending instruction message «i»'''
		)
		
		var List<InstructionEvent> instructions = getEventBlock(i.instructions)		
		new SendInstructionEvent(_model, _drone.get.name + " sent message " + i, true, i, instructions, _drone)
	}
	
	def dispatch InstructionEvent getEvent(WaitForMessage i) {
		logger.debug(
			'''«_drone.get.name» Waiting for message «i.type» w timeout «i.timeout»'''
		)
		val List<InstructionEvent> whenArrivedInstructions = getEventBlock(i.whenArrived)
		val List<InstructionEvent> whenLostInstructions = getEventBlock(i.whenLost)	
		new WaitForMessageEvent(_model, _drone.get.name + " waiting for message " + i.type, true, i, _drone, whenArrivedInstructions, whenLostInstructions)
	}
	
	def dispatch InstructionEvent getEvent(SendMessage i) {
		logger.debug(
			'''«_drone.get.name» Sending  message of type «i.messageType» '''
		)
		
		new SendMessageEvent(_model, _drone.get.name + " sending message" + i.messageType, true, i, _drone)
	}
	
	def dispatch InstructionEvent getEvent(PlaceObject i) {
		logger.debug(
			'''«_drone.get.name» Attempting to place carried object at («_drone.get.x», «_drone.get.y», «_drone.get.z»)'''
		)
		
		new PlaceObjectEvent(_model, _drone.get.name + " place carried object ", true)
	}
	
	def dispatch InstructionEvent getEvent(PerformAction i) {
		logger.debug(
			'''«_drone.get.name» performing action «i.action.name» on target «i.target.name»'''
		)
		
		new PerformActionEvent(_model, _drone.get.name + " perform action " + i.action.name, true, i)
	}
}
		
