package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

public class CustomComponentStoryDiagramEditPolicyProvider extends
		AbstractProvider implements IEditPolicyProvider {

	public void createEditPolicies(EditPart ep) {
		if (ep instanceof IGraphicalEditPart) {
			EObject element = ((IGraphicalEditPart) ep)
					.resolveSemanticElement();

			if (element instanceof ComponentStoryNode) {
				ep.installEditPolicy(
						"ComponentStoryNodeFigureRole",
						new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.policies.ComponentStoryNodeFigureEditPolicy());
			}

			else if (element instanceof SinglePortVariable) {
				ep.installEditPolicy(
						"ComponentStoryNodeFigureRole",
						new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.policies.EmbeddedSinglePortVariableExternalLabelsEditPolicy());
			}
		}
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			EditPart ep = ((CreateEditPoliciesOperation) operation)
					.getEditPart();

			if (ep instanceof ComponentStoryNodeEditPart) {
				EObject element = ((IGraphicalEditPart) ep)
						.resolveSemanticElement();
				return element instanceof ComponentStoryNode;
			}

			else if (ep instanceof SinglePortVariableEditPart) {
				EObject element = ((IGraphicalEditPart) ep)
						.resolveSemanticElement();
				return element instanceof SinglePortVariable;
			}
		}
		return false;
	}

}
