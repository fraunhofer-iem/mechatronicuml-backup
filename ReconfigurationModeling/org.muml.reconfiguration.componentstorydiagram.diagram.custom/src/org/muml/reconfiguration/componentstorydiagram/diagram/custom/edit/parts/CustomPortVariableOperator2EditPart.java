package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.diagram.custom.util.CsdmUtility;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart;

public class CustomPortVariableOperator2EditPart extends
		PortVariableOperator2EditPart {

	public CustomPortVariableOperator2EditPart(View view) {
		super(view);
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		updateText();
		super.handleNotificationEvent(event);
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateText();
	}
	
	private void updateText(){
		setLabelText(CsdmUtility.adaptComponentStoryPatternVariableText(this));
	}


}
