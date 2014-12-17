package de.uni_paderborn.fujaba.muml.pattern.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class PatternNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.PatternNavigatorItem) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.PatternNavigatorItem item = (de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.PatternNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
