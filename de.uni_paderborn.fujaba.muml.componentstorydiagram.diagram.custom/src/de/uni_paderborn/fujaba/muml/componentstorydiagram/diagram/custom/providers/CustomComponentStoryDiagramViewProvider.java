package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramViewProvider;

public class CustomComponentStoryDiagramViewProvider extends
		ComponentStoryDiagramViewProvider {
	@Override
	public Node createPartVariable_3014(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = super.createPartVariable_3014(domainElement, containerView,
				index, persisted, preferencesHint);

		// adapt color
//		CsdmUtility.adaptColor(node);

		return node;
	}

}
