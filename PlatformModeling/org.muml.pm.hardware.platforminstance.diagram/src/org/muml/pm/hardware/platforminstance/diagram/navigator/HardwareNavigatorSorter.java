package org.muml.pm.hardware.platforminstance.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class HardwareNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7016;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof HardwareNavigatorItem) {
			HardwareNavigatorItem item = (HardwareNavigatorItem) element;
			return HardwareVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
