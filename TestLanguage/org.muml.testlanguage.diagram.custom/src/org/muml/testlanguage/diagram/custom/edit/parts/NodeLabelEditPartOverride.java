package org.muml.testlanguage.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart;

public class NodeLabelEditPartOverride extends NodeLabelEditPart {

	public NodeLabelEditPartOverride(View view) {
		super(view);
	}
	
	@Override
	protected boolean isEditable() {
		return false;
	}

}
