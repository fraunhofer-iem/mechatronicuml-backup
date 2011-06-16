package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

public class PortBehavior extends AbstractPortBehavior {

	/**
	 * The model object. It will be set, while the EditPart is active (between
	 * calls to activate() and deactivate()).
	 */
	private Port port;

	public PortBehavior(AbstractBorderItemEditPart editPart) {
		super(editPart);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate() {
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof Port) {
			port = (Port) editPart.getNotationView().getElement();
		}
		super.activate();
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		port = null;
		super.deactivate();
	}

	@Override
	public void updatePortKindAndPortType() {
//		if (port != null) {
//			updatePortKindAndPortType(port.getPortKind(),
//					port.getSenderMessageInterface(),
//					port.getReceiverMessageInterface());
//		}
	}

	@Override
	public void updatePortCardinality() {
		boolean isMulti = false;
		if (port != null && port.getCardinality() != null) {
			NaturalNumber upperBound = port.getCardinality().getUpperBound();
			if (upperBound != null
					&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
				isMulti = true;
			}
		}
		updatePortCardinality(isMulti);
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
//		Object feature = notification.getFeature();
//		if (feature instanceof EStructuralFeature) {
//			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
//			if (structuralFeature.getContainerClass() == Port.class) {
//				int featureID = notification.getFeatureID(PortImpl.class);
//				if (featureID == ComponentPackage.PORT__RECEIVER_MESSAGE_INTERFACE
//						|| featureID == ComponentPackage.PORT__SENDER_MESSAGE_INTERFACE
//						|| featureID == ComponentPackage.PORT__PORT_KIND) {
//
//					updatePortKindAndPortType(port.getPortKind(),
//							port.getSenderMessageInterface(),
//							port.getReceiverMessageInterface());
//
//				} else if (featureID == ComponentPackage.PORT__CARDINALITY) {
//					updatePortCardinality();
//				}
//			}
//		}
	}

}
