package de.uni_paderborn.fujaba.common.emf.edit.ui.validator;

import java.util.ArrayList;
import java.util.List;

import de.uni_paderborn.fujaba.common.emf.edit.ui.property.Range;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.TextValidationStatus;

/**
 * A Validator, which checks if the identifier string contains only valid
 * characters.
 * 
 * @author bingo
 * 
 */
public class IdentifierValidator implements IValidator {

	@Override
	public IValidationStatus validate(Object object) {
		String text = (String) object;
		List<Range> ranges = new ArrayList<Range>();
		Range range = null;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (!Character.isJavaIdentifierPart(ch)) {
				if (range == null) {
					range = new Range(i, 1);
					ranges.add(range);
				} else {
					range.incrementLength();
				}
			} else {
				range = null;
			}
		}
		if (ranges.isEmpty()) {
			return new TextValidationStatus(null);
		}
		return new TextValidationStatus(ranges);
	}

}
