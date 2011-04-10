package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomiccomponentEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentEditPartFactory extends
		AtomiccomponentEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (AtomiccomponentVisualIDRegistry.getVisualID(view)) {
			case PortEditPart.VISUAL_ID:
				return new CustomPortEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
