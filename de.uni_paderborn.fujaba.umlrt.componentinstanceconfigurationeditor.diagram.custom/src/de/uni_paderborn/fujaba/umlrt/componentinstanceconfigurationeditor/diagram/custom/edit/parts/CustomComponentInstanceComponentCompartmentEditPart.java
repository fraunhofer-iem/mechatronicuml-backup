package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.policies.CustomComponentInstanceComponentCompartmentItemSemanticEditPolicy;

/**
 * A custom CompartmentEditPart for a ComponentInstance. It prevents deletion of
 * the whole Compartment area.
 * 
 * @author bingo
 * 
 */
public class CustomComponentInstanceComponentCompartmentEditPart extends
		ComponentInstanceComponentCompartmentEditPart {

	public CustomComponentInstanceComponentCompartmentEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new CustomComponentInstanceComponentCompartmentItemSemanticEditPolicy());

	}
}
