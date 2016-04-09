package org.muml.pim.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.DiagramPluginXmlTest;
import org.muml.pim.PimPackage;

@RunWith(Parameterized.class)
public class PimDiagramPluginXmlTest extends DiagramPluginXmlTest {
	
	public PimDiagramPluginXmlTest(String[] pluginNames) {
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
					"org.muml.pim.component.diagram",
					"org.muml.pim.component.diagram.custom"
			}},
			new Object[] { new String[] {
					"org.muml.pim.componentinstanceconfiguration.diagram",
					"org.muml.pim.componentinstanceconfiguration.diagram.custom"
			}},
			new Object[] { new String[] {
					"org.muml.pim.messagetype.diagram",
					"org.muml.pim.messagetype.diagram.custom"
			}},
			new Object[] { new String[] {
					"org.muml.pim.coordinationprotocol.diagram",
					"org.muml.pim.coordinationprotocol.diagram.custom"
			}},
			new Object[] { new String[] {
					"org.muml.pim.realtimestatechart.diagram",
					"org.muml.pim.realtimestatechart.diagram.custom"
			}},
			new Object[] {new String[] {
					"org.muml.pim.common"
			}}
		};
		return Arrays.asList(pluginsToCheck);
	}
	
}
