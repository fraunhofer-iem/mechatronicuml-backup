package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts;

import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
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
public class LinkInstanceEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * MUML FIX, see code comments.
	 *
	 * @generated
	 */
	@Override
	protected Collection<?> disableCanonicalFor(Request request) {

		@SuppressWarnings("unchecked")
		Collection<Object> hosts = super.disableCanonicalFor(request);

		// MUML FIX: Make sure that commands disable ALL canonical editpolicies,
		// because GMF supports adding additional commands using Edit Helpers concept,
		// which could trigger refresh of any canonical edit policy.
		// So it should be the cleanest solution to disable all canonical edit policies. 
		EditPart part = this;
		while (part != null) {
			hosts.add(part);
			part = part.getParent();
		}
		return hosts;
	}

	/**
	 * @generated
	 */
	public LinkInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.LinkInstanceItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel30EditPart) {
			((de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel30EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLinkCommentFigure());
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
		if (childEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel30EditPart) {
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
		return new LinkFigure();
	}

	/**
	 * @generated
	 */
	public LinkFigure getPrimaryShape() {
		return (LinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkCommentFigure;

		/**
		 * @generated
		 */
		public LinkFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkCommentFigure = new WrappingLabel();

			fFigureLinkCommentFigure.setText("<...>");
			fFigureLinkCommentFigure.setTextWrap(true);

			this.add(fFigureLinkCommentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkCommentFigure() {
			return fFigureLinkCommentFigure;
		}

	}

	/**
	 * Handles the property changed event.
	 * It additionally tests, if the source/target feature was changed and updates
	 * the Connection's visualization accordingly.
	 * @param notification The property changed event.
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
			doCanonicalRefresh();
		}

		super.handleNotificationEvent(notification);
	}

	protected void doCanonicalRefresh() {
		List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
				.getRegisteredEditPolicies(getDiagramView().getElement());
		for (CanonicalEditPolicy editPolicy : editPolicies) {
			editPolicy.refresh();
		}
	}

}
