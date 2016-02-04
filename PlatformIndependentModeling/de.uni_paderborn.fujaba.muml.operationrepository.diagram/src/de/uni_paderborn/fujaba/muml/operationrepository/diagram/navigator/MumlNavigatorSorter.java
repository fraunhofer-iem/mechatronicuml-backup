package de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator;

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
		if (element instanceof de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem item = (de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
