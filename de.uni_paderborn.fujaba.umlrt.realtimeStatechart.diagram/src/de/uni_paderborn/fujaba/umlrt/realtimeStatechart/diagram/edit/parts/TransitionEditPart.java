package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TransitionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public TransitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies.TransitionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionPriorityFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
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
		return new TransitionFigure();
	}

	/**
	 * @generated
	 */
	public TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TransitionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionPriorityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionExprFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionRelativeDeadlineExprFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionTimeGuardExprFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionGuardExprFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionClockResetExprFigure;

		/**
		 * @generated
		 */
		public TransitionFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTransitionPriorityFigure = new WrappingLabel();
			fFigureTransitionPriorityFigure.setText("");

			this.add(fFigureTransitionPriorityFigure);

			fFigureTransitionExprFigure = new WrappingLabel();
			fFigureTransitionExprFigure.setText("");

			this.add(fFigureTransitionExprFigure);

			fFigureTransitionRelativeDeadlineExprFigure = new WrappingLabel();
			fFigureTransitionRelativeDeadlineExprFigure.setText("");

			this.add(fFigureTransitionRelativeDeadlineExprFigure);

			fFigureTransitionTimeGuardExprFigure = new WrappingLabel();
			fFigureTransitionTimeGuardExprFigure.setText("");

			this.add(fFigureTransitionTimeGuardExprFigure);

			fFigureTransitionGuardExprFigure = new WrappingLabel();
			fFigureTransitionGuardExprFigure.setText("");

			this.add(fFigureTransitionGuardExprFigure);

			fFigureTransitionClockResetExprFigure = new WrappingLabel();
			fFigureTransitionClockResetExprFigure.setText("");

			this.add(fFigureTransitionClockResetExprFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionPriorityFigure() {
			return fFigureTransitionPriorityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionExprFigure() {
			return fFigureTransitionExprFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionRelativeDeadlineExprFigure() {
			return fFigureTransitionRelativeDeadlineExprFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionTimeGuardExprFigure() {
			return fFigureTransitionTimeGuardExprFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionGuardExprFigure() {
			return fFigureTransitionGuardExprFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionClockResetExprFigure() {
			return fFigureTransitionClockResetExprFigure;
		}

	}

}
