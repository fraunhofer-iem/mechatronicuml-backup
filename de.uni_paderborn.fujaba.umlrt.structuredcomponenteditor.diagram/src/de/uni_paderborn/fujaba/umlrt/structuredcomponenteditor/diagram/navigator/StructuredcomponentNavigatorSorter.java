package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class StructuredcomponentNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem item = (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) element;
			return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
