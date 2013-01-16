package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AssemblyVariableEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public AssemblyVariableEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.AssemblyVariableItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableNameEditPart) {
			((de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssemblyVariableLabelFigure());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableNameEditPart) {
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
		return new AssemblyVariableFigure();
	}

	/**
	 * @generated
	 */
	public AssemblyVariableFigure getPrimaryShape() {
		return (AssemblyVariableFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AssemblyVariableFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssemblyVariableLabelFigure;

		/**
		 * @generated
		 */
		public AssemblyVariableFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAssemblyVariableLabelFigure = new WrappingLabel();
			fFigureAssemblyVariableLabelFigure.setText("");

			this.add(fFigureAssemblyVariableLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssemblyVariableLabelFigure() {
			return fFigureAssemblyVariableLabelFigure;
		}

	}

	/**
	 * Handles the property changed event.
	 * It additionally tests, if the source/target feature was changed and updates
	 * the Connection's visualization accordingly.
	 * @param event The property changed event.
	 * @generated
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {

		// Fix for MechatronicUML BUG #17:
		// Connection does not refresh, after changing its source or target via
		// Properties View.
		EObject sourceElement = null;
		if (getSource() instanceof GraphicalEditPart) {
			sourceElement = ((GraphicalEditPart) getSource()).getNotationView()
					.getElement();
		}
		EObject targetElement = null;
		if (getTarget() instanceof GraphicalEditPart) {
			targetElement = ((GraphicalEditPart) getTarget()).getNotationView()
					.getElement();
		}
		if (notification.getOldValue() == sourceElement
				|| notification.getOldValue() == targetElement) {
			List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
					.getRegisteredEditPolicies(getDiagramView().getElement());
			for (CanonicalEditPolicy editPolicy : editPolicies) {
				editPolicy.refresh();
			}
		}

		super.handleNotificationEvent(notification);
	}
}
