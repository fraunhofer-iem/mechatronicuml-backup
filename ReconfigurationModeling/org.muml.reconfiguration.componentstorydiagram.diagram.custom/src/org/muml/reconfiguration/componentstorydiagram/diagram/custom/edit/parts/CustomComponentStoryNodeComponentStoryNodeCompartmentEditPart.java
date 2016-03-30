package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryNodeComponentStoryNodeCompartmentItemSemanticEditPolicy;

public class CustomComponentStoryNodeComponentStoryNodeCompartmentEditPart
		extends ComponentStoryNodeComponentStoryNodeCompartmentEditPart {

	public CustomComponentStoryNodeComponentStoryNodeCompartmentEditPart(
			View view) {
		super(view);
	}
	
	protected void createDefaultEditPolicies() {
		EditPolicy resizePolicy = new NonResizableEditPolicy() {
			@Override
			protected Command getMoveCommand(ChangeBoundsRequest request) {
				return UnexecutableCommand.INSTANCE;
			}

			@Override
			public boolean isDragAllowed() {
				return false;
			}
		};

		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, resizePolicy);
		
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ComponentStoryNodeComponentStoryNodeCompartmentItemSemanticEditPolicy() {
					protected Command getSemanticCommand(
							IEditCommandRequest request) {
						if (request instanceof DestroyRequest) {
							return null;
						}
						return super.getSemanticCommand(request);
					}

				});

	}

}
