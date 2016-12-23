package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule;
import org.muml.reconfiguration.componentstorydiagram.diagram.custom.util.CsdmUtility;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart.ActivityFigure;

public class CustomComponentStoryRuleEditPart extends
		ComponentStoryRuleEditPart {

	public CustomComponentStoryRuleEditPart(View view) {
		super(view);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateActivityNameLabel();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		updateActivityNameLabel();
	}

	private void updateActivityNameLabel() {
		if (!getChildren().isEmpty()) {

			ActivityEditPart activityEditPart = (ActivityEditPart) getChildren().get(0);
			WrappingLabel activityNameLabel = ((ActivityFigure) activityEditPart
					.getPrimaryShape()).getFigureActivityName();
			
			ComponentStoryRule componentStoryRule = (ComponentStoryRule) ((View) getModel()).getElement();
			
			activityNameLabel.setText(CsdmUtility.getSignature(componentStoryRule));
		}

	}
}
