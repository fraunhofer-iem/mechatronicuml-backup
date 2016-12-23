package org.muml.pm.hardware.platform.diagram.custom.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.muml.pm.hardware.common.figures.CustomIconFigure.ResourceType;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.PlatformPart;
import org.muml.pm.hardware.platform.diagram.custom.part.Activator;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart;

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
	 * The execution of the transformation keeps the ports of this instance and
	 * its type in synch.
	 * 
	 * @author adann
	 */
	@Override
	public void activate() {
		super.activate();
		Display.getCurrent().asyncExec(new Runnable() {
			@Override
			public void run() {
				executeTransformation();
			}
		});
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape = new ModifiedCustomSimpleResourceFigure();
		primaryShape.setToolTip(new Label("Double-Click to open Platform"));
		((SimpleResourceFigure) primaryShape).getFigureCustomIconFigure().setIcon(ResourceType.PLATFORM);
		return primaryShape;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (HwplatformPackage.Literals.HW_PLATFORM_PART__HWPLATFORM_TYPE.equals(feature)) {

			executeTransformation();
		}

		super.handleNotificationEvent(notification);
	}

	private void executeTransformation() {

		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			PlatformPart platformPart = (PlatformPart) getNotationView().getElement();
			if (platformPart instanceof HWPlatformPart && ((HWPlatformPart) platformPart).getHwplatformType() == null) {
				return;
			}
			Activator.updateHWPortParts(editingDomain, platformPart);
		}
	}

	public class ModifiedCustomSimpleResourceFigure extends SimpleResourceFigure  {
		@Override
		protected void fillShape(Graphics graphics) {
			Color bgColor = graphics.getBackgroundColor();
			Color fgColor = graphics.getForegroundColor();
			// Set the graphics color
			graphics.setForegroundColor(ColorConstants.menuBackground);
			graphics.setBackgroundColor(ColorConstants.menuBackgroundSelected);
			// Restore the original colors
			graphics.fillGradient(getBounds(), true);
			graphics.setBackgroundColor(bgColor);
			graphics.setForegroundColor(fgColor);
		}

	}

}
