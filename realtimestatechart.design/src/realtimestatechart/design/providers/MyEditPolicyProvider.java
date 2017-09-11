package realtimestatechart.design.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.muml.core.common.edit.policies.compartment.BorderlessCompartmentEditPolicy;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;

import realtimestatechart.design.edit.policies.SiriusTransitionColorEditPolicy;

public class MyEditPolicyProvider extends AbstractEditPolicyProvider {

	public void createEditPolicies(EditPart editPart) {
		if (editPart instanceof CompartmentEditPart) {
			editPart.installEditPolicy("BorderRole", new BorderlessCompartmentEditPolicy());
		}
		if (getSemanticElement(editPart) instanceof Transition && editPart instanceof AbstractDiagramEdgeEditPart) {
			editPart.installEditPolicy(org.eclipse.gef.EditPolicy.SELECTION_FEEDBACK_ROLE, new SiriusTransitionColorEditPolicy());
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

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			CreateEditPoliciesOperation castedOperation = (CreateEditPoliciesOperation) operation;
			EditPart editPart = castedOperation.getEditPart();
			EObject element = getSemanticElement(editPart);
			if (element instanceof Transition) {
				return true;
			}
			if (element instanceof State) {
				return true;
			}
			if (element instanceof RealtimeStatechart) {
				return true;
			}
		}
		return false;
	}

}
