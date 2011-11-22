package de.uni_paderborn.fujaba.common.emf.edit.ui.textual.labelproviders;

import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ILabelProvider;

import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.Range;

/**
 * Default implementation of IMultiLabelProvider; it requires label provider for
 * single objects and a join element to concatenate the resulting strings
 * together.
 * 
 * @author bingo
 * 
 */
public class DefaultMultiLabelProvider implements IMultiLabelProvider {

	/**
	 * The join element to concatenate the strings for each object.
	 */
	protected String joinElement;

	/**
	 * The label provider to create a label for a single object.
	 */
	protected ILabelProvider objectLabelProvider;

	/**
	 * Constructs this DefaultMultiLabelProvider.
	 * 
	 * @param joinElement
	 *            The join element to concatenate the strings for each object.
	 * @param labelProvider
	 *            The label provider to create a label for a single object.
	 */
	public DefaultMultiLabelProvider(String joinElement,
			ILabelProvider labelProvider) {
		this.joinElement = joinElement;
		this.objectLabelProvider = labelProvider;
	}

	@Override
	public String getText(List<Object> objects,
			Map<Object, Range> returnedTextSelections) {

		StringBuffer buffer = new StringBuffer();

		boolean first = true;
		for (Object object : objects) {
			if (!first) {
				// Append the split element
				buffer.append(joinElement);
			}

			// Get the label for the element
			String label = objectLabelProvider.getText(object);

			// Create a text selection for the element
			Range textSelection = new Range(buffer.length(), label.length());
			returnedTextSelections.put(object, textSelection);

			// Append the label
			buffer.append(label);
			first = false;
		}

		return buffer.toString();
	}

}
