package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityNameEditPart;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule;

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
		activityNameLabel.setText(CsdmUtility.getSignature(((ReconfigurationRule)((Activity)((View)getModel()).getElement()).eContainer())));
	}
}
