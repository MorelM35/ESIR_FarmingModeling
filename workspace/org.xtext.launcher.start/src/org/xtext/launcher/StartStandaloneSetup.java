/*
* generated by Xtext
*/
package org.xtext.launcher;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StartStandaloneSetup extends StartStandaloneSetupGenerated{

	public static void doSetup() {
		new StartStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

