package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.providers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Sorting;
import org.eclipse.gmf.runtime.notation.SortingDirection;
import org.eclipse.gmf.runtime.notation.SortingStyle;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts.CustomStateCompoundCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlViewProvider;

public class CustomRealtimestatechartViewProvider extends MumlViewProvider {

	private static final String STATE_COMPOUND_COMPARTMENT_TYPE = MumlVisualIDRegistry
			.getType(StateCompoundCompartmentEditPart.VISUAL_ID);

	@Override
	public Node createState_2001(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node stateNode = super.createState_2001(domainElement, containerView,
				index, persisted, preferencesHint);

		// Configure Compound Compartment
		Node stateCompoundCompartment = getChildNode(stateNode,
				STATE_COMPOUND_COMPARTMENT_TYPE);
		if (stateCompoundCompartment != null) {
			configureStateCompoundCompartment(stateCompoundCompartment);
		}

		// Return the State Node
		return stateNode;
	}

	protected void configureStateCompoundCompartment(
			Node stateCompoundCompartment) {
		// Get or create the SortingStyle
		SortingStyle style = (SortingStyle) stateCompoundCompartment
				.getStyle(NotationPackage.eINSTANCE.getSortingStyle());
		if (style == null) {
			style = NotationFactory.eINSTANCE.createSortingStyle();

			@SuppressWarnings("unchecked")
			List<Style> styles = stateCompoundCompartment.getStyles();
			styles.add(style);
		}

		// Activate sorting
		style.setSorting(Sorting.AUTOMATIC_LITERAL);
		Map<String, SortingDirection> sortingKeys = new HashMap<String, SortingDirection>();
		sortingKeys.put(
				CustomStateCompoundCompartmentEditPart.DEFAULT_SORTING_KEY,
				SortingDirection.ASCENDING_LITERAL);
		style.setSortingKeys(sortingKeys);
	}

	protected Node getChildNode(Node stateNode, String type) {
		for (Object child : stateNode.getChildren()) {
			View view = (View) child;
			if (view.getType().equals(type)) {
				return (Node) view;
			}
		}
		return null;
	}

}
