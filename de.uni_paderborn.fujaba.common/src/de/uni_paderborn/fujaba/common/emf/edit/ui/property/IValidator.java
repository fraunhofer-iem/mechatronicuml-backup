package de.uni_paderborn.fujaba.common.emf.edit.ui.property;


/**
 * A Validator can decide, if a given input is valid.
 * 
 * @author bingo
 * 
 */
public interface IValidator {
	/**
	 * Validates the input and creates a validation status.
	 * 
	 * @param object
	 *            The input to validate.
	 * @return The validation status representing the outcome.
	 */
	IValidationStatus validate(Object object);

}
