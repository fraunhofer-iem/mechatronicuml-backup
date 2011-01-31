package patterneditor.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import patterneditor.diagram.edit.policies.RolePatternItemSemanticEditPolicy;

/**
 * @generated
 */
public class RolePatternEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public RolePatternEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RolePatternItemSemanticEditPolicy());
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
		return new RolePatternFigure();
	}

	/**
	 * @generated
	 */
	public RolePatternFigure getPrimaryShape() {
		return (RolePatternFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RolePatternFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RolePatternFigure() {
			this.setLineStyle(Graphics.LINE_DASH);

		}

	}

}
