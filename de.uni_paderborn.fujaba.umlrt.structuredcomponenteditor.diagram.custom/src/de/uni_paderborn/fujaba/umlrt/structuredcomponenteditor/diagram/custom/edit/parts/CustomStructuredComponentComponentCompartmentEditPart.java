package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies.CustomStructuredComponentComponentCompartmentItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart;

public class CustomStructuredComponentComponentCompartmentEditPart extends
		StructuredComponentComponentCompartmentEditPart {

	public CustomStructuredComponentComponentCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new CustomStructuredComponentComponentCompartmentItemSemanticEditPolicy());
	}
}
