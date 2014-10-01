package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.custom.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.Bus;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusEditPart;

public class CustomBusEditPart extends BusEditPart {
	public CustomBusEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addSemanticListeners() {
		super.addSemanticListeners();
		
		Bus instance =  (Bus) resolveSemanticElement();
		DataRate bandwidth = instance.getBandwidth();
		
		if (bandwidth != null) {
			addListenerFilter("Bandwidth", this, bandwidth);//$NON-NLS-1
		}
	}
	
	@Override
	protected void removeSemanticListeners() {
		super.removeSemanticListeners();
		removeListenerFilter("Bandwidth"); //$NON-NLS-1$
	}
	
	/**
	 * Updates the visual representation of this ComponentPart according to
	 * model changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		EStructuralFeature feature = (EStructuralFeature) notification.getFeature();

		if (HwvaluetypePackage.Literals.DATA_RATE__VALUE.equals(feature) || HwvaluetypePackage.Literals.DATA_RATE__UNIT.equals(feature) ) {
			Request refreshRequest = new Request(RequestConstants.REQ_REFRESH);
			this.performRequest(refreshRequest);
			// Remove and recreate listeners
			reactivateSemanticModel();
			
		}
		super.handleNotificationEvent(notification);
	}
}
