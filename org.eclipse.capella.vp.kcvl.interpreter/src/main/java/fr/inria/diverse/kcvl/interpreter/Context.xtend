package fr.inria.diverse.kcvl.interpreter

import java.util.List
import java.util.Map

import org.eclipse.emf.ecore.EObject

import org.eclipse.xtend.lib.Property

import org.omg.cvl.Choice
import org.omg.cvl.Variable
import org.omg.cvl.VariableValueAssignment
import org.omg.cvl.VariationPoint

/**
 * Used as context during the CVL derivation
 * May be used in a stack for VClassifiers and so
 */
public class Context
{
	// List of selected choices
	@Property
	List<Choice> selectedChoices = newArrayList
 
	// List of unselected choices
	@Property
	List<Choice> unselectedChoices  = newArrayList
	  
	@Property
	Map<Variable, VariableValueAssignment> choiceParameter = newHashMap

	@Property
	Map<Choice, List<Variable>> choiceParameterC = newHashMap

	@Property
	List<VariationPoint> selectedVPs  = newArrayList

	@Property
	List<VariationPoint> unselectedVPs = newArrayList

	@Property
	Map<EObject, EObject> objectSubstitutions = newHashMap

	@Property
	Choice currentChoice
}
