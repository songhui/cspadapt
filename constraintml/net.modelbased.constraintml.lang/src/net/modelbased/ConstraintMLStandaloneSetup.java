/*
* generated by Xtext
*/
package net.modelbased;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ConstraintMLStandaloneSetup extends ConstraintMLStandaloneSetupGenerated{

	public static void doSetup() {
		new ConstraintMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
