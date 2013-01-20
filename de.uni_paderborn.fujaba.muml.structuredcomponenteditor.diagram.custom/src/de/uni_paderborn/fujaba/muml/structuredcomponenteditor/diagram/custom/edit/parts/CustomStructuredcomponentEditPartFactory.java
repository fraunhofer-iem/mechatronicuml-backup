package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.CoordinationProtocolEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortGmfProtocolEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart;
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
			case CoordinationProtocolEditPart.VISUAL_ID:
				return new CustomCoordinationProtocolEditPart(view);
			case StaticStructuredComponentEditPart.VISUAL_ID:
				return new CustomStaticStructuredComponentEditPart(view);
			case CustomRolePatternEditPart.VISUAL_ID:
				return new CustomRolePatternEditPart(view);
			case DiscretePortEditPart.VISUAL_ID:
				return new CustomDiscretePortEditPart(view);
			case ContinuousPortEditPart.VISUAL_ID:
				return new CustomContinuousPortEditPart(view);
			case DiscretePortGmfProtocolEditPart.VISUAL_ID:
				return new CustomDiscretePortGmfProtocolEditPart(view);
			case DiscretePort2EditPart.VISUAL_ID:
				return new CustomDiscretePort2EditPart(view);
			case ContinuousPort2EditPart.VISUAL_ID:
				return new CustomContinuousPortEditPart(view);
			case HybridPortEditPart.VISUAL_ID:
				return new CustomHybridPortEditPart(view);
			case ComponentPartEditPart.VISUAL_ID:
				return new CustomComponentPartEditPart(view);
			case StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new CustomStaticStructuredComponentComponentCompartmentEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
