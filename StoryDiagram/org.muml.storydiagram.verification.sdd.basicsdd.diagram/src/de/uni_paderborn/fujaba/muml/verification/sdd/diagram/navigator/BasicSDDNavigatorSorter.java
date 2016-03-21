package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class BasicSDDNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7016;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem) {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem item = (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
