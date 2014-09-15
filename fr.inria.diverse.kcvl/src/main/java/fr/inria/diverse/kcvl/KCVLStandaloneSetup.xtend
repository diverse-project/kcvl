package fr.inria.diverse.kcvl

public class KCVLStandaloneSetup extends KCVLStandaloneSetupGenerated {

	def static void doSetup() {
		new KCVLStandaloneSetup().createInjectorAndDoEMFRegistration
	}

}
