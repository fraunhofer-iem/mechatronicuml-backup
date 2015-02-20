package de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;

public interface VerificationOptionsProvider {
	/**
	 * Initialize the provider (e.g., show a dialog for the user to decide). This is called once before any calls to other methods.
	 * @return true if preparation was successful, false to abort process
	 */
	boolean prepareOptionsProvider(VerifiableElement element);
	
	/**
	 * Supplies verification options
	 */
	Options getOptions();
	
}
