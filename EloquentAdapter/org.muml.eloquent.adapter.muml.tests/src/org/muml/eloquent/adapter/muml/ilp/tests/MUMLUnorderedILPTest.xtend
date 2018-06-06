package org.muml.eloquent.adapter.muml.ilp.tests

import java.util.Collection
import java.util.List
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.eloquent.adapter.muml.tests.MUMLOCLContextBasedTest
import org.muml.psm.allocation.algorithm.ilp.tests.UnorderedILPTest

@RunWith(value = typeof(Parameterized))
class MUMLUnorderedILPTest extends MUMLOCLContextBasedTest {
	new(String expectedURI, String transformationURI, String aslURI, String cicURI, String hwpicURI) {
		super(expectedURI, transformationURI,
			UnorderedILPTest.configurationPropertyMap, aslURI, cicURI,
			hwpicURI
		)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		val List<Object[]> testData = newArrayList
		testData.addAll(ClassifierContextDeclCS2ILPTest.testData)
		testData.addAll(DifferentLocation2ILPTest.testData)
		testData.addAll(GeneralConstraint2ILPTest.testData)
		testData.addAll(MeasureFunction2ILPTest.testData)
		testData.addAll(MetaModelImportTest.testData)
		testData.addAll(RequiredHardwareResourceInstance2ILPTest.testData)
		testData.addAll(ResourceConstraint2ILPTest.testData)
		testData.addAll(SameLocation2ILPTest.testData)
		testData
	}
	
	protected override checkTransformationResult() {
		UnorderedILPTest.checkTransformationResult(runner, expectedList)
	}
}