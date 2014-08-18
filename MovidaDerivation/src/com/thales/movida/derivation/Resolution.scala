package com.thales.movida.derivation
import org.eclipse.emf.ecore.resource.Resource
import featureDiagram._
import resolutionmodel._
import org.eclipse.emf.ecore.EObject
import k2.standard.JavaConversions._
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI

object Resolution {



	var resolModel : resolutionmodel.ResolutionModel =null
	
		/** Retrieve the selected features on the feature diagram  pathDir : the directory where the feature diagram model is stored*/
	/** pathFeatureModel : the path of the feature model if it is already selected (with UI ...), or "" otherwise */
	/** Result : the path of the new resolutionmodel obtained */
	def deriveFeatureDiagram(pathFDModel : Resource) :ResolutionModel ={
		// Load feature diagram model

	  
	  
	  
	  
	  var fd : featureDiagram.FeatureDiagram = pathFDModel.getContents().get(0).asInstanceOf[featureDiagram.FeatureDiagram]
	  
		//Use selection algorithm on feature diagram
		resolModel = resolutionmodel.ResolutionmodelFactory.eINSTANCE.createResolutionModel()
		resolModel.setFeatureDiagram(fd)
		processFD(fd)
		
		return resolModel
		
		
		
	}
	
	
	var currentFeatureSelection : FeatureSelection= null
	var parentOp : resolutionmodel.Operator= resolutionmodel.Operator.MANDATORY
	
	def processFD(e : EObject ):Any={
	  e match {
	    case f : FeatureDiagram =>{
          
	      if (f.isGraphTypeTree() && f.getRoot()!= null){ 
	    	  processFD(f.getRoot())
	     }
	    }
	    case f : Feature =>{
	    		        var featureSelection: FeatureSelection = ResolutionmodelFactory.eINSTANCE.createFeatureSelection()
	    		        featureSelection.setFeature(f)
	    		        featureSelection.setFeatureName(f.getName())
	    		        if (parentOp == resolutionmodel.Operator.MANDATORY)
	    		        	featureSelection.setState(SelectionState.SELECTED)
	    		        else
	    		        	featureSelection.setState(SelectionState.UNSELECTED)
	    		        featureSelection.setOperator(parentOp)	    		        
	    		        if (currentFeatureSelection ==null)
	    		          resolModel.getFeatureSelections().add(featureSelection)
	    		        else
	    		          currentFeatureSelection.getOwningSelection().add(featureSelection)
	    		        
	    		        var oldcurrentFeatureSelection = currentFeatureSelection
	    		        currentFeatureSelection = featureSelection
	    		        f.getOperator().each( op => processFD(op))
	    		        currentFeatureSelection = oldcurrentFeatureSelection
		}
	    case m : featureDiagram.Operator => {
	      	    	m match {
	      	    	  case op : Mandatory => parentOp = resolutionmodel.Operator.MANDATORY
	      	    	  case op : Alternative => parentOp = resolutionmodel.Operator.ALTERNATIVE
	      	    	  case op : Card => parentOp = resolutionmodel.Operator.CARD
	      	    	  case op : Opt => parentOp = resolutionmodel.Operator.OPT
	      	    	  case op : Or => parentOp = resolutionmodel.Operator.OR
	      	    	}
	      	    		m.getFeatures.each(f =>processFD(f))
	    }

	  }
	}
}
