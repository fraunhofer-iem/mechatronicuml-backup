package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.MumlinstanceEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentEditPartFactory extends
		MumlinstanceEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlinstanceVisualIDRegistry.getVisualID(view)) {
			case PortEditPart.VISUAL_ID:
				return new CustomPortEditPart(view);
			case AtomicComponentDiagramEditPart.VISUAL_ID:
				return new CustomAtomicComponentDiagramEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
