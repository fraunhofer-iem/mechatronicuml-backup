package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;

public class CustomPartVariableNameEditPart extends PartVariableNameEditPart {

	public CustomPartVariableNameEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		SdmUtility.adaptColor(getFigure(), ((PartVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
		super.handleNotificationEvent(event);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		SdmUtility.adaptColor(getFigure(), ((PartVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
		((WrappingLabel) getFigure()).setTextUnderline(true);

	}
}
