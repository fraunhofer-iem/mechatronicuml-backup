package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomResourceFigure;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart;

/**
 * A customized EditPart for a {@link HWPlatformPart}.
 * 
 * @author adann
 * 
 */
public class CustomHWPlatformPartEditPart extends HWPlatformPartEditPart {

	public CustomHWPlatformPartEditPart(View view) {
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
		primaryShape = super.createNodeShape();
		primaryShape.setToolTip(new Label("Double-Click to open Platform"));
		((CustomResourceFigure) primaryShape).getFigureCustomIconFigure()
				.setIcon(ResourceType.PLATFORM);
		((CustomResourceFigure) primaryShape).getFigureResourceInfoRectangle()
				.setVisible(false);
		return primaryShape;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (PlatformPackage.Literals.HW_PLATFORM_PART__HWPLATFORM_TYPE
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
