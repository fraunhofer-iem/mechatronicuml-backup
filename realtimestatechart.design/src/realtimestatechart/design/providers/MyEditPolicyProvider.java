package realtimestatechart.design.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListViewNodeListCompartmentEditPart;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

public class MyEditPolicyProvider extends AbstractEditPolicyProvider {


    public void createEditPolicies(EditPart editPart) {
    	if (editPart instanceof DNodeListViewNodeListCompartmentEditPart) {
    		DNodeListViewNodeListCompartmentEditPart cep = (DNodeListViewNodeListCompartmentEditPart) editPart;

    		System.out.println(cep);
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
                if (element instanceof RealtimeStatechart) {
                	return true;
                }
            }
        }
        return false;
    }

}
