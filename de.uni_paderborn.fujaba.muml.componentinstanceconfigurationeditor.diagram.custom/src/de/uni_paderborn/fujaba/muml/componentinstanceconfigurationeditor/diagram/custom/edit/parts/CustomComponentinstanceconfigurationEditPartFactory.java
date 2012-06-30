package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.MumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry;

/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationEditPartFactory extends
		MumlEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (MumlVisualIDRegistry.getVisualID(view)) {
			case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
				return new CustomDiscreteMultiPortInstanceEditPart(view);
				
			case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
				return new CustomDiscreteMultiPortInstance2EditPart(view);
			
			case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
				return new CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart(view);
			
			case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
				return new CustomDiscreteSinglePortInstanceEditPart(view);
				
			case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
				return new CustomDiscreteSinglePortInstance2EditPart(view);

			case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
				return new CustomDiscreteSinglePortInstance3EditPart(view);
				
			case ContinuousPortInstanceEditPart.VISUAL_ID:
				return new CustomContinuousPortInstanceEditPart(view);
				
			case ContinuousPortInstance2EditPart.VISUAL_ID:
				return new CustomContinuousPortInstance2EditPart(view);
				
			case HybridPortInstanceEditPart.VISUAL_ID:
				return new CustomHybridPortInstanceEditPart(view);
				
			case HybridPortInstance2EditPart.VISUAL_ID:
				return new CustomHybridPortInstance2EditPart(view);

			case StructuredComponentInstanceEditPart.VISUAL_ID:
				return new CustomStructuredComponentInstanceEditPart(view);

			case AtomicComponentInstanceEditPart.VISUAL_ID:
				return new CustomAtomicComponentInstanceEditPart(view);
		
//			case ComponentInstanceComponentInstanceCompartmentEditPart.VISUAL_ID:
//				return new CustomComponentInstanceComponentInstanceCompartmentEditPart(
//						view);
			}
		}
		return super.createEditPart(context, model);
	}

}
