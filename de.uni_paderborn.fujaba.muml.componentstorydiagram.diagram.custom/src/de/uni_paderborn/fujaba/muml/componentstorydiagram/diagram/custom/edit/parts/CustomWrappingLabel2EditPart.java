package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.patterns.BindingState;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable;

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
