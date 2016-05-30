package org.muml.storydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.muml.storydiagram.diagram.custom.util.SdmUtility;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableTypeLabelEditPart;
import org.muml.storydiagram.patterns.BindingState;
import org.muml.storydiagram.patterns.ObjectVariable;

public class CustomObjectVariableTypeLabelEditPart extends ObjectVariableTypeLabelEditPart {
	public CustomObjectVariableTypeLabelEditPart(View view) {
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

	protected void updateFigure() {
		SdmUtility.adaptColor(getFigure(),
				((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());

		ObjectVariable ov = (ObjectVariable) ((View) getModel()).getElement();


		if (ov.getBindingState() == BindingState.BOUND) {
			setForegroundColor(new Color(null, 160, 160, 160));
			((WrappingLabel) this.getFigure()).setOpaque(false);
		} else if (ov.getBindingState() == BindingState.MAYBE_BOUND) {
			setBackgroundColor(new Color(null, 200, 200, 200));
			((WrappingLabel) this.getFigure()).setOpaque(true);
		} else if (ov.getBindingState() == BindingState.UNBOUND) {
			((WrappingLabel) this.getFigure()).setOpaque(false);
			/*
			 * Leave the color as is, so it is green in case of created
			 * objects, red for destroyed objects, and black otherwise.
			 */
		}

		((WrappingLabel) getFigure()).setTextUnderline(true);
	}
}
