import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * This class checks whether feature.xml, feature.properties and build.properties are set correctly. 
 *
 * It checks the following things:
 * 
 * Does the feature.xml contain the tags license and copyright?
 * Do license/copyright contain licenseURL/copyrightURL with non-empty values?
 * Are there feature.properties and build.properties files in the same folder?
 * Does feature.properties includes non-empty values for "providerName", "copyright", "copyrightURL", "license", "licenseURL"?
 * Does build.properties include bin.includes?
 * Does bin.includes contain feature.properties?
 * 
 * 
 * @author Melanie Bruns
 *
 */
public class PropertiesCheck {

	
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
    	PropertiesCheck propCheck = new PropertiesCheck();
       
    	String filename=args[0];

    	if(filename.endsWith("feature.xml")){
    		propCheck.checkFeatureXML(filename);
    		propCheck.checkFeatureProperties(filename.replace("feature.xml", "feature.properties"));
    		propCheck.checkBuildProperties(filename.replace("feature.xml", "build.properties"));
    	}
    }
	
	/**
	 * Checks whether the feature.xml is existent, includes the tags feature, license, licenseURL, 
	 * copyright, copyrightURL and whether the URL tags are not empty
	 * @param filename
	 * @throws ParserConfigurationException
	 */
	public void checkFeatureXML(String filename) throws ParserConfigurationException{
		File file = new File(filename);
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = null;
		try {
			document = db.parse(file);
		} catch (SAXException | IOException e) {
			throw new IllegalArgumentException("Could not parse feature.xml: " + filename);
		}

		Node licenseNode = getNode(new String[] { "feature", "license" }, document);
		checkAttribute(licenseNode, "url", document);
		Node copyrightNode = getNode(new String[] { "feature", "copyright" }, document);
		checkAttribute(copyrightNode, "url", document);

	}
	
	/**
	 * Check whether feature.properties file exists and includes the tags providerName, copyright, 
	 * copyrightURL, license, licenseURL with non-empty values.
	 * @param filename The path where the feature.properties file should be
	 */
	public void checkFeatureProperties(String filename) {
		Properties properties = new Properties();
		try {
			properties.load(new InputStreamReader(new FileInputStream(new File(filename))));

		} catch (IOException e) {
			throw new IllegalArgumentException("Feature.properties not found for " + filename);
		}
		if (properties.isEmpty()){
			throw new IllegalArgumentException("Feature.properties not found for " + filename);
		}
		String[] featureProperties = new String[] {"providerName", "copyright", "copyrightURL", "license", "licenseURL"}; 
		for (String property : featureProperties){
			if (!properties.containsKey(property) || properties.getProperty(property).isEmpty()){
				throw new IllegalArgumentException("Feature.properties is missing property "+ property + " for "+ filename);
			}
		}
	}
	
	/**
	 * 
	 * Checks the build.properties file whether it includes bin.includes, and whether
	 * bin.includes contains feature.properties
	 * @param filename The path where the build.properties file should be
	 */
	public void checkBuildProperties(String filename){
		Properties properties = new Properties();
		String currentBinIncludes="";
		try {
			properties.load(new InputStreamReader(new FileInputStream(new File(filename))));
			currentBinIncludes = properties.getProperty("bin.includes");

		} catch (IOException e) {
			throw new IllegalArgumentException("Build.properties do not include 'bin.includes' for " + filename);
		}
		if(currentBinIncludes.isEmpty() || !currentBinIncludes.contains("feature.properties")){
			throw new IllegalArgumentException("'bin.includes' does not contain feature.properties for " + filename);
		}
	}


	
	/**
	 * Return the node for the last tag in the document
	 * @param tags A hierarchical series of tags 
	 * @param document The file to search in 
	 * @return A node in the document that is in the given list of tags
	 */
	private Node getNode(String tags[], Document document) {
		Node node = document;
		for (String tag : tags) {
			Node nextNode = null;
			for (int i = 0; i < node.getChildNodes().getLength(); i++) {
				Node childNode = node.getChildNodes().item(i);
				if (childNode.getNodeName().equals(tag)) {
					nextNode = childNode;
					break;
				}
			}
			if (nextNode == null) {
				throw new IllegalArgumentException("No child tag found with name: " + tag  + " for " + document.getDocumentURI());
			}
			node = nextNode;	
		}
		return node;
	}

	/**
	 * Checks whether an attribute with name=attributeName exists for the node and whether it has 
	 * a non-empty value.
	 * @param node
	 * @param attributeName
	 * @param document
	 */
	private void checkAttribute(Node node, String attributeName,  Document document) {
		Node attribute = node.getAttributes().getNamedItem(attributeName);
		if (attribute == null) {
			throw new IllegalArgumentException("No attribute found with name: " + attributeName + " for " + document.getDocumentURI());
		} else if(attribute.getNodeValue().isEmpty()){
			throw new IllegalArgumentException("Attribute " + attributeName + "is empty for " + document.getDocumentURI());
		}
	}
}


