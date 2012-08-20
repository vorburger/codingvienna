
package org.codingvienna;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Dc6StandaloneSetup extends Dc6StandaloneSetupGenerated{

	public static void doSetup() {
		new Dc6StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

