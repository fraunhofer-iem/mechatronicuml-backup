package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class RealtimestatechartNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7014;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimestatechartNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimestatechartNavigatorItem item = (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimestatechartNavigatorItem) element;
			return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.MumlinstanceVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
