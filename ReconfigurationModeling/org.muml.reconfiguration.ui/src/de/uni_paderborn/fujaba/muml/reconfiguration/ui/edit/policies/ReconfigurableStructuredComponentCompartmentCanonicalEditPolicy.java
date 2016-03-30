package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.diagram.edit.policies.StaticStructuredComponentComponentCompartmentCanonicalEditPolicy;


public class ReconfigurableStructuredComponentCompartmentCanonicalEditPolicy
		extends StaticStructuredComponentComponentCompartmentCanonicalEditPolicy {
	private boolean canonicalNodes = true;

	public ReconfigurableStructuredComponentCompartmentCanonicalEditPolicy() {
		super();
	}

	public ReconfigurableStructuredComponentCompartmentCanonicalEditPolicy(
			boolean canonicalNodes) {
		super(canonicalNodes);
		this.canonicalNodes = canonicalNodes;
		
	}

	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenViewDescriptors() {
		// Begin added to switch off toplevel canonical behavior:
		if (!canonicalNodes) {
			View containerView = (View) getHost().getModel();
			List<View> childViews = containerView.getChildren();
			List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();

			for (View childView : childViews) {
				EObject childElement = childView.getElement();
				int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView);
				List<Integer> visualIDs = Arrays
						.asList(new Integer[] {
								org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID,
								org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID });
				if (childElement.eContainer() == containerView.getElement()
						&& visualIDs.contains(visualID)) {
					result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
			return result;
		}
		// End added

		View viewObject = (View) getHost().getModel();
		return de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationDiagramUpdater
				.getReconfigurableStructuredComponentCompartment_7077SemanticChildren(viewObject);

	}

	
}
