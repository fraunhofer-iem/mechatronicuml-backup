package org.muml.storydiagram.diagram.custom.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.diagram.edit.parts.JunctionNodeEditPart;

public class CustomJunctionNodeEditPart extends JunctionNodeEditPart {
	public CustomJunctionNodeEditPart(View view) {
		super(view);
	}

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new NonResizableEditPolicyEx();
	}
}
