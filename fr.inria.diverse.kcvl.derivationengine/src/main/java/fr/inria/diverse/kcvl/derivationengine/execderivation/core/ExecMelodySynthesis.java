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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.factory.SessionFactory;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.omg.CVLMetamodelMaster.cvl.VPackage;

import fr.inria.diverse.kcvl.extensions.SemanticDeleteOfObject;

//import fr.inria.diverse.kcvl.interpreter.CVLSynthesis;
import fr.inria.diverse.kcvl.interpreter.Derivator;
import fr.inria.diverse.kcvl.interpreter.Pair;
import fr.inria.diverse.kcvl.interpreter.PatternIntegration;

//  Cloner un model melody Ok
//Ouvrir programmatiquement une session avec un model melody et un modele cvl de choix.
// Creer VRM OK. Binder API 
// Creer Configuration OK  binder API
// Deriver OK. binder API
// Checker modèle Melody ok

public class ExecMelodySynthesis implements PatternIntegration {

	List<String> excludingExtensions;

	/**
	 * This method permits to execute product derivation
	 * 
	 * 
	 * @resolutionModelPath : the path for the resolution model where user
	 *                      choices (selected or unselected features are stored)
	 */
	SemanticDeleteOfObject toD;

	int j;

	public void delete(File file) throws IOException {

		if (file.isDirectory()) {

			// directory is empty, then delete it
			if (file.list().length == 0) {

				file.delete();
			} else {

				// list all the directory contents
				String files[] = file.list();

				for (String temp : files) {
					// construct the file structure
					File fileDelete = new File(file, temp);

					// recursive delete
					delete(fileDelete);
				}

				// check the directory again, if empty then delete it
				if (file.list().length == 0) {
					file.delete();
				}
			}

		} else {
			// if file, then delete it
			file.delete();
		}
	}

	File output = null;

	public void copyDirectory(File sourceLocation, File targetLocation)
			throws IOException {
		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}

