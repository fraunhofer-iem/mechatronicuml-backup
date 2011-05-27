package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MessageinterfaceNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.navigator.MessageinterfaceNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.navigator.MessageinterfaceNavigatorItem item = (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.navigator.MessageinterfaceNavigatorItem) element;
			return de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
