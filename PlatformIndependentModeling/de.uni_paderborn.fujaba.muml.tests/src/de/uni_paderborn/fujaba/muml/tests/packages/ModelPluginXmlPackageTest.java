package de.uni_paderborn.fujaba.muml.tests.packages;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import de.uni_paderborn.fujaba.tests.TestUtilities;
import de.uni_paderborn.fujaba.tests.packages.PackageTest;

public class ModelPluginXmlPackageTest extends PackageTest {

	private static Resource ecoreModel;
	
	public static final String PLUGIN_XML_LOCATION = "../de.uni_paderborn.fujaba.muml/plugin.xml";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ecoreModel = TestUtilities.loadResource(new ResourceSetImpl(), "de.uni_paderborn.fujaba.muml/model/muml.ecore");
	}
	
	@Test
	public void testModelPluginXml() throws SAXException, IOException, Exception {
		testPluginXml((EPackage) ecoreModel.getContents().get(0), getUris(), "Model Plugin");
	}
	
	
	
	protected Collection<String> getUris() throws SAXException, IOException {
		final List<String> uris = new ArrayList<String>();
		XMLReader xmlReader = XMLReaderFactory.createXMLReader();
		FileReader reader = new FileReader(PLUGIN_XML_LOCATION);
		InputSource inputSource = new InputSource(reader);
		xmlReader.setContentHandler(new DefaultHandler() {

			@Override
			public void startElement(String arg0, String arg1, String arg2,
					Attributes attributes) throws SAXException {
				if ("package".equals(arg1)) {
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
	
	@Override
	protected boolean isRequiredPackage(EPackage _package) {
		return true;
	}
	

}
