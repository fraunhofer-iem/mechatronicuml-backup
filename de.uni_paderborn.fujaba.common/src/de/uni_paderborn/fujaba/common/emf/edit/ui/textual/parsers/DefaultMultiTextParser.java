package de.uni_paderborn.fujaba.common.emf.edit.ui.textual.parsers;

import java.util.ArrayList;
import java.util.List;

import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.Range;

/**
 * Default implementation of IMultiTextParser, it requires a split element to
 * split the text into single objects and an object parser to parse single
 * objects.
 * 
 * @author bingo
 * 
 */
public class DefaultMultiTextParser extends AbstractMultiTextParser {

	/**
	 * The split element.
	 */
	protected char[] splitElement;

	/**
	 * The object parser.
	 */
	protected ITextParser objectParser;

	/**
	 * Constructs this DefaultMultiTextParser.
	 * 
	 * @param splitElement
	 *            The split element to use.
	 * @param objectParser
	 *            The object parser to use.
	 */
	public DefaultMultiTextParser(String splitElement, ITextParser objectParser) {
		this.splitElement = splitElement.toCharArray();
		this.objectParser = objectParser;
	}

	@Override
	protected List<Range> split(char[] input) {
		List<Range> ranges = new ArrayList<Range>();
		int start = 0;
		for (int i = 0; i < input.length - splitElement.length + 1; i++) {
			boolean found = true;
			for (int j = 0; j < splitElement.length && found; j++) {
				if (input[i + j] != splitElement[j]) {
					found = false;
				}
			}
			if (found) {
				ranges.add(new Range(start, i - start));
				i += splitElement.length - 1;
				start = i + 1;
			}
		}
		if (start <= input.length) {
			ranges.add(new Range(start, input.length - start));
		}
		return ranges;
	}

	@Override
	public Object createObject(char[] text, Range range,
			List<Range> returnedErrorRanges) {
		// Delegates to our object parser.
		return objectParser.createObject(text, range, returnedErrorRanges);
	}

}
