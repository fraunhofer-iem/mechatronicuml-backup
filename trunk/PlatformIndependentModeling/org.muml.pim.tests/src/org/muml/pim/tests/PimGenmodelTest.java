package org.muml.pim.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.GenmodelTest;

@RunWith(Parameterized.class)
public class PimGenmodelTest extends GenmodelTest {

	public PimGenmodelTest(String genmodelPath) throws Exception {
		super(genmodelPath);
	    for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
	    	if (entry.getKey().equals("testargument")) {
				throw new Exception("testargument");
	    	}
	    }
		for (String args : Platform.getApplicationArgs()) {
			if (args.equals("-testargument")) {
				throw new Exception(args);
			}
		}
	}
	
	@Parameters
	public static Collection<Object[]> getGenmodelPaths() {
		return Collections.singleton(new Object[] {"org.muml.pim/model/pim.genmodel"});
	}

}
