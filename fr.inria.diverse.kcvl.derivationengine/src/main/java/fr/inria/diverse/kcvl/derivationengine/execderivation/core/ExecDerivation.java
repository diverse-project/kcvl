/*******************************************************************************
 * Copyright (c) 2010-2012 mgouyett.
 * INRIA-IRISA- Triskell Team
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     mgouyett - initial API and implementation
 * 	INRIA-IRISA- Triskell Team
 * 	contact : marie.gouyette@gmail.com
 ******************************************************************************/
package fr.inria.diverse.kcvl.derivationengine.execderivation.core;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.patterns.core.CorePatternsPlugin;
import org.eclipse.emf.diffmerge.patterns.core.api.IPattern;
import org.eclipse.emf.diffmerge.patterns.core.api.IPatternApplication;
import org.eclipse.emf.diffmerge.patterns.core.api.IPatternInstance;
import org.eclipse.emf.diffmerge.patterns.core.api.IPatternRole;
import org.eclipse.emf.diffmerge.patterns.core.api.ext.IModelOperation;
import org.eclipse.emf.diffmerge.patterns.core.operations.CompoundModelOperation;
import org.eclipse.emf.diffmerge.patterns.core.util.BasicPatternApplication;
import org.eclipse.emf.diffmerge.patterns.core.util.locations.BasicCompositeLocation;
import org.eclipse.emf.diffmerge.patterns.core.util.locations.BasicElementLocation;
import org.eclipse.emf.diffmerge.patterns.core.util.locations.BasicReferenceLocation;
import org.eclipse.emf.diffmerge.patterns.diagrams.PatternCoreDiagramPlugin;
import org.eclipse.emf.diffmerge.patterns.diagrams.factories.IPatternOperationFactory;
import org.eclipse.emf.diffmerge.patterns.diagrams.operations.AbstractFilteredGraphicalUpdateOperation;
import org.eclipse.emf.diffmerge.patterns.diagrams.operations.AbstractGraphicalWrappingInstanceOperation;
import org.eclipse.emf.diffmerge.patterns.diagrams.operations.AbstractGraphicalWrappingInstanceOperation.RefreshRequestKind;
import org.eclipse.emf.diffmerge.patterns.diagrams.sirius.util.SiriusDiagramUtil;
import org.eclipse.emf.diffmerge.patterns.diagrams.sirius.util.SiriusGenericTypeUtil;
import org.eclipse.emf.diffmerge.patterns.repositories.catalogs.operations.OpenCatalogOperation;
import org.eclipse.emf.diffmerge.patterns.templates.engine.TemplatePatternsEnginePlugin;
import org.eclipse.emf.diffmerge.patterns.templates.engine.ext.ISemanticRuleProvider;
import org.eclipse.emf.diffmerge.patterns.templates.engine.operations.ApplyTemplatePatternOperation;
import org.eclipse.emf.diffmerge.patterns.templates.engine.specifications.TemplatePatternApplicationSpecification;
import org.eclipse.emf.diffmerge.patterns.templates.gen.templatepatterns.TemplatePattern;
import org.eclipse.emf.diffmerge.patterns.templates.gen.templatepatterns.TemplatePatternRole;
import org.eclipse.emf.diffmerge.patterns.templates.gen.templatepatterns.impl.TemplatePatternDataImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.omg.CVLMetamodelMaster.cvl.VPackage;

import fr.inria.diverse.kcvl.extensions.SemanticDeleteOfObject;
import fr.inria.diverse.kcvl.interpreter.Derivator;
import fr.inria.diverse.kcvl.interpreter.Pair;
import fr.inria.diverse.kcvl.interpreter.PatternIntegration;

/**
 * This class permits to execute product derivation from a given resolution
 * model to obtain a resolved model (product model)
 * 
 * @author obarais
 * 
 */
