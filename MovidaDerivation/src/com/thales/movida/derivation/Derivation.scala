package com.thales.movida.derivation
import org.eclipse.emf.ecore.resource.Resource
import featureDiagram.Feature
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.resource.ResourceSet
import k2.standard.JavaConversions._
import resolutionmodel.SelectionState
import k2.io.StdIO
import resolutionmodel._
import org.eclipse.emf.ecore.util.EcoreUtil
import com.thales.movida.derivation.service.SemanticDeleteOfObject
import scala.reflect.BeanProperty
import com.thales.movida.derivation.service.CustomizedLoadOfDependantResources



object Derivation {

	@BeanProperty
	var semanticDelete : SemanticDeleteOfObject=null
 
	@BeanProperty
	var customizedLoad : CustomizedLoadOfDependantResources=null
  
	
  var stdio: _root_.k2.io.StdIOClass = new _root_.k2.io.StdIOClass()
  var notselected: java.util.List[Feature] = new java.util.ArrayList[Feature]()
  var domainResource: Resource = _
  var toRemove: java.util.List[EObject] = new java.util.ArrayList[EObject]()

  
  /** 
   * Derive a base model from a given resolution model resource
   * @param resolmodel : resource that contains the reolution model used for this derivation
   * @param baseModelURI : the base model extension (could be .* if we want to derive any extension)
   * */
  def deriveFeatureDiagram(resolmodel: Resource,baseModelURI : String): Resource = {
    //val rep: ResourceSet = resolmodel.getResourceSet()
    val rm: ResolutionModel = resolmodel.getContents().get(0).asInstanceOf[ResolutionModel]
    var featureSelections: java.util.List[resolutionmodel.FeatureSelection] = new java.util.ArrayList[resolutionmodel.FeatureSelection]
    featureSelections.addAll(rm.getFeatureSelections())
    rm.getFeatureSelections().each(e => this.getAllFeatureSelection(e, featureSelections));

    
    notselected.addAll(featureSelections.select(f => { f.getState() == SelectionState.UNSELECTED }).collect(f1 => f1.getFeature))
    
   
    
    if (this.customizedLoad==null){
    	// Debug
    	stdio.writeln("Read resource")
    //
    	EcoreUtil.resolveAll(resolmodel)
    	EcoreUtil.resolveAll(resolmodel.getResourceSet())
    	
    	
    	// Debug
    	resolmodel.getResourceSet().getResources.each( e =>  stdio.writeln(" Resource " + e.getURI().toString() ))
    	// End debug
    
    	
	    domainResource = resolmodel.getResourceSet().getResources.select(e =>
	      (selectionCriteria (e , baseModelURI ) )).first
	      
	      

    }else{
    	domainResource = customizedLoad.getDependantResource(resolmodel).select(e =>
	      (selectionCriteria (e , baseModelURI) )).first    	
    
    }
    
  
   
   
    
    var root: EObject = domainResource.getContents().get(0)

    this.removeObject(root)

    
    
    if (semanticDelete == null){
    	stdio.writeln("call fix references")
    	this.fixReference(root)
    }

    //call to remove
    stdio.writeln("Remove object from resources")
    if (semanticDelete == null)
          toRemove.each(o =>EcoreUtil.delete(o))
    else 
        toRemove.each(o =>semanticDelete.delete(o)) 
      
    return domainResource

  }

