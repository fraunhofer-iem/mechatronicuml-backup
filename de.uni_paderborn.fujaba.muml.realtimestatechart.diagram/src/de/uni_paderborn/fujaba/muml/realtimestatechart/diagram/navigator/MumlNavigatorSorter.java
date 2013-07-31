package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MumlNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7040;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem item = (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
