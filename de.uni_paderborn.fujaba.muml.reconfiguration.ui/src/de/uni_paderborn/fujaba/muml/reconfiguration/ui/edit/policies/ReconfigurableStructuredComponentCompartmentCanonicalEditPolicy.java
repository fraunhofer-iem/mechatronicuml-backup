package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.policies.StaticStructuredComponentComponentCompartmentCanonicalEditPolicy;

/**
 * @generated
 */
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
			List<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor>();

			for (View childView : childViews) {
				EObject childElement = childView.getElement();
				int visualID = de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView);
				List<Integer> visualIDs = Arrays
						.asList(new Integer[] {
								de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID,
								de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart.VISUAL_ID });
				if (childElement.eContainer() == containerView.getElement()
						&& visualIDs.contains(visualID)) {
					result.add(new de.uni_paderborn.fujaba.muml.component.diagram.part.MumlNodeDescriptor(
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
