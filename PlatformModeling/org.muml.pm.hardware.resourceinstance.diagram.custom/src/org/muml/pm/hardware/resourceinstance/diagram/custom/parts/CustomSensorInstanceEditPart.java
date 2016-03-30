package org.muml.pm.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.resourceinstance.diagram.custom.part.Activator;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart;

/**
 * A customized EditPart for {@link StructuredResourceInstance}. A customized
 * Figure will be used, which underlines the text.
 * 
 * @author adann
 * 
 */
public class CustomSensorInstanceEditPart extends SensorInstanceEditPart {

	public CustomSensorInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * The execution of the transformation keeps the ports of this instance and
	 * its type in synch.
	 * 
	 * @author adann
	 */
	@Override
	public void activate() {
		super.activate();
		executeTransformation();
	}

	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();
		if (HwresourceinstancePackage.Literals.RESOURCE_INSTANCE__RESOURCE_TYPE
				.equals(feature)) {

			executeTransformation();

		}

		super.handleNotificationEvent(notification);

	}

	private void executeTransformation() {

		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			ResourceInstance resourceInstance = (ResourceInstance) getNotationView()
					.getElement();
			if(resourceInstance.getResourceType()==null){
				return;
			}
			Activator.createInstance(editingDomain, resourceInstance);
		}
	}

}
