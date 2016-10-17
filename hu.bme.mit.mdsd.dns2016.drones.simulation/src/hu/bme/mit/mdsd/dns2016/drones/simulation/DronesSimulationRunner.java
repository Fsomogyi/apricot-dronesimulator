package hu.bme.mit.mdsd.dns2016.drones.simulation;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import desmoj.core.simulator.Experiment;
import desmoj.core.simulator.ModelCondition;
import desmoj.core.simulator.TimeInstant;

public class DronesSimulationRunner {	
	
	private static Logger logger = Logger.getLogger(DronesSimulationRunner.class);
	
	private static void runSimulation(String[] behavFiles) throws Exception {
		InstanceModelBuilder builder = new InstanceModelBuilder();
		
		logger.info("MDSD DNS-2016");
		
		logger.info("Loading Resource Set");
		
		InstanceModel instances = builder.build(behavFiles);
		
		logger.info("Resource Set Loaded");
		
		DronesSimulationModel model = new DronesSimulationModel(instances.getMission(), instances.getDronePrograms(), null, "DronesSimulationModel", true, false);
		Experiment.setEpsilon(TimeUnit.MILLISECONDS);
		Experiment.setReferenceUnit(TimeUnit.SECONDS);
		Experiment experiment = new Experiment("Experiment");
		model.connectToExperiment(experiment);	
		experiment.traceOn(new TimeInstant(0));

		logger.info("Running experiment...");
		
		experiment.setExecutionSpeedRate(0.0f);
		
		experiment.stop(new TimeInstant(1, TimeUnit.HOURS));
		// TODO: refactor or delete this
		ModelCondition stopCond = new ModelCondition(model, null, false, model) {
			
			@Override
			public boolean check() {
				DronesSimulationModel sim = (DronesSimulationModel) this.getModel();
				if (sim.getActiveDrones().isEmpty()) {
					return true;
				}
				return false;
			}
		};
		experiment.stop(stopCond);
		
		experiment.start();
		
		// Create the report files
		experiment.report();
		
		experiment.finish();
		
		logger.info("Experiment finished");
	}
	
	public static void main(String[] args) {
		try {
			if (args.length < 1) {
				System.err.println("Usage: " + DronesSimulationRunner.class.getCanonicalName() + "<.behaviour file path> [<.behaviour file path>...]");
				return;
			}
			runSimulation(Arrays.copyOfRange(args, 0, args.length));
		} catch(Exception ex) {
			System.err.println(ex);
			ex.printStackTrace();
		}
	}
}
