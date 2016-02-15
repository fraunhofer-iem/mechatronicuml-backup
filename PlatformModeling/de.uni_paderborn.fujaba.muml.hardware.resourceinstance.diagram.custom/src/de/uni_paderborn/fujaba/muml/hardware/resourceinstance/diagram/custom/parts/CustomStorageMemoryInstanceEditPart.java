package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart;

public class CustomStorageMemoryInstanceEditPart extends StorageMemoryInstanceEditPart{

	public CustomStorageMemoryInstanceEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void addSemanticListeners() {
		super.addSemanticListeners();
		
		MemoryResourceInstance instance =  (MemoryResourceInstance) resolveSemanticElement();
		DataSize size = instance.getMemorySize();
		
		if (size != null) {
			addListenerFilter("DataSize", this, size);//$NON-NLS-1
		}
	}

	@Override
	protected void removeSemanticListeners() {
		super.removeSemanticListeners();
		removeListenerFilter("DataSize"); //$NON-NLS-1$
	}

	/**
	 * Updates the visual representation of this ComponentPart according to
	 * model changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		EStructuralFeature feature = (EStructuralFeature) notification.getFeature();

		if (HwvaluetypePackage.Literals.DATA_SIZE__VALUE.equals(feature) || HwvaluetypePackage.Literals.DATA_SIZE__UNIT.equals(feature) ) {
			Request refreshRequest = new Request(RequestConstants.REQ_REFRESH);
			this.performRequest(refreshRequest);
			// Remove and recreate listeners
			reactivateSemanticModel();
			
		}
		super.handleNotificationEvent(notification);
	}

}
