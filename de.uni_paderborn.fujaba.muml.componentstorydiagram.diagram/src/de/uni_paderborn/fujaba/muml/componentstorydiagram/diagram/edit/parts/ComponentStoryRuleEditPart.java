package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class ComponentStoryRuleEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Component Story"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public ComponentStoryRuleEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies.ComponentStoryRuleItemSemanticEditPolicy());

		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies.ComponentStoryRuleCanonicalEditPolicy(
						true));

		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
