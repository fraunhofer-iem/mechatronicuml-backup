package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parts;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartEditPart;

/**
 * A customized EditPart for {@link ResourceInstancePart}. The HWPortParts are
 * created by execution of a qvt-o transformation when is resourceInstance is
 * set.
 * 
 * @author adann
 * 
 */
public class CustomResourceInstancePartEditPart extends
		ResourceInstancePartEditPart {

	public CustomResourceInstancePartEditPart(View view) {
		super(view);

	}
	

	/**
	 * The execution of the transformation keeps the ports of
	 * this instance and its type in synch.
	 * @author adann
	 */
	@Override
	public void activate() {
		super.activate();
		executeTransformation();
	}


	@Override
	protected IFigure createNodeShape() {
		IFigure result = super.createNodeShape();
		result.setToolTip(new Label("Double-Click to open ResourceInstance"));
		return result;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (PlatformPackage.Literals.RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE
				.equals(feature)) {

			executeTransformation();
		}
		super.handleNotificationEvent(notification);
	}

	private void executeTransformation() {

		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			PlatformPart platformPart = (PlatformPart) getNotationView()
					.getElement();
			Activator.updateHWPortParts(editingDomain, platformPart);
		}
	}
}
