package de.uni_paderborn.fujaba.modelica.m2t.ui.handler;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.modelica.m2t.ui.Activator;
import de.uni_paderborn.fujaba.modelica.m2t.ui.common.GenerateAll;

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
				try {
					Iterator<IFile> filesIt = files.iterator();
					while (filesIt.hasNext()) {
						IFile model = (IFile)filesIt.next();
						URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
						try {
							IContainer target = model.getProject().getFolder("src-gen");
							GenerateAll generator = new GenerateAll(modelURI, target, Collections.<Object>emptyList());
							generator.doGenerate(monitor);
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
