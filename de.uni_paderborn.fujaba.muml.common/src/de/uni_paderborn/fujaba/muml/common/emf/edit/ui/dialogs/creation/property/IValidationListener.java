package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

/**
 * A Listener, which will be notified, if a validation occurred.
 * 
 * @author bingo
 * 
 */
public interface IValidationListener {

	/**
	 * This method is called, whenever a validation occurred.
	 * 
	 * @param valid
	 *            <code>true</code>, if the validation was valid.
	 */
	void validationOccurred(boolean valid);
}
