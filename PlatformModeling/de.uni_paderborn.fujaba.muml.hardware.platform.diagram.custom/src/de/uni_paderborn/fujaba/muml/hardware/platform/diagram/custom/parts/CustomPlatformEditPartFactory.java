package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HardwareEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author adann
 * 
 */
public class CustomPlatformEditPartFactory extends HardwareEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (HardwareVisualIDRegistry.getVisualID(view)) {
			case ResourcePartEditPart.VISUAL_ID:
				return new CustomResourcePartEditPart(view);

			case HWPlatformPartEditPart.VISUAL_ID:
				return new CustomHWPlatformPartEditPart(view);

			case NetworkBridgeEditPart.VISUAL_ID:
				return new CustomBridgeEditPart(view);

			case HWPlatform2EditPart.VISUAL_ID:
				return new CustomHWPlatform2EditPart(view);

			case BusEditPart.VISUAL_ID:
				return new CustomBusEditPart(view);
			default:
				break;

			}

		}

		return super.createEditPart(context, model);

	}

}
