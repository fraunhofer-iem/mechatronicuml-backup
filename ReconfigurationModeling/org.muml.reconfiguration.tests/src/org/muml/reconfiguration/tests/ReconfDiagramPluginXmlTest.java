package org.muml.reconfiguration.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.muml.pim.PimPackage;
import org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.storydiagram.StorydiagramPackage;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ReconfDiagramPluginXmlTest extends org.muml.core.tests.DiagramPluginXmlTest{

	
	public ReconfDiagramPluginXmlTest(String[] pluginNames) {
		super(pluginNames);
	}

	@BeforeClass
	public static void setUpBeforeClass() {
		// Initialize all packages
		PimPackage.eINSTANCE.eClass();
		ComponentstorydiagramPackage.eINSTANCE.eClass();
		ComponentstorypatternPackage.eINSTANCE.eClass();
		StorydiagramPackage.eINSTANCE.eClass();
	}
	
	
	@Parameters
	public static List<Object[]> getPluginsToCheck(){

		Object[][] pluginsToCheck = new Object[][] {
			new Object[] { new String[] { 
					"org.muml.reconfiguration.componentstorydiagram.diagram",
					"org.muml.reconfiguration.componentstorydiagram.diagram.custom",
			}},

			new Object[] { new String[] {
					"org.muml.reconfiguration.verification.sdd.componentsdd.diagram",
					"org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom"
			}}
		};
		return Arrays.asList(pluginsToCheck);
	}
}
