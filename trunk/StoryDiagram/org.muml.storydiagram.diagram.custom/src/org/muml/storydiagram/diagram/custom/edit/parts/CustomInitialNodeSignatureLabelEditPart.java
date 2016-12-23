package org.muml.storydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.diagram.custom.util.TextUtil;
import org.muml.storydiagram.diagram.edit.parts.InitialNodeLabelEditPart;

public class CustomInitialNodeSignatureLabelEditPart extends InitialNodeLabelEditPart {
	public CustomInitialNodeSignatureLabelEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateFigure();
	}

	private void updateFigure() {
		InitialNode node = (InitialNode) ((View) getModel()).getElement();

		setLabelText(TextUtil.getText(node));
	}
}
