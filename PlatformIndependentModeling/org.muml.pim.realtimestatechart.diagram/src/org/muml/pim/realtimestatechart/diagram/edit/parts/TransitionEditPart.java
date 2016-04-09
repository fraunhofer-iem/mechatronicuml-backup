/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.diagram.edit.parts;

import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
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
import org.eclipse.swt.widgets.Display;
import org.muml.pim.common.edit.policies.statechart.TransitionColorEditPolicy;
import org.muml.pim.common.figures.TransitionPriorityDecoration;
import org.muml.pim.realtimestatechart.diagram.edit.policies.TransitionItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransitionEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

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
	public TransitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TransitionItemSemanticEditPolicy());

		installEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.TRANSITION_COLOR_ROLE,
				new TransitionColorEditPolicy());

	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel8EditPart) {
			((WrappingLabel8EditPart) childEditPart).setLabel(getPrimaryShape().getFigureTransitionLabelFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel9EditPart) {
			((WrappingLabel9EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTransitionDeadlineLabelFigure());
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
		if (childEditPart instanceof WrappingLabel8EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel9EditPart) {
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
		private WrappingLabel fFigureTransitionLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionDeadlineLabelFigure;

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

			fFigureTransitionLabelFigure = new WrappingLabel();

			fFigureTransitionLabelFigure.setText("");

			this.add(fFigureTransitionLabelFigure);

			fFigureTransitionDeadlineLabelFigure = new WrappingLabel();

			fFigureTransitionDeadlineLabelFigure.setText("");

			this.add(fFigureTransitionDeadlineLabelFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			TransitionPriorityDecoration df = new TransitionPriorityDecoration();
			df.setLocation(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
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
		public WrappingLabel getFigureTransitionLabelFigure() {
			return fFigureTransitionLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionDeadlineLabelFigure() {
			return fFigureTransitionDeadlineLabelFigure;
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
			sourceElement = ((GraphicalEditPart) getSource()).getNotationView().getElement();
		}
		EObject targetElement = null;
		if (getTarget() instanceof GraphicalEditPart) {
			targetElement = ((GraphicalEditPart) getTarget()).getNotationView().getElement();
		}
		if (notification.getOldValue() == sourceElement || notification.getOldValue() == targetElement) {
			Display.getCurrent().asyncExec(new Runnable() {
				@Override
				public void run() {
					doCanonicalRefresh();
				}
			});
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
