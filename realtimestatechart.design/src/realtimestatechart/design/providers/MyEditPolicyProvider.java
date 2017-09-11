package realtimestatechart.design.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.muml.core.common.edit.policies.compartment.BorderlessCompartmentEditPolicy;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.State;

public class MyEditPolicyProvider extends AbstractEditPolicyProvider {


    public void createEditPolicies(EditPart editPart) {
    	if (editPart instanceof CompartmentEditPart) {
    		editPart.installEditPolicy("BorderlessRole", new BorderlessCompartmentEditPolicy());
    	}
    }

    public boolean provides(IOperation operation) {
        if (operation instanceof CreateEditPoliciesOperation) {
            CreateEditPoliciesOperation castedOperation = (CreateEditPoliciesOperation) operation;
            EditPart editPart = castedOperation.getEditPart();
            Object model = editPart.getModel();
            if (model instanceof View) {
                View view = (View) model;
                EObject element = view.getElement();
                if (element instanceof DSemanticDecorator) {
                	element = ((DSemanticDecorator) element).getTarget();
                }
                if (element instanceof State) {
                	return true;
                }
                if (element instanceof RealtimeStatechart) {
                	return true;
                }
            }
        }
        return false;
    }

}
