package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.parts.CustomStructuredcomponentEditPartFactory;

public class CustomReconfigurationEditPartFactory extends
		CustomStructuredcomponentEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart(
						view);
			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart(
						view);
			}
		}
		return super.createEditPart(context, model);

	}

}
