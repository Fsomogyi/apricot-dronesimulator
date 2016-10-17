# Apricot Drone Simulator

## Introduction
Apricot Drone Simulator enables the definition of cooperative drones and their behaviours (programs) in order to run simulations on the drones. The system was created at the Fault Tolerant Systems Research Group (http://www.inf.mit.bme.hu/en) at the Budapest University of Technology and Economics, using model-driven techniques. It was developed as a homework for the course "Model Driven Software Development" by Ferenc Somogyi, György Demarcsek, Krisztián Nagy.

## Technologies used
* Eclipse Modeling Tools 4.5.2
* EMF IncQuery 1.1
* Sirius 3.1.5
* Xtext 2.9.2
* Xtend 2.9.2
* DESMO-J 2.5.1c

## User's Guide
1. The metamodel of the drones can be found in the project **_hu.bme.mit.mdsd.dns2016.drones_**, under the **_model_** folder. The model can be generated using the **_genmodel_** file, although the cloned repository already contains the generated files.

2. The metamodel of the drones' behaviour can be found in the project **_hu.bme.mit.mdsd.dns2016.drones.behaviour_**, under the **_model_** folder. The repository also contains the generated files, but this metamodel can be regenerated as well.

3. Drone instance models (new drones) are created with a graphical interface supported by **Sirius**. To create a new model, a new **Eclipse** instance (runtime) must be started, loading the **__hu.bme.mit.mdsd.dns2016.drones.design__** project.

4. Behaviour instance models (new drone behaviours) are created with a textual interface supported by **Xtext**. To create a new model, a new **Eclipse** instance (runtime) must be started, loading the **__hu.bme.mit.mdsd.dns2016.drones.text__** project. Behaviour models are "linked" to drone models, which means they refer to one or more drone instance model.

5. There are existing instance models under the **__hu.bme.mit.mdsd.dns2016.drones.instancemodels__** and **__hu.bme.mit.mdsd.dns2016.drones.behaviour.instancemodels__** projects.

6. To start the **__DESMO-J__** simulation, run the **__DronesSimulationRunner__** file under the **__hu.bme.mit.mdsd.dns2016.drones.simulation__** project and package. In order to run the simulation, the behaviour models for drones that are present in the simulation must be specified in the arguments of the run configuration. The drone instance models are automatically discovered based on the behaviour models.

## Possibilities for future work
* Graphical presentation for the simulation
* See TODO-s in code for more possibilities
