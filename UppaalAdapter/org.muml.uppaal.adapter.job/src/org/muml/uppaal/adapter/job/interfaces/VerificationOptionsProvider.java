package org.muml.uppaal.adapter.job.interfaces;

import org.muml.pim.constraint.VerifiableElement;
import org.muml.uppaal.options.Options;

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
