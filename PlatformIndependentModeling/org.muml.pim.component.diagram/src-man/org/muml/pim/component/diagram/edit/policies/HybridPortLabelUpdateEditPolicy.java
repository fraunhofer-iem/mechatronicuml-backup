package org.muml.pim.component.diagram.edit.policies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.HybridPort;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypePackage;

public class HybridPortLabelUpdateEditPolicy extends NotifyingGraphicalEditPolicy {

	@Override
	protected void addListeners() {
		// do not call super.addListeners(); the host edit part already listens on the semantic element.
		HybridPort hybridPort = (HybridPort) getSemanticElement();
		if (hybridPort != null) {
			TimeValue samplingInterval = hybridPort.getSamplingInterval();
			if (samplingInterval != null) {
				addNotificationListener(samplingInterval);
			}
		}
	}
	
	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
		if (feature == ComponentPackage.Literals.HYBRID_PORT__SAMPLING_INTERVAL) {
			updateListeners();
			getHost().refresh();
		} else if (feature.getEContainingClass() == ValuetypePackage.Literals.TIME_VALUE) {
			getHost().refresh();
		}
	}
}
