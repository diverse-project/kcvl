package fr.inria.diverse.kcvl.extensions;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;

public interface CustomizedLoadOfDependentResources {
	Collection<Resource> getDependentResources(Resource r);
}
