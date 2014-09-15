package fr.inria.diverse.kcvl

import fr.inria.diverse.kcvl.postprocess.KCvlPostProcessor

public class KCVLRuntimeModule extends fr.inria.diverse.kcvl.AbstractKCVLRuntimeModule
{
	override bindIDerivedStateComputer()
	{
		return typeof(KCvlPostProcessor)
	}
}
 