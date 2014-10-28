package de.uni_paderborn.fujaba.muml.hardware.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.tests.GenmodelTest;

@RunWith(Parameterized.class)
public class HardwareGenmodelTest extends GenmodelTest {

	public HardwareGenmodelTest(String genmodelPath) throws IOException {
		super(genmodelPath);
	}
	
	@Parameters
	public static Collection<Object[]> getGenmodelPaths() {
		return Collections.singleton(new Object[] {"de.uni_paderborn.fujaba.muml.hardware/model/hardware.genmodel"});
	}

}
