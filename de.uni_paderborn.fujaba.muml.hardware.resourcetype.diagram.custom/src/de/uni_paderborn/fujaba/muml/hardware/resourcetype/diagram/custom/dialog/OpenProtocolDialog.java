package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.custom.dialog;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart;

/**
 * This is a dialog for choosing a protocol for a {@link HWPort}.
 * The dialog is called by a right-click on a HWPort and clicking "Choose Communication Protocol". 
 * This dialog is embedded into the editor via popupMenus extension point in the plugin.xml.
 * @author adann
 *
 */
public class OpenProtocolDialog implements IObjectActionDelegate {

	private HWPortEditPart selectedElement;
	private Shell shell;

	@Override
	public void run(IAction action) {
		if (selectedElement == null) {
			return;
		}
		HWPort port = (HWPort) selectedElement.resolveSemanticElement();
		ResourceTypeRepository repo;
		repo = (ResourceTypeRepository) selectedElement
				.resolveSemanticElement().eContainer().eContainer();
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell,
				new AdapterFactoryLabelProvider(
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
								.getInstance().getItemProvidersAdapterFactory()));
		dialog.setTitle("Choose Communication Protocol:");
		dialog.setMultipleSelection(false);
		dialog.setElements(repo.getProtocols().toArray());
		if (dialog.open() == Dialog.OK) {

			port.setProtocol((CommunicationProtocol) dialog.getFirstResult());
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof HWPortEditPart) {
				selectedElement = (HWPortEditPart) structuredSelection
						.getFirstElement();
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		shell = targetPart.getSite().getShell();

	}

}
