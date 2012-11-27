package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;

public class CustomComponentVariableComponentVariableCompartmentEditPart extends
		ComponentVariableComponentVariableCompartmentEditPart {
	
	public CustomComponentVariableComponentVariableCompartmentEditPart(
			View view) {
		super(view);
		
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
	}
}