  def getAllFeatureSelection(select: resolutionmodel.FeatureSelection, selection: java.util.List[resolutionmodel.FeatureSelection]) {
    selection.addAll(select.getOwningSelection)
    select.getOwningSelection.each(f => getAllFeatureSelection(f, selection))

  }
  
 
  
  
  def selectionCriteria (e : Resource, baseModelURI : String) : Boolean = {
    var res : Boolean = false
    
     if (baseModelURI.equals(".*")){ // Derivation on any kind of model, search the first resource that not have the excluding extensions
    	res =  (e.getURI() != null  && e.getURI().toString() != null ) 
    }
    else { // Derivation for a special extension, search the first resource with this given extension
    	res = e.getURI().toString() != null    && e.getURI().toString().equals(baseModelURI) 
      
    }
    
    return res
  }
  

  
  def fixReference(obj: EObject): Any = {
    if (obj != null) {
      var props: java.util.List[_ >: EStructuralFeature] = new java.util.ArrayList[EStructuralFeature]
      props.addAll(
        obj.eClass().getEAllReferences().select(prop => { prop.isContainment().booleanValue() }))
      props.each(prop => {
        var o = obj.eGet(prop.asInstanceOf[EStructuralFeature], true)
        if (prop.asInstanceOf[EStructuralFeature].isMany) {
          var col: java.util.Collection[_ >: EObject] = o.asInstanceOf[java.util.Collection[_ >: EObject]]
          col.each(o1 => {
            //if (domainResource.getContents().contains(o1)) {
            this.fixReference(o1.asInstanceOf[EObject])
            //	    }
          })
        } else {
          //if (domainResource.getContents.contains(o))
          fixReference(o.asInstanceOf[EObject])
        }
      })

      props = obj.eClass().getEAllStructuralFeatures().select(prop => !prop.isDerived() && ! prop.isTransient())
      props.each(prop => {
        var o = obj.eGet(prop.asInstanceOf[EStructuralFeature], true)
        if (prop.asInstanceOf[EStructuralFeature].isMany) {
          var col: java.util.List[_ >: EObject] = null
          col = o.asInstanceOf[java.util.List[_ >: EObject]]
          if (col != null) {
            var colleToRemove: java.util.List[_ >: EObject] = new java.util.ArrayList[EObject]
            col.each(o1 => {
              if (toRemove.exists(objtoremove => objtoremove.equals(o1))) {
                colleToRemove.add(o1.asInstanceOf[EObject])
              }
            })
            colleToRemove.each(element => col.remove(element))
            //else
            //	stdio.writeln("col est nulle " + o.toString)
          }
        } else {
          if (toRemove.exists(objtoremove => { objtoremove.equals(o) })) {
            obj.eSet(prop.asInstanceOf[EStructuralFeature], null)
          }
        }
      })
    }
  }

  def isNotSelected(obj: EObject): Boolean = {
    notselected.each(f =>
      {
        if (f.getModelElements.exists(ob1 =>
          {
        	  ob1 == obj
          })){
          return true
        }
      })
    return false

  }

  def removeObject(obj: EObject) {
//    stdio.writeln("removeObject begin : " + obj.toString())
    if (this.isNotSelected(obj)) {
      if (this.semanticDelete == null)
    	  this.removeObjectandAllContaining(obj.asInstanceOf[EObject])
      else
    	  toRemove.add(obj)
    } else {
      var props: java.util.List[EReference] = obj.eClass.getEAllReferences().select(prop => prop.isContainment())
      props.each(prop => {
        var o: Object = obj.eGet(prop, true)
        if (prop.isMany) {
          var col: java.util.List[_ >: EObject] = o.asInstanceOf[java.util.List[_ >: EObject]]
          if (col	 != null) {
            col.each(o1 =>
              //if (domainResource.getContents.contains(o1)){ 
              this.removeObject(o1.asInstanceOf[EObject]) //}
              )
          }
        } else {
          //				if (  domainResource.getContents.contains(o)){
          if (o.isInstanceOf[EObject])
            this.removeObject(o.asInstanceOf[EObject])
          //else
           // println("bizarre for "+ prop.getName() + " " + o)
          //				}
        }
      })

    }

  }

  def removeObjectandAllContaining(obj: EObject) {
    var props: java.util.List[EReference] = null
    if (obj != null) {
      props = obj.eClass().getEAllReferences().select(prop => { prop.isContainment() })
      props.each(prop => {
        var o: Object = obj.eGet(prop, true)
        if (prop.isMany()) {
          var col: java.util.List[EObject] = o.asInstanceOf[java.util.List[EObject]]
          if (col != null) {
            col.each(o1 =>
              this.removeObjectandAllContaining(o1))
          }
        } else {
          this.removeObjectandAllContaining(o.asInstanceOf[EObject])
        }

      })
      if (obj.eResource()== domainResource) {
    	  //stdio.writeln("remove from resource" + obj.toString)
    	  toRemove.add(obj)
      } else {
        stdio.writeln("removeObjectandAllContaining : Object " + obj.toString() + " not contained")
      }
    }
  }

}