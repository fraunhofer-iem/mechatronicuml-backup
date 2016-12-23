package org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry;

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
		if (element instanceof BasicSDDNavigatorItem) {
			BasicSDDNavigatorItem item = (BasicSDDNavigatorItem) element;
			return BasicSDDVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
