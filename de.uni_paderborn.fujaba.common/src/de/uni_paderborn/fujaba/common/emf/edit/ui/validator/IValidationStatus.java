package de.uni_paderborn.fujaba.common.emf.edit.ui.validator;

/**
 * The status of a validation.
 * 
 * @author bingo
 * 
 */
public interface IValidationStatus {

	/**
	 * Finds out, if the validation has been successful.
	 * 
	 * @return <code>true</code>, if the validation was successful.
	 */
	boolean isSuccessful();

}
