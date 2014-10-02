package de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces;

import de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResultRepository;

public interface VerificationPropertyResultAcceptor {
	/**
	 * Accept the results of the verification process (e.g., to display or log them)
	 */
	void acceptResult(PropertyResultRepository result);
}
