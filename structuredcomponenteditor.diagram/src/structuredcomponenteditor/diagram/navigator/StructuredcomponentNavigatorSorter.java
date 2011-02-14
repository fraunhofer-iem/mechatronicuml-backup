package structuredcomponenteditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry;

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
		if (element instanceof StructuredcomponentNavigatorItem) {
			StructuredcomponentNavigatorItem item = (StructuredcomponentNavigatorItem) element;
			return StructuredcomponentVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}
