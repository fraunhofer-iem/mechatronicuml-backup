package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class HardwareNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem item = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem) element;
			return de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
