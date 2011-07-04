package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.parameter;

import java.util.ArrayList;
import java.util.List;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.IValidationStatus;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.IValidator;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.Range;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.TextValidationStatus;

/**
 * A Validator, which checks if the parameter name contains only valid
 * characters.
 * 
 * @author bingo
 * 
 */
public class ParameterNameValidator implements IValidator {

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
