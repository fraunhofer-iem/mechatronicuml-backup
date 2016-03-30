package org.muml.storydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.diagram.custom.util.TextUtil;
import org.muml.storydiagram.diagram.edit.parts.Constraint2EditPart;
import org.muml.storydiagram.patterns.Constraint;

public class CustomConstraint2EditPart extends Constraint2EditPart {
	public CustomConstraint2EditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateLabel();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateLabel();
	}

	private void updateLabel() {
		Constraint constraint = (Constraint) ((View) getModel()).getElement();
		setLabelText(TextUtil.getText(constraint));
	}
}
