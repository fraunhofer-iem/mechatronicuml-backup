package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parts;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ComputingResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart;

/**
 * A customized EditPart for {@link ResourceInstancePart}. The HWPortParts are
 * created by execution of a qvt-o transformation when is resourceInstance is
 * set.
 * 
 * @author adann
 * 
 */
public class CustomResourcePartEditPart extends
		ResourcePartEditPart {

	public CustomResourcePartEditPart(View view) {
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
		Request refreshRequest = new Request(RequestConstants.REQ_REFRESH);
		this.performRequest(refreshRequest);
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
		if (HwplatformPackage.Literals.RESOURCE_PART__RESOURCE_TYPE
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
