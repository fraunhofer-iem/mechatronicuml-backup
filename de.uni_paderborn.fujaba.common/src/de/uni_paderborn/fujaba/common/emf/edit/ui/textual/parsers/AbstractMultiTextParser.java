package de.uni_paderborn.fujaba.common.emf.edit.ui.textual.parsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.Range;

/**
 * Abstract implementation of the IMultiTextParser interface, it requires
 * subclasses to implement the ITextParser interface to parse single objects and
 * to implement a split() method.
 * 
 * @author bingo
 * 
 */
public abstract class AbstractMultiTextParser implements IMultiTextParser,
		ITextParser {

	/**
	 * Split the String containing multiple into single objects described by
	 * Ranges.
	 * 
	 * @param input
	 *            The input to split.
	 * @return The resulting ranges. There should be one range per object.
	 */
	protected abstract List<Range> split(char[] input);

	@Override
	public List<Object> createObjects(char[] text,
			Map<Object, Range> returnedSelectionRanges,
			List<Range> returnedErrorRanges) {
		List<Object> returnedObjects = new ArrayList<Object>();
		for (Range range : split(text)) {
			if (!range.isEmpty()) {
				Object element = createObject(text, range, returnedErrorRanges);
				if (element != null) {
					returnedObjects.add(element);
				}
				returnedSelectionRanges.put(element, range);
			}
		}
		return returnedObjects;
	}
}
