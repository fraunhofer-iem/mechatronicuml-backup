package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ComputingResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;
import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

public class CustomPLDInstanceEditPart extends ProgrammableLogicDeviceInstanceEditPart{

	public CustomPLDInstanceEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void addSemanticListeners() {
		super.addSemanticListeners();
		
		ComputingResourceInstance instance =  (ComputingResourceInstance) resolveSemanticElement();
		Frequency frequency = instance.getFrequency();
		
		if (frequency != null) {
			addListenerFilter("Frequency", this, frequency);//$NON-NLS-1
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

		if (HwvaluetypePackage.Literals.FREQUENCY__VALUE.equals(feature) || HwvaluetypePackage.Literals.FREQUENCY__UNIT.equals(feature) ) {
			Request refreshRequest = new Request(RequestConstants.REQ_REFRESH);
			this.performRequest(refreshRequest);
			// Remove and recreate listeners
			reactivateSemanticModel();
			
		}
		super.handleNotificationEvent(notification);
	}

}
