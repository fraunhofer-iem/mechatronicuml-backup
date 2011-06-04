package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;

import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.impl.PortInstanceImpl;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

public class PortInstanceBehavior extends AbstractPortBehavior {

	/**
	 * The model object. It will be set, while the EditPart is active (between
	 * calls to activate() and deactivate()).
	 */
	private PortInstance portInstance;

	public PortInstanceBehavior(AbstractBorderItemEditPart editPart) {
		super(editPart);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void activate() {
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof PortInstance) {
			portInstance = (PortInstance) editPart.getNotationView().getElement();
		}
		super.activate();
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		portInstance = null;
		super.deactivate();
	}


	@Override
	public void updatePortType() {
		MessageInterface requiredMessageInterface = null;
		MessageInterface providedMessageInterface = null;
		if (portInstance != null) {
			requiredMessageInterface = portInstance.getRequiredMessageInterface();
			providedMessageInterface = portInstance.getProvidedMessageInterface();
		}
		updatePortType(requiredMessageInterface, providedMessageInterface);
	}

	@Override
	public void updatePortCardinality() {
		updatePortCardinality(false);
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.getContainerClass() == PortInstance.class) {
				int featureID = notification.getFeatureID(PortInstanceImpl.class);
				if (featureID == InstancePackage.PORT_INSTANCE__PROVIDED_MESSAGE_INTERFACE
						|| featureID == InstancePackage.PORT_INSTANCE__REQUIRED_MESSAGE_INTERFACE) {
					updatePortType(portInstance.getRequiredMessageInterface(),
							portInstance.getProvidedMessageInterface());
				}
			}
		}
	}

}
