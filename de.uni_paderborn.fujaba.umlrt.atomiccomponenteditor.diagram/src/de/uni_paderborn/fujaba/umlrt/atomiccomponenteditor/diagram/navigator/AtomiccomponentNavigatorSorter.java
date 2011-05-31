package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class AtomiccomponentNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 3004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem item = (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) element;
			return de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
