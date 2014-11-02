package de.uni_paderborn.fujaba.muml.deployment.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class AllocationNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem) {
			de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem item = (de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
