package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.Range;

/**
 * An ITextParse is able to parse a text in order to create new objects
 * represented by that text.
 * 
 * @author bingo
 * 
 */
public interface ITextParser {

	/**
	 * Creates objects represented by the given text.
	 * 
	 * @param text
	 *            The text representing the objects to create.
	 * @return The created objects.
	 */
	List<EObject> createObjects(String text, Map<EObject, Range> returnedSelectionRanges,
			List<Range> returnedErrorRanges);
}
