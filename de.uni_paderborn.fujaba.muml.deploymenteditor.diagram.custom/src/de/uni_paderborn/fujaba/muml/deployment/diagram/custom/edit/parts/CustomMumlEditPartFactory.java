package de.uni_paderborn.fujaba.muml.deployment.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart;
import de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.MumlEditPartFactory;

public class CustomMumlEditPartFactory extends MumlEditPartFactory  {
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case HardwarePortEditPart.VISUAL_ID:
				return new CustomHardwarePortEditPart(
						view);
			}
		}
		return super.createEditPart(context, model);
	}

}
