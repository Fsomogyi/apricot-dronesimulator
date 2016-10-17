package hu.bme.mit.mdsd.dns2016.drones.simulation

import org.apache.log4j.Logger

import hu.bme.mit.mdsd.dns2016.behaviour.Condition
import hu.bme.mit.mdsd.dns2016.drones.Mission
import hu.bme.mit.mdsd.dns2016.drones.FieldObject
import hu.bme.mit.mdsd.dns2016.drones.Parameter
import hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.InvalidConditionExpressionException

class ConditionEvaluator {
	Mission _mission
	
	private static Logger logger = Logger.getLogger(ConditionEvaluator)

	private static var ConditionEvaluator INSTANCE

	public static def ConditionEvaluator getInstance(Mission mission) {
		if (INSTANCE == null) {
			INSTANCE = new ConditionEvaluator(mission);
		}	
		INSTANCE
	}	

	private new(Mission mission) {
		this._mission = mission
	}

	def conditionToString(Condition condition) {
		var operator = ""
		
		switch (condition.operation) {
			case ConditionKind.EQUALS:
				operator = "=="
				
			case ConditionKind.GREATER_THAN:
				operator = ">"
				
			case ConditionKind.LESSER_THAN:
				operator = "<"
								
			case ConditionKind.NOT_EQUALS:
				operator = "!="
		}
		
		var expr = condition.fieldObject.name + "." + condition.key + " " + operator + " " + condition.value
		return "Condition '" + expr + "'"	
	}

	def boolean evaluate(Condition condition) {
		val FieldObject target = condition.getFieldObject()
		val String property = condition.getKey()
		
		var String value = null
		
		value = target.parameters.findFirst[Parameter p |
			p.key.equals(property)
		]?.value
		
		
		if (value === null) {
			var feature = target.eClass.EAllAttributes.findFirst[eAttr | eAttr.name.equals(property)]
			if (feature == null) {
				throw new InvalidConditionExpressionException("Could not read FieldObject property: '" + property + "'!")
			}
			value = target.eGet(feature).toString()
		}
				
		var result = false
		
		switch (condition.operation) {
			case ConditionKind.EQUALS:
				result = value.equals(condition.value)
				
			case ConditionKind.GREATER_THAN:
			{
				try {
					result = (Float.parseFloat(value).floatValue > Float.parseFloat(condition.value))
				} catch (NumberFormatException e) {
					throw new InvalidConditionExpressionException("Key '" + property + "' or condition value is not a number!")
				}
			}
				
			case ConditionKind.LESSER_THAN:
			{
				try {
					result = (Float.parseFloat(value).floatValue < Float.parseFloat(condition.value))
				} catch (NumberFormatException e) {
					throw new InvalidConditionExpressionException("Key '" + property + "' or condition value is not a number!")
				}
			}				
				
			case ConditionKind.NOT_EQUALS:
				result = (!value.equals(condition.value))
		}
		
		logger.info(
			'''Evaluation trace: «condition.conditionToString()»  («value») -> «result»'''
		)
		
		return result
	}
}
