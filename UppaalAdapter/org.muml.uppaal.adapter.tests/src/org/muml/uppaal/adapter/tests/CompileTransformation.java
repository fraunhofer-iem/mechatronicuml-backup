package org.muml.uppaal.adapter.tests;

import static org.junit.Assert.assertTrue;

import org.eclipse.core.runtime.IStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
