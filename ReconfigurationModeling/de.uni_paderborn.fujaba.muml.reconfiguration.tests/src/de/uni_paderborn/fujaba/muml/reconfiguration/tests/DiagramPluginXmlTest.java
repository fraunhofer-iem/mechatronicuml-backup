package de.uni_paderborn.fujaba.muml.reconfiguration.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.storydriven.storydiagrams.StorydiagramsPackage;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;


public class DiagramPluginXmlTest extends de.uni_paderborn.fujaba.muml.tests.DiagramPluginXmlTest{

	
	@BeforeClass
	public static void setUpBeforeClass() {
		// Initialize all packages
		MumlPackage.eINSTANCE.eClass();
		ComponentstorydiagramPackage.eINSTANCE.eClass();
		ComponentstorypatternPackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();
	}
	
	@Override
	public List<String> getPluginsToCheck() {
		 String EDITOR_PLUGINS[] = {
					"de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram",
					"org.storydriven.storydiagrams.diagram"
					 };
		 
		List<String> pluginsToCheck = new ArrayList<String>();
		for (String basePlugin : EDITOR_PLUGINS) {
			for (String suffix : new String[] { "", ".custom" }) {
				String pluginName = basePlugin + suffix;
				pluginsToCheck.add(pluginName);
			}
		}
		String ADD_PLUGINS[] = { "de.uni_paderborn.fujaba.muml.componentstorypattern" };
		pluginsToCheck.addAll(Arrays.asList(ADD_PLUGINS));
		return pluginsToCheck;
	
	}
}
