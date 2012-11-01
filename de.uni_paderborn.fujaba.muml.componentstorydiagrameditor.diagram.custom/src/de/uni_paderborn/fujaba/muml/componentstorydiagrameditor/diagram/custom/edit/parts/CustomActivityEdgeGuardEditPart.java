package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.diagram.custom.util.LabelUtil;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeGuardEditPart;

public class CustomActivityEdgeGuardEditPart extends ActivityEdgeGuardEditPart {

	public CustomActivityEdgeGuardEditPart(View view) {
		super(view);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateLabel();
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateLabel();
	}
	
	private void updateLabel()
	{
		ActivityEdge edge = (ActivityEdge) ((View) getModel()).getElement();

		setLabelText(LabelUtil.getText(edge));
	}	
	
}
