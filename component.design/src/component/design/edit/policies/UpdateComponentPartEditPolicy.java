package component.design.edit.policies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.diagram.custom.part.Activator;

// XXX Register in ComponentPart and listen to change of reference "type", then execute QVTO transformation!
public class UpdateComponentPartEditPolicy extends NotifyingGraphicalEditPolicy {
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
	
	public ComponentPart getComponentPart() {
		EObject element = getSemanticElement();
		if (element instanceof ComponentPart) {
			return (ComponentPart) element;
		}
		return null;
	}
	


	@Override
	public void activate() {
		super.activate();
		ComponentPart componentPart = getComponentPart();
        editingDomain = TransactionUtil.getEditingDomain(componentPart);
		Activator.updateComponentPart(editingDomain, componentPart);
	}

	protected void addListeners() {
		super.addListeners();
		
	}
	

	@Override
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (notification.getFeature() == ComponentPackage.Literals.COMPONENT_PART__COMPONENT_TYPE) {
			ComponentPart componentPart = getComponentPart();
			Display.getCurrent().asyncExec(new Runnable() {
				@Override
				public void run() {
					Activator.updateComponentPart(editingDomain, componentPart);
				}
			});
	
		}
	}
}
