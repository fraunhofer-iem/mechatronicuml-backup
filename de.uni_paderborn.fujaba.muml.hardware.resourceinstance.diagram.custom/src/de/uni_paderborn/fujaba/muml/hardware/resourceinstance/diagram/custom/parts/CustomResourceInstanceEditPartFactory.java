package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HardwareEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author adann
 * 
 */
public class CustomResourceInstanceEditPartFactory extends HardwareEditPartFactory{
	
	@Override
	public EditPart createEditPart(EditPart context, Object model){
		if(model instanceof View){
			View view= (View) model;
			
			switch (HardwareVisualIDRegistry.getVisualID(view)) {
			case StructuredResourceInstanceEditPart.VISUAL_ID:
				return new CustomStructuredResourceInstanceEditPart(view);
			
		
				
			case SensorInstanceEditPart.VISUAL_ID:
				return new CustomSensorInstanceEditPart(view);
				
			case ActuatorInstanceEditPart.VISUAL_ID:
				return new CustomActuatorInstanceEditPart(view);
							
			}
			
		}
		
		
		return super.createEditPart(context, model);
	}

}
