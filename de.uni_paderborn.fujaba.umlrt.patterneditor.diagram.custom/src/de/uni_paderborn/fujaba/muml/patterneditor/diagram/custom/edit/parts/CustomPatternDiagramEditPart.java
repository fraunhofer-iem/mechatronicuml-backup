package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.PatternDiagramEditPart;

public class CustomPatternDiagramEditPart extends PatternDiagramEditPart {

	public CustomPatternDiagramEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
	}

}
