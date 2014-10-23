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
package fr.inria.exec_derivation.core;

import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import org.eclipse.emf.diffmerge.patterns.core.api.IPatternInstance;
import org.eclipse.emf.diffmerge.patterns.core.api.IPatternRole;
import org.eclipse.emf.diffmerge.patterns.core.api.ext.IModelOperation;
import org.eclipse.emf.diffmerge.patterns.core.util.BasicPatternApplication;
import org.eclipse.emf.diffmerge.patterns.core.util.locations.BasicCompositeLocation;
import org.eclipse.emf.diffmerge.patterns.core.util.locations.BasicElementLocation;
import org.eclipse.emf.diffmerge.patterns.core.util.locations.BasicReferenceLocation;
import org.eclipse.emf.diffmerge.patterns.repositories.catalogs.operations.OpenCatalogOperation;
import org.eclipse.emf.diffmerge.patterns.templates.engine.operations.ApplyTemplatePatternOperation;
import org.eclipse.emf.diffmerge.patterns.templates.gen.templatepatterns.TemplatePatternRole;
import org.eclipse.emf.diffmerge.patterns.templates.gen.templatepatterns.impl.TemplatePatternRoleImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.swt.SWT;
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

import com.thales.movida.derivation.service.SemanticDeleteOfObject;

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

	Resource resolvedModelRes;

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
				.getConfigurationElementsFor("fr.inria.cvl.derivationengine.cvlderivationsemanticsextension")) {

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
				/*
				 * for (Resource res1 : v.getDomainResources()) { URI newuri =
				 * res1.getURI(); newuri = newuri.trimFileExtension(); newuri =
				 * URI.createURI(newuri.toString() + "_new");
				 * System.err.println("newuri " + newuri); newuri =
				 * newuri.appendFileExtension(res1.getURI() .fileExtension());
				 * Resource copy = domain.getResourceSet().createResource(
				 * newuri); EcoreUtil.Copier copier = new EcoreUtil.Copier();
				 * 
				 * for (EObject root : res1.getContents()) {
				 * copy.getContents().add(copier.copy(root)); }
				 * copier.copyReferences(); try {
				 * copy.save(Collections.emptyMap()); } catch (IOException e) {
				 * e.printStackTrace(); }
				 * 
				 * }
				 */

			}
		});

		// We undo the command to not keep some modifications in base model
		// resource
		// domain.getCommandStack().undo();

	}

	public boolean includePattern(List<Pair<EObject, EObject>> substitutes) {

		IPatternRole r = (IPatternRole) substitutes.iterator().next().getL();
		IPattern myPattern = r.getPattern();
		System.err.println(resolvedModelRes.getURI());
		BasicPatternApplication applicationSpec = new BasicPatternApplication(
				myPattern);
		for (Pair<EObject, EObject> entry : substitutes) {
			applicationSpec.addLocation((IPatternRole) entry.getL(),
					new BasicReferenceLocation(entry.getR().eContainer(), entry
							.getR().eContainmentFeature()));
		}

		// applicationSpec.addLocation(�);
		// Demande-moi si c�est pas clair : pour chaque r�le du pattern
		// il faut une ILocation
		// qui d�termine comment le r�le est � appliqu� � : soit par
		// ajout des �l�ments du r�le dans
		// un �l�ment du mod�le via une r�f�rence de containment
		// (BasicReferenceLocation),
		// soit par fusion avec un �l�ment du mod�le
		// (BasicElementLocation).
		// Tu peux faire applicationSpec.isComplete() pour v�rifier que
		// tout est par�.
		// Si applicationSpec.isComplete(), on poursuit.
		boolean res = applicationSpec.isComplete();
		IModelOperation<IPatternInstance> patternApplicationOperation = new ApplyTemplatePatternOperation(
				applicationSpec, true, "$name$", 1, 1,
				substitutes.iterator().next().getL().eResource(),
				substitutes.iterator().next().getR().eResource());
		CorePatternsPlugin.getDefault().getModelEnvironment()
				.execute(patternApplicationOperation);

		return res;
	}

	public boolean fusionPattern(List<Pair<EObject, EObject>> substitutes) {
		TemplatePatternRoleImpl r = (TemplatePatternRoleImpl) substitutes.iterator().next().getL();
		//IPatternRole r = (IPatternRole) substitutes.iterator().next().getL();
		IPattern myPattern = r.getPattern();

		BasicPatternApplication applicationSpec = new BasicPatternApplication(
				myPattern);

		List<IPatternRole> rolestointegrate = new ArrayList<IPatternRole>();
		rolestointegrate.addAll(myPattern.getRoles());
		for (Pair<EObject, EObject> re : substitutes) {
			if (rolestointegrate.contains(re.getL()))
				rolestointegrate.remove(re.getL());

		}

		EObject ob = null;

		Map<EObject, EList<EObject>> composite = new HashMap<EObject, EList<EObject>>();

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
					applicationSpec.addLocation((IPatternRole) entry.getKey(),
							new BasicElementLocation(entry.getValue().get(0)));
				}
			}else{
				if (ob == null)
					ob = entry.getValue().get(0);
				{
					BasicCompositeLocation loc = new BasicCompositeLocation();
					for (EObject atomics :entry.getValue() ){
						loc.getOwnedLocations().add(new BasicElementLocation(atomics));
					}
					applicationSpec.addLocation((IPatternRole) entry.getKey(),
							loc);
				}
			}
			// BasicCompositeLocation loc = new BasicCompositeLocation();
			// loc.getOwnedLocations().add(new BasicElementLocation(element_p))

		}

		for (IPatternRole ob1 : rolestointegrate) {
			applicationSpec.addLocation(
					ob1,
					new BasicElementLocation(ob.eContainer()));
					/*new BasicReferenceLocation(ob.eContainer(), ob
							.eContainmentFeature()));*/
		}

		boolean res = applicationSpec.isComplete();

		/*final IModelOperation<IPatternInstance> patternApplicationOperation = new ApplyTemplatePatternOperation(
				applicationSpec, true, "$name$", 1, 1,null,null);*/
		final IModelOperation<IPatternInstance> patternApplicationOperation = new ApplyTemplatePatternOperation(
				applicationSpec, true, "$name$", 1, 1,
				substitutes.iterator().next().getL().eResource(),
				substitutes.iterator().next().getR().eResource());

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				// System.err.println("shell " + activeShell);
				CorePatternsPlugin.getDefault().getModelEnvironment()
						.execute(patternApplicationOperation);
			}
		});

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

	@Override
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
						//new BasicReferenceLocation(entry.getR().eContainer(),
						new BasicElementLocation(entry.getR()));
				if (ob == null)
					ob = entry.getR();

			} else {
				rolestointegrate.remove(entry.getL());
			}
		}

		for (IPatternRole ob1 : rolestointegrate) {
			/*applicationSpec.addLocation(
					ob1,
					new BasicReferenceLocation(ob.eContainer(), ob
							.eContainmentFeature()));*/
			applicationSpec.addLocation((IPatternRole) ob1,
					//new BasicReferenceLocation(entry.getR().eContainer(),
					new BasicElementLocation(ob));
		}

		boolean res = applicationSpec.isComplete();
		//TODO
		/*final IModelOperation<IPatternInstance> patternApplicationOperation = new ApplyTemplatePatternOperation(
				applicationSpec, true, "$name$", 1, 1, null, null);*/
		Pair<EObject, EObject> current = substitutes.iterator().next() ;
		Resource patternRes = current.getL().eResource();
		Resource modelRes = current.getR().eResource();
		System.out.println("patternRes = " + patternRes);
		System.out.println("modelRes = " + modelRes);
		final IModelOperation<IPatternInstance> patternApplicationOperation = new ApplyTemplatePatternOperation(
				applicationSpec, true, "$name$", 1, 1, patternRes, modelRes);

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				System.err.println("shell " + activeShell);
				CorePatternsPlugin.getDefault().getModelEnvironment()
						.execute(patternApplicationOperation);
			}
		});

		// com.thalesgroup.mde.shared.patterns.templates.engine.diffmerge.TemplatePatternApplicationComparison.updateModelStep
		// com.thalesgroup.mde.melody.patterns.advance.ext.MelodyAdvanceRuleProvider
		// a;
		return res;

	}
}

class MyPrintStream extends PrintStream {

	public MyPrintStream(OutputStream out) {
		super(out);
	}

}
