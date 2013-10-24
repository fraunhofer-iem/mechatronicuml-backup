package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HardwareEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author adann
 * 
 */

public class CustomResourceEditPartFactory extends HardwareEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {

		if (model instanceof View) {
			View view = (View) model;

			switch (HardwareVisualIDRegistry.getVisualID(view)) {
			case StructuredResourceEditPart.VISUAL_ID:
				return new CustomStructuredResourceEditPart(view);

			case ProcessorEditPart.VISUAL_ID:
				return new CustomProcessorEditPart(view);

			}

		}

		return super.createEditPart(context, model);

	}

}
