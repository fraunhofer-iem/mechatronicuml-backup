package org.muml.storydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.expressions.TextualExpression;
import org.muml.storydiagram.diagram.custom.util.SdmUtility;
import org.muml.storydiagram.diagram.edit.parts.AttributeAssignmentEditPart;
import org.muml.storydiagram.patterns.AttributeAssignment;

public class CustomAttributeAssignmentEditPart extends AttributeAssignmentEditPart {
	public CustomAttributeAssignmentEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		updateFigure();
		super.handleNotificationEvent(event);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateFigure();
	}

	private void updateFigure() {
		AttributeAssignment aa = ((AttributeAssignment) ((View) getModel()).getElement());

		String text = "";

		if (aa.getAttribute() != null) {
			text = aa.getAttribute().getName() + " := ";
		} else {
			text = "[null] := ";
		}

		if (aa.getValueExpression() != null) {
			text += ((TextualExpression) aa.getValueExpression()).getExpressionText();
		} else {
			text += "[null]";
		}

		// if (text.length() > 50)
		// {
		// text = text.substring(0, 50);
		// text += "...";
		// }

		setLabelText(text);

		// ((WrappingLabel) getFigure()).setTextWrap(true);

		getFigure().setForegroundColor(SdmUtility.getColor(aa));
	}
}
