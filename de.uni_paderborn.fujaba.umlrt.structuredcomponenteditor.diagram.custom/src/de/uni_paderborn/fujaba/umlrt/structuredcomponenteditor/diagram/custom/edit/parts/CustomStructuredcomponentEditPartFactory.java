package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.MumlinstanceEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentEditPartFactory extends
		MumlinstanceEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlinstanceVisualIDRegistry.getVisualID(view)) {
			case StructuredComponentDiagramEditPart.VISUAL_ID:
				return new CustomStructuredComponentDiagramEditPart(view);
			case PortEditPart.VISUAL_ID:
				return new CustomPortEditPart(view);
			case Port2EditPart.VISUAL_ID:
				return new CustomPortEditPart(view);
			case ComponentPartEditPart.VISUAL_ID:
				return new CustomComponentPartEditPart(view);
			case StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new CustomStructuredComponentComponentCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
