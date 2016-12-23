package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule;
import org.muml.reconfiguration.componentstorydiagram.diagram.custom.util.CsdmUtility;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityNameEditPart;
import org.muml.storydiagram.activities.Activity;

public class CustomActivityNameEditPart extends ActivityNameEditPart {

	public CustomActivityNameEditPart(View view) {
		super(view);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateActivityNameLabel();
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateActivityNameLabel();
	}

	private void updateActivityNameLabel() {
		WrappingLabel activityNameLabel = (WrappingLabel)getFigure();
		Activity activity = (Activity)((View)getModel()).getElement();
		ComponentStoryRule componentStoryRule = (ComponentStoryRule)(activity.eContainer());
		activityNameLabel.setText(CsdmUtility.getSignature(componentStoryRule));
	}
}
