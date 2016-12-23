package org.muml.testlanguage.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.testlanguage.diagram.edit.policies.OutputTargetsItemSemanticEditPolicy;

/**
 * @generated
 */
public class OutputTargetsEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public OutputTargetsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new OutputTargetsItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new OutputTargetsFigure();
	}

	/**
	 * @generated
	 */
	public OutputTargetsFigure getPrimaryShape() {
		return (OutputTargetsFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class OutputTargetsFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public OutputTargetsFigure() {
			this.setLineWidth(2);

		}

	}

}
