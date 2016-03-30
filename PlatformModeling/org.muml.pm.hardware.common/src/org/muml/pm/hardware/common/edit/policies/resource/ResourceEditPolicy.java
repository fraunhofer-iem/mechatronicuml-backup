package org.muml.pm.hardware.common.edit.policies.resource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pm.hardware.common.figures.CustomIconFigure;
import org.muml.pm.hardware.common.figures.CustomIconFigure.ResourceType;
import org.muml.pm.hardware.hwresource.Device;
import org.muml.pm.hardware.hwresource.DeviceKind;
import org.muml.pm.hardware.hwresource.HwresourcePackage;

/**
 * Base edit policy for all {@link ResourceType}s that uses the
 * CustomResourceFigure. It provides handling model notifications and updating
 * the CustomResourceFigure accordingly. This base implementation does not
 * depend on any semantic classes, but subclasses should override
 * handleNotificationEvent() and call refreshIcon() method.
 * 
 * @author adann
 * 
 */
public class ResourceEditPolicy extends NotifyingGraphicalEditPolicy {

	static final Font BOLD_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

	public static final Color COLOR_DEVICE = new Color(null, 230, 230, 230);

	@Override
	public void activate() {
		super.activate();
		setFont();
		refreshIcon();
	}

	public IFigure getContentPane() {
		return ((AbstractGraphicalEditPart) getHost()).getContentPane();
	}

	public CustomIconFigure getIconFigure() {
		try {
			Method method = getContentPane().getClass().getMethod("getFigureCustomIconFigure");

			return (CustomIconFigure) method.invoke(getContentPane());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method sets the correct icon for a {@link ResourceType} based on its
	 * kind.
	 * 
	 */
	public void refreshIcon() {

		EObject element = getElement();
		ResourceType kind = ResourceType.PROCESSOR;
		Boolean isResourceInstance = isResourceInstance();

		if (element != null) {
			if (HwresourcePackage.Literals.STRUCTURED_RESOURCE.isSuperTypeOf(element.eClass())) {
				kind = ResourceType.STRUCTURED;
			}
			if (HwresourcePackage.Literals.DEVICE.isSuperTypeOf(element.eClass())) {
				if (((Device) element).getDeviceKind() == DeviceKind.SENSOR) {
					kind = ResourceType.SENSOR;
				} else {
					kind = ResourceType.ACTUATOR;
				}
				isDevice(true);
			}
			if (HwresourcePackage.Literals.PROCESSOR.isSuperTypeOf(element.eClass())) {
				kind = ResourceType.PROCESSOR;
			}
			if (HwresourcePackage.Literals.PROGRAMMABLE_LOGIC_DEVICE.isSuperTypeOf(element.eClass())) {
				kind = ResourceType.PLD;
			}
			if (HwresourcePackage.Literals.MEMORY_RESOURCE.isSuperTypeOf(element.eClass())) {
				kind = ResourceType.MEMORY;
			}
			if (HwresourcePackage.Literals.COMMUNICATION_RESOURCE.isSuperTypeOf(element.eClass())) {
				kind = ResourceType.COMMUNICATION;
			}
			getIconFigure().setIcon(kind);
			isResourceInstance(isResourceInstance);
		}

	}

	/**
	 * Get the current Element, to which this EditPolicy is installed
	 * 
	 * @return the semanticElement as a {@link ResourceType}
	 */
	protected EObject getElement() {
		return getSemanticElement();
	}

	/**
	 * A ResourceType is never a ResourceInstance
	 * 
	 * @return false
	 */
	protected boolean isResourceInstance() {
		return false;
	}

	protected void setFont() {
		getFigureResourceNameFigure().setFont(BOLD_FONT);
		getFigureResourceKindFigure().setFont(BOLD_FONT);
		getFigureResourceCardinalityFigure().setFont(BOLD_FONT);
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

		if (feature == HwresourcePackage.Literals.DEVICE__DEVICE_KIND) {
			refreshIcon();
		}
		super.handleNotificationEvent(notification);
	}

	public WrappingLabel getFigureResourceCardinalityFigure() {
		try {
			Method method = getContentPane().getClass().getMethod("getFigureResourceCardinalityFigure");

			return (WrappingLabel) method.invoke(getContentPane());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WrappingLabel getFigureResourceKindFigure() {

		try {
			Method method = getContentPane().getClass().getMethod("getFigureResourceKindFigure");

			return (WrappingLabel) method.invoke(getContentPane());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WrappingLabel getFigureResourceNameFigure() {
		try {
			Method method = getContentPane().getClass().getMethod("getFigureResourceNameFigure");

			return (WrappingLabel) method.invoke(getContentPane());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public void isResourceInstance(Boolean isInstance) {
		getFigureResourceNameFigure().setTextUnderline(isInstance);
		getFigureResourceKindFigure().setTextUnderline(isInstance);
	}

	public void isDevice(Boolean isDevice) {
		if (isDevice) {
			getContentPane().setBackgroundColor(COLOR_DEVICE);
			((Shape) getContentPane()).setFill(true);

		} else {
			getContentPane().setBackgroundColor(ColorConstants.white);
		}

	}

}
