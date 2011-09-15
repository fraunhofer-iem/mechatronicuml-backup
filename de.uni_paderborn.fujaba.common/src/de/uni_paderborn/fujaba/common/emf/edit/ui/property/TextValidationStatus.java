package de.uni_paderborn.fujaba.common.emf.edit.ui.property;

import java.util.List;

/**
 * A validation status for text validation.
 * 
 * @author bingo
 * 
 */
public class TextValidationStatus implements IValidationStatus {

	/**
	 * The invalid ranges of the text.
	 */
	private List<Range> invalidRanges;

	/**
	 * Constructs this TextValidationStatus.
	 * 
	 * @param invalidRanges
	 *            The invalid ranges of the text.
	 */
	public TextValidationStatus(List<Range> invalidRanges) {
		this.invalidRanges = invalidRanges;
	}

	/**
	 * Finds out, if the validation has been successful.
	 * 
	 * @return <code>true</code>, if the validation was successful.
	 */
	@Override
	public boolean isSuccessful() {
		return invalidRanges == null || invalidRanges.isEmpty();
	}

	/**
	 * Gets the list of invalid ranges in the text, or <code>null</code>, if the
	 * text is valid.
	 * 
	 * @return The list of invalid ranges in the text.
	 */
	public List<Range> getInvalidRanges() {
		return invalidRanges;
	}
}
