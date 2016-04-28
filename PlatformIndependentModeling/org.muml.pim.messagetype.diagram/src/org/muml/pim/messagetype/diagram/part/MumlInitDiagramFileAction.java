package org.muml.pim.messagetype.diagram.part;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.modelinstance.ModelinstanceFactory;
import org.muml.core.modelinstance.ui.handlers.AbstractCreateDiagramFileCommand;

/**
 * @generated
 */
public class MumlInitDiagramFileAction extends AbstractCreateDiagramFileCommand {

	/**
	 * @generated
	 */
	public static class CreateDiagramElement extends AbstractHandler {

		/**
		 * @generated
		 */
		@Override
		public Object execute(ExecutionEvent event) throws ExecutionException {
			// Get shell and uri of current selection
			//			org.eclipse.swt.widgets.Shell shell = org.eclipse.ui.handlers.HandlerUtil.getActiveWorkbenchWindow(event).getShell();
			ISelection selection = HandlerUtil.getCurrentSelection(event);
			IResource selectedResource = null;
			if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
				Object object = ((IStructuredSelection) selection).getFirstElement();
				if (object instanceof IResource) {
					selectedResource = (IResource) object;
				} else if (object instanceof IAdaptable) {
					selectedResource = (IResource) ((IAdaptable) object).getAdapter(IResource.class);
				}
			}
			if (selectedResource instanceof IContainer) {
				// Get a unique filename for the new file
				IPath filePath = selectedResource.getFullPath();
				String fileName = MumlDiagramEditorUtil.getUniqueFileName(filePath, "ModelElementCategory",
						"modelelementcategory");
				// Create the new file
				ResourceSet resourceSet = new ResourceSetImpl();
				URI uri = URI.createPlatformResourceURI(filePath.append(fileName).toString(), true);
				Resource resource = resourceSet.createResource(uri);
				EObject model = ModelinstanceFactory.eINSTANCE.createModelElementCategory();
				resource.getContents().add(model);
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					MessageTypeDiagramEditorPlugin.getInstance().logError("Could not create child element", e);
				}
			}
			return null;
		}
	}

	/**
	 * @generated
	 */
	@Override
	public void setCharset(IFile diagramFile) {
		MumlDiagramEditorUtil.setCharset(diagramFile);
	}

	/**
	 * @generated
	 */
	@Override
	public String getUniqueFilename(String hint, String extension, IPath filePath) {
		return MumlDiagramEditorUtil.getUniqueFileName(filePath, hint, extension);
	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return MumlDiagramEditor.ID;

	}
}
