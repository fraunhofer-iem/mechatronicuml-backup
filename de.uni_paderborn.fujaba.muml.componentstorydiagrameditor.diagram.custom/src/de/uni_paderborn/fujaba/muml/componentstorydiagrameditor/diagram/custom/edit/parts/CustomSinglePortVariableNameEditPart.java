package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable;

public class CustomSinglePortVariableNameEditPart extends SinglePortVariableNameEditPart {

	public CustomSinglePortVariableNameEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
			SdmUtility.adaptColor(getFigure(), ((SinglePortVariable) ((View) this
					.getModel()).getElement()).getBindingOperator());
		}
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		SdmUtility.adaptColor(getFigure(), ((SinglePortVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
	}

}
