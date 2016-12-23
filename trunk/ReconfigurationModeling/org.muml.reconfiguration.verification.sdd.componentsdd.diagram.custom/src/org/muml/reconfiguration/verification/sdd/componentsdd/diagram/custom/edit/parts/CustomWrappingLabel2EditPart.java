package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.PartVariable;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.storydiagram.patterns.BindingState;

public class CustomWrappingLabel2EditPart extends WrappingLabel2EditPart {

	public CustomWrappingLabel2EditPart(View view) {
		super(view);
	}
	

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE
				.equals(notification.getFeature())) {
			updateBound();
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateBound();
	}
	
	private void updateBound(){
		BindingState state = ((PartVariable)((View) getModel()).getElement()).getBindingState();
		
		if (BindingState.BOUND.equals(state)){
			((WrappingLabel) getFigure()).setTextUnderline(true);
		} else {
			((WrappingLabel) getFigure()).setTextUnderline(false);
		}
		
	}
}
