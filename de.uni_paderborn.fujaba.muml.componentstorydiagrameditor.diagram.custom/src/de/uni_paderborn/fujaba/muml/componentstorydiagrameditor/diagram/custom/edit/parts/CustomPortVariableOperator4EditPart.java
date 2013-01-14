package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableOperator4EditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

public class CustomPortVariableOperator4EditPart extends
		PortVariableOperator4EditPart {

	public CustomPortVariableOperator4EditPart(View view) {
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
		SdmUtility.adaptColor(getFigure(), ((PortVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
	}
	
	private void updateText(){
		setLabelText(CsdmUtility.adaptComponentStoryPatternVariableText(this));
	}


}
