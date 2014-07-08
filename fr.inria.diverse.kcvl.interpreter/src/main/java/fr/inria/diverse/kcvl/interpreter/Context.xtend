package fr.inria.diverse.kcvl.interpreter

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.omg.CVLMetamodelMaster.cvl.Choice
import org.omg.CVLMetamodelMaster.cvl.Variable
import org.omg.CVLMetamodelMaster.cvl.VariableValueAssignment
import org.omg.CVLMetamodelMaster.cvl.VariationPoint

public class Context {

  //List of choice that are selected to true
  @Property
  val List<Choice> selectedChoice = new ArrayList<Choice>()
  
  //List of choice that are selected to false
  @Property
  List<Choice> unSelectedChoice  = new ArrayList<Choice>()
  // 
  @Property
  var  Map<Variable, VariableValueAssignment> choiceParameter = new HashMap<Variable, VariableValueAssignment>()
  @Property
  var Map<Choice, List<Variable>> choiceParameterC = new HashMap<Choice, List<Variable>>()
  @Property
  var List<VariationPoint> selectedVP  = new ArrayList<VariationPoint>()
  @Property
  var List<VariationPoint> unSelectedVP = new ArrayList<VariationPoint>()
  @Property
  var Map<EObject, EObject> objectSubstitution  = new HashMap<EObject, EObject>()
  @Property
  var Choice currentChoice

}