package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.MumlEditPartFactory;
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
			case CustomCoordinationProtocolEditPart.VISUAL_ID:
				return new CustomCoordinationProtocolEditPart(view);
			case CustomModelElementCategoryEditPart.VISUAL_ID:
				return new CustomModelElementCategoryEditPart(view);
//			case CustomRolePatternEditPart.VISUAL_ID:
//				return new CustomRolePatternEditPart(view);
//			case CustomDiscretePortGmfProtocolEditPart.VISUAL_ID:
//				return new CustomDiscretePortGmfProtocolEditPart(view);
//			case CustomDiscretePort2EditPart.VISUAL_ID:
//				return new CustomDiscretePort2EditPart(view);
			case CustomComponentPartEditPart.VISUAL_ID:
				return new CustomComponentPartEditPart(view);
			case CustomStaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new CustomStaticStructuredComponentComponentCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
