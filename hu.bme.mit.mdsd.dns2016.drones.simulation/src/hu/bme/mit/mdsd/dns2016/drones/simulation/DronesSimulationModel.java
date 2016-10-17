package hu.bme.mit.mdsd.dns2016.drones.simulation;

import java.util.List;

import desmoj.core.dist.ContDist;
import desmoj.core.dist.ContDistUniform;
import desmoj.core.dist.DiscreteDistPoisson;
import desmoj.core.dist.DiscreteDist;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.Queue;
import desmoj.core.statistic.Count;
import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Mission;
import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.FieldObjectEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.MovableObjectEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.DroneStartedProgram;

public class DronesSimulationModel extends Model {
	
	private Mission mission;
	private List<DroneBehaviour> programs;
	private Queue<DroneEntity> activeDrones;
	private Queue<DroneEntity> inactiveDrones;
	private Queue<FieldObjectEntity> fieldObjectEntities;
	private Queue<MovableObjectEntity> movableObjectEntities;
	
	private ContDist droneSpeedModifier;
	private DiscreteDist<?> messageDeliveryTime;
	
	// Statistics
	private Count droppedMessageCount;
	private Count executedInstructionCount;
	private Count collisionCount;
	private Count batteryDeathCount;
	
	public DronesSimulationModel(Mission mission, List<DroneBehaviour> programs, Model owner, String name, boolean showInReport, boolean showInTrace) {
		super(owner, name, showInReport, showInTrace);
		this.mission = mission;
		this.programs = programs;
	}

	@Override
	public String description() {
		return "Drone simulation model";
	}

	@Override
	public void doInitialSchedules() {
		for (DroneEntity drone : this.activeDrones) {
			if (drone.behaviour != null) {
				new DroneStartedProgram(this, "Drone Started Program", true).schedule(drone/*, new TimeSpan(this.getDroneProgramStartTime().sample().floatValue())*/);
			}
		}
	}

	@Override
	public void init() {
		// Initialize drones
		inactiveDrones = new Queue<DroneEntity>(this, "Disabled Drones Queue", true, false);
		activeDrones = new Queue<DroneEntity>(this, "Active Drones Queue", true, false);
		for (Drone drone : mission.getDrones()) {
			
			DroneEntity newDroneEntity = new DroneEntity(drone, this, drone.getName(), true);
			
			for (DroneBehaviour program : programs) {
				if (program.getDrones().contains(drone)) {
					if (newDroneEntity.behaviour != null) {
						System.err.println("Warning: Drone " + drone.getName() + " has multiple programs!");
					}
					newDroneEntity.behaviour = program;
				}
			}
			
			if (newDroneEntity.behaviour == null) {
				System.err.println("Warning: Drone " + drone.getName() + " has no program");
			}
			
			activeDrones.insert(newDroneEntity);
		}
		
		// Initialize field objects and movable objects
		fieldObjectEntities = new Queue<FieldObjectEntity>(this, "Field Objects Queue", true, false);
		movableObjectEntities = new Queue<MovableObjectEntity>(this, "Movable Objects Queue", true, false);
		for (FieldObject fieldObject : mission.getFieldObjects()) {
			FieldObjectEntity fieldObjectEntity = new FieldObjectEntity(fieldObject, this, fieldObject.getName(), true);
			fieldObjectEntities.insert(fieldObjectEntity);
			if (fieldObject instanceof MovableObject) {
				MovableObjectEntity movableObjectEntity = new MovableObjectEntity((MovableObject) fieldObject, this, fieldObject.getName(), true);
				movableObjectEntities.insert(movableObjectEntity);
			}
		}
		
		this.setDroneSpeedModifier(new ContDistUniform(this, "Drone Speed modifier", 0.0, 1.0, true, false));
		this.setMessageDeliveryTime(new DiscreteDistPoisson(this, "Drone message delivery time", 2, true, false));
		this.setDroppedMessageCount(new Count(this, "Number of dropped messages", true, false));
		this.getDroppedMessageCount().setUnit("number of occurences");
		this.setExecutedInstructionCount(new Count(this, "Total number of instructions executed", true, false));
		this.getExecutedInstructionCount().setUnit("number of occurences");
		this.setBatteryDeathCount(new Count(this, "Number of drones depleted during the operation", true, false));
		this.getBatteryDeathCount().setUnit("number of occurences");
		this.setCollisionCount(new Count(this, "Number of drones crashed during the operation", true, false));
		this.getCollisionCount().setUnit("number of occurences");
	}

	public Queue<DroneEntity> getActiveDrones() {
		return this.activeDrones;
	}
	
	public Queue<DroneEntity> getInactiveDrones() {
		return this.inactiveDrones;
	}
	
	public Mission getMission() {
		return this.mission;
	}

	public ContDist getDroneSpeedModifier() {
		return droneSpeedModifier;
	}

	public void setDroneSpeedModifier(ContDist droneSpeedModifier) {
		this.droneSpeedModifier = droneSpeedModifier;
	}

	public DiscreteDist<?> getMessageDeliveryTime() {
		return messageDeliveryTime;
	}

	public void setMessageDeliveryTime(DiscreteDist<?> messageDeliveryTime) {
		this.messageDeliveryTime = messageDeliveryTime;
	}

	public Count getDroppedMessageCount() {
		return droppedMessageCount;
	}

	public void setDroppedMessageCount(Count droppedMessageCount) {
		this.droppedMessageCount = droppedMessageCount;
	}

	public Count getExecutedInstructionCount() {
		return executedInstructionCount;
	}

	public void setExecutedInstructionCount(Count executedInstructionCount) {
		this.executedInstructionCount = executedInstructionCount;
	}

	public Count getBatteryDeathCount() {
		return batteryDeathCount;
	}

	public void setBatteryDeathCount(Count batteryDeathCount) {
		this.batteryDeathCount = batteryDeathCount;
	}

	public Count getCollisionCount() {
		return collisionCount;
	}
	
	public void setCollisionCount(Count collisionCount) {
		this.collisionCount = collisionCount;
	}
	
	public FieldObjectEntity getFieldObjectEntity(FieldObject fieldOject){
		for (FieldObjectEntity fieldObjectEntity : fieldObjectEntities) {
			if (fieldObjectEntity.fieldObject.equals(fieldOject)) {
				return fieldObjectEntity;
			}
		}
		return null;
	}
	
	public MovableObjectEntity getMovableObjectEntity(MovableObject movableOject){
		for (MovableObjectEntity movableObjectEntity : movableObjectEntities) {
			if (movableObjectEntity.movableObject.equals(movableOject)) {
				return movableObjectEntity;
			}
		}
		return null;
	}
}
