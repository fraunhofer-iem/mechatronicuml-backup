package de.uni_paderborn.fujaba.muml.verification.uppaal.tests;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.verification.uppaal.tests.framework.QVToTransformationTest;

public class UnitTests {
	@Test
	public void testProtocol2CIC() {
		QVToTransformationTest test = new QVToTransformationTest(
						new String[] {
								null,
								null,
								"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Protocol2CIC/example1/One2OneExpected.fujaba"
						}, 
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/cic/Protocol2CIC.qvto", 
						new String[] {
								"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Protocol2CIC/example1/One2OneInput.fujaba",
								"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/default.options",
								null
						});
		test.test();
	}
	
	
	@Before
	public void setUp() throws Exception {
		// Register the XMI resource factory for the .fujaba extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("fujaba", new XMIResourceFactoryImpl());
		m.put("options", new XMIResourceFactoryImpl());
	}
}
