package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePort2EditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePortEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentEditPartFactory extends
		MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			case StructuredComponentEditPart.VISUAL_ID:
				return new CustomStructuredComponentEditPart(view);
			case StructuredComponentDiagramEditPart.VISUAL_ID:
				return new CustomStructuredComponentDiagramEditPart(view);
			case DiscretePortEditPart.VISUAL_ID:
				return new CustomDiscretePortEditPart(view);
			case ContinuousPortEditPart.VISUAL_ID:
				return new CustomContinuousPortEditPart(view);
			case HybridPortEditPart.VISUAL_ID:
				return new CustomHybridPortEditPart(view);
			case HardwarePortEditPart.VISUAL_ID:
				return new CustomHardwarePortEditPart(view);
			case DiscretePort2EditPart.VISUAL_ID:
				return new CustomDiscretePortEditPart(view);
			case ContinuousPort2EditPart.VISUAL_ID:
				return new CustomContinuousPortEditPart(view);
			case HybridPort2EditPart.VISUAL_ID:
				return new CustomHybridPortEditPart(view);
			case HardwarePort2EditPart.VISUAL_ID:
				return new CustomHardwarePortEditPart(view);
			case ComponentPartEditPart.VISUAL_ID:
				return new CustomComponentPartEditPart(view);
			case StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new CustomStructuredComponentComponentCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
