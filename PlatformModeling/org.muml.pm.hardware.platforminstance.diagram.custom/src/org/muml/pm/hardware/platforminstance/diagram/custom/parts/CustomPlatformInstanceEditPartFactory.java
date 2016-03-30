package org.muml.pm.hardware.platforminstance.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HardwareEditPartFactory;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;

public class CustomPlatformInstanceEditPartFactory extends HardwareEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (HardwareVisualIDRegistry.getVisualID(view)) {
			case StructuredResourceInstanceEditPart.VISUAL_ID:
				return new CustomStructuredResourceInstanceEditPart(view);

			case HWPlatformInstanceEditPart.VISUAL_ID:
				return new CustomHWPlatformInstanceEditPart(view);

			case HWPlatformInstance2EditPart.VISUAL_ID:
				return new CustomHWPlatformInstance2EditPart(view);

			default:
				break;
			}

		}

		return super.createEditPart(context, model);
	}
}
