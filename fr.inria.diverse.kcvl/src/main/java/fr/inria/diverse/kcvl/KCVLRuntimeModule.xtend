package fr.inria.diverse.kcvl

import fr.inria.diverse.kcvl.postprocess.KCvlPostProcessor
import fr.inria.diverse.kcvl.scoping.KcvlGlobalScopeProvider

public class KCVLRuntimeModule extends fr.inria.diverse.kcvl.AbstractKCVLRuntimeModule
{
	override bindIDerivedStateComputer()
	{
		return typeof(KCvlPostProcessor)
	}
	
	override bindIGlobalScopeProvider() {
		return typeof(KcvlGlobalScopeProvider)
	}
}
 