package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeParametersCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart;
import de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart;
import de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry;

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
			case ModelElementCategoryEditPart.VISUAL_ID:
				return new CustomModelElementCategoryEditPart(view);
			case RoleConnectorEditPart.VISUAL_ID:
				return new CustomRoleConnectorEditPart(view);
			case MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new CustomMessageTypeMessageTypesCompartmentEditPart(view);			
			case CustomCoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
				return new CustomCoordinationProtocolCoordinationProtocolContainerCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
