package org.muml.pm.hardware.platforminstance.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

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
		if (element instanceof org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem item = (org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem) element;
			return org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
