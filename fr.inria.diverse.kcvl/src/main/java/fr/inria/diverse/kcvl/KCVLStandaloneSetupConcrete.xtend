package fr.inria.diverse.kcvl

public class KCVLStandaloneSetupConcrete extends KCVLStandaloneSetupGenerated {

	def static void doSetup() {
		new KCVLStandaloneSetupConcrete().createInjectorAndDoEMFRegistration
	}

}
