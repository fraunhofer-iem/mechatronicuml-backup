package org.muml.pim.messagetype.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.messagetype.diagram.edit.parts.MumlEditPartFactory;

public class CustomMessageinterfaceEditPartFactory extends MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new CustomMessageTypeParametersCompartmentEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}

}
