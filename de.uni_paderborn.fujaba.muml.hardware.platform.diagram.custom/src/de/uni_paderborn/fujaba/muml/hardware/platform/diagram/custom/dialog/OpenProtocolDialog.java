package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.dialog;

import java.util.Collection;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
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

import de.uni_paderborn.fujaba.muml.hardware.platform.Bus;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platform.Link;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.Link2EditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.LinkEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol;
/**
 * This is a dialog for choosing a protocol for a {@link Bus} or a {@link Link}.
 * The dialog is called by a right-click on a {@link Bus} or a {@link Link} and clicking "Choose Communication Protocol". 
 * This dialog is embedded into the editor via popupMenus extension point in the plugin.xml.
 * @author adann
 *
 */
public class OpenProtocolDialog implements IObjectActionDelegate {

	private IGraphicalEditPart selectedElement;
	private Shell shell;

	@Override
	public void run(IAction action) {
		if (selectedElement == null) {
			return;
		}
		CommunicationMedia media = (CommunicationMedia) selectedElement.resolveSemanticElement();
		Collection availableProtocols=null;
		if(selectedElement instanceof BusEditPart){
			BusProtocol busProtocol = de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory.eINSTANCE.createBusProtocol();
			availableProtocols =ItemPropertyDescriptor.getReachableObjectsOfType( media,  busProtocol.eClass());
		}
		else if(selectedElement instanceof Link2EditPart || selectedElement instanceof LinkEditPart){
			LinkProtocol linkProtocol = de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory.eINSTANCE.createLinkProtocol();
			availableProtocols =ItemPropertyDescriptor.getReachableObjectsOfType( media,  linkProtocol.eClass());
		}
		
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell,
				new AdapterFactoryLabelProvider(
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
								.getInstance().getItemProvidersAdapterFactory()));
		dialog.setTitle("Choose Communication Protocol:");
		dialog.setMultipleSelection(false);
		dialog.setElements(availableProtocols.toArray());
		if (dialog.open() == Dialog.OK) {

			media.setProtocol((CommunicationProtocol) dialog.getFirstResult());
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IGraphicalEditPart) {
				selectedElement = (IGraphicalEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		shell = targetPart.getSite().getShell();
	}

}
