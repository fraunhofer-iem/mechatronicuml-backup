package de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PatternDiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Patterneditor"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public PatternDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.PatternDiagramItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.PatternDiagramCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
