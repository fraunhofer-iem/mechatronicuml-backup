package org.muml.pim.operationrepository.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MumlNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof org.muml.pim.operationrepository.diagram.navigator.MumlNavigatorItem) {
			org.muml.pim.operationrepository.diagram.navigator.MumlNavigatorItem item = (org.muml.pim.operationrepository.diagram.navigator.MumlNavigatorItem) element;
			return org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
