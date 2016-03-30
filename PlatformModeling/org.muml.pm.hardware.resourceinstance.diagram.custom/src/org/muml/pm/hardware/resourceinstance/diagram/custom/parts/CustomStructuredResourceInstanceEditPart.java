package org.muml.pm.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.muml.pm.hardware.common.figures.CustomIconFigure.ResourceType;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.resourceinstance.diagram.custom.part.Activator;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart;

/**
 * A customized EditPart for {@link StructuredResourceInstance}. A customized
 * Figure will be used, which underlines the text.
 * 
 * @author adann
 * 
 */
public class CustomStructuredResourceInstanceEditPart extends
		StructuredResourceInstanceEditPart {

	public CustomStructuredResourceInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * The execution of the transformation keeps this instance and its type in
	 * synch.
	 * 
	 * @author adann
	 */
	@Override
	public void activate() {
		super.activate();
		executeTransformation();
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape = new CustomStructuredResourceFigure();
		((CustomStructuredResourceFigure) primaryShape)
				.getFigureStructuredResourceNameFigure().setTextUnderline(true);
		((CustomStructuredResourceFigure) primaryShape)
				.getFigureStructuredResourceKindFigure().setTextUnderline(true);
		((CustomStructuredResourceFigure) primaryShape)
				.getFigureCustomStructuredIconFigure().setIcon(
						ResourceType.STRUCTURED);
		return primaryShape;
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
	
	public class CustomStructuredResourceFigure extends StructuredResourceFigure{
		
		@Override
		protected void fillShape(Graphics graphics) {
			Color bgColor = graphics.getBackgroundColor();
			Color fgColor = graphics.getForegroundColor();
			// Set the graphics color
			float hsbVals[] = java.awt.Color.RGBtoHSB( bgColor.getRed(),
                    bgColor.getGreen(),
                    bgColor.getBlue(), null );
		    java.awt.Color highlight = java.awt.Color.getHSBColor( hsbVals[0], hsbVals[1], 0.5f * (1f+ hsbVals[2] ));
		    java.awt.Color shadow = java.awt.Color.getHSBColor( hsbVals[0], hsbVals[1], 0.5f * hsbVals[2] );
			Color lightColor = new Color(bgColor.getDevice(), highlight.getRed(), highlight.getGreen(), highlight.getBlue());
			Color darkColor = new Color(bgColor.getDevice(), shadow.getRed(),shadow.getGreen(),shadow.getBlue());
			graphics.setForegroundColor(lightColor);
			graphics.setBackgroundColor(darkColor);
			// Restore the original colors
			graphics.fillGradient(getBounds(), true);
			graphics.setBackgroundColor(bgColor);
			graphics.setForegroundColor(fgColor);
		}
		
	}

}
