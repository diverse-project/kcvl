package fr.inria.diverse.kcvl.interpreter;


import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface PatternIntegration {
	public boolean includePattern(List<Pair<EObject,EObject>> substitutes);
	public boolean fusionPattern(List<Pair<EObject,EObject>> substitutes);
	public boolean applyStructuralOrganisationalPattern(List<Pair<EObject,EObject>> substitutes);
}
