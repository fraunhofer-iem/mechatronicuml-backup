package org.muml.pim.pattern.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry;

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
		if (element instanceof MumlNavigatorItem) {
			MumlNavigatorItem item = (MumlNavigatorItem) element;
			return MumlVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
