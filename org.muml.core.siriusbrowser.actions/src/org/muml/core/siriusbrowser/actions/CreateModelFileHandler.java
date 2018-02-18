package org.muml.core.siriusbrowser.actions;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateModelFileHandler extends AbstractHandler {
	// private Shell shell;
	//
	// protected Shell getShell() {
	// return shell;
	// }

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		EObject modelElement = null;

		// get package uri
		EPackage ePackage = null;
		EFactory eFactory = null;
		{
			String packageUri = event.getParameter("org.muml.core.siriusbrowser.actions.parameters.epackage");
			if (packageUri != null) {
				ePackage = EPackage.Registry.INSTANCE.getEPackage(packageUri);
				if (ePackage != null) {
					eFactory = ePackage.getEFactoryInstance();
				}
			}
			
		}

		// get eclass name
		EClass eClass = null;
		{
			String eClassName = event.getParameter("org.muml.core.siriusbrowser.actions.parameters.eclass");
			if (eClassName != null) {
				if (ePackage != null) {
					EClassifier eClassifier = ePackage.getEClassifier(eClassName);
					if (eClassifier instanceof EClass) {
						eClass = (EClass) eClassifier;
					}
				}
			}
		}

		if (eFactory != null && eClass != null) {
			modelElement = eFactory.create(eClass);
		}

		if (modelElement == null) {
			throw new UnsupportedOperationException("Creating Model Element failed!");
		}
		
		// Get filename hint
		String filenameHint = "muml.xmi";
		{
			String paramFilenameHint = event.getParameter("org.muml.core.siriusbrowser.actions.parameters.filename");
			if (paramFilenameHint != null && !paramFilenameHint.isEmpty()) {
				filenameHint = paramFilenameHint;
			}
		}

		// Extract filename base and extension
		String filenameBase = "", filenameExtension = filenameHint;
		int filenameSplit = filenameHint.lastIndexOf('.');
		if (filenameSplit > 0) {
			filenameBase = filenameHint.substring(0, filenameSplit);
			filenameExtension = filenameHint.substring(filenameSplit);
		}
		
		
		// shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			Object object = ((IStructuredSelection) selection).getFirstElement();
			if (object instanceof IContainer) {
				IContainer container = (IContainer) object;
				IFile file = null;
				int id = 1;
				do {
					file = container.getFile(new Path(filenameBase + id + filenameExtension));
					id++;
				} while (file.exists());

				ResourceSet resourceSet = new ResourceSetImpl();
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource resource = resourceSet.createResource(uri, "xmi");
				resource.getContents().add(modelElement);
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					file.refreshLocal(1, new NullProgressMonitor());

				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}