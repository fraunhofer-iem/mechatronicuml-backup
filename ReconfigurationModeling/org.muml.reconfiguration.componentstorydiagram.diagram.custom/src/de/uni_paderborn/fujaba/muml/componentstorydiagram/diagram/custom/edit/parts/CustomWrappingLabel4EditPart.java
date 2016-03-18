package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.TextUtil;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel4EditPart;

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
