package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.multifeaturecreationdialog;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * An ITextProvider is able to provide a text for a set of objects.
 **/
public interface ITextProvider {

	/**
	 * Provides a text for the set of passed objects.
	 * 
	 * @param objects
	 *            The objects to represent by the text.
	 * @param returnedTextSelections
	 *            An empty map, which should be filled with the new substring
	 *            areas for each object.
	 * 
	 * @return The representing text.
	 */
	String getText(List<EObject> objects,
			Map<EObject, Range> returnedTextSelections);

}
