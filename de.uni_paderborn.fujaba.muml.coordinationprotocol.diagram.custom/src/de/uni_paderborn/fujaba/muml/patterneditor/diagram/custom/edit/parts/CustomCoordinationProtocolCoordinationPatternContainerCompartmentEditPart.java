package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolCoordinationPatternContainerCompartmentEditPart;

public class CustomCoordinationProtocolCoordinationPatternContainerCompartmentEditPart
		extends
		CoordinationProtocolCoordinationPatternContainerCompartmentEditPart {

	public CustomCoordinationProtocolCoordinationPatternContainerCompartmentEditPart(
			View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// Call super implementation first
		super.handleNotificationEvent(notification);

		if (NotationPackage.Literals.VIEW__PERSISTED_CHILDREN
				.equals(notification.getFeature())
				|| NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN
						.equals(notification.getFeature())) {

			// Make sure super implementation was called before this, so that
			// new views are created already.

			List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
					.getRegisteredEditPolicies(this.getDiagramView()
							.getElement());
			for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
					.hasNext();) {
				CanonicalEditPolicy nextEditPolicy = it.next();

				// refresh() internally calls refreshConnections(), which in
				// turn creates the Link between the Pattern and the Role.
				nextEditPolicy.refresh();
			}
		}
	}

}
