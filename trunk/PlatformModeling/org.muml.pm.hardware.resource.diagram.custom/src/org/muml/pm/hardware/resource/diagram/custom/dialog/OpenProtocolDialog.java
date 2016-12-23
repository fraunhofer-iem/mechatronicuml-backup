package org.muml.pm.hardware.resource.diagram.custom.dialog;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.muml.pm.hardware.hwresource.Bus;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwresource.CommunicationResource;
import org.muml.pm.hardware.hwresource.Link;
import org.muml.pm.hardware.hwresource.ResourceRepository;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart;

/**
 * This is a dialog for choosing a protocol for a {@link HWPort}. The dialog is
 * called by a right-click on a HWPort and clicking
 * "Choose Communication Protocol". This dialog is embedded into the editor via
 * popupMenus extension point in the plugin.xml.
 * 
 * @author adann
 *
 */
public class OpenProtocolDialog implements IObjectActionDelegate {

	private IGraphicalEditPart selectedElement;
	private Shell shell;

	private enum Targets {
		BUS, LINK, COMMUNICATION_RESOURCE
	};

	private Targets target;

	@Override
	public void run(IAction action) {
		if (selectedElement == null) {
			return;
		}
		ResourceRepository repo = null;
		

		if (selectedElement instanceof CommunicationResourceEditPart) {
		
			repo = (ResourceRepository) selectedElement.resolveSemanticElement().eContainer().eContainer();

		}

		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell,
				new AdapterFactoryLabelProvider(
						org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
								.getInstance().getItemProvidersAdapterFactory()));
		dialog.setTitle("Choose Communication Protocol:");
		dialog.setMultipleSelection(false);
		dialog.setElements(repo.getProtocols().toArray());
		if (dialog.open() == Dialog.OK) {
			switch (target) {
			case BUS:
				((Bus) selectedElement.resolveSemanticElement())
						.setProtocol((CommunicationProtocol) dialog.getFirstResult());
				break;

			case LINK:
				((Link) selectedElement.resolveSemanticElement())
						.setProtocol((CommunicationProtocol) dialog.getFirstResult());

				break;
			case COMMUNICATION_RESOURCE:
				((CommunicationResource) selectedElement.resolveSemanticElement())
						.setProtocol((CommunicationProtocol) dialog.getFirstResult());

				break;
			default:
				break;
			}

		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof CommunicationResourceEditPart) {
				selectedElement = (IGraphicalEditPart) structuredSelection.getFirstElement();
				if (selectedElement instanceof CommunicationResourceEditPart) {
					target = Targets.COMMUNICATION_RESOURCE;
				}
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();

	}

}
