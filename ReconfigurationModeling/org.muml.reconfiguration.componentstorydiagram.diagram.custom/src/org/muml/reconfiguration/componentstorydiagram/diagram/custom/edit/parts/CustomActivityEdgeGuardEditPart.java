package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.diagram.custom.util.CsdmUtility;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEdgeGuardEditPart;
import org.storydriven.storydiagrams.activities.ActivityEdge;

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
	
	private void updateLabel(){
		ActivityEdge edge = (ActivityEdge) ((View) getModel()).getElement();
		setLabelText(CsdmUtility.getText(edge));
	}	
	
}
