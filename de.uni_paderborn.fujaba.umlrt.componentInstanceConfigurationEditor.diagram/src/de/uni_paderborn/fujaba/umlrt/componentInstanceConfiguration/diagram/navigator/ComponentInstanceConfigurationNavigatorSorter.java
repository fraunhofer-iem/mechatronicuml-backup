package de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ComponentInstanceConfigurationNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationNavigatorItem item = (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationNavigatorItem) element;
			return de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
