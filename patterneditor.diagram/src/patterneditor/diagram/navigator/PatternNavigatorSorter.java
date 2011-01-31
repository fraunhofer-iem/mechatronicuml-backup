package patterneditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import patterneditor.diagram.part.PatternVisualIDRegistry;

/**
 * @generated
 */
public class PatternNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof PatternNavigatorItem) {
			PatternNavigatorItem item = (PatternNavigatorItem) element;
			return PatternVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
