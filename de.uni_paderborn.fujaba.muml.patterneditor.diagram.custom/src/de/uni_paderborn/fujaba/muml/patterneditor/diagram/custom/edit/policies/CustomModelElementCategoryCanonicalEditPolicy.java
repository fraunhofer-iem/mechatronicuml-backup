package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.policies;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.ExtendableElement;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.ModelElementCategoryCanonicalEditPolicy;

public class CustomModelElementCategoryCanonicalEditPolicy extends
		ModelElementCategoryCanonicalEditPolicy {

	@SuppressWarnings("unchecked")
	@Override
	protected List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> getSemanticChildrenViewDescriptors() {
		View containerView = (View) getHost().getModel();
		List<GraphicalEditPart> childEditParts = getHost().getChildren();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor>();
		for (GraphicalEditPart childEditPart : childEditParts) {
			View childView = childEditPart.getNotationView();
			ExtendableElement childElement = (ExtendableElement) childView.getElement(); 
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(containerView, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

}
