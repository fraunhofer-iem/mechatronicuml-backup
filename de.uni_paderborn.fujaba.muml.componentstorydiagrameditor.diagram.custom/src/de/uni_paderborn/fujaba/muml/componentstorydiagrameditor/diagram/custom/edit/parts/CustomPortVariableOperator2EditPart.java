package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableOperator2EditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

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
		CsdmUtility.adaptColor(getFigure(), ((PortVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
	}
	
	private void updateText(){
		setLabelText(CsdmUtility.adaptComponentStoryPatternVariableText(this));
	}


}
