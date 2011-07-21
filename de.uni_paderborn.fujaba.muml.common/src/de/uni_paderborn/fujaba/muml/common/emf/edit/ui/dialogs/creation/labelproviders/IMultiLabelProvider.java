package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.labelproviders;

import java.util.List;
import java.util.Map;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.Range;

/**
 * An IMultiTextProvider is able to provide a text for a set of objects.
 **/
public interface IMultiLabelProvider {

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
	String getText(List<Object> objects,
			Map<Object, Range> returnedTextSelections);

}
