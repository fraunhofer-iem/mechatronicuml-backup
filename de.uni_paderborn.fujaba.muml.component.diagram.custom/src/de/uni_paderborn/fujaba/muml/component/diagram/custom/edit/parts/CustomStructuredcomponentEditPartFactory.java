package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentEditPartFactory extends
		MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
//			case CoordinationProtocolEditPart.VISUAL_ID:
//				return new CustomCoordinationProtocolEditPart(view);
//			case CustomRolePatternEditPart.VISUAL_ID:
//				return new CustomRolePatternEditPart(view);
//			case DiscretePortGmfProtocolEditPart.VISUAL_ID:
//				return new CustomDiscretePortGmfProtocolEditPart(view);
//			case DiscretePort2EditPart.VISUAL_ID:
//				return new CustomDiscretePort2EditPart(view);
			case ComponentPartEditPart.VISUAL_ID:
				return new CustomComponentPartEditPart(view);
			case StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new CustomStaticStructuredComponentComponentCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
