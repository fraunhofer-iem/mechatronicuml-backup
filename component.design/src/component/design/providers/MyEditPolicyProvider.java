package component.design.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.muml.pim.common.edit.policies.ports.PortTypeEditPolicy;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.Port;

import component.design.edit.policies.UpdateComponentPartEditPolicy;

public class MyEditPolicyProvider extends AbstractEditPolicyProvider {

	public void createEditPolicies(EditPart editPart) {
		EObject element = getSemanticElement(editPart);
		if (element instanceof ComponentPart) {
			editPart.installEditPolicy("ComponentPartUpdateRole", new UpdateComponentPartEditPolicy());
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
			if (view.getElement() instanceof DNode) {
				DNode node = (DNode) view.getElement();
				EObject mappingElement = node.getActualMapping();
				while (mappingElement != null) {
					if (mappingElement instanceof DiagramDescription) {
						return (DiagramDescription) mappingElement;
					}
					mappingElement = mappingElement.eContainer();
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
			if (diagramDescription != null && "org.muml.pim.component.diagram".equals(diagramDescription.getName())) {
				EObject element = getSemanticElement(editPart);
				if (element instanceof ComponentPart) {
					return true;
				}
				if (element instanceof Port) {
					return true;
				}
			}
		}
		return false;
	}

}
