package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.tests

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.qvto.QVToBasedAlgorithmTest
import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class Opt4JBasedAlgorithmTest extends QVToBasedAlgorithmTest {
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		getTestData(
			"platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j/transforms/Opt4JBasedAlgorithm.qvto"
		)
	}
	
}