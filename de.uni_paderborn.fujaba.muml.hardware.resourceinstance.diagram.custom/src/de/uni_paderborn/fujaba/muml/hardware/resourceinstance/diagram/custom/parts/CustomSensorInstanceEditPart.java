package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart;

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
			Activator.createInstance(editingDomain, resourceInstance);
		}
	}

}
