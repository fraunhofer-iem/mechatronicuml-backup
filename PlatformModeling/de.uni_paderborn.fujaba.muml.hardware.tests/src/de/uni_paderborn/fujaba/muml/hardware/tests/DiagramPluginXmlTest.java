package de.uni_paderborn.fujaba.muml.hardware.tests;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.storydriven.core.CorePackage;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.hardware.HardwarePackage;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

public class DiagramPluginXmlTest {
	public static final String EDITOR_PLUGINS[] = {
			"de.uni_paderborn.fujaba.muml.hardware.resource.diagram",
			"de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram",
			"de.uni_paderborn.fujaba.muml.hardware.platform.diagram",
			"de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram" };

	@BeforeClass
	public static void setUpBeforeClass() {
		// Initialize all packages
		HardwarePackage.eINSTANCE.eClass();
		MumlPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
	}

	@Test
	public void validMetamodelNsUris() throws Exception {
		final ProblemCollector problems=new ProblemCollector();

		for (String basePlugin : EDITOR_PLUGINS) {
			final List<String> allowedMetamodelTypes = new ArrayList<String>();
			final List<String> usedMetamodelTypes = new ArrayList<String>();
			for (String suffix : new String[] { "", ".custom" }) {
				final String pluginName = basePlugin + suffix;
				XMLReader xmlReader = XMLReaderFactory.createXMLReader();
				FileReader reader = new FileReader("../" + pluginName
						+ "/plugin.xml");
				InputSource inputSource = new InputSource(reader);
				xmlReader.setContentHandler(new DefaultHandler() {

					@Override
					public void startElement(String arg0, String arg1,
							String arg2, Attributes attributes)
							throws SAXException {
						String nsUri = null;
						if ("metamodel".equals(arg1)) {
							nsUri = attributes.getValue("nsURI");
						} else if ("child".equals(arg1)) {
							nsUri = attributes.getValue("packageNsUri");
						} else if ("diagramElement".equals(arg1)) {
							nsUri = attributes.getValue("packageNsUri");
						} else if ("metamodelType".equals(arg1) || "specializationType".equals(arg1)) {
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
			}
			for (String used : usedMetamodelTypes) {
				if (!allowedMetamodelTypes.contains(used)) {
					problems.add("INVALID metamodel type: " + used + " is not defined.");
				}
			}
		}
		problems.fail();

	}
}
