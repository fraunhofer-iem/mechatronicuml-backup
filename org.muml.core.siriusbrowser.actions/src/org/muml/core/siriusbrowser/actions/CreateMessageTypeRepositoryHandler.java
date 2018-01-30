package org.muml.core.siriusbrowser.actions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.internal.messages.Msg;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.pim.msgtype.MsgtypeFactory;

public class CreateMessageTypeRepositoryHandler extends AbstractHandler {
	private Shell shell;

	protected Shell getShell() {
		return shell;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			Object object = ((IStructuredSelection) selection).getFirstElement();
			if (object instanceof IContainer) {
				IContainer container = (IContainer) object;
				IFile file = null;
				int id = 1;
				do {
					file = container.getFile(new Path("repository" + id + ".messagetype"));
					id++;
				} while (file.exists());
				
				ResourceSet resourceSet = new ResourceSetImpl();
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource resource = resourceSet.createResource(uri, "xmi");
				resource.getContents().add(MsgtypeFactory.eINSTANCE.createMessageTypeRepository());
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