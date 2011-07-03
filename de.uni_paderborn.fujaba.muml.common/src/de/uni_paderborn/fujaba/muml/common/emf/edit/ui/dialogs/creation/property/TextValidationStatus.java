package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import java.util.List;


public class TextValidationStatus implements IValidationStatus {

	private List<Range> invalidRanges;
	
	public TextValidationStatus(List<Range> invalidRanges) {
		this.invalidRanges = invalidRanges;
	}

	@Override
	public boolean isSuccessful() {
		return invalidRanges == null || invalidRanges.isEmpty(); 
	}

	public List<Range> getInvalidRanges() {
		return invalidRanges;
	}
}
