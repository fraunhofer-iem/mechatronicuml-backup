package org.muml.eloquent.adapter.muml.tests

import java.util.Collections
import java.util.Map
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.Util
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest

/**
 * Base class for MUML specific tests.
 */
class MUMLOCLContextBasedTest extends QVToTransformationSingleOutExtentTest {
	
	new(String expectedURI, String transformationURI, String aslURI, String cicURI, String hwpicURI) {
		this(expectedURI, transformationURI,
			Collections.emptyMap,
			aslURI, cicURI, hwpicURI
		)
	}
	
	new(Object expectedOutput, String transformationURI,
			Map<String, Object> configurationPropertyMap,
			String aslURI, String cicURI, String hwpicURI) {
		super(expectedOutput, transformationURI, configurationPropertyMap,
			createInParameters(aslURI, cicURI, hwpicURI)
		)
	}
	
	protected static def Object[] createInParameters(String aslURI, String cicURI, String hwpicURI) { 
		val OCLContext oclContext = OclcontextFactory.eINSTANCE.createOCLContext
		oclContext.componentInstanceConfiguration = Util.loadURI(
			cicURI
		) as ComponentInstanceConfiguration
		oclContext.hardwarePlatformInstanceConfiguration = Util.loadURI(
			hwpicURI
		) as HWPlatformInstanceConfiguration
		#[aslURI, oclContext]
	}
}
