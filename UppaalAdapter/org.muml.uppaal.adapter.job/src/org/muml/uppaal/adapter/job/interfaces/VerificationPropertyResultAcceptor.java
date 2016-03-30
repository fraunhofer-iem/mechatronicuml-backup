package org.muml.uppaal.adapter.job.interfaces;

import org.muml.uppaal.adapter.results.PropertyResultRepository;

public interface VerificationPropertyResultAcceptor {
	/**
	 * Accept the results of the verification process (e.g., to display or log them)
	 */
	void acceptResult(PropertyResultRepository result);
}
