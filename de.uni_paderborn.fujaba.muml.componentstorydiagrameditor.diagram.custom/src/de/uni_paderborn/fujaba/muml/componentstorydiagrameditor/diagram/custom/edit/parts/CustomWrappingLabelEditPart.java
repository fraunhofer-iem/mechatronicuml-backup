package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabelEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;

public class CustomWrappingLabelEditPart extends WrappingLabelEditPart {

	public CustomWrappingLabelEditPart(View view) {
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
		CsdmUtility.adaptColor(getFigure(), ((PartVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
	}
	
	private void updateText(){
		setLabelText(CsdmUtility.adaptComponentStoryPatternVariableText(this));
	}

}
