
package org.varymde;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CvlmappingvaribilitychoiceStandaloneSetup extends CvlmappingvaribilitychoiceStandaloneSetupGenerated{

	public static void doSetup() {
		new CvlmappingvaribilitychoiceStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

