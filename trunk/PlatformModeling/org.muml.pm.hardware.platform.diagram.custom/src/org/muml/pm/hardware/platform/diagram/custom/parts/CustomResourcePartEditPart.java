package org.muml.pm.hardware.platform.diagram.custom.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.PlatformPart;
import org.muml.pm.hardware.hwplatform.ResourcePart;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.platform.diagram.custom.part.Activator;
import org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart;

/**
 * A customized EditPart for {@link ResourceInstancePart}. The HWPortParts are
 * created by execution of a qvt-o transformation when is resourceInstance is
 * set.
 * 
 * @author adann
 * 
 */
public class CustomResourcePartEditPart extends ResourcePartEditPart {
	private static final Color COLOR_DEVICE = new Color(null, 230, 230, 230);
	private static final Color COLOR_NORMAL = new Color(null, 255, 255, 255);
	private boolean isDevice = false;

	public CustomResourcePartEditPart(View view) {
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
		Request refreshRequest = new Request(RequestConstants.REQ_REFRESH);
		this.performRequest(refreshRequest);
		refreshFigure();
		Display.getCurrent().asyncExec(new Runnable() {
			@Override
			public void run() {
				executeTransformation();
			}
		});
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape = new ModifiedCustomResourceFigure();

		primaryShape.setToolTip(new Label("Double-Click to open ResourceInstance"));
		return primaryShape;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (HwplatformPackage.Literals.RESOURCE_PART__RESOURCE_TYPE.equals(feature)) {

			executeTransformation();
			refreshFigure();
		}
		super.handleNotificationEvent(notification);
	}

	private void executeTransformation() {

		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			PlatformPart platformPart = (PlatformPart) getNotationView().getElement();
			if (platformPart instanceof ResourcePart && ((ResourcePart) platformPart).getResourceType() == null) {
				return;
			}
			Activator.updateHWPortParts(editingDomain, platformPart);
		}
	}

	private void refreshFigure() {
		ResourcePart element = (ResourcePart) resolveSemanticElement();
		ResourceFigure figure = (ResourceFigure) getContentPane();
		if (element.getResourceType() != null && HwresourceinstancePackage.Literals.DEVICE_INSTANCE
				.isSuperTypeOf(element.getResourceType().eClass())) {
			isDevice = true;
			figure.getFigureResourceRectangleInfo().setVisible(false);
			figure.setBackgroundColor(COLOR_DEVICE);

		} else {
			isDevice = false;
			figure.getFigureResourceRectangleInfo().setVisible(true);
			figure.setBackgroundColor(COLOR_NORMAL);

		}
	}

	public class ModifiedCustomResourceFigure extends ResourceFigure  {

		@Override
		protected void fillShape(Graphics graphics) {

			if (isDevice) {
				super.fillShape(graphics);
			}

			else {
				Color bgColor = graphics.getBackgroundColor();
				Color fgColor = graphics.getForegroundColor();
				// Set the graphics color
				graphics.setForegroundColor(ColorConstants.buttonLightest);
				graphics.setBackgroundColor(ColorConstants.buttonDarker);
				// Restore the original colors
				graphics.fillGradient(getBounds(), true);
				graphics.setBackgroundColor(bgColor);
				graphics.setForegroundColor(fgColor);

			}
		}
	}
}
