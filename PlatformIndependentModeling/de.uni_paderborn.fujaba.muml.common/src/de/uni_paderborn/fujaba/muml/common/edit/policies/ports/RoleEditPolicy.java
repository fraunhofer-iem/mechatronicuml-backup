package de.uni_paderborn.fujaba.muml.common.edit.policies.ports;

import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.common.edit.policies.EditPolicyUtils;
import de.uni_paderborn.fujaba.muml.common.figures.CustomPortFigure;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;

public class RoleEditPolicy extends PortBaseEditPolicy {

	
	@Override
	public void activate() {
		super.activate();

		
		Display.getCurrent().asyncExec(new Runnable() {

			@Override
			public void run() {
				refreshSide();			
			}

		});
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
	
	
		if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY) {
			refreshArrow();
		} else if (notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES
				|| notification.getFeature() == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES) {
			refreshPortType();
			refreshSide();
		}
		if (notification.getEventType() == Notification.SET
				&& notification.getFeature() instanceof EAttribute) {
			EAttribute feature = (EAttribute) notification.getFeature();
			if (feature.getName().equals("x")) {
				this.determineSide(notification.getNewIntValue());
			}
		}
	}
	
	
	
/**
 * @author sthiele2
 * @param newX The new x-value of the dragged role
 */
	private void determineSide(int newX) {

		Role myRole = this.getRole();
		if (myRole.getRoleConnector() == null) {
			return;
		}
		List<Role> roles = myRole.getRoleConnector().getRoles();
		EditPart myEditPart = this.getHost();
		List<EditPart> children = myEditPart.getParent().getChildren();
		for (EditPart child : children) {
			EObject element = ((View) child.getModel()).getElement();
			if (element instanceof Role && myRole != element) {
				Role other = (Role) element;
				org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure figure = ((BorderedNodeFigure) ((GraphicalEditPart) child)
						.getFigure());
				int otherX = figure.getLocation().x();
				PortBaseEditPolicy otherPolicy = (PortBaseEditPolicy) child
						.getEditPolicy(de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles.PORT_VISUALIZATION_ROLE);

				CustomPortFigure.PortType myPortType = this.getPortType(myRole);
				if (myPortType == CustomPortFigure.PortType.OUT_PORT) {
					if (otherX >= newX) {
						this.sideChanged(PositionConstants.EAST);
						otherPolicy.sideChanged(PositionConstants.WEST);
					} else {
						this.sideChanged(PositionConstants.WEST);
						otherPolicy.sideChanged(PositionConstants.EAST);
					}
				} else if (myPortType == CustomPortFigure.PortType.IN_PORT) {

					if (otherX >= newX) {
						this.sideChanged(PositionConstants.EAST);
						otherPolicy.sideChanged(PositionConstants.WEST);
					} else {
						this.sideChanged(PositionConstants.WEST);
						otherPolicy.sideChanged(PositionConstants.EAST);
					}
				}
			}
		}
	}

	private CustomPortFigure.PortType getPortType(Role role) {
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;

		boolean receiverInterfaceSet = role.getReceiverMessageTypes().size() > 0;
		boolean senderInterfaceSet = role.getSenderMessageTypes().size() > 0;

		// Find out the PortType depending on the MessageInterfaces set.
		if (receiverInterfaceSet && senderInterfaceSet) {
			type = CustomPortFigure.PortType.INOUT_PORT;
		} else if (receiverInterfaceSet) {
			type = CustomPortFigure.PortType.IN_PORT;
		} else if (senderInterfaceSet) {
			type = CustomPortFigure.PortType.OUT_PORT;
		}
		return type;
	}

	@Override
	protected void refreshPortType() {
		CustomPortFigure.PortType type = CustomPortFigure.PortType.NONE;
		Role role = (Role) getRole();
		if (role != null) {
			// Access the message interfaces...
			boolean receiverInterfaceSet = role.getReceiverMessageTypes()
					.size() > 0;
			boolean senderInterfaceSet = role.getSenderMessageTypes().size() > 0;

			// Find out the PortType depending on the MessageInterfaces set.
			if (receiverInterfaceSet && senderInterfaceSet) {
				type = CustomPortFigure.PortType.INOUT_PORT;
			} else if (receiverInterfaceSet) {
				type = CustomPortFigure.PortType.IN_PORT;
			} else if (senderInterfaceSet) {
				type = CustomPortFigure.PortType.OUT_PORT;
			}
		}

		getPortFigure().setPortKindAndPortType(
				CustomPortFigure.PortKind.DISCRETE, type);
	}

	@Override
	protected void refreshArrow() {
		boolean isMulti = false;
		Role role = getRole();

		if (role != null && role.getCardinality() != null) {
			NaturalNumber upperBound = role.getCardinality().getUpperBound();
			if (upperBound != null
					&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
				isMulti = true;
			}
		}
		getPortFigure().setMulti(isMulti);
		Color color = getArrowForegroundColor();
		getPortFigure().setLineStyle(
				EditPolicyUtils.getLineType(getPrimaryView()));
		getPortFigure().configureArrows(color, color);
		//@author: sthiele2
		//refresh the turn angle when the arrows are refreshed
		this.determineSide(getPortFigure().getBounds().x);
	}

	protected Role getRole() {
		return (Role) getSemanticElement();
	}

	
	private void refreshSide() {
		org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure figure =
				((BorderedNodeFigure) ((GraphicalEditPart) getHost())
				.getFigure());
		if (figure != null) {
			determineSide(figure.getLocation().x);
		}
	}
}
