package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.diagram.custom.util.CsdmUtility;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.DelegationVariable;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart;

public class CustomDelegationVariableNameEditPart extends
		DelegationVariableNameEditPart {
	
	public CustomDelegationVariableNameEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
			CsdmUtility.adaptColor(getFigure(), ((DelegationVariable) ((View) this
					.getModel()).getElement()).getBindingOperator());
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		CsdmUtility.adaptColor(getFigure(), ((DelegationVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
	}
}

