package org.muml.core.tests.packages;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.core.tests.TestUtilities;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class PluginXmlPackageTest extends PackageTest {

	private Resource ecoreModel;
	private String pluginName;
	private String modelFile;
	
	public PluginXmlPackageTest(String pluginName, String modelFile) {
		this.pluginName = pluginName;
		this.modelFile = modelFile;
	}

	@Before
	public void setup() throws Exception {
		ecoreModel = TestUtilities.loadResource(new ResourceSetImpl(), pluginName + "/" + modelFile);
	}
	
	@Test
	public void testModelPluginXml() throws SAXException, IOException, Exception {
		testPluginXml((EPackage) ecoreModel.getContents().get(0), getUris("package", pluginName), "Model Plugin");
	}

	
	@Test
	public void testEditPluginXml() throws SAXException, IOException, Exception {
		testPluginXml((EPackage) ecoreModel.getContents().get(0), getUris("factory", pluginName + ".edit"), "Edit Plugin");
	}
	
	protected Collection<String> getUris(final String searchLocalName, String pluginName) throws SAXException, IOException, URISyntaxException {
		final List<String> uris = new ArrayList<String>();
		XMLReader xmlReader = XMLReaderFactory.createXMLReader();
		
		InputSource inputSource = new InputSource(Platform.getBundle(pluginName).getResource("plugin.xml").openStream());
		xmlReader.setContentHandler(new DefaultHandler() {

			@Override
			public void startElement(String uri, String localName,
                    String qName, Attributes attributes) throws SAXException {
				if (searchLocalName.equals(localName)) {
					String uriAttribute = attributes.getValue("uri");
					if (uriAttribute != null) {
						uris.add(uriAttribute);
					}
				}
			}

		});
		xmlReader.parse(inputSource);
		return uris;
	}
	
	@Override
	protected boolean isRequiredPackage(EPackage _package) {
		return true;
	}
	

}
