package org.muml.eloquent.adapter.muml.algorithm.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.eloquent.adapter.muml.tests.MUMLOCLContextBasedAlgorithmTest

@RunWith(value = typeof(Parameterized))
class Opt4JBasedAlgorithmTest extends MUMLOCLContextBasedAlgorithmTest {
	
	new(String expectedURI, String transformationURI, String aslURI, String cicURI, String hwpicURI) {
		super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		getTestData(
			"platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j/transforms/Opt4JBasedAlgorithm.qvto"
		)
	}
	
}
