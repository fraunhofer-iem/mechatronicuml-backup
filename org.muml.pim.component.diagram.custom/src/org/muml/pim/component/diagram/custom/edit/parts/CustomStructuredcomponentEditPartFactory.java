package org.muml.pim.component.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.diagram.edit.parts.MumlEditPartFactory;
import org.muml.pim.component.diagram.part.MumlVisualIDRegistry;

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
			case CustomCoordinationProtocolPartEditPart.VISUAL_ID:
				return new CustomCoordinationProtocolPartEditPart(view);
			case CustomModelElementCategoryEditPart.VISUAL_ID:
				return new CustomModelElementCategoryEditPart(view);
			case CustomStaticStructuredComponentEditPart.VISUAL_ID:
				return new CustomStaticStructuredComponentEditPart(view);	
			case CustomPortPartEditPart.VISUAL_ID:
				return new CustomPortPartEditPart(view);
			case CustomComponentPartEditPart.VISUAL_ID:
				return new CustomComponentPartEditPart(view);
			case CustomStaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new CustomStaticStructuredComponentComponentCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
