package de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentEditPartFactory extends MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			default:
			}
		}
		return super.createEditPart(context, model);
	}

}
