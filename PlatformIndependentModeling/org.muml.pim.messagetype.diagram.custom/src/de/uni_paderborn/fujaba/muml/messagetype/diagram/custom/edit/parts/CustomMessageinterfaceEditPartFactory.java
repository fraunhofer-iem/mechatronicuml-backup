package de.uni_paderborn.fujaba.muml.messagetype.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MumlEditPartFactory;

public class CustomMessageinterfaceEditPartFactory extends MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new CustomMessageTypeParametersCompartmentEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}

}
