package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.UmlrtEditPartFactory;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentEditPartFactory extends UmlrtEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (UmlrtVisualIDRegistry.getVisualID(view)) {
			case DiscretePortEditPart.VISUAL_ID:
				return new CustomDiscretePortEditPart(view);
			case AtomicComponentDiagramEditPart.VISUAL_ID:
				return new CustomAtomicComponentDiagramEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