public class ExecDerivation implements PatternIntegration {

	
	List<IPatternInstance> instances = new ArrayList<IPatternInstance>();
	Resource resolvedModelRes;

	DRepresentation _diagramToRefresh;
	SiriusDiagramUtil _diagramUtil = new SiriusDiagramUtil();

	SiriusGenericTypeUtil _genericTypeUtil = new SiriusGenericTypeUtil();

	TemplatePatternApplicationSpecification _applicationSpec;

	List<String> excludingExtensions;

	/**
	 * This method permits to execute product derivation
	 * 
	 * 
	 * @resolutionModelPath : the path for the resolution model where user
	 *                      choices (selected or unselected features are stored)
	 */
	SemanticDeleteOfObject toD;

	public void callProductDerivation(URI file) {
		if (file.toString().endsWith("kcvl")) {
			try {
				XtextResourceSet rs = new XtextResourceSet() ;
				Resource oldRes = rs.getResource(file,  true) ;
				EcoreUtil.resolveAll(oldRes) ;
				URI newUri = file.trimFileExtension().appendFileExtension("cvl") ;
				Resource newRes = rs.createResource(newUri) ;
				newRes.getContents().addAll(oldRes.getContents()) ;
				newRes.save(null) ;
				file = newUri ;

				Session sess = SessionManager.INSTANCE.getSessions().iterator().next() ;

				AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(
						sess, file, null);
				sess.getTransactionalEditingDomain().getCommandStack()
				        .execute(addCommandToSession);
			} catch (Exception e) {
				e.printStackTrace() ;
			}
		}

		for (Session s : SessionManager.INSTANCE.getSessions()) {
			for (Resource r : s.getSemanticResources()) {
				if (file.toString().equals(r.getURI().toString())) {
					resolvedModelRes = r;
				}
			}
		}
		
		// If not found, we cannot do anything
		if (resolvedModelRes == null) {
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			    public void run() {
				    Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				    
				    MessageBox dialog = 
							  new MessageBox(activeShell, SWT.ICON_ERROR | SWT.OK);
							dialog.setText("Cannot proceed");
							dialog.setMessage("KCVL file needs to be attached to the Sirius session " +
									"of the target model before proceeding.");
							dialog.open();
				}
			});
			
