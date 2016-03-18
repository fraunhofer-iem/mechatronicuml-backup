package de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator;

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
		if (element instanceof de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) {
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem item = (de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
