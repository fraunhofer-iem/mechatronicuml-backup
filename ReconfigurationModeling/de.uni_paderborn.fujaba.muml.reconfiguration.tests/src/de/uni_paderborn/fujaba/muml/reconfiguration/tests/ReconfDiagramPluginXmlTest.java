package de.uni_paderborn.fujaba.muml.reconfiguration.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
import org.storydriven.storydiagrams.StorydiagramsPackage;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;

@RunWith(Parameterized.class)
public class ReconfDiagramPluginXmlTest extends de.uni_paderborn.fujaba.tests.DiagramPluginXmlTest{

	
	public ReconfDiagramPluginXmlTest(String[] pluginNames) {
		super(pluginNames);
	}

	@BeforeClass
	public static void setUpBeforeClass() {
		// Initialize all packages
		MumlPackage.eINSTANCE.eClass();
		ComponentstorydiagramPackage.eINSTANCE.eClass();
		ComponentstorypatternPackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();
	}
	
	
	@Parameters
	public static List<Object[]> getPluginsToCheck(){

		Object[][] pluginsToCheck = new Object[][] {
			new Object[] { new String[] { 
					"de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram",
					"de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom",
			}},

			new Object[] { new String[] {
					"de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram",
					"de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.diagram.custom"
			}}
		};
		return Arrays.asList(pluginsToCheck);
	}
}
