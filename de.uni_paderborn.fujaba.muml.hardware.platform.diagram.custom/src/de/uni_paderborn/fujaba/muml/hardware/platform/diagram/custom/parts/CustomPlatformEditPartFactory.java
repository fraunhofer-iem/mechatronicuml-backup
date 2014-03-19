package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgeEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HardwareEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry;
/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author adann
 * 
 */
public class CustomPlatformEditPartFactory extends
		HardwareEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (HardwareVisualIDRegistry.getVisualID(view)) {
			case ResourceInstancePartEditPart.VISUAL_ID:
				return new CustomResourceInstancePartEditPart(view);
			
			case HWPlatformPartEditPart.VISUAL_ID:
				return new CustomHWPlatformPartEditPart(view);
				
			case BridgeEditPart.VISUAL_ID:
				return new CustomBridgeEditPart(view);
				
			case HWPlatformEditPart.VISUAL_ID:
				return new CustomHWPlatformEditPart(view);
				
			case BusEditPart.VISUAL_ID:
				return new CustomBusEditPart(view);
				
			} 

		} 

		return super.createEditPart(context, model);

	}

}
