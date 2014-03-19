package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlVisualIDRegistry;

/**
 * Our customized EditPartFactory, which makes sure our overridden
 * EditPart-Classes are instantiated.
 * 
 * @author bingo
 * 
 */
public class CustomProtocolEditPartFactory extends MumlEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			case CoordinationProtocol2EditPart.VISUAL_ID:
				return new CustomCoordinationProtocol2EditPart(view);
			case ModelElementCategoryEditPart.VISUAL_ID:
				return new CustomModelElementCategoryEditPart(view);
//			case CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
//				return new CustomCoordinationProtocolCoordinationProtocolContainerCompartmentEditPart(view);				
			}
		}
		return super.createEditPart(context, model);
	}
}
