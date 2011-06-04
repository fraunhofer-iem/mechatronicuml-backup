package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ComponentInstanceConfigurationDiagramEditPart extends
		DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies.ComponentInstanceConfigurationDiagramItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies.ComponentInstanceConfigurationDiagramCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
