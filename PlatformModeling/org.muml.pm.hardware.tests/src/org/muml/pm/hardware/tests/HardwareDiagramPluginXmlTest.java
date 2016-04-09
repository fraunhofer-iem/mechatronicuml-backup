package org.muml.pm.hardware.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.DiagramPluginXmlTest;
import org.muml.pim.PimPackage;

@RunWith(Parameterized.class)
public class HardwareDiagramPluginXmlTest extends DiagramPluginXmlTest {
	
	public HardwareDiagramPluginXmlTest(String[] pluginNames) {
		super(pluginNames);
	}

	@BeforeClass
	public static void setUpBeforeClass() {
		PimPackage.eINSTANCE.eClass();
	}

	@Parameters
	public static List<Object[]> getPluginsToCheck(){

		Object[][] pluginsToCheck = new Object[][] {
			new Object[] { new String[] { 
					"org.muml.pm.hardware.resource.diagram",
					"org.muml.pm.hardware.resource.diagram.custom"
			}},
			new Object[] { new String[] {
					"org.muml.pm.hardware.resourceinstance.diagram",
					"org.muml.pm.hardware.resourceinstance.diagram.custom"
			}},
			new Object[] { new String[] {
					"org.muml.pm.hardware.platform.diagram",
					"org.muml.pm.hardware.platform.diagram.custom"
			}},
			new Object[] { new String[] {
					"org.muml.pm.hardware.platforminstance.diagram",
					"org.muml.pm.hardware.platforminstance.diagram.custom"
			}}
		};
		return Arrays.asList(pluginsToCheck);
	}
	
}
