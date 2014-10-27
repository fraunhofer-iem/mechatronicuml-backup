package pattern.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import pattern.diagram.part.Pattern2VisualIDRegistry;

/**
 * @generated
 */
public class Pattern2NavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Pattern2NavigatorItem) {
			Pattern2NavigatorItem item = (Pattern2NavigatorItem) element;
			return Pattern2VisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
