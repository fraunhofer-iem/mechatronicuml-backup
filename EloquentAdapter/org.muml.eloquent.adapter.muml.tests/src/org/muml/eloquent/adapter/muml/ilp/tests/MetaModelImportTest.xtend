package org.muml.eloquent.adapter.muml.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.eloquent.adapter.muml.tests.MUMLOCLContextBasedTest

@RunWith(value = typeof(Parameterized))
class MetaModelImportTest extends MUMLOCLContextBasedTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.eloquent.adapter.muml.tests/fixtures/ilp/metamodelImport/"
	
	new(String expectedURI, String transformationURI, String aslURI, String cicURI, String hwpicURI) {
		super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		#[
			#[uriPrefix + "metamodelImport.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "metamodelImport.allocation_specification",
			  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.3",
			  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"]
		]
	}
	
}
