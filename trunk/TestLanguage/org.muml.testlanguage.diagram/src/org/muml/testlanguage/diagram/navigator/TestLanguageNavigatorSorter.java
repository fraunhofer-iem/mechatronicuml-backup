package org.muml.testlanguage.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry;

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
		if (element instanceof TestLanguageNavigatorItem) {
			TestLanguageNavigatorItem item = (TestLanguageNavigatorItem) element;
			return TestLanguageVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
