package de.uni_paderborn.fujaba.muml.verification.uppaal.tests;

import static org.junit.Assert.*;

import org.eclipse.core.runtime.IStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.verification.uppaal.job.Muml2UppaalJob;

public class CompileTransformation {
	
	private IStatus status;
	
	@Before
	public void setUp() throws Exception {
		//status = Muml2UppaalJob.loadTransformation("CoordinationProtocol");
		Assert.fail("FIX ME");
	}

	@Test
	public void compileTransformation() {
				
		assertTrue(status.getMessage(), status.isOK());
		
	}

}
