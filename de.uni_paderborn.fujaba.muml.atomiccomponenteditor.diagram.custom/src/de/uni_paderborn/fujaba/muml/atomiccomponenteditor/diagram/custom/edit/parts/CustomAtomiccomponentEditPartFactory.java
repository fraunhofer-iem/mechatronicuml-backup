package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortEditPart;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HardwarePortEditPart;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortEditPart;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry;

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
			case DiscretePortEditPart.VISUAL_ID:
				return new CustomDiscretePortEditPart(view);
			case ContinuousPortEditPart.VISUAL_ID:
				return new CustomContinuousPortEditPart(view);
			case HybridPortEditPart.VISUAL_ID:
				return new CustomHybridPortEditPart(view);
			case HardwarePortEditPart.VISUAL_ID:
				return new CustomHardwarePortEditPart(view);
			case AtomicComponentDiagramEditPart.VISUAL_ID:
				return new CustomAtomicComponentDiagramEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
