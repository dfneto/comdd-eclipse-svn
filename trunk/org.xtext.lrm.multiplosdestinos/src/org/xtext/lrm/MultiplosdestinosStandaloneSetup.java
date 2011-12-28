
package org.xtext.lrm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MultiplosdestinosStandaloneSetup extends MultiplosdestinosStandaloneSetupGenerated{

	public static void doSetup() {
		new MultiplosdestinosStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

