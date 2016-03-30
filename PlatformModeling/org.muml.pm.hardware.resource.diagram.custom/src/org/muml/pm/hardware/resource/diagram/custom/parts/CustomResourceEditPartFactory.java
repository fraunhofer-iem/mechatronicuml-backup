package org.muml.pm.hardware.resource.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pm.hardware.resource.diagram.edit.parts.HardwareEditPartFactory;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;

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

			default:
				break;


			}

		}

		return super.createEditPart(context, model);

	}

}
