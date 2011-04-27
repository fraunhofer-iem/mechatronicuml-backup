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
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetExprEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetExprEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionClockResetExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionDeadlineExprEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionDeadlineExprEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionAbsoluteDeadlineExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventExprEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventExprEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionRelativeDeadlineExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionEventExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSideEffectExprEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSideEffectExprEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionGuardExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTimeGuardExprEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTimeGuardExprEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionSideEffectExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionClockConstraintExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionSafetyTransitionLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExpr2EditPart) {
			((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExpr2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionSynchroExprLabel());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetExprEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionDeadlineExprEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventExprEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSideEffectExprEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTimeGuardExprEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExpr2EditPart) {
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
		private WrappingLabel fFigureTransitionEventExprLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionAbsoluteDeadlineExprLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionRelativeDeadlineExprLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionClockConstraintExprLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionGuardExprLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionClockResetExprLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionSideEffectExprLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionSafetyTransitionLabel;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionSynchroExprLabel;

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

			fFigureTransitionEventExprLabel = new WrappingLabel();
			fFigureTransitionEventExprLabel.setText("");

			this.add(fFigureTransitionEventExprLabel);

			fFigureTransitionAbsoluteDeadlineExprLabel = new WrappingLabel();
			fFigureTransitionAbsoluteDeadlineExprLabel.setText("");

			this.add(fFigureTransitionAbsoluteDeadlineExprLabel);

			fFigureTransitionRelativeDeadlineExprLabel = new WrappingLabel();
			fFigureTransitionRelativeDeadlineExprLabel.setText("");

			this.add(fFigureTransitionRelativeDeadlineExprLabel);

			fFigureTransitionClockConstraintExprLabel = new WrappingLabel();
			fFigureTransitionClockConstraintExprLabel.setText("");

			this.add(fFigureTransitionClockConstraintExprLabel);

			fFigureTransitionGuardExprLabel = new WrappingLabel();
			fFigureTransitionGuardExprLabel.setText("");

			this.add(fFigureTransitionGuardExprLabel);

			fFigureTransitionClockResetExprLabel = new WrappingLabel();
			fFigureTransitionClockResetExprLabel.setText("");

			this.add(fFigureTransitionClockResetExprLabel);

			fFigureTransitionSideEffectExprLabel = new WrappingLabel();
			fFigureTransitionSideEffectExprLabel.setText("");

			this.add(fFigureTransitionSideEffectExprLabel);

			fFigureTransitionSafetyTransitionLabel = new WrappingLabel();
			fFigureTransitionSafetyTransitionLabel.setText("");

			this.add(fFigureTransitionSafetyTransitionLabel);

			fFigureTransitionSynchroExprLabel = new WrappingLabel();
			fFigureTransitionSynchroExprLabel.setText("");

			this.add(fFigureTransitionSynchroExprLabel);

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
		public WrappingLabel getFigureTransitionEventExprLabel() {
			return fFigureTransitionEventExprLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionAbsoluteDeadlineExprLabel() {
			return fFigureTransitionAbsoluteDeadlineExprLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionRelativeDeadlineExprLabel() {
			return fFigureTransitionRelativeDeadlineExprLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionClockConstraintExprLabel() {
			return fFigureTransitionClockConstraintExprLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionGuardExprLabel() {
			return fFigureTransitionGuardExprLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionClockResetExprLabel() {
			return fFigureTransitionClockResetExprLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionSideEffectExprLabel() {
			return fFigureTransitionSideEffectExprLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionSafetyTransitionLabel() {
			return fFigureTransitionSafetyTransitionLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionSynchroExprLabel() {
			return fFigureTransitionSynchroExprLabel;
		}

	}

}