			return ;
		}

		Resource pattern_res = null;
		Resource model_res = null;

		List<IFile> files = new ArrayList<IFile>();
		for (Resource r : resolvedModelRes.getResourceSet().getResources()) {
			if ("patterns".equals(r.getURI().fileExtension()))
				pattern_res = r;
			else if ("melodymodeller".equals(r.getURI().fileExtension())) {
				model_res = r;
			} else if ("uml".equals(r.getURI().fileExtension())) {
				model_res = r;
			}
		}

		if (pattern_res != null) {
			String fileString = URI.decode(pattern_res.getURI().path());
			if (fileString.startsWith("/resource/")) {
				fileString = fileString.substring(9);
			}
			IFile file1 = ResourcesPlugin.getWorkspace().getRoot()
					.getFile(new Path(fileString));
			EditingDomain domain = CorePatternsPlugin.getDefault().getModelEnvironment().getEditingDomain(file1);
			OpenCatalogOperation operation = new OpenCatalogOperation(file1,
					(TransactionalEditingDomain) domain);
			System.out.println("openCatalogResult="+CorePatternsPlugin.getDefault().getModelEnvironment()
				.execute(operation));
		}

		final Derivator v = new Derivator();
		v.setPatternIntegration(this);

		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();

		for (IConfigurationElement f : extensionRegistry
				.getConfigurationElementsFor("fr.inria.diverse.kcvl.derivationengine.cvlderivationsemanticsextension")) {

			try {
				toD = (SemanticDeleteOfObject) f
						.createExecutableExtension("class");

				v.setSemanticDelete(toD);
			} catch (CoreException e) {
				e.printStackTrace();
			}

		}

		// FIXME: No more XtextResourceSet for the moment
		//XtextResourceSet rs = new XtextResourceSet();
		//v.setResourceSet(rs);

		// Retrieve session
		final Session sess = SessionManager.INSTANCE
				.getSession(resolvedModelRes);
		final TransactionalEditingDomain domain = sess
				.getTransactionalEditingDomain();

		// Use the session resourceSet instead
		v.setResourceSet(domain.getResourceSet());

		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				// Derive domain model

				MessageConsole myConsole = findConsole("cvl");
				MessageConsoleStream out = myConsole.newMessageStream();
				PrintStream oldout = System.out;
				System.setOut(new PrintStream(out));
				v.start((VPackage) resolvedModelRes.getContents().get(0));
				System.setOut(oldout);

				if (toD != null) {
					List<EObject> toRemove = null;
					try {
						toRemove = (List<EObject>) toD.getClass()
								.getMethod("getToDelete").invoke(toD);
					} catch (IllegalAccessException e) {

						e.printStackTrace();
					} catch (IllegalArgumentException e) {

						e.printStackTrace();
					} catch (InvocationTargetException e) {

						e.printStackTrace();
					} catch (NoSuchMethodException e) {

						e.printStackTrace();
					} catch (SecurityException e) {

						e.printStackTrace();
					}
					for (EObject o : toRemove) {
						System.err.println(o);
						System.err.println(SessionManager.INSTANCE
								.getSession(o));
						System.err.println(o.eResource());
					}
					// TODO JLN try Again
					if (v.getDomainResources().get(0).getURI().fileExtension()
							.equals("melodymodeller")) {
/*						if (executionManager != null) {
							// TODO JLN monitor delete false
							MelodyDeleteCommand mdc = new MelodyDeleteCommand(
									executionManager, toRemove, true, false,
									true);

							if (mdc.canExecute()) {
								mdc.execute();
							}

						}*/
					}
				}
				
				System.err.println(v.getDomainResources().size());
				
				// Save model
				for (Resource res1 : v.getDomainResources()) {
					if (!res1.getURI().toString().endsWith(".patterns")) {
						URI newuri = res1.getURI();
						newuri = newuri.trimFileExtension();
						newuri = URI.createURI(newuri.toString() + "_new_"+((VPackage) resolvedModelRes.getContents().get(0)).getName());
						System.err.println("newuri " + newuri);
						newuri = newuri.appendFileExtension(res1.getURI()
								.fileExtension());
						Resource copy = domain.getResourceSet().createResource(
								newuri);
						EcoreUtil.Copier copier = new EcoreUtil.Copier();
	
						for (EObject root : res1.getContents()) {
							copy.getContents().add(copier.copy(root));
						}
						copier.copyReferences();
						try {
							copy.save(Collections.emptyMap());
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					}
				}
			}
		});

		// We undo the command to not keep some modifications in base model
		// resource
		domain.getCommandStack().undo();
	}


	public boolean includePattern(List<Pair<EObject, EObject>> substitutes) {

		IPatternRole r = (IPatternRole) substitutes.iterator().next().getL();
		IPattern myPattern = r.getPattern();
		System.err.println(resolvedModelRes.getURI());
		BasicPatternApplication applicationSpec = new BasicPatternApplication(
				myPattern);

		for (Pair<EObject, EObject> entry : substitutes) {
			System.err.println(r.getName());
			IPatternRole r1 = (IPatternRole) entry.getL();
			/*if (r1 instanceof TemplatePatternRole) {
				EList mes = ((TemplatePatternRole) r).getMergeDerivationRule()
						.deriveCandidateElements(applicationSpec);
				for (Iterator iterator = mes.iterator(); iterator.hasNext();) {
					Object object = (Object) iterator.next();
					System.err.println(r.getName() + ":CandidateElements : "
							+ object.toString());
				}
			}*/

			// PatternApplicationWizard p = new PatternApplicationWizard();
			
			applicationSpec.addLocation(r1, new BasicReferenceLocation(entry
					.getR().eContainer(), entry.getR().eContainmentFeature()));

		}

		// applicationSpec.addLocation(ï¿½);
		// Demande-moi si cï¿½est pas clair : pour chaque rï¿½le du pattern
		// il faut une ILocation
		// qui dï¿½termine comment le rï¿½le est ï¿½ appliquï¿½ ï¿½ : soit par
		// ajout des ï¿½lï¿½ments du rï¿½le dans
		// un ï¿½lï¿½ment du modï¿½le via une rï¿½fï¿½rence de containment
		// (BasicReferenceLocation),
		// soit par fusion avec un ï¿½lï¿½ment du modï¿½le
		// (BasicElementLocation).
		// Tu peux faire applicationSpec.isComplete() pour vï¿½rifier que
		// tout est parï¿½.
		// Si applicationSpec.isComplete(), on poursuit.
		boolean res = applicationSpec.isComplete();
		IModelOperation<IPatternInstance> patternApplicationOperation = new ApplyTemplatePatternOperation(
				applicationSpec, true, "$name$", 1, 1, substitutes.iterator()
						.next().getL().eResource(), substitutes.iterator()
						.next().getR().eResource());
		IPatternInstance instance = CorePatternsPlugin.getDefault().getModelEnvironment()
				.execute(patternApplicationOperation);
		instances.add(instance);
		return res;
	}

	public boolean fusionPattern(final List<Pair<EObject, EObject>> substitutes) {

		IPatternRole r = (IPatternRole) substitutes.iterator().next().getL();
		TemplatePattern myPattern = (TemplatePattern) r.getPattern();
		System.err.println("resolvedModelRes:" + resolvedModelRes.getURI());
		final Session sess = SessionManager.INSTANCE
				.getSession(resolvedModelRes);

		HashMap<String, DRepresentation> representationMap = new HashMap<String, DRepresentation>();
		Collection<DView> views = sess.getOwnedViews();
		System.err.println(sess.getOwnedViews().size());
		for (DView dView : views) {
			System.err.println("tyty" + dView.getViewpoint().getName());
			Collection<DRepresentation> representations = dView
					.getAllRepresentations();

			for (Iterator iterator2 = representations.iterator(); iterator2
					.hasNext();) {
				DRepresentation dRepresentation = (DRepresentation) iterator2
						.next();
				System.err.println("representation : "
						+ dRepresentation.getName());
				representationMap.put(dRepresentation.getName(),
						dRepresentation);

			}

		}

		// BasicPatternApplication applicationSpec = new
		// BasicPatternApplication(
		// myPattern);

		List<EObject> scope = new ArrayList<EObject>();

		if (representationMap
				.get("[SFBD] Root System Function - System Function Breakdown") instanceof DDiagram) {

			DDiagram d = (DDiagram) representationMap
					.get("[SFBD] Root System Function - System Function Breakdown");
			_diagramToRefresh = d;
			List diagElts = d.getOwnedDiagramElements();

			if (!diagElts.isEmpty()) {
				List<EObject> sms = _diagramUtil
						.getSemanticElementsFor(diagElts.get(0));

				if (!diagElts.isEmpty()) {
					System.err.println("grrr " + sms.get(0).eContainer());
					scope.add(sms.get(0).eContainer());
				}

			}

		}

		_applicationSpec = new TemplatePatternApplicationSpecification(scope);
		_applicationSpec.setPattern(myPattern);

		_applicationSpec.setDisplayWhenDone(true);
		_applicationSpec.setReuseLayout(false);

		List<IPatternRole> rolestointegrate = new ArrayList<IPatternRole>();

		List<? extends IPatternRole> patternRoles = myPattern.getRoles();

		rolestointegrate.addAll(patternRoles);

		for (Pair<EObject, EObject> re : substitutes) {
			if (rolestointegrate.contains(re.getL()))
				rolestointegrate.remove(re.getL());
		}

		EObject ob = null;
		// j'ai changé en linkedhasmap pour conserver l'ordre des rôles pour le
		// support de dérivé.
		Map<EObject, EList<EObject>> composite = new LinkedHashMap<EObject, EList<EObject>>();

		for (Pair<EObject, EObject> entry : substitutes) {
			if (!composite.containsKey(entry.getL())) {
				composite.put(entry.getL(), new BasicEList<EObject>());
			}
			composite.get(entry.getL()).add(entry.getR());
		}

		for (Entry<EObject, EList<EObject>> entry : composite.entrySet()) {
			if (entry.getValue().size() == 1) {
				if (ob == null)
					ob = entry.getValue().get(0);
				{
					TemplatePatternRole role = ((TemplatePatternRole) (IPatternRole) entry
							.getKey());
					boolean isMultiple = role.getPattern().getMultiElements()
							.containsAll(role.getTemplateElements());
					if (isMultiple) {
						BasicCompositeLocation loc = new BasicCompositeLocation();
						EList mes = ((TemplatePatternRole) (IPatternRole) entry
								.getKey()).getMergeDerivationRule()
								.deriveCandidateElements(
										_applicationSpec.getApplication());
						if (mes != null) {

							for (Iterator it = mes.iterator(); it.hasNext();) {
								EObject object = (EObject) it.next();
								System.err.println(r.getName()
										+ ":CandidateElements : "
										+ object.toString());
								loc.getOwnedLocations().add(
										new BasicElementLocation(object));

							}
						}
						_applicationSpec.getApplication().addLocation(
								(IPatternRole) entry.getKey(), loc);
					} else {
						_applicationSpec.getApplication().addLocation(
								(IPatternRole) entry.getKey(),
								new BasicElementLocation(entry.getValue()
										.get(0)));
					}

					// _applicationSpec.addLocation((IPatternRole)
					// entry.getKey(),
					// new BasicElementLocation(entry.getValue().get(0)));

				}
			} else {
				if (ob == null)
					ob = entry.getValue().get(0);
				{
					BasicCompositeLocation loc = new BasicCompositeLocation();
					for (EObject atomics : entry.getValue()) {
						loc.getOwnedLocations().add(
								new BasicElementLocation(atomics));
					}

					_applicationSpec.getApplication().addLocation(
							(IPatternRole) entry.getKey(), loc);

					// _applicationSpec.addLocation((IPatternRole)
					// entry.getKey(),
					// loc);
				}
			}
			// BasicCompositeLocation loc = new BasicCompositeLocation();
			// loc.getOwnedLocations().add(new BasicElementLocation(element_p))

		}

		for (IPatternRole ob1 : rolestointegrate) {

			// _applicationSpec.addLocation(
			// ob1,
			// new BasicElementLocation(ob.eContainer()));

			_applicationSpec.getApplication().addLocation(ob1,
					new BasicElementLocation(ob.eContainer()));

			/*
			 * new BasicReferenceLocation(ob.eContainer(), ob
			 * .eContainmentFeature()));
			 */
		}
		/*for (Pair<EObject, EObject> re : substitutes) {
					
		_applicationSpec.getApplication().addLocation((IPatternRole) re.getL(), new BasicReferenceLocation(re
				.getR().eContainer(), re.getR().eContainmentFeature()));
		}*/

		boolean res = _applicationSpec.isComplete();

		/*
		 * final IModelOperation<IPatternInstance> patternApplicationOperation =
		 * new ApplyTemplatePatternOperation( applicationSpec, true, "$name$",
		 * 1, 1,null,null);
		 */

		/*
		 * final IModelOperation<IPatternInstance> patternApplicationOperation =
		 * new ApplyTemplatePatternOperation( _applicationSpec.getApplication(),
		 * true, "$name$", 1, 1,
		 * substitutes.iterator().next().getL().eResource(),
		 * substitutes.iterator().next().getR().eResource());
		 */

		final Resource RL = substitutes.iterator().next().getL().eResource();
		System.err.println("RL" + RL.getURI().toString());

		final Resource RR = substitutes.iterator().next().getR().eResource();

		System.err.println("RR" + RR.getURI().toString());

		doPerformFinish2(RL, RR);
		
		/*PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			public void run() {

				/*
				 * Shell activeShell = PlatformUI.getWorkbench()
				 * .getActiveWorkbenchWindow().getShell(); //
				 * System.err.println("shell " + activeShell);
				 * CorePatternsPlugin.getDefault().getModelEnvironment()
				 * .execute(patternApplicationOperation);
				 */
/*
				doPerformFinish2(RL, RR);				
			}

		});
*/
		return res;
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	public boolean applyStructuralOrganisationalPattern(
			List<Pair<EObject, EObject>> substitutes) {

		IPatternRole r = (IPatternRole) substitutes.iterator().next().getL();
		IPattern myPattern = r.getPattern();
		BasicPatternApplication applicationSpec = new BasicPatternApplication(
				myPattern);

		List<IPatternRole> rolestointegrate = new ArrayList<IPatternRole>();
		rolestointegrate.addAll(myPattern.getRoles());

		// rolestointegrate.removeAll(substitutes.keySet());

		EObject ob = null;

		for (Pair<EObject, EObject> entry : substitutes) {
			if (((TemplatePatternRole) entry.getL()).acceptsAddition()) {
				applicationSpec.addLocation((IPatternRole) entry.getL(),
				// new BasicReferenceLocation(entry.getR().eContainer(),
						new BasicElementLocation(entry.getR()));
				if (ob == null)
					ob = entry.getR();

			} else {
				rolestointegrate.remove(entry.getL());
			}
		}

		for (IPatternRole ob1 : rolestointegrate) {
			/*
			 * applicationSpec.addLocation( ob1, new
			 * BasicReferenceLocation(ob.eContainer(), ob
			 * .eContainmentFeature()));
			 */
			applicationSpec.addLocation((IPatternRole) ob1,
			// new BasicReferenceLocation(entry.getR().eContainer(),
					new BasicElementLocation(ob));
		}

		boolean res = applicationSpec.isComplete();
		// TODO
		/*
		 * final IModelOperation<IPatternInstance> patternApplicationOperation =
		 * new ApplyTemplatePatternOperation( applicationSpec, true, "$name$",
		 * 1, 1, null, null);
		 */
		Pair<EObject, EObject> current = substitutes.iterator().next();
		Resource patternRes = current.getL().eResource();
		Resource modelRes = current.getR().eResource();
		System.err.println("patternRes = " + patternRes);
		System.err.println("modelRes = " + modelRes);
		final IModelOperation<IPatternInstance> patternApplicationOperation = new ApplyTemplatePatternOperation(
				applicationSpec, true, "$name$", 1, 1, patternRes, modelRes);

		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				System.err.println("shell " + activeShell);
				IPatternInstance instance =CorePatternsPlugin.getDefault().getModelEnvironment()
						.execute(patternApplicationOperation);
				instances.add(instance);
			}
		});

		// com.thalesgroup.mde.shared.patterns.templates.engine.diffmerge.TemplatePatternApplicationComparison.updateModelStep
		// com.thalesgroup.mde.melody.patterns.advance.ext.MelodyAdvanceRuleProvider
		// a;
		return res;

	}

	
	
	protected void doPerformFinish2(Resource l, Resource r) {
		Map<Object, Point> elementsLocationsMap = new Hashtable<Object, Point>();
		Map<Object, Object> elementsContainersMap = new Hashtable<Object, Object>();
		if (_diagramToRefresh != null) {
			// Save current diagram elements locations
			for (Object diagramElement : _diagramUtil
					.getDiagramElements(_diagramToRefresh)) {
				if (_genericTypeUtil
						.isInstanceOfDiagramElementType(diagramElement)) {
					elementsLocationsMap.put(diagramElement,
							_diagramUtil.getLocation(diagramElement));
				}
			}
			// Save diagram elements containers
			for (Object diagramElement : _diagramUtil
					.getDiagramElements(_diagramToRefresh)) {
				if (_genericTypeUtil
						.isInstanceOfDiagramElementType(diagramElement)) {
					EObject container = _diagramUtil
							.getTechnicalContainerFor(diagramElement);
					if (_genericTypeUtil
							.isInstanceOfGraphicalContainerType(container)) {
						elementsContainersMap.put(diagramElement, container);
					}
				}
			}
		}
		boolean result = false;

		IPatternApplication application = _applicationSpec.getApplication();
		// boolean unfold = _applicationSpec.mustUnfoldWhenDone();
		boolean unfold = true;
		boolean display = _applicationSpec.mustDisplayWhenDone();

		RefreshRequestKind refreshRequest = display ? RefreshRequestKind.INSTANCE
				: unfold ? RefreshRequestKind.DIAGRAM : RefreshRequestKind.NONE;

		final int NB = _applicationSpec.getNumberOfApplications();
		// Create all instances before showing them all because of Doremi cache
		// for candidate elements of mappings

		/*
		 * List<IModelOperation<IPatternInstance>> applyOperations = new
		 * ArrayList<IModelOperation<IPatternInstance>>(NB); for (int i = 1; i
		 * <= NB; i++) { IModelOperation<IPatternInstance> mainOperation = new
		 * ApplyTemplatePatternOperation( application, unfold,
		 * _applicationSpec.getNamingRule(), i, 1
		 * ,substitutes.iterator().next().getL().eResource(),
		 * substitutes.iterator().next().getR().eResource());
		 * applyOperations.add(mainOperation); }
		 * 
		 * if (!applyOperations.isEmpty()) {
		 * IModelOperation<List<IPatternInstance>> applyAllOperation = new
		 * CompoundModelOperation<IPatternInstance>(
		 * applyOperations.get(0).getName(), applyOperations, null,
		 * applyOperations.get(0).getTargetContext(),
		 * applyOperations.get(0).getSourceContext());
		 */

		// Pattern application operation at semantic level
		IModelOperation<IPatternInstance> mainOperation = new ApplyTemplatePatternOperation(
				application, unfold, "$name$", 1, 1, l, r);
		// Put it into a composite operation
		IModelOperation<List<IPatternInstance>> applyAllOperation = new CompoundModelOperation<IPatternInstance>(
				mainOperation.getName(),
				Collections.singletonList(mainOperation), null,
				mainOperation.getTargetContext(),
				mainOperation.getSourceContext());
		AbstractGraphicalWrappingInstanceOperation<List<? extends IPatternInstance>> graphicalOperation = instantiateGraphicalWrappingInstanceOperation(
				applyAllOperation, _diagramToRefresh, refreshRequest);

		List<? extends IPatternInstance> instances = CorePatternsPlugin
				.getDefault().getModelEnvironment().execute(graphicalOperation);
		System.err.println("nombre instance "+ instances.size());
		this.instances.addAll(instances);
		// List<? extends IPatternInstance> instances = execute(mainOperation);
		result = instances != null && !instances.isEmpty();
		// After execution of the main operation because the GMF/Doremi
		// synchronization happens in post-commit listeners
		ISemanticRuleProvider ruleProvider = null;
		ruleProvider = TemplatePatternsEnginePlugin.getDefault()
				.getSemanticRuleProviderFor(_diagramToRefresh);
		if (result
				&& _applicationSpec.mustReuseLayout()
				&& _diagramToRefresh != null
				&& !ruleProvider
						.isAutomaticallyUpdatedDiagram(_diagramToRefresh)) {
			List<AbstractFilteredGraphicalUpdateOperation> layoutOperations = new ArrayList<AbstractFilteredGraphicalUpdateOperation>(
					instances.size());
			final int xOffset = MULTI_INSTANCE_OFFSET, yOffset = MULTI_INSTANCE_OFFSET;
			int currentVx = 0, currentVy = 0;
			for (IPatternInstance instance : instances) {
				AbstractFilteredGraphicalUpdateOperation layoutOperation = instantiateLayoutReuseOperation(
						_diagramToRefresh, instance, elementsLocationsMap,
						elementsContainersMap, currentVx, currentVy, true,
						true, _applicationSpec.getScopeElement());
				layoutOperations.add(layoutOperation);
				currentVx += xOffset;
				currentVy += yOffset;
			}

			CorePatternsPlugin
					.getDefault()
					.getModelEnvironment()
					.execute(
							new CompoundModelOperation<Collection<Object>>(
									layoutOperations.get(0).getName(),
									layoutOperations, null, layoutOperations
											.get(0).getTargetContext(),
									layoutOperations.get(0).getSourceContext()));
			// execute(new CompoundModelOperation<Collection<Object>>(
			// layoutOperations.get(0).getName(), layoutOperations, null,
			// layoutOperations.get(0).getTargetContext(),
			// layoutOperations.get(0).getSourceContext()));
		}
	}

	protected AbstractFilteredGraphicalUpdateOperation instantiateLayoutReuseOperation(
			Object diagram_p, IPatternInstance instance_p,
			Map initialElementsLocationsMap_p, Map elementsContainersMap_p,
			int vx_p, int vy_p, boolean updateLayout_p, boolean updateStyle_p,
			Object modelSideContext_p) {
		IPatternOperationFactory factory = PatternCoreDiagramPlugin
				.getDefault().getOperationFactory();
		if (factory != null)
			return factory.instantiateLayoutReuseOperation(diagram_p,
					instance_p, initialElementsLocationsMap_p,
					elementsContainersMap_p, vx_p, vy_p, updateLayout_p,
					updateStyle_p, modelSideContext_p);
		else
			return null;
	}

	protected AbstractGraphicalWrappingInstanceOperation instantiateGraphicalWrappingInstanceOperation(
			IModelOperation<List<IPatternInstance>> operation_p,
			Object diagram_p, RefreshRequestKind refreshRequest_p) {
		IPatternOperationFactory factory = PatternCoreDiagramPlugin
				.getDefault().getOperationFactory();
		if (factory != null)

			return factory.instantiateGraphicalWrappingInstanceOperation(
					operation_p, diagram_p, refreshRequest_p, true);

		else
			return null;
	}

	private static final int MULTI_INSTANCE_OFFSET = 10;

	
	
	public EObject getRealObject(EObject sub) {
		System.err.println("ok arrive jusqye là " + sub);
		//TODO Manager substitution
		//Last pattern instances
		IPatternInstance instance = null;
		if (instances.size()>0){
			 instance = instances.get(instances.size()-1);
			//System.err.println( instance.getLocation((IPatternRole) sub));
			TemplatePatternDataImpl data = (TemplatePatternDataImpl) instance.getPatternData();
			
			System.err.println(data.getCounterpart(sub, true));
			//System.err.println(data.getCounterpart(sub, false));
/*			for (EObject o :data.getInstanceElements()){
				System.err.println(o.eClass() + "  " + o);
			}*/
			return data.getCounterpart(sub, true);
			
		}

		
		//System.err.println(sub.eClass().getEStructuralFeature("id"));
		//TODO Looking for the good object corresponding to sub 
		
		
		
		return null;
	}

	
}



class MyPrintStream extends PrintStream {

	public MyPrintStream(OutputStream out) {
		super(out);
	}

}
