
package fr.inria.diverse.kcvl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KCVLStandaloneSetup extends KCVLStandaloneSetupGenerated{

	public static void doSetup() {
		new KCVLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

