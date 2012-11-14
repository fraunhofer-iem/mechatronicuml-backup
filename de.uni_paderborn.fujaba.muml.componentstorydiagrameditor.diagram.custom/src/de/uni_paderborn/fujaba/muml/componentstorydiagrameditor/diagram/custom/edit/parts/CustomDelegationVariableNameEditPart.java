package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable;

public class CustomDelegationVariableNameEditPart extends
		DelegationVariableNameEditPart {
	
	public CustomDelegationVariableNameEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		SdmUtility.adaptColor(getFigure(), ((DelegationVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
		super.handleNotificationEvent(event);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		SdmUtility.adaptColor(getFigure(), ((DelegationVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
	}
}
