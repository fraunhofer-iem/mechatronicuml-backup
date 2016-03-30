package org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator;

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
		if (element instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem item = (org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) element;
			return org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
