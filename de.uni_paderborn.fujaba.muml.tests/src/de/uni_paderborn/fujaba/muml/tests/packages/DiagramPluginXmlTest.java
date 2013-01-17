package de.uni_paderborn.fujaba.muml.tests.packages;

import java.io.FileReader;

import org.eclipse.emf.ecore.EPackage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.storydriven.storydiagrams.StorydiagramsPackage;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import de.uni_paderborn.fujaba.muml.model.ModelPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

public class DiagramPluginXmlTest extends PackageTest {
	public static final String EDITOR_PLUGINS[] = {
			"de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram",
			"de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram",
			"de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram",
			"de.uni_paderborn.fujaba.muml.deploymenteditor.diagram",
			"de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram",
			"de.uni_paderborn.fujaba.muml.patterneditor.diagram",
			"de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram",
			"de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram" };

	@BeforeClass
	public static void setUpBeforeClass() {
		// Initialize all packages
		ModelPackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();
		ComponentstorypatternPackage.eINSTANCE.eClass();
	}

	@Test
	public void validMetamodelNsUris() throws Exception {
		final ProblemCollector problems = new ProblemCollector();

		for (String basePlugin : EDITOR_PLUGINS) {
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
						String uri = null;
						if ("metamodel".equals(arg1)) {
							uri = attributes.getValue("nsURI");
						} else if ("child".equals(arg1)) {
							uri = attributes.getValue("packageNsUri");
						} else if ("diagramElement".equals(arg1)) {
							uri = attributes.getValue("packageNsUri");
						}
						if (uri != null) {
							if (!EPackage.Registry.INSTANCE.containsKey(uri)) {
								problems.add("INVALID: " + pluginName
										+ " contains invalid package nsURI: "
										+ uri);
							}
						}
					}

				});
				xmlReader.parse(inputSource);
			}
		}
		problems.fail();

	}
}
