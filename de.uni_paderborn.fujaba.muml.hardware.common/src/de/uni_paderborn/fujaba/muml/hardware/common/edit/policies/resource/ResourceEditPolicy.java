package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.resource;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.muml.common.edit.policies.NotifyingGraphicalEditPolicy;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomResourceFigure;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;


/**
 * Base edit policy for all {@link ResourceType}s that uses the CustomResourceFigure.
 *  It provides handling model notifications and updating the CustomResourceFigure accordingly. 
 *  This base implementation does not depend on any semantic classes, but subclasses
 * should override handleNotificationEvent() and call refreshIcon() method.
 * 
 * @author adann
 * 
 */
public class ResourceEditPolicy extends NotifyingGraphicalEditPolicy {

	static final Font BOLD_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			SWT.BOLD);

	@Override
	public void activate() {
		super.activate();
		setFont();
		refreshIcon();
	}

	public IFigure getContentPane() {
		return ((AbstractGraphicalEditPart) getHost()).getContentPane();
	}

	public CustomResourceFigure getResourceFigure() {
		return (CustomResourceFigure) getContentPane();
	}

	public CustomIconFigure getIconFigure() {
		return getResourceFigure().getFigureCustomIconFigure();
	}

	/**
	 * This method sets the correct icon for a {@link ResourceType} based on its kind.
	 * 
	 */
	public void refreshIcon() {

		de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType element = getResourceType();
		ResourceType kind = ResourceType.PROCESSOR;
		Boolean isResourceInstance = isResourceInstance();
		getResourceFigure().getFigureResourceInfoRectangle().setVisible(true);

		if (element != null) {
			if (ResourcetypePackage.Literals.STRUCTURED_RESOURCE
					.isSuperTypeOf(element.eClass())) {
				kind = ResourceType.STRUCTURED;
			}
			if (ResourcetypePackage.Literals.DEVICE.isSuperTypeOf(element
					.eClass())) {
				if (((Device) element).getDeviceType() == DeviceKind.SENSOR) {
					kind = ResourceType.SENSOR;
				} else {
					kind = ResourceType.ACTUATOR;
				}

				getResourceFigure().getFigureResourceInfoRectangle()
						.setVisible(false);
			}
			if (ResourcetypePackage.Literals.PROCESSOR.isSuperTypeOf(element
					.eClass())) {
				kind = ResourceType.PROCESSOR;
			}
			if (ResourcetypePackage.Literals.PROGRAMMABLE_LOGIC_DEVICE
					.isSuperTypeOf(element.eClass())) {
				kind = ResourceType.PLD;
			}
			if (ResourcetypePackage.Literals.MEMORY_RESOURCE
					.isSuperTypeOf(element.eClass())) {
				kind = ResourceType.MEMORY;
			}
			getIconFigure().setIcon(kind);
			getResourceFigure().isResourceInstance(isResourceInstance);
		}

	}

	/**
	 * Get the current ResourceType
	 * @return the semanticElement as a {@link ResourceType}
	 */
	protected de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType getResourceType() {
		return (de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType) getSemanticElement();
	}

	/**
	 * A ResourceType is never a ResourceInstance
	 * @return false
	 */
	protected boolean isResourceInstance() {
		return false;
	}
	
	protected void setFont() {
		getResourceFigure().getFigureResourceNameFigure().setFont(BOLD_FONT);
		getResourceFigure().getFigureResourceKindFigure().setFont(BOLD_FONT);
		getResourceFigure().getFigureResourceCardinalityFigure().setFont(
				BOLD_FONT);
	}

	/**
	 * Updates the visualization of a ResourceType if its kind is changed.
	 */
	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		if (feature == ResourcetypePackage.Literals.DEVICE__DEVICE_TYPE) {
			refreshIcon();
		}
		super.handleNotificationEvent(notification);
	}

}
