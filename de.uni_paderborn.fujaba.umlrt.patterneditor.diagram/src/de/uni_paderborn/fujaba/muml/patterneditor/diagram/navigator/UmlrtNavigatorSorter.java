package de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class UmlrtNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem item = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
