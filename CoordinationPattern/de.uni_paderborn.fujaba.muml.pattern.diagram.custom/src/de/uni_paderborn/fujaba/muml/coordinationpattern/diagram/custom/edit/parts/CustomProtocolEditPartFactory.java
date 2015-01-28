package de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.edit.parts.CoordinationPattern2EditPart;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.edit.parts.MessageTypeParametersCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.edit.parts.ModelElementCategoryEditPart;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.edit.parts.PatternEditPartFactory;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.edit.parts.RoleConnectorEditPart;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.part.PatternVisualIDRegistry;

/**
 * Our customized EditPartFactory, which makes sure our overridden
 * EditPart-Classes are instantiated.
 * 
 * @author bingo
 * 
 */
public class CustomProtocolEditPartFactory extends PatternEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (PatternVisualIDRegistry.getVisualID(view)) {
			case CoordinationPattern2EditPart.VISUAL_ID:
				return new CustomCoordinationProtocol2EditPart(view);
			case ModelElementCategoryEditPart.VISUAL_ID:
				return new CustomModelElementCategoryEditPart(view);
			case RoleConnectorEditPart.VISUAL_ID:
				return new CustomRoleConnectorEditPart(view);
			case MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new CustomMessageTypeMessageTypesCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
