package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart.ActivityFigure;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryRuleEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule;

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
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateActivityNameLabel();
	}

	private void updateActivityNameLabel() {
		if (!getChildren().isEmpty()) {

			ActivityEditPart activityEditPart = (ActivityEditPart) getChildren()
					.get(0);
			WrappingLabel activityNameLabel = ((ActivityFigure) activityEditPart
					.getPrimaryShape()).getFigureActivityName();
			
			ComponentStoryRule componentStoryRule = (ComponentStoryRule) ((View) getModel()).getElement();
			
			activityNameLabel.setText(CsdmUtility.getSignature(componentStoryRule));
		}

	}
}
