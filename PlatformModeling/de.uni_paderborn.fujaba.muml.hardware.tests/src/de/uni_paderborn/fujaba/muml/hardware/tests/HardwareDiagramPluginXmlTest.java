package de.uni_paderborn.fujaba.muml.hardware.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.tests.DiagramPluginXmlTest;

@RunWith(Parameterized.class)
public class HardwareDiagramPluginXmlTest extends DiagramPluginXmlTest {
	
	public HardwareDiagramPluginXmlTest(String[] pluginNames) {
		super(pluginNames);
	}

	@BeforeClass
	public static void setUpBeforeClass() {
		MumlPackage.eINSTANCE.eClass();
	}

	@Parameters
	public static List<Object[]> getPluginsToCheck(){

		Object[][] pluginsToCheck = new Object[][] {
			new Object[] { new String[] { 
					"de.uni_paderborn.fujaba.muml.hardware.resource.diagram",
					"de.uni_paderborn.fujaba.muml.hardware.resource.diagram.custom"
			}},
			new Object[] { new String[] {
					"de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram",
					"de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom"
			}},
			new Object[] { new String[] {
					"de.uni_paderborn.fujaba.muml.hardware.platform.diagram",
					"de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom"
			}},
			new Object[] { new String[] {
					"de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram",
					"de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom"
			}}
		};
		return Arrays.asList(pluginsToCheck);
	}
	
}
