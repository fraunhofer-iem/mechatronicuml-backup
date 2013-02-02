package de.uni_paderborn.fujaba.muml.tests.packages;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class EditPluginXmlPackageTest extends PackageTest {

	private static Resource ecoreModel;
	
	public static final String PLUGIN_XML_LOCATION = "../de.uni_paderborn.fujaba.muml.edit/plugin.xml";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ecoreModel = loadEcoreResource("de.uni_paderborn.fujaba.muml", "/model/muml.ecore");
	}
	
	@Test
	public void testEditPluginXml() throws SAXException, IOException, Exception {
		testPluginXml((EPackage) ecoreModel.getContents().get(0), getUris(), "Edit Plugin");
	}
	
	protected List<String> getUris() throws SAXException, IOException {
		final List<String> uris = new ArrayList<String>();
		XMLReader xmlReader = XMLReaderFactory.createXMLReader();
		FileReader reader = new FileReader(PLUGIN_XML_LOCATION);
		InputSource inputSource = new InputSource(reader);
		xmlReader.setContentHandler(new DefaultHandler() {

			@Override
			public void startElement(String arg0, String arg1, String arg2,
					Attributes attributes) throws SAXException {
				if ("factory".equals(arg1)) {
					String uri = attributes.getValue("uri");
					if (uri != null) {
						uris.add(uri);
					}
				}
			}

		});
		xmlReader.parse(inputSource);
		return uris;
	}

}
