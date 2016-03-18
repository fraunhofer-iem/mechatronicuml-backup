package de.uni_paderborn.fujaba.muml.common.edit.policies.component;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;

import de.uni_paderborn.fujaba.common.edit.policies.NotifyingGraphicalEditPolicy;
import de.uni_paderborn.fujaba.muml.common.edit.policies.IBackgroundColorEditPolicy;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

public class ComponentColorEditPolicy extends NotifyingGraphicalEditPolicy implements IBackgroundColorEditPolicy {

	private static final Color COLOR_CONTINUOUS = new Color(null, 230, 230, 230);
	private static final Color COLOR_SOFTWARE = new Color(null, 214, 226, 190);

	@Override
	public void activate() {
		super.activate();
		updateColor();
	}
	
	@Override
	protected void addListeners() {
		super.addListeners();
		EObject element = getSemanticElement();
		if (element instanceof ComponentInstance) {
			ComponentInstance componentInstance = (ComponentInstance) element;
			addNotificationListener(componentInstance.getComponentPart());
			addNotificationListener(componentInstance.getComponentType());
		}
		if (element instanceof ComponentPart) {
			ComponentPart componentPart = (ComponentPart) element;
			addNotificationListener(componentPart.getComponentType());
		}
	}
	
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (notification.getFeature() == ComponentPackage.Literals.COMPONENT_PART__COMPONENT_TYPE) {
			updateListeners();
			updateColor();
		}
		if (notification.getFeature() == ComponentPackage.Literals.COMPONENT__COMPONENT_KIND) {
			updateColor();
		}
		if (notification.getFeature() == InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_PART) {
			updateListeners();
			updateColor();
		}
		if (notification.getFeature() == InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_TYPE) {
			updateListeners();
			updateColor();
		}
	}
	
	private Component getComponent() {
		EObject semanticElement = getSemanticElement();
		if (semanticElement instanceof ComponentInstance) {
			ComponentInstance componentInstance = (ComponentInstance) semanticElement;
			if (componentInstance.getComponentPart() != null && componentInstance.getComponentPart().getComponentType() != null) {
				semanticElement = componentInstance.getComponentPart();
			}
			if (componentInstance.getComponentType() != null) {
				semanticElement = componentInstance.getComponentType();
			}
		}
		if (semanticElement instanceof ComponentPart) {
			return ((ComponentPart) semanticElement).getComponentType();
		} else if (semanticElement instanceof Component) {
			return (Component) semanticElement;
		}
		return null;
	}
	
	private void updateColor() {
		getHost().refresh();
	}
	
	@Override
	public Color getCurrentBackgroundColor() {
		Component component = getComponent();
		Color color = ColorConstants.white;
		if (component instanceof AtomicComponent) {
			if (component.getComponentKind() == ComponentKind.CONTINUOUS_COMPONENT)  {
				color = COLOR_CONTINUOUS;
			}
			if (component.getComponentKind() == ComponentKind.SOFTWARE_COMPONENT)  {
				color = COLOR_SOFTWARE;
			}
		}
		return color;
	}
}