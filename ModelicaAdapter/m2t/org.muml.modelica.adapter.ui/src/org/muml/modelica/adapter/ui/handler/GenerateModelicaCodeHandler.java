package org.muml.modelica.adapter.ui.handler;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.modelica.adapter.ui.Activator;
import org.muml.modelica.adapter.ui.common.Generator;
import org.muml.pim.instance.ComponentInstanceConfiguration;

public class GenerateModelicaCodeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		generateCode(getFiles(event));
		return null;
	}
	
	private static List<IFile> getFiles(ExecutionEvent event) {
		List<IFile> fileList = new ArrayList<IFile>();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			for (Object item : ((IStructuredSelection) selection).toList()) {
				if (item instanceof IFile) {
					fileList.add((IFile) item);
				}
			}
		}
		return fileList;
	}
	
	private static void generateCode(final List<IFile> files) {
		// copied from generated AcceleoGenerateModelicaCodeGeneratorAction
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				Iterator<IFile> filesIt = files.iterator();
				while (filesIt.hasNext()) {
					IFile model = (IFile)filesIt.next();
					ComponentInstanceConfiguration cic = getCIC(model);
					if (cic == null) {
						throw new IllegalArgumentException(model.getName()
								+ ": no cic found");
					}
					IFolder directory = model.getProject().getFolder("src-gen");
					try {
						// wrap potential exception into unchecked RTE.
						Generator.generateCode(cic, directory, monitor);
					} catch (CoreException e) {
						throw new RuntimeException(e);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
			}
		};
		
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
		} catch (InvocationTargetException e) {
			logError(e);
		} catch (InterruptedException e) {
			logError(e);
		} catch (RuntimeException e) {
			logError(e);
		}
	}
	
	private static ComponentInstanceConfiguration getCIC(IFile file) {
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		TreeIterator<EObject> tit = resource.getAllContents();
		while (tit.hasNext()) {
			EObject object = tit.next();
			if ((object instanceof ComponentInstanceConfiguration)
					&& ((ComponentInstanceConfiguration) object).getParentStructuredComponentInstance() == null) {
				return (ComponentInstanceConfiguration) object;
			}
		}
		return null;
	}
	
	private static void logError(String message, Throwable e) {
		IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, e);
		Activator.getDefault().getLog().log(status);
	}
	
	private static void logError(Throwable e) {
		logError(e.getMessage(), e);
	}
	
}
