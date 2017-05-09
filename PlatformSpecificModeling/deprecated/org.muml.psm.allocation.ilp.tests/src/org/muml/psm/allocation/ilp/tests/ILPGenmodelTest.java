package org.muml.psm.allocation.ilp.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.GenmodelTest;

@RunWith(Parameterized.class)
public class ILPGenmodelTest extends GenmodelTest {

	public ILPGenmodelTest(String genmodelPath) throws IOException {
		super(genmodelPath);
	}
	
	@Parameters
	public static Collection<Object[]> getGenmodelPaths() {
		return Collections.singleton(new Object[] {"org.muml.psm.allocation.ilp/model/ilp.genmodel"});
	}

}
