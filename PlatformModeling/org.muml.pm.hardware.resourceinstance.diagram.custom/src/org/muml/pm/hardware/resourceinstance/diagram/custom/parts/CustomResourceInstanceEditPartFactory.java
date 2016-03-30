package org.muml.pm.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HardwareEditPartFactory;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author adann
 * 
 */
public class CustomResourceInstanceEditPartFactory extends HardwareEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (HardwareVisualIDRegistry.getVisualID(view)) {
			case StructuredResourceInstanceEditPart.VISUAL_ID:
				return new CustomStructuredResourceInstanceEditPart(view);

			case SensorInstanceEditPart.VISUAL_ID:
				return new CustomSensorInstanceEditPart(view);

			case ActuatorInstanceEditPart.VISUAL_ID:
				return new CustomActuatorInstanceEditPart(view);

			case ProcessorInstanceEditPart.VISUAL_ID:
				return new CustomProcessorInstanceEditPart(view);

			case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
				return new CustomPLDInstanceEditPart(view);

			case ProcessingMemoryInstanceEditPart.VISUAL_ID:
				return new CustomProcessingMemoryInstanceEditPart(view);

			case StorageMemoryInstanceEditPart.VISUAL_ID:
				return new CustomStorageMemoryInstanceEditPart(view);
			default:
				break;
			}

		}

		return super.createEditPart(context, model);
	}

}
