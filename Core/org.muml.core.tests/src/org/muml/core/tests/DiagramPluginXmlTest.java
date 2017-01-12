package org.muml.core.tests;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;
import org.muml.core.tests.resource.ProblemCollector;
import org.osgi.framework.Bundle;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public abstract class DiagramPluginXmlTest {

	private String[] pluginNames;

	/**
	 * Creates this test.
	 * 
	 * @param pluginNames
	 *            The plugin names that all must be tested together (e.g.
	 *            diagram and diagram custom plugins).
	 */
	public DiagramPluginXmlTest(String[] pluginNames) {
		this.pluginNames = pluginNames;
	}

	@Test
	public void validMetamodelNsUris() throws Exception {

		final ProblemCollector problems = new ProblemCollector();
		
		final List<String> allowedMetamodelTypes = new ArrayList<String>();
		final List<String> usedMetamodelTypes = new ArrayList<String>();

		XMLReader xmlReader = XMLReaderFactory.createXMLReader();
		for (final String pluginName : pluginNames) {
			Bundle bundle = Platform.getBundle(pluginName);
			if (bundle == null) {
				throw new UnsupportedOperationException("Could not find bundle " + pluginName + "! It is not loaded.");
			}
			URL url = bundle.getResource("plugin.xml");
			InputSource inputSource = new InputSource(url.openStream());
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
	
}
