package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HardwareEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;


public class CustomPlatformInstanceEditPartFactory extends HardwareEditPartFactory{

	@Override
	public EditPart createEditPart(EditPart context, Object model){
		if(model instanceof View){
			View view= (View) model;
			
			switch (HardwareVisualIDRegistry.getVisualID(view)) {
			case StructuredResourceInstanceEditPart.VISUAL_ID:
				return new CustomStructuredResourceInstanceEditPart(view);
				
			case HWPlatformInstanceEditPart.VISUAL_ID:
				return new CustomHWPlatformInstanceEditPart(view);
				
			case HWPlatformInstance2EditPart.VISUAL_ID:
				return new CustomHWPlatformInstance2EditPart(view);
				
		//	case CustomHWPlatformInstanceConfigurationEditPart.VISUAL_ID:
		//		return new CustomHWPlatformInstanceConfigurationEditPart(view);
				
			}
			
		}
		
		
		return super.createEditPart(context, model);
	}
}
