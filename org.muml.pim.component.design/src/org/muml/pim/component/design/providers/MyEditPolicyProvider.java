package org.muml.pim.component.design.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.muml.pim.common.edit.policies.ports.PortInstanceEditPolicy;
import org.muml.pim.common.edit.policies.ports.PortPartEditPolicy;
import org.muml.pim.common.edit.policies.ports.PortTypeEditPolicy;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortPart;
import org.muml.pim.component.design.edit.policies.UpdateComponentInstanceEditPolicy;
import org.muml.pim.component.design.edit.policies.UpdateComponentPartEditPolicy;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.PortInstance;

public class MyEditPolicyProvider extends AbstractEditPolicyProvider {

	public void createEditPolicies(EditPart editPart) {
		EObject element = getSemanticElement(editPart);
		if (element instanceof ComponentPart) {
			editPart.installEditPolicy("ComponentPartUpdate", new UpdateComponentPartEditPolicy());
		}
		if (element instanceof ComponentInstance) {
			editPart.installEditPolicy("ComponentInstanceUpdate", new UpdateComponentInstanceEditPolicy());
		}
		if (element instanceof Port) {
			editPart.installEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.PORT_VISUALIZATION_ROLE,
					new PortTypeEditPolicy());
		}
		if (element instanceof PortPart) {
			editPart.installEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.PORT_VISUALIZATION_ROLE,
					new PortPartEditPolicy());
		}
		if (element instanceof PortInstance) {
			editPart.installEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.PORT_VISUALIZATION_ROLE,
					new PortInstanceEditPolicy());
		}
	}

	private EObject getSemanticElement(EditPart editPart) {
		Object model = editPart.getModel();
		if (model instanceof View) {
			View view = (View) model;
			EObject element = view.getElement();
			if (element instanceof DSemanticDecorator) {
				element = ((DSemanticDecorator) element).getTarget();
			}
			return element;
		}
		return null;
	}

	DiagramDescription findDiagramDescription(EditPart editPart) {
		if (editPart.getModel() instanceof View) {
			View view = (View) editPart.getModel();
			if (view.getElement() instanceof AbstractDNode) {
				AbstractDNode node = (AbstractDNode) view.getElement();
				if (node != null) {
					DDiagram diagram = node.getParentDiagram();
					if (diagram != null) {
						return diagram.getDescription();
					}
				}
			}
		}
		return null;
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			CreateEditPoliciesOperation castedOperation = (CreateEditPoliciesOperation) operation;
			EditPart editPart = castedOperation.getEditPart();

			// check if I am responsible for this edit part
			DiagramDescription diagramDescription = findDiagramDescription(editPart);
			if (diagramDescription != null) {
				if ("org.muml.pim.component.diagram".equals(diagramDescription.getName()) || "org.muml.pim.instance.diagram".equals(diagramDescription.getName())) {
					EObject element = getSemanticElement(editPart);
					if (element instanceof ComponentPart) {
						return true;
					}
					if (element instanceof Port || element instanceof PortPart || element instanceof PortInstance) {
						return true;
					}
					if (element instanceof ComponentInstance) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
