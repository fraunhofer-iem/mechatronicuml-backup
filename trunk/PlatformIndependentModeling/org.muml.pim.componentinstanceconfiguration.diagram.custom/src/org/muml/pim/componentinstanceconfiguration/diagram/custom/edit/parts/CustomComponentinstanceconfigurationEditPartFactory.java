package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.MumlEditPartFactory;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationEditPartFactory extends
		MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
				return new CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart(
						view);

			case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
				return new CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart(
						view);
			case AtomicComponentInstanceEditPart.VISUAL_ID:
				return new CustomAtomicComponentInstanceEditPart(view);

			case AtomicComponentInstance2EditPart.VISUAL_ID:
				return new CustomAtomicComponentInstance2EditPart(view);

			case StructuredComponentInstance2EditPart.VISUAL_ID:
				return new CustomStructuredComponentInstance2EditPart(view);

			case StructuredComponentInstanceEditPart.VISUAL_ID:
				return new CustomStructuredComponentInstanceEditPart(view);

			case StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
				return new CustomStructuredComponentInstanceComponentInstanceContentsCompartmentEditPart(
						view);

			case StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
				return new CustomStructuredComponentInstanceComponentInstanceContentsCompartment2EditPart(
						view);

			case CoordinationProtocolInstanceEditPart.VISUAL_ID:
				return new CustomCoordinationProtocolInstanceEditPart(view);

			case CoordinationProtocolInstance2EditPart.VISUAL_ID:
				return new CustomCoordinationProtocolInstance2EditPart(view);

			case AssemblyConnectorInstanceEditPart.VISUAL_ID:
				return new CustomAssemblyConnectorInstanceEditPart(view);

			}
		}
		return super.createEditPart(context, model);
	}

}
