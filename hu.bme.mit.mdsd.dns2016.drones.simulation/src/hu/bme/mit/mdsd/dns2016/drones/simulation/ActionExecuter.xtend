package hu.bme.mit.mdsd.dns2016.drones.simulation

import org.apache.log4j.Logger

import hu.bme.mit.mdsd.dns2016.drones.Mission
import hu.bme.mit.mdsd.dns2016.drones.FieldObject
import hu.bme.mit.mdsd.dns2016.drones.Parameter
import hu.bme.mit.mdsd.dns2016.drones.ActionKind
import hu.bme.mit.mdsd.dns2016.behaviour.PerformAction
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.InvalidActionExpressionException
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.DroneActionNotSupportedException
import hu.bme.mit.mdsd.dns2016.drones.Drone

class ActionExecuter {
	Mission _mission
	Drone _drone
	
	private static Logger logger = Logger.getLogger(ActionExecuter)

	private static var ActionExecuter INSTANCE

	public static def ActionExecuter getInstance(Mission mission) {
		if (INSTANCE == null) {
			INSTANCE = new ActionExecuter(mission)
		}
		INSTANCE
	}
	
	private new(Mission mission) {
		_mission = mission
	}

	def actionToString(PerformAction pa) {
		var operator = ""
		
		switch (pa.action.operation) {
			case ActionKind.SET:
				operator = "="
				
			case ActionKind.ADD:
				operator = "+="
				
			case ActionKind.SUBTRACT:
				operator = "-="
		}
		
		var expr = pa.target.name + "." + pa.action.key + " " + operator + " " + pa.action.value
		return "Action '" + expr + "'"	
	}

	def void execute(PerformAction pa, Drone drone) {
		logger.info(
			'''Executing action: '«pa.actionToString()»' '''
		)
		
		if (!drone.getSupportedActions().contains(pa.getAction())) {
			throw new DroneActionNotSupportedException("Action " + pa.getAction().getName() + " for Drone " + drone.getName() + " is not supported");
		}
		
		val FieldObject target = pa.target
		val String key = pa.action.key
		val String value = pa.action.value
		
		val Parameter param = target.parameters.findFirst[Parameter p | p.key.equals(key)]

		if (param != null) {
			switch (pa.action.operation) {
				case ActionKind.SET:
					param.value = value

				case ActionKind.ADD:
				{
					try {
						var Float floatParamValue = Float.parseFloat(param.value)
						var Float floatValue = Float.parseFloat(value)
						
						var Float result = floatParamValue + floatValue
						param.value = result.toString()
					} catch (NumberFormatException e) {
						throw new InvalidActionExpressionException("Parameter '" + key + "' on target '" + target.name + "'" + " is not a number!");
					}
				}

				case ActionKind.SUBTRACT:
				{
					try {
						var Float floatParamValue = Float.parseFloat(param.value)
						var Float floatValue = Float.parseFloat(value)
						
						var Float result = floatParamValue - floatValue
						param.value = result.toString()
					} catch (NumberFormatException e) {
						throw new InvalidActionExpressionException("Parameter '" + key + "' on target '" + target.name + "'" + " is not a number!");
					}
				}
			}
		}
		else {
			throw new InvalidActionExpressionException("Parameter '" + key + "' not found on target '" + target.name + "'!");
		}
		
		logger.info(
		''' Execution successful ''')
	}
}
