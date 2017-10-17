package org.muml.pim.component.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.component.diagram.custom.part.Activator;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart;

public class CustomStaticStructuredComponentEditPart extends StaticStructuredComponentEditPart {

	public CustomStaticStructuredComponentEditPart(View view) {
		super(view);
	}


	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();

		if (ComponentPackage.Literals.STRUCTURED_COMPONENT__CONNECTORS
				.equals(feature)) {
			executeTransformation();
		}
		super.handleNotificationEvent(notification);
	}

	private void executeTransformation() {
		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			StructuredComponent component = (StructuredComponent) getNotationView()
					.getElement();
			Activator.updateCoordinationProtocolParts(editingDomain, component);
		}
	}


}
