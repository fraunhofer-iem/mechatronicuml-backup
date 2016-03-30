package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.diagram.custom.util.TextUtil;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel4EditPart;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;

public class CustomWrappingLabel4EditPart extends WrappingLabel4EditPart {

	public CustomWrappingLabel4EditPart(View view) {
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
		ActivityFinalNode node = (ActivityFinalNode) ((View) getModel()).getElement();

		setLabelText(TextUtil.getText(node));
	}

}
