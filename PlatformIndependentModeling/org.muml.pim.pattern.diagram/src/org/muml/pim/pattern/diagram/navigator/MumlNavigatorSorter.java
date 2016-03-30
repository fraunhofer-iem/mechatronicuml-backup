package org.muml.pim.pattern.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MumlNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7006;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof org.muml.pim.pattern.diagram.navigator.MumlNavigatorItem) {
			org.muml.pim.pattern.diagram.navigator.MumlNavigatorItem item = (org.muml.pim.pattern.diagram.navigator.MumlNavigatorItem) element;
			return org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
