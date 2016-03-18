package de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property;

public interface VerificationPropertyChoiceProvider {
	/**
	 * Initialize the provider (e.g., show a dialog for the user to decide). This is called once before any calls to other methods.
	 * @return true if preparation was successful, false to abort process
	 */
	boolean preparePropertyChoiceProvider(VerifiableElement element);
	
	/**
	 * Predicate that decides for each supplied property whether it is supposed to be included 
	 * for verification or not
	 */
	boolean isChosen(Property property);

}
