package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HardwarePortInstance2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HardwarePortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.MumlEditPartFactory;
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
			case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
				return new CustomPortInstanceEditPart(view);
				
//			case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
//				return new CustomPortInstanceEditPart(view);
				
			case HardwarePortInstanceEditPart.VISUAL_ID:
				return new CustomPortInstanceEditPart(view);
				
//			case HardwarePortInstance2EditPart.VISUAL_ID:
//				return new CustomPortInstanceEditPart(view);
				
			case ContinuousPortInstanceEditPart.VISUAL_ID:
				return new CustomPortInstanceEditPart(view);
				
//			case ContinuousPortInstance2EditPart.VISUAL_ID:
//				return new CustomPortInstanceEditPart(view);
				
			case HybridPortInstanceEditPart.VISUAL_ID:
				return new CustomPortInstanceEditPart(view);
				
//			case HybridPortInstance2EditPart.VISUAL_ID:
//				return new CustomPortInstanceEditPart(view);
				
			case ComponentInstanceEditPart.VISUAL_ID:
				return new CustomComponentInstanceEditPart(view);
		
			case ComponentInstanceComponentCompartmentEditPart.VISUAL_ID:
				return new CustomComponentInstanceComponentCompartmentEditPart(
						view);
			}
		}
		return super.createEditPart(context, model);
	}

}
