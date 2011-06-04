package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.Port;
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
	public void updatePortType() {
		if (port != null) {
			updatePortType(port.getRequiredMessageInterface(),
					port.getProvidedMessageInterface());
		}
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
		Object feature = notification.getFeature();
		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.getContainerClass() == Port.class) {
				int featureID = notification.getFeatureID(PortImpl.class);
				if (featureID == ComponentPackage.PORT__PROVIDED_MESSAGE_INTERFACE
						|| featureID == ComponentPackage.PORT__REQUIRED_MESSAGE_INTERFACE) {
					updatePortType(port.getRequiredMessageInterface(),
							port.getProvidedMessageInterface());
				} else if (featureID == ComponentPackage.PORT__CARDINALITY) {
					updatePortCardinality();
				}
			}
		}
	}

}
