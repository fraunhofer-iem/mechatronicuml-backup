package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ComponentinstanceconfigurationNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7020;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem item = (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
