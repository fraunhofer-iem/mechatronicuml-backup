package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;

import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure.PortKind;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

public class RoleBehavior extends AbstractBehavior {
	/**
	 * The model object. It will be set, while the EditPart is active (between
	 * calls to activate() and deactivate()).
	 */
	private Role role;

	public RoleBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	@Override
	public void activate() {
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof Role) {
			role = (Role) editPart.getNotationView().getElement();
		}

		EditPart parentEditPart = editPart.getParent();
		IFigure figure = null;
		if (parentEditPart instanceof GraphicalEditPart) {
			figure = ((GraphicalEditPart) parentEditPart).getFigure();
		}
		if (figure instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			addContainerLayoutListener(portContainerFigure);
		}

		super.activate();
	}

	public Role getRole() {
		return role;
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		role = null;

		EditPart parentEditPart = editPart.getParent();
		IFigure figure = null;
		if (parentEditPart instanceof GraphicalEditPart) {
			figure = ((GraphicalEditPart) parentEditPart).getFigure();
		}
		if (figure instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			removeContainerLayoutListener(portContainerFigure);
		}

		super.deactivate();
	}

	@Override
	public PortKind getPortKind() {
		return CustomPortFigure.PortKind.DISCRETE;
	}

	@Override
	public CustomPortFigure.PortType getPortType() {
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;
		if (getRole() != null) {
			// Access the message interfaces...
			Role role = (Role) getRole();
			MessageInterface receiverInterface = role
					.getReceiverMessageInterface();
			MessageInterface senderInterface = role
					.getSenderMessageInterface();

			// Find out the PortType depending on the MessageInterfaces set.
			if (receiverInterface != null && senderInterface != null) {
				type = CustomPortFigure.PortType.INOUT_PORT;
			} else if (receiverInterface != null) {
				type = CustomPortFigure.PortType.IN_PORT;
			} else if (senderInterface != null) {
				type = CustomPortFigure.PortType.OUT_PORT;
			}
		}
		return type;
	}

	@Override
	public boolean isMulti() {
		boolean isMulti = false;
		if (role != null && role.getCardinality() != null) {
			NaturalNumber upperBound = role.getCardinality().getUpperBound();
			if (upperBound != null
					&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
				isMulti = true;
			}
		}
		return isMulti;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == PatternPackage.Literals.ROLE__CARDINALITY) {
			updateCardinality();
		} else if (notification.getFeature() == PatternPackage.Literals.ROLE__RECEIVER_MESSAGE_INTERFACE
				|| notification.getFeature() == PatternPackage.Literals.ROLE__SENDER_MESSAGE_INTERFACE) {
			updatePortType();
		}
	}

}
