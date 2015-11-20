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
package fr.inria.diverse.kcvl.derivationengine.execderivation.popup.actions;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.RemoveSemanticResourceCommand;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.inria.diverse.kcvl.derivationengine.execderivation.core.ExecDerivation;
import fr.inria.diverse.kcvl.derivationengine.utils.PathMethod;
import fr.inria.diverse.kcvl.derivationengine.utils.Test;

/** This class defines the action of the popup menu for the derivation*/
public class AllProductsDerivationAction implements IObjectActionDelegate {

	private Shell shell;
	
	/**
	 * File selected by the user
	 */
	private ISelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public AllProductsDerivationAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if ((selection instanceof IStructuredSelection)) {


            IStructuredSelection structured = (IStructuredSelection)selection;
            final Object object = structured.getFirstElement();


            // if the selection is a valid project file, get its name.
            if (object instanceof IFile) {
            	// Retrieve feature diagram path
                IFile resolutionModelFile = (IFile) object;
              final  String resolutionModelPath = "file:/" + resolutionModelFile.getLocation().toString();
              System.out.println("resolutionModelPath " + resolutionModelPath);
             final URI file  =URI.createPlatformResourceURI(resolutionModelFile.getFullPath().toString(), true);
              
              //----------------------------------------------------------
            final  String resolvedModelPath = PathMethod.getResolvedModelPath(resolutionModelPath) ;
              System.out.println("resolvedModelPath " + resolvedModelPath);
              //----------------------------------------------------------

                // Call Selection
                new Job("Console cvl derivation") {
    				public IStatus run(IProgressMonitor pm) {
    					for (Session s : SessionManager.INSTANCE.getSessions()) {
    						for (Resource r : s.getSemanticResources()) {
    							String ext = "kcvl";
    							if (ext.equals(r.getURI().fileExtension())) {
    								RemoveSemanticResourceCommand removeCommandFromSession = new RemoveSemanticResourceCommand(
    										s, r, true, null);
    								s.getTransactionalEditingDomain().getCommandStack()
    								        .execute(removeCommandFromSession);
    							}
    						}
    					}
    					for (Session s : SessionManager.INSTANCE.getSessions()) {
    						for (Resource r : s.getSemanticResources()) {
    							System.out.println(r.getURI() + " BEFOREIN " + s);
    						}
    					}
    					try {
							Test t = new Test();
							List<URI> allUris = t.test(file);
							ExecDerivation exec = new ExecDerivation();
							for (int i = 0; i < allUris.size(); i++) {
								exec.callProductDerivation(allUris.get(i));
							}


							((IFile)object).getParent().refreshLocal(1,pm);
						} catch (Exception e) {
							e.printStackTrace();
						}

    					return Status.OK_STATUS;
    				}
    			}.schedule(); 
				
            } else {
                throw new IllegalArgumentException(
                        "Object is not Instance of IFile");
            }
        } else {
            throw new IllegalArgumentException(
                    "Selection is not an IStructuredSelection");
        }
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
	
	

}
