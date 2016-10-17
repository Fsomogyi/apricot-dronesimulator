package hu.bme.mit.mdsd.dns2016.drones.simulation.events;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.helpers.MathHelper;

public class DroneBatteryChargeEvent extends Event<DroneEntity> {
	
	private static Logger logger = Logger.getLogger(DroneBatteryChargeEvent.class);

	public DroneBatteryChargeEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
	}

	private boolean chargeStationInProximity(DroneEntity whose) {
		if (MathHelper.surfaceDistance(whose, whose.getChargeStationEntity()) < 2.0f) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public void eventRoutine(DroneEntity who) throws SuspendExecution {
		if (chargeStationInProximity(who) && who.get().getBattery().getRemainingLifeTime() < who.get().getBattery().getLifeTime()) {
			float oldCharge = who.getDroneCharge();
			who.get().getBattery().setRemainingLifeTime(
					who.get().getBattery().getRemainingLifeTime() + who.get().getBattery().getRechargeRate()
			);
			float newCharge = who.getDroneCharge();
			logger.debug("Charging drone battery " + who.getName() + " from " + oldCharge + " to " + newCharge);
		}
		
		DroneBatteryChargeEvent next = new DroneBatteryChargeEvent(this.getModel(), this.getName(), this.debugIsOn());
		next.setSchedulingPriority(-1);
		next.schedule(who, new TimeSpan(1.0 ,TimeUnit.SECONDS));	
	}
	
}
