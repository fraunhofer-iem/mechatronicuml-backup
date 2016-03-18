package de.uni_paderborn.fujaba.muml.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.tests.DiagramPluginXmlTest;

@RunWith(Parameterized.class)
public class PimDiagramPluginXmlTest extends DiagramPluginXmlTest {
	
	public PimDiagramPluginXmlTest(String[] pluginNames) {
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
					"de.uni_paderborn.fujaba.muml.component.diagram",
					"de.uni_paderborn.fujaba.muml.component.diagram.custom"
			}},
			new Object[] { new String[] {
					"de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram",
					"de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom"
			}},
			new Object[] { new String[] {
					"de.uni_paderborn.fujaba.muml.messagetype.diagram",
					"de.uni_paderborn.fujaba.muml.messagetype.diagram.custom"
			}},
			new Object[] { new String[] {
					"de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram",
					"de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom"
			}},
			new Object[] { new String[] {
					"de.uni_paderborn.fujaba.muml.realtimestatechart.diagram",
					"de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom"
			}},
			new Object[] {new String[] {
					"de.uni_paderborn.fujaba.muml.common"
			}}
		};
		return Arrays.asList(pluginsToCheck);
	}
	
}
