package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.edit.parts;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

import de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart;
import de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry;

public class CustomModelElementCategoryEditPart extends de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart {

	public CustomModelElementCategoryEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy("CustomCanonical", new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies.ModelElementCategoryCanonicalEditPolicy(false) {

			protected EditPart getSourceEditPart(UpdaterLinkDescriptor descriptor,
					Domain2Notation domain2NotationMap) {
				EditPart sourceEditPart = super.getSourceEditPart(descriptor, domain2NotationMap);
				// Begin added to fix #542				
				if (/*descriptor.getVisualID() == CoordinationProtocolRolesEditPart.VISUAL_ID &&*/ sourceEditPart != null && sourceEditPart.getModel() instanceof View) {
					View sourceView = (View) sourceEditPart.getModel();					
					String wrongHint = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
							.getType(CoordinationPatternEditPart.VISUAL_ID);
					String rightHint = PatternVisualIDRegistry
							.getType(CoordinationPattern2EditPart.VISUAL_ID);
					if (wrongHint.equals(sourceView.getType())) {
						TreeIterator<EObject> allContents = sourceView.eAllContents();
						while (allContents.hasNext()) {
							EObject object =  allContents.next();
							View view = null;
							if (object instanceof View) {
								view = (View) object;
							}
							if (view != null && rightHint.equals((view).getType())) {
								sourceEditPart = (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
								break;
							}
						}
					}
				}
				// End added
				return sourceEditPart;
			}

		});
	}

}
