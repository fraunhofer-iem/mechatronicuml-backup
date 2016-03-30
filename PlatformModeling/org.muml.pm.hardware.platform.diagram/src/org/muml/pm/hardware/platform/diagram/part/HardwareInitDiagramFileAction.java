package org.muml.pm.hardware.platform.diagram.part;

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
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @generated
 */
public class HardwareInitDiagramFileAction
		extends org.muml.core.modelinstance.ui.handlers.AbstractCreateDiagramFileCommand {

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
				String fileName = org.muml.pm.hardware.platform.diagram.part.HardwareDiagramEditorUtil
						.getUniqueFileName(filePath, "HWPlatform", "hwplatform");
				// Create the new file
				ResourceSet resourceSet = new ResourceSetImpl();
				URI uri = URI.createPlatformResourceURI(filePath.append(fileName).toString(), true);
				Resource resource = resourceSet.createResource(uri);
				EObject model = org.muml.pm.hardware.hwplatform.HwplatformFactory.eINSTANCE
						.createHWPlatform();
				resource.getContents().add(model);
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
							.getInstance().logError("Could not create child element", e);
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
		org.muml.pm.hardware.platform.diagram.part.HardwareDiagramEditorUtil.setCharset(diagramFile);
	}

	/**
	 * @generated
	 */
	@Override
	public String getUniqueFilename(String hint, String extension, IPath filePath) {
		return org.muml.pm.hardware.platform.diagram.part.HardwareDiagramEditorUtil
				.getUniqueFileName(filePath, hint, extension);
	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return org.muml.pm.hardware.platform.diagram.part.HardwareDiagramEditor.ID;

	}
}
