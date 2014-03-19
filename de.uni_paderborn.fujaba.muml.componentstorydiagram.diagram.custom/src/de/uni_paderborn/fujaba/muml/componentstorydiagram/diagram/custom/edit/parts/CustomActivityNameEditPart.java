package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityNameEditPart;

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
