package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.handlers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart;
import de.uni_paderborn.fujaba.muml.protocol.Role;

public class CopyRolePropertiesToPortHandler extends AbstractHandler {

	public CopyRolePropertiesToPortHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while (iter.hasNext()) {
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();

			// add StaticStructuredComponent to list
			if (editPart instanceof DiscretePortEditPart) {
				DiscretePort port = (DiscretePort) ((View) editPart.getModel())
						.getElement();

				Role role = port.getRefinedRole();
				boolean hadReceiverMessageBuffer = !port.getReceiverMessageBuffer().isEmpty();
				if (role == null) {
					MessageDialog
							.openInformation(window.getShell(),
									"Role not specified",
									"Refined Role must be set for this Port, to copy the Role properties.");
				} else if (role.getCardinality() != null
						&& role.getCardinality().getUpperBound().getValue() > 1
						&& role.getRoleAndAdaptationBehavior() == null) {
					MessageDialog
							.openInformation(window.getShell(),
									"RoleAndAdaptationBehavior not set",
									"The multi Role needs to specify a \"RoleAndAdaptationBehavior\".");

				} else {
					updatePort(editPart.getEditingDomain(), port);
					if (hadReceiverMessageBuffer) {
						MessageDialog
							.openInformation(window.getShell(),
									"Transformation Report",
									"Role properties have been successfully copied to the Port. Existing MessageBuffer specification was overwritten.");
					}
				}
			}

		}

		return null;
	}
	
	public static void updatePort(EditingDomain editingDomain, DiscretePort port) {
		ModelExtent inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { port, getRootNode(port) }));
		
		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { inputExtent });
		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				Activator.COPYTOPORT_TRANSFORMATION,
				modelExtents);
		if(command.canExecute()){
		editingDomain.getCommandStack().execute(command);
		}
		
		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}

	private static RootNode getRootNode(DiscretePort thePort) {
		return (RootNode) thePort.getComponent().eContainer().eContainer();
	}

}