			String[] children = sourceLocation.list();
			for (int i = 0; i < children.length; i++) {
				copyDirectory(new File(sourceLocation, children[i]), new File(
						targetLocation, children[i]));
			}
		} else {

			InputStream in = new FileInputStream(sourceLocation);
			OutputStream out = null;
			if (targetLocation.isDirectory()) {
				out = new FileOutputStream(targetLocation + "/"
						+ sourceLocation.getName());
			} else
				out = new FileOutputStream(targetLocation);

			// Copy the bits from instream to outstream
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
				out.flush();
			}
			in.close();
			out.close();
		}
	}

	Session s = null;

	EClass eclassTested;
	List<EClass> eclassTesteds = new ArrayList<EClass>();
	List<EClass> eclassTesteds1 = new ArrayList<EClass>();
	
	/*public void callSynthesis(final URI file, final IFile cvlfile) {
		eclassTesteds = new ArrayList<EClass>();
		eclassTesteds1 = new ArrayList<EClass>();
		final long initial_time= System.currentTimeMillis();
		
		for (int k = 0; k < 200; k++) {
			try {
				s = SessionFactory.INSTANCE.createDefaultSession(file
						.trimFileExtension().appendFileExtension("aird"));
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			s.open(new NullProgressMonitor());

			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			final IWorkspaceRoot root = workspace.getRoot();

			j = k;
			// System.err.println(root.getFolder(cvlfile.getParent().getLocation()).getFolder("/target").getFullPath().toOSString());

			output = new File(root.getFolder(cvlfile.getParent().getLocation())
					.getFolder("/target" + j).getFullPath().toOSString());
			if (!output.exists())
				output.mkdir();
			try {

				copyDirectory(cvlfile.getLocation().toFile(), output);
				copyDirectory(cvlfile.getLocation().removeFileExtension()
						.addFileExtension("melodymodeller").toFile(), output);
				cvlfile.getParent().refreshLocal(2, new NullProgressMonitor());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// cvlfile.getParent().getFullPath().append("/target")
			//String filef = file.createFileURI(file.path()).toFileString();

			// System.err.println(filef.substring(0,
			// filef.lastIndexOf(file.lastSegment())));

			// copyDirectory(;

			final TransactionalEditingDomain domain = s
					.getTransactionalEditingDomain();


			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				protected void doExecute() {

					// ADD Melody

					// s.addSemanticResource(file.trimFileExtension()
					// .appendFileExtension("melodymodeller"), true);

					//System.err.println(s.getSemanticResources().size());
					Collection<Resource> resouces = s.getSemanticResources();
					for (Resource resto : resouces){
						s.removeSemanticResource(resto,new NullProgressMonitor());
					}
					s.addSemanticResource(
							URI.createFileURI(root
									.getFolder(
											cvlfile.getParent().getLocation())
									.getFolder("/target" + j)
									.getFullPath()
									.append(file
											.trimFileExtension()
											.appendFileExtension(
													"melodymodeller")
											.lastSegment()).toOSString()), new NullProgressMonitor());

					// ADD CVL

					// s.addSemanticResource(file, true);
					s.addSemanticResource(
							URI.createFileURI(root
									.getFolder(
											cvlfile.getParent().getLocation())
									.getFolder("/target" + j)
									.getFullPath()
									.append(file.trimFileExtension()
											.appendFileExtension("cvl")
											.lastSegment()).toOSString()), new NullProgressMonitor());

					Resource melodyres = null;
					Resource cvlres = null;

					for (Resource res1 : s.getSemanticResources()) {
						if (res1.getURI().fileExtension()
								.equals("melodymodeller")) {
							melodyres = res1;
							//System.err.println(melodyres.getURI());
						} else if (res1.getURI().fileExtension().equals("cvl")) {
							cvlres = res1;
						}
					}
					if (melodyres != null) {
						if (!melodyres.isLoaded()) {
							try {
								melodyres.load(Collections.EMPTY_MAP);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					} else {
						System.err.println("melodyres is null");
					}
					if (cvlres != null) {
						if (!cvlres.isLoaded()) {
							try {
								cvlres.load(Collections.EMPTY_MAP);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					} else {
						System.err.println("cvlres is null");
					}
					// Check Melody Model
					Diagnostic c = Diagnostician.INSTANCE.validate(melodyres
							.getContents().get(0));
					int numberofWarning = c.getChildren().size();
					//System.err.println(numberofWarning);
//					int numberofError = c.getChildren().size();
//					
//					for (Diagnostic diag : c.getChildren()){
//						if (diag.getSeverity() == 4){
//							numberofError =numberofError +1;
//						}
//						
//					}
					
					CVLSynthesis synthesis = new CVLSynthesis();
					 eclassTested = synthesis.generateVRM(melodyres.getContents().get(0),
							(VPackage) cvlres.getContents().get(0),true);
					 eclassTesteds1.add(eclassTested);
					synthesis.generateConfig((VPackage) cvlres.getContents()
							.get(0),true);

					try {
						cvlres.save(Collections.EMPTY_MAP);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					final Derivator v = new Derivator();
					v.setPatternintegration(ExecMelodySynthesis.this);

					IExtensionRegistry extensionRegistry = Platform
							.getExtensionRegistry();

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

					XtextResourceSet rs = new XtextResourceSet();
					v.setResourceSet(rs);
					MessageConsole myConsole = findConsole("cvl");
					MessageConsoleStream out = myConsole.newMessageStream();
					PrintStream oldout = System.out;
					System.setOut(new PrintStream(out));
					v.start((VPackage) cvlres.getContents().get(0));
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
//						
//						 * System.err.println("toremove " + toRemove.size());
//						 * for (EObject o : toRemove) { System.err.println(o);
//						 * System.err.println(SessionManager.INSTANCE
//						 * .getSession(o)); System.err.println(o.eResource()); }
//						 
						// TODO JLN try Again
						// System.err.println(v.getDomainResources());
						// if
						// (v.getDomainResources().get(0).getURI().fileExtension()
						// .equals("melodymodeller")) {
							// TODO JLN monitor delete false
						
						TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(toRemove.get(0));

						if (domain != null) {	DeleteCommand mdc = new DeleteCommand(
									domain, toRemove);

							if (mdc.canExecute()) {
								// System.err.println("pass par là");
								mdc.execute();

//								try {
//									cvlres.save(Collections.EMPTY_MAP);
//									melodyres.save(Collections.EMPTY_MAP);
//								} catch (IOException e1) {
//									// TODO Auto-generated catch block
//									e1.printStackTrace();
//								}
								
								
								//System.err.println(melodyres.getURI());
								
								Diagnostic c1 = Diagnostician.INSTANCE
										.validate(melodyres.getContents()
												.get(0));
								//System.err.println(Diagnostician.INSTANCE.getClass());
								
								int numberofWarning1 = c1.getChildren().size();
								//System.err.println(numberofWarning1);
								boolean counterexample = false;
								for (Diagnostic diag : c1.getChildren()) {
									if (diag.getSeverity() == 4) {
										
										System.err.print(eclassTested.getName() +";");
										System.err.print(diag.getMessage()+";");
//										
//										System.err.print(diag.get + ";");
										counterexample = true;
										break;
									}
								}
								//counterexample = counterexample
								//		|| (numberofWarning1 > numberofWarning);

								//s.save(new NullProgressMonitor());
								s.close(new NullProgressMonitor());

								if (!counterexample || eclassTesteds.contains(eclassTested) ) {
									try {
										delete(output);
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
								else{
									//System.err.println("time: "+(System.currentTimeMillis() - initial_time));
									if ( !eclassTesteds.contains(eclassTested))
										eclassTesteds.add(eclassTested);
								}
							}
						}
					}
				}
			});
		}
		for (EClass c : eclassTesteds1){
			System.err.println(c.getName());
		}
	}*/

	public boolean includePattern(List<Pair<EObject, EObject>> substitutes) {

		return false;
	}

	public boolean fusionPattern(List<Pair<EObject, EObject>> substitutes) {

		return false;
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
		return false;

	}


	
}
