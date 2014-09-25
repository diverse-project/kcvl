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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

import fr.varymde.cvl.vary.CVL2Familiar;

/**
 * This class permits to execute product derivation from a given resolution
 * model to obtain a resolved model (product model)
 * 
 * @author mgouyett
 * 
 */
public class ExecToFamiliar {

	Resource resolvedModelRes;

	List<String> excludingExtensions;
	String fi;

	public ExecToFamiliar(String resolvedModelPath) {
		fi = resolvedModelPath;
	}

	/**
	 * This method permits to execute product derivation
	 * 
	 * 
	 * @resolutionModelPath : the path for the resolution model where user
	 *                      choices (selected or unselected features are stored)
	 */
	public void callReportProduction(URI file) {
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

		// Retrieve the URI file in the session
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
		


		// Retrieve session
		final Session sess = SessionManager.INSTANCE
				.getSession(resolvedModelRes);
		final TransactionalEditingDomain domain = sess
				.getTransactionalEditingDomain();

		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {

				// Derive domain model

				MessageConsole myConsole = findConsole("cvl");
				MessageConsoleStream out = myConsole.newMessageStream();
				PrintStream oldout = System.out;
				System.setOut(new PrintStream(out));
				//CVL2Familiar cvl2Familiar = CVL2Familiar.toFamiliar(null);//new CVL2Familiar();
				String s = CVL2Familiar.toFamiliar((VPackage) resolvedModelRes.getContents().get(0));
				
				
				URI newuri = resolvedModelRes.getURI();
				newuri = newuri.trimFileExtension();

				File f = new File(fi + ".fml");
				FileOutputStream fo=null;
				try {
					fo = new FileOutputStream(f);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				PrintWriter p = new PrintWriter(fo);
				p.println("fm1 = " + s);
				p.println("c = counting fm1");
				p.println("d = cores fm1");
				p.println("e = deads fm1");
				p.println("println c");
				p.println("println d");
				p.println("println e");
				
				
				p.flush();
				try {
					fo.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				System.err.println(s);
				try {
					System.out.println(new ToFamiliar().generateReport(s));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				System.setOut(oldout);
								;

			}
		});

		// We undo the command to not keep some modifications in base model
		// resource
		domain.getCommandStack().undo();

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
}

