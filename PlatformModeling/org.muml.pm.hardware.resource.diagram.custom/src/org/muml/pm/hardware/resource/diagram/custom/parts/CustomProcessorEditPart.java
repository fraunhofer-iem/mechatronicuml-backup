package org.muml.pm.hardware.resource.diagram.custom.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pm.hardware.hwresource.Processor;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart;


/**
 * A customized EditPart for a Processor. 
 * This EditPart fixes the bug that two links are displayed when the reference usedCache of a {@link Processor} is set.
 * 
 * @author adann
 * 
 */
public class CustomProcessorEditPart extends ProcessorEditPart {

	public CustomProcessorEditPart(View view) {
		super(view);
	}

	/**
	 * This method is a fix a bug.
	 * The bug is: two arrows are displayed in the editor view if a processorOwnedCache association is created
	 * This fixes the bug by NOT updating the view twice times.
	 * @author adann
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {

		if (event.getFeature() == org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
				.getProcessor_OwnedCache()) {
				return;
		}

		super.handleNotificationEvent(event);
	}
}
