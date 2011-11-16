package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.edit.policies.CustomAtomicComponentDiagramCanonicalEditPolicy;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart;

public class CustomAtomicComponentDiagramEditPart extends
		AtomicComponentDiagramEditPart {

	public CustomAtomicComponentDiagramEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CustomAtomicComponentDiagramCanonicalEditPolicy());
	}

}
