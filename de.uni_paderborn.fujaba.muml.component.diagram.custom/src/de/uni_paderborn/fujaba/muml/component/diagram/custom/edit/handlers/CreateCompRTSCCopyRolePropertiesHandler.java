package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.Port;

public class CreateCompRTSCCopyRolePropertiesHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while (iter.hasNext()) {
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();

			// add StaticStructuredComponent to list
			if (editPart instanceof AtomicComponent
					&& ((AtomicComponent) editPart).getComponentKind() == ComponentKind.SOFTWARE_COMPONENT) {
				AtomicComponent atomicComponent = (AtomicComponent) editPart
						.resolveSemanticElement();
				for (Port port : atomicComponent.getPorts()) {
					if (ComponentPackage.Literals.DISCRETE_PORT
							.isSuperTypeOf(port.eClass())) {
						CopyRolePropertiesToPortHandler
								.copyRolePropertiesToPort((DiscretePort) port,
										window.getShell(),
										editPart.getEditingDomain());
					}
				}

			}
		}
		return null;
	}

}
