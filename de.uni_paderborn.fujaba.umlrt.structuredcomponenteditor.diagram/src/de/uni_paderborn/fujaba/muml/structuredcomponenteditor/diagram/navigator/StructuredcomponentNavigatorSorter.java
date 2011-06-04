package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class StructuredcomponentNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) {
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem item = (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.UmlrtVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
