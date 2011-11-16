package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.policies.CustomStructuredComponentDiagramCanonicalEditPolicy;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart;

public class CustomStructuredComponentDiagramEditPart extends
		StructuredComponentDiagramEditPart {

	public CustomStructuredComponentDiagramEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CustomStructuredComponentDiagramCanonicalEditPolicy());
	}

}
