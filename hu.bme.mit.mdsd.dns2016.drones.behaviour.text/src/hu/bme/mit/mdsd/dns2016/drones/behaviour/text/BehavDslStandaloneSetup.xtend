/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BehavDslStandaloneSetup extends BehavDslStandaloneSetupGenerated {

	def static void doSetup() {
		new BehavDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
