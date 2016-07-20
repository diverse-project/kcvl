package fr.inria.diverse.kcvl.interpreter

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource
import org.eclipse.xtend.lib.Property
import org.omg.cvl.Choice 
import org.omg.cvl.CompositeVariationPoint
import org.omg.cvl.CvlPackage
import org.omg.cvl.FragmentSubstitution
import org.omg.cvl.LinkAssignment
import org.omg.cvl.LinkExistence
import org.omg.cvl.ObjectExistence
import org.omg.cvl.ObjectSubstitution
import org.omg.cvl.OpaqueVariationPoint
import org.omg.cvl.ParametricSlotAssignmet
import org.omg.cvl.VPackage

public class CVL2Familiar {

	def Resource loadCVLModel(String cvluri) {
		if (!EPackage.Registry.INSTANCE.containsKey(CvlPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(CvlPackage.eINSTANCE.getNsURI(),
				CvlPackage.eINSTANCE);
		}
		var fact = new XMIResourceFactoryImpl
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("cvl", fact);

		if (!EPackage.Registry.INSTANCE.containsKey(UMLPackage.eNS_URI)) {

			EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
			UMLResource.Factory.INSTANCE);
		UMLPackage.eINSTANCE.eClass();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()
		var uri = URI.createURI(cvluri);
		// Resource xtextResource = resourceSet.createResource(uri);
		var res = rs.getResource(uri, true);
		// var uri1 = URI.createURI("My.officemodel");
		// Resource xtextResource = resourceSet.createResource(uri);
		// var res1 = rs.getResource(uri1, true);
		EcoreUtil.resolveAll(res)
		EcoreUtil.resolveAll(res.getResourceSet())
		return res;

	}

	def List<Diagnostic> checkDomainModelsfromURI(String cvluri) {
		checkDomainModels(loadCVLModel(cvluri).getContents().get(0) as VPackage)

	}

	def List<Diagnostic> checkDomainModels(VPackage root) {

		/*res.getResourceSet().getResources.select(e =>
		 * 	      e.getURI() != null  && e.getURI().toString() != null && e.getURI().toFileString().contains("officemodel")).first.load(new java.util.HashMap[Any,Any]())
		 */
		val roots = new ArrayList<EObject>()
		val l = new CVLChecker
		l.findDomainModelElement(root)

		l.l.forEach(e1 |
			{
			var r = l.findRoot(e1)
			if (!roots.contains(r))
				roots.add(r)
			})
		// TODO find domain root
		val diags = new ArrayList<Diagnostic>()

		roots.forEach(r|diags.add(Diagnostician.INSTANCE.validate(r)))
		return diags
	}

	def String toFamiliar(VPackage root) {

		var familiar = new FamiliarPrinter
		return familiar.start(root)
	}

	def String toFamiliarfromUri(String cvluri) {

		return toFamiliar(loadCVLModel(cvluri).getContents().get(0) as VPackage)
	}

}

class FamiliarPrinter {

	var List<Resource> domainResources = new ArrayList<Resource>()

	var res = new StringBuilder
	var res2 = new StringBuilder

	def String start(VPackage o) {

		res.append("FM (")

		traverse(o, null)
		res.append(res2.toString)

		res.append(" )")

		return res.toString

	}

	static def String mkstring(List<String> list, String delimiter, String before, String after) {
		if (list.size == 0)
			return ""
		val s = new StringBuffer
		if (before !== null)
			s.append(before)
		list.forEach[e|s.append(delimiter + e)]

		if (after !== null)
			s.append(after)
		return s.toString().replace(before + delimiter, before)
	}

	def void traverse(EObject e, Choice parent) {
		switch e {
			VPackage:
				e.getPackageElement().forEach(e1|traverse(e1, null))
			Choice: {

				if (e.getChild().filter(e1|e1 instanceof Choice).size() > 0) {
					res.append(e.getName() + " : ")

					var lower = 0
					var upper = e.getChild().size()
					if (e.getGroupMultiplicity() != null) {
						lower = e.getGroupMultiplicity().getLower()
						upper = e.getGroupMultiplicity().getUpper()
					}
					val lchoicenames = new ArrayList<String>()

					e.getChild().forEach(
						e1 |
							if (e1 instanceof Choice) {
								lchoicenames.add(e1.getName())
							}
					)

					// val choicename = lchoicenames.toArray[String](Array[java.lang.String]())
					if (upper.equals(lower)) {
						res.append(lchoicenames.mkstring(" ", "", ""))
					} else if (lower == 1) {
						if (lchoicenames.size == 1)
							res.append(lchoicenames.mkstring(" | ", "", ""))
						else {
							res.append("(")
							res.append(lchoicenames.mkstring(" | ", "", ""))
							res.append(")")
						}
					} else if (lower > 1) {
						res.append("(")
						res.append(lchoicenames.mkstring(" | ", "", ""))
						res.append(")+")
					} else if (lower == 0 && upper > 1) {
						// res.append("(")
						e.getChild().forEach(e1|
							if (e1 instanceof Choice) {
								res.append("[" + e.getName() + "]")
							}
						)
					// res.append(")")
					} else if (lower == 0 && upper == 1) {
						if (lchoicenames.size == 1) {
							res.append("[")
							res.append(lchoicenames.mkstring(" | ", "", ""))
							res.append("]")

						} else {
							res.append("(")
							res.append(lchoicenames.mkstring(" | ", "", ""))
							res.append(")?")
						}
					}
					res.append("; ")
				}
				if (e.isIsImpliedByParent() && parent != null) {
					res2.append(parent.getName() + " -> " + e.getName() + "; ")
				}
				e.getChild().forEach(e1|traverse(e1, e))
			}
			default: {
			}
		}
	}

}

class CVLChecker {

	@Property
	val l = new ArrayList<EObject>()

	def void findDomainModelElement(EObject e) {

		switch e {
			VPackage:
				e.getPackageElement().forEach(e1|findDomainModelElement(e1))
			ObjectExistence: {
				e.getOptionalObject().forEach(e2|l.add(e2.getReference()))
			}
			ParametricSlotAssignmet: {
			}
			ObjectSubstitution: {
				l.add(e.getPlacementObject().getReference())
				l.add(e.getReplacementObject().getReference())
			}
			FragmentSubstitution: {
			}
			LinkExistence: {
				l.add(e.getOptionalLink().getReference())
			}
			LinkAssignment: {
				l.add(e.getLink().getReference())
				l.add(e.getNewEnd().getReference())
			}
			CompositeVariationPoint: {
				e.getChildren().forEach(e1|findDomainModelElement(e1))
			}
			OpaqueVariationPoint: {
				e.getSourceObject().forEach(e2|l.add(e2.getReference()))
			}
			default: {
			}
		}

	}

	def EObject findRoot(EObject e) {
		if (e.eContainer() == null || e.eContainer() instanceof Resource)
			return e
		else
			return findRoot(e.eContainer())
	}

}
