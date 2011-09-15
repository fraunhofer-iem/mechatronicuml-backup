package de.uni_paderborn.fujaba.common.emf.edit.ui.parsers;

import java.util.List;

import de.uni_paderborn.fujaba.common.emf.edit.ui.property.Range;

/**
 * An ITextParser is able to parse a text in order to create a new object
 * represented by that text.
 * 
 * @author bingo
 * 
 */
public interface ITextParser {

	/**
	 * Creates an object represented by the given text.
	 * 
	 * @param text
	 *            The text representing the objects to create.
	 * @param range
	 *            The range to parse.
	 * @param returnedErrorRanges
	 *            The error ranges in the text.
	 * @return The created objects.
	 */
	Object createObject(char[] text, Range range,
			List<Range> returnedErrorRanges);
}
