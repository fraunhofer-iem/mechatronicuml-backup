package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart;

public class CustomStaticStructuredComponentEditPart extends
		StaticStructuredComponentEditPart {

	public CustomStaticStructuredComponentEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// necessary to show the role pattern connection right after setting the
		// Port.refines feature
		if (notification.getFeature() == ComponentPackage.Literals.STRUCTURED_COMPONENT__GMF_PROTOCOLS) {
			java.util.List<org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy> editPolicies = org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy
					.getRegisteredEditPolicies(getDiagramView().getElement());
			for (org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy editPolicy : editPolicies) {
				editPolicy.refresh();
			}
		}
		super.handleNotificationEvent(notification);
	}

}
