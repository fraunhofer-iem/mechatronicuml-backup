package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.edit.part;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.edit.policies.CustomMessageInterfaceDiagramCanonicalEditPolicy;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart;

public class CustomMessageInterfaceDiagramEditPart extends
		MessageInterfaceDiagramEditPart {

	public CustomMessageInterfaceDiagramEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CustomMessageInterfaceDiagramCanonicalEditPolicy());
	}

}
