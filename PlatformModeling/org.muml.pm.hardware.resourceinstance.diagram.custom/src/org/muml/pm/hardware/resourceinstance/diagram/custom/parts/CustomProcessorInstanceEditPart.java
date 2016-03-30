package org.muml.pm.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pm.hardware.hwresourceinstance.ComputingResourceInstance;
import org.muml.pm.hardware.hwvaluetype.Frequency;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart;

public class CustomProcessorInstanceEditPart extends ProcessorInstanceEditPart {

	public CustomProcessorInstanceEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addSemanticListeners() {
		super.addSemanticListeners();

		ComputingResourceInstance instance = (ComputingResourceInstance) resolveSemanticElement();
		Frequency frequency = instance.getFrequency();

		if (frequency != null) {
			addListenerFilter("Frequency", this, frequency);// $NON-NLS-1
		}
	}

	@Override
	protected void removeSemanticListeners() {
		super.removeSemanticListeners();
		removeListenerFilter("Frequency"); //$NON-NLS-1$
	}

	/**
	 * Updates the visual representation of this ComponentPart according to
	 * model changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		EStructuralFeature feature = (EStructuralFeature) notification.getFeature();

		if (HwvaluetypePackage.Literals.FREQUENCY__VALUE.equals(feature)
				|| HwvaluetypePackage.Literals.FREQUENCY__UNIT.equals(feature)) {
			Request refreshRequest = new Request(RequestConstants.REQ_REFRESH);
			this.performRequest(refreshRequest);
			// Remove and recreate listeners
			reactivateSemanticModel();

		}
		super.handleNotificationEvent(notification);
	}

}
