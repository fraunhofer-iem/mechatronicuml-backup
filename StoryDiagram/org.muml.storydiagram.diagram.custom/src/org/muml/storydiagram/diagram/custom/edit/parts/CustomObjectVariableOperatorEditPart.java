package org.muml.storydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.diagram.custom.util.SdmUtility;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableOperatorEditPart;
import org.muml.storydiagram.patterns.ObjectVariable;

public class CustomObjectVariableOperatorEditPart extends ObjectVariableOperatorEditPart {
	public CustomObjectVariableOperatorEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);

		if (event.getNotifier() instanceof ObjectVariable) {
			adjustColorAndModifierLabel();
		}
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		adjustColorAndModifierLabel();
	}

	protected void adjustColorAndModifierLabel() {
		SdmUtility.adaptColor(getFigure(),
				((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());

		setLabelText(SdmUtility.adaptObjectVariableModifierText(this));
	}
}
