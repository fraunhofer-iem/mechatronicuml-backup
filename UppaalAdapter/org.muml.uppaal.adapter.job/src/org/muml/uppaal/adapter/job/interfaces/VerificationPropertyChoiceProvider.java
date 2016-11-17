package org.muml.uppaal.adapter.job.interfaces;

import org.muml.pim.constraint.VerifiableElement;
import org.muml.uppaal.adapter.mtctl.Property;

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
