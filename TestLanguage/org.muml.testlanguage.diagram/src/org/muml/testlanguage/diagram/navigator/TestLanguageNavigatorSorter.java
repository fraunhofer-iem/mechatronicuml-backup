package org.muml.testlanguage.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class TestLanguageNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof org.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) {
			org.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem item = (org.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) element;
			return org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
