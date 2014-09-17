package com.thales.movida.derivation.service;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;

public interface CustomizedLoadOfDependantResources {

	Collection<Resource> getDependantResource(Resource r);
	
}
