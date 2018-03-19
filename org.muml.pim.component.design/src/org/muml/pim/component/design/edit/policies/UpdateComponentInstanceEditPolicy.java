package org.muml.pim.component.design.edit.policies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.InstancePackage;

// Registers in ComponentInstance and listen to change of reference "componentType", then execute QVTO transformation!
public class UpdateComponentInstanceEditPolicy extends NotifyingGraphicalEditPolicy {
	EditingDomain editingDomain;
	
	// Sirius specific override
	protected EObject getSemanticElement() {
		Object model = getHost().getModel();
		if (model instanceof View) {
			View view = (View) model;
			EObject element = view.getElement();
			if (element instanceof DSemanticDecorator) {
				element = ((DSemanticDecorator) element).getTarget();
			}
			return element;
		}
		return null;
	}


	@Override
	public void activate() {
		super.activate();
		ComponentInstance componentInstance = (ComponentInstance) getSemanticElement();
		editingDomain = TransactionUtil.getEditingDomain(componentInstance);
		Display.getCurrent().asyncExec(new Runnable() {
			@Override
			public void run() {
				org.muml.pim.componentinstanceconfiguration.diagram.custom.part.Activator.updateComponentInstance(editingDomain, componentInstance);
			}
		});
	}

	protected void addListeners() {
		super.addListeners();
		
	}
	

	@Override
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (notification.getFeature() == InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_TYPE) {
			ComponentInstance componentInstance = (ComponentInstance) getSemanticElement();
			Display.getCurrent().asyncExec(new Runnable() {
				@Override
				public void run() {
					EditingDomain editingDomain = getEditingDomain();
					if (editingDomain != null) {
						org.muml.pim.componentinstanceconfiguration.diagram.custom.part.Activator.createComponentInstance(editingDomain, componentInstance);
					}
				}
			});
		}
	}

}
