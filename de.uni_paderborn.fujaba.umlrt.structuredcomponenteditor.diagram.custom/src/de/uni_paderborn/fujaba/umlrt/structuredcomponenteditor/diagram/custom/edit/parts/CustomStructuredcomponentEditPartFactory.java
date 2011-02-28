package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredcomponentEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentEditPartFactory extends
		StructuredcomponentEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (StructuredcomponentVisualIDRegistry.getVisualID(view)) {
			case PortEditPart.VISUAL_ID:
				return new CustomPortEditPart(view);
			case Port2EditPart.VISUAL_ID:
				return new CustomPort2EditPart(view);
			case StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new CustomStructuredComponentComponentCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
