package org.muml.pm.hardware.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.GenmodelTest;

@RunWith(Parameterized.class)
public class HardwareGenmodelTest extends GenmodelTest {

	public HardwareGenmodelTest(String genmodelPath) throws IOException {
		super(genmodelPath);
	}
	
	@Parameters
	public static Collection<Object[]> getGenmodelPaths() {
		return Collections.singleton(new Object[] {"org.muml.pm.hardware/model/hardware.genmodel"});
	}

}
