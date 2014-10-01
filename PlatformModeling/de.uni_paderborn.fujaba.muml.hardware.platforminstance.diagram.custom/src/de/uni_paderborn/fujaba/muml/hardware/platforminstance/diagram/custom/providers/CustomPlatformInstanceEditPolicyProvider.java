package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.policies.CustomHWPlatformInstanceConfigurationSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;

public class CustomPlatformInstanceEditPolicyProvider extends AbstractProvider
		implements IEditPolicyProvider {

	public void createEditPolicies(EditPart ep) {
		if (ep instanceof IGraphicalEditPart) {
			EObject element = ((IGraphicalEditPart) ep)
					.resolveSemanticElement();
			if (element instanceof HWPlatformInstanceConfiguration) {
				ep.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
						new CustomHWPlatformInstanceConfigurationSemanticEditPolicy());

			}

		}
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			EditPart ep = ((CreateEditPoliciesOperation) operation)
					.getEditPart();
			if (ep instanceof DiagramEditPart
					&& ep instanceof HWPlatformInstanceConfigurationEditPart) {
				EObject element = ((IGraphicalEditPart) ep)
						.resolveSemanticElement();
				return element instanceof HWPlatformInstanceConfiguration;
			}
		}
		return false;
	}

}
