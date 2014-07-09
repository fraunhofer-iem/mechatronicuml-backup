/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package de.uni_paderborn.fujaba.muml.model.gen.c.ui.popupMenus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import de.uni_paderborn.fujaba.muml.model.gen.c.ui.Activator;
import de.uni_paderborn.fujaba.muml.model.gen.c.ui.common.GenerateAll;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.osgi.framework.Bundle;

/**
 * C code generation.
 */
public class GenerateCForCIC extends ActionDelegate implements IActionDelegate {
	
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		if (files != null) {
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						Iterator<IFile> filesIt = files.iterator();
						while (filesIt.hasNext()) {
							IFile model = (IFile)filesIt.next();
							URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
							try {
								Bundle bundle = Platform.getBundle(de.uni_paderborn.fujaba.muml.model.gen.c.Activator.PLUGIN_ID);
								System.out.println(bundle.toString());
								IContainer target = model.getProject().getFolder("src-gen");
								GenerateAll generator = new GenerateAll(modelURI, target, getArguments());
								generator.doGenerate(monitor);
								URL resources = FileLocator.toFileURL(bundle.getEntry("resources"));
								File sourceFolder = new File(resources.toURI());
								File targetFolder = new File(model.getProject().getFolder("src-gen").getLocationURI());
								copyFolder(sourceFolder, targetFolder);
							} catch (IOException e) {
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
								Activator.getDefault().getLog().log(status);
							} finally {
								model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
							}
						}
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
					catch (URISyntaxException e){}
				}
			};
			try {
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}
	
	public void copyFolder(File sourceLocation , File targetLocation) throws IOException 
	{
	    if (sourceLocation.isDirectory()) 
	    {
	        if (!targetLocation.exists()) 
	        {
	            targetLocation.mkdir();
	        }
	        String[] subFolder = sourceLocation.list();
	        for (int i=0; i<subFolder.length; i++) 
	        {
	            copyFolder(new File(sourceLocation, subFolder[i]),
	                    new File(targetLocation, subFolder[i]));
	        }
	    } 
	    else 
	    {
	        byte[] buffer = new byte[1024];
	        int x;
	        InputStream input = new FileInputStream(sourceLocation);
	        OutputStream output = new FileOutputStream(targetLocation);
	        
	        while ((x = input.read(buffer)) > 0) 
	        {
	            output.write(buffer, 0, x);
	        }
	        input.close();
	        output.close();
	    }
	}


}