package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;

public class CustomAssemblyVariableNameEditPart extends
		AssemblyVariableNameEditPart {

	public CustomAssemblyVariableNameEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
			CsdmUtility.adaptColor(getFigure(), ((AssemblyVariable) ((View) this
					.getModel()).getElement()).getBindingOperator());
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		CsdmUtility.adaptColor(getFigure(), ((AssemblyVariable) ((View) this
				.getModel()).getElement()).getBindingOperator());
	}
}
