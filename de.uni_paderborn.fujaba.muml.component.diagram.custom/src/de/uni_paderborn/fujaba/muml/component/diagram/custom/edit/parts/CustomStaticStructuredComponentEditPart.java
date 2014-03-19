package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart;

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
