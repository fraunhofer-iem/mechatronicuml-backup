package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.diagram.custom.util.CsdmUtility;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;

public class CustomDelegationVariableEditPart extends
		DelegationVariableEditPart {

	public CustomDelegationVariableEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
			CsdmUtility.adaptColor(this);
		}
	}
	
}

