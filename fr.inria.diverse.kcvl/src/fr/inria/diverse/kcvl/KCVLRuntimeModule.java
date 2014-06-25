package fr.inria.diverse.kcvl ;

import org.eclipse.xtext.resource.IDerivedStateComputer ;

import fr.inria.diverse.kcvl.postprocess.KCvlPostProcessor ;

public class KCVLRuntimeModule extends fr.inria.diverse.kcvl.AbstractKCVLRuntimeModule
{
	@Override
	public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer()
	{
		System.out.println("Binded");
		return KCvlPostProcessor.class;
	}
}
