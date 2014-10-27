package de.uni_paderborn.fujaba.muml.tests;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.tests.resource.ProblemCollector;

public class DiagramPluginXmlTest {
	
	@BeforeClass
	public static void setUpBeforeClass() {
		// Initialize all packages
		MumlPackage.eINSTANCE.eClass();
		// StorydiagramsPackage.eINSTANCE.eClass();
		// ComponentstorypatternPackage.eINSTANCE.eClass();
	}

	@Test
	public void validMetamodelNsUris() throws Exception {

		final ProblemCollector problems = new ProblemCollector();
		
		final List<String> allowedMetamodelTypes = new ArrayList<String>();
		final List<String> usedMetamodelTypes = new ArrayList<String>();
		for (final String pluginName : getPluginsToCheck()) {

			XMLReader xmlReader = XMLReaderFactory.createXMLReader();
			FileReader reader = new FileReader("../" + pluginName
					+ "/plugin.xml");
			InputSource inputSource = new InputSource(reader);
			xmlReader.setContentHandler(new DefaultHandler() {

				@Override
				public void startElement(String arg0, String arg1, String arg2,
						Attributes attributes) throws SAXException {
					String nsUri = null;
					if ("metamodel".equals(arg1)) {
						nsUri = attributes.getValue("nsURI");
					} else if ("child".equals(arg1)) {
						nsUri = attributes.getValue("packageNsUri");
					} else if ("diagramElement".equals(arg1)) {
						nsUri = attributes.getValue("packageNsUri");
					} else if ("metamodelType".equals(arg1)
							|| "specializationType".equals(arg1)) {
						String type = attributes.getValue("id");
						if (type != null) {
							allowedMetamodelTypes.add(type);
						}
					} else if ("elementType".equals(arg1)) {
						String ref = attributes.getValue("ref");
						if (ref != null) {
							usedMetamodelTypes.add(ref);
						}
					}

					if (nsUri != null) {
						if (!EPackage.Registry.INSTANCE.containsKey(nsUri)) {
							problems.add("INVALID nsURI: " + pluginName
									+ " contains invalid package nsURI: "
									+ nsUri);
						}
					}
				}
			});
			xmlReader.parse(inputSource);

			for (String used : usedMetamodelTypes) {
				if (!allowedMetamodelTypes.contains(used)) {
					problems.add("INVALID metamodel type: " + used
							+ " is not defined.");
				}
			}
		}
		problems.fail();

	}
	
	public List<String> getPluginsToCheck(){
		String EDITOR_PLUGINS[] = {
			"de.uni_paderborn.fujaba.muml.component.diagram",
			"de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram",
			// "de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram",
			// "de.uni_paderborn.fujaba.muml.deployment.diagram",
			"de.uni_paderborn.fujaba.muml.messagetype.diagram",
			"de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram",
			"de.uni_paderborn.fujaba.muml.realtimestatechart.diagram" };

 
	List<String> pluginsToCheck = new ArrayList<String>();
	for (String basePlugin : EDITOR_PLUGINS) {
		for (String suffix : new String[] { "", ".custom" }) {
			String pluginName = basePlugin + suffix;
			pluginsToCheck.add(pluginName);
		}
	}
	String ADD_PLUGINS[] = { "de.uni_paderborn.fujaba.muml.common" };
	pluginsToCheck.addAll(Arrays.asList(ADD_PLUGINS));
	return pluginsToCheck;
	}
}
