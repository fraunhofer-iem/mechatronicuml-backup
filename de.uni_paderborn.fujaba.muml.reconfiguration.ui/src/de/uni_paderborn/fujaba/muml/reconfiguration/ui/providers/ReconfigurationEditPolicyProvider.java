package de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies.CustomModelElementCategoryItemSemanticEditPolicy;



public class ReconfigurationEditPolicyProvider extends AbstractProvider implements IEditPolicyProvider {

    public void createEditPolicies(EditPart ep) {
        if (ep instanceof IGraphicalEditPart) {
            EObject element = ((IGraphicalEditPart)ep).resolveSemanticElement();
            if (element instanceof ModelElementCategory) {
                ep.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CustomModelElementCategoryItemSemanticEditPolicy());
            }
        }
    }

    public boolean provides(IOperation operation) {
        if (operation instanceof CreateEditPoliciesOperation) {
            EditPart ep = ((CreateEditPoliciesOperation) operation).getEditPart();
            if (ep instanceof DiagramEditPart && ep instanceof ModelElementCategoryEditPart) {
                EObject element = ((IGraphicalEditPart)ep).resolveSemanticElement();
                return element instanceof ModelElementCategory;
            }
        }
        return false;
    }

	
}
