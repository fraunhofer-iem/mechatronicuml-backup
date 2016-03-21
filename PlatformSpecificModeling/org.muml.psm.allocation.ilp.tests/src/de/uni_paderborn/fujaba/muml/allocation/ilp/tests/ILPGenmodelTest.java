package de.uni_paderborn.fujaba.muml.allocation.ilp.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.tests.GenmodelTest;

@RunWith(Parameterized.class)
public class ILPGenmodelTest extends GenmodelTest {

	public ILPGenmodelTest(String genmodelPath) throws IOException {
		super(genmodelPath);
	}
	
	@Parameters
	public static Collection<Object[]> getGenmodelPaths() {
		return Collections.singleton(new Object[] {"de.uni_paderborn.fujaba.muml.allocation.ilp/model/ilp.genmodel"});
	}

}
