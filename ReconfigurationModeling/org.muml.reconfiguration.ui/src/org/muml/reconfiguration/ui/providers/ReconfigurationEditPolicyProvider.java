package org.muml.reconfiguration.ui.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.PortPart;
import org.muml.pim.component.diagram.custom.edit.parts.CustomPortPartEditPart;
import org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart;
import org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.reconfiguration.ui.edit.policies.CustomModelElementCategoryCanonicalEditPolicy;
import org.muml.reconfiguration.ui.edit.policies.CustomModelElementCategoryItemSemanticEditPolicy;

public class ReconfigurationEditPolicyProvider extends AbstractProvider
		implements IEditPolicyProvider {

	public void createEditPolicies(EditPart ep) {
		if (ep instanceof IGraphicalEditPart) {
			EObject element = ((IGraphicalEditPart) ep)
					.resolveSemanticElement();
			if (element instanceof ModelElementCategory) {
				ep.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
						new CustomModelElementCategoryItemSemanticEditPolicy());
				ep.installEditPolicy(
						"CustomCanonical",
						new CustomModelElementCategoryCanonicalEditPolicy(false));
			}
			if (element instanceof PortPart) {
				ep.installEditPolicy(
						org.muml.pim.common.edit.policies.EditPolicyRoles.PORT_VISUALIZATION_ROLE,
						new org.muml.reconfiguration.ui.edit.policies.CustomPortPartEditPolicy());
			}

			if (element instanceof ComponentPart) {
				ep.installEditPolicy(
						"ComponentPartIconRole",
						new org.muml.reconfiguration.ui.edit.policies.ComponentPartIconEditPolicy());
			}
		}
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			EditPart ep = ((CreateEditPoliciesOperation) operation)
					.getEditPart();
			if (ep instanceof DiagramEditPart
					&& ep instanceof ModelElementCategoryEditPart) {
				EObject element = ((IGraphicalEditPart) ep)
						.resolveSemanticElement();
				return element instanceof ModelElementCategory;
			}
			if (ep instanceof CustomPortPartEditPart) {
				EObject element = ((IGraphicalEditPart) ep)
						.resolveSemanticElement();
				return element instanceof PortPart;
			}

			if (ep instanceof ComponentPartEditPart) {
				EObject element = ((IGraphicalEditPart) ep)
						.resolveSemanticElement();
				return element instanceof ComponentPart;
			}
		}
		return false;
	}

}
