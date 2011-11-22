package de.uni_paderborn.fujaba.common.emf.edit.ui.textual.parsers;

import java.util.List;
import java.util.Map;

import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.Range;

/**
 * An IMultiTextParser is able to parse a text in order to create new objects
 * represented by that text.
 * 
 * @author bingo
 * 
 */
public interface IMultiTextParser {

	/**
	 * Creates objects represented by the given text.
	 * 
	 * @param text
	 *            The text representing the objects to create.
	 * @param returnedSelectionRanges
	 *            The ranges in the text representing the created objects.
	 * @param returnedErrorRanges
	 *            The error ranges in the text.
	 * @return The created objects.
	 */
	List<Object> createObjects(char[] text,
			Map<Object, Range> returnedSelectionRanges,
			List<Range> returnedErrorRanges);
}
