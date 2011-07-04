package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
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
				new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.TransitionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionClockResetExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionAbsoluteDeadlineExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionRelativeDeadlineExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionEventExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionGuardExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionActionExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionClockConstraintExprLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransitionSafetyTransitionLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel10EditPart) {
			((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel10EditPart) childEditPart)
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel10EditPart) {
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
		private WrappingLabel fFigureTransitionActionExprLabel;
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
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTransitionPriorityFigure = new WrappingLabel();
			fFigureTransitionPriorityFigure.setText("-");

			this.add(fFigureTransitionPriorityFigure);

			fFigureTransitionEventExprLabel = new WrappingLabel();
			fFigureTransitionEventExprLabel.setText("-");

			this.add(fFigureTransitionEventExprLabel);

			fFigureTransitionAbsoluteDeadlineExprLabel = new WrappingLabel();
			fFigureTransitionAbsoluteDeadlineExprLabel.setText("-");

			this.add(fFigureTransitionAbsoluteDeadlineExprLabel);

			fFigureTransitionRelativeDeadlineExprLabel = new WrappingLabel();
			fFigureTransitionRelativeDeadlineExprLabel.setText("-");

			this.add(fFigureTransitionRelativeDeadlineExprLabel);

			fFigureTransitionClockConstraintExprLabel = new WrappingLabel();
			fFigureTransitionClockConstraintExprLabel.setText("-");

			this.add(fFigureTransitionClockConstraintExprLabel);

			fFigureTransitionGuardExprLabel = new WrappingLabel();
			fFigureTransitionGuardExprLabel.setText("-");

			this.add(fFigureTransitionGuardExprLabel);

			fFigureTransitionClockResetExprLabel = new WrappingLabel();
			fFigureTransitionClockResetExprLabel.setText("-");

			this.add(fFigureTransitionClockResetExprLabel);

			fFigureTransitionActionExprLabel = new WrappingLabel();
			fFigureTransitionActionExprLabel.setText("-");

			this.add(fFigureTransitionActionExprLabel);

			fFigureTransitionSafetyTransitionLabel = new WrappingLabel();
			fFigureTransitionSafetyTransitionLabel.setText("-");

			this.add(fFigureTransitionSafetyTransitionLabel);

			fFigureTransitionSynchroExprLabel = new WrappingLabel();
			fFigureTransitionSynchroExprLabel.setText("-");

			this.add(fFigureTransitionSynchroExprLabel);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			de.uni_paderborn.fujaba.muml.common.figures.TransitionPriorityDecoration df = new de.uni_paderborn.fujaba.muml.common.figures.TransitionPriorityDecoration();

			df.setLocation(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(0)));
			df.setSize(getMapMode().DPtoLP(16), getMapMode().DPtoLP(16));

			return df;
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
		public WrappingLabel getFigureTransitionActionExprLabel() {
			return fFigureTransitionActionExprLabel;
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
