import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * This class sets properties, which are checked in {@link PropertiesCheck} 
 * to their default values for the following files:feature.xml, feature.properties and build.properties
 * If build.properties and feature.properties do not exist, they are created.
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
public class SetPropertiesToDefault {
	public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, TransformerException{
    	SetPropertiesToDefault propCheck = new SetPropertiesToDefault();
       
    	String filename=args[0];

    	if(filename.endsWith("feature.xml")){
    		propCheck.checkFeatureXML(filename);
    		//propCheck.checkFeatureProperties(filename.replace("feature.xml", "feature.properties"));
    		propCheck.checkBuildProperties(filename.replace("feature.xml", "build.properties"));
    	}
    }
	
	/**
	 * Checks whether the feature.xml is existent, includes the tags feature, license, licenseURL, 
	 * copyright, copyrightURL and whether the URL tags are not empty
	 * @param filename
	 * @throws ParserConfigurationException
	 * @throws TransformerException 
	 */
	public void checkFeatureXML(String filename) throws ParserConfigurationException, FileNotFoundException, TransformerException{
		File file = new File(filename);
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = null;
		try {
			document = db.parse(file);
		} catch (SAXException | IOException e) {
			//If we can't parse the document, better manually fix it, else we might delete too much
			throw new IllegalArgumentException("Could not parse feature.xml: " + filename);
		}
		
		Node featureNode = getNode(new String[] { "feature" }, document);
		
		//Provider name
		setAttribute(featureNode, "provider-name", "%providerName", document);
		
		//Subtree for license
		createChildNodeIfNecessary(featureNode, "license", document);
		setAttribute(getNode(new String[] { "feature", "license" }, document), "url", "%licenseURL", document);
		setText(getNode(new String[] { "feature", "license" }, document), "\n      %license\n   ", document);
		
		//Subtree for copyright
		createChildNodeIfNecessary(featureNode, "copyright", document);
		setAttribute(getNode(new String[] { "feature", "copyright" }, document), "url", "%copyrightURL", document);
		setText(getNode(new String[] { "feature", "copyright" }, document), "\n      %copyright\n   ", document);

		// Use a Transformer for output
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(new FileOutputStream(file));
		transformer.transform(source, result);
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
	 * Makes sure the build.properties file contains bin.includes and bin.includes contains feature.properties
	 * @param filename The path where the build.properties file should be
	 */
	public void checkBuildProperties(String filename){
		Properties properties = new Properties();
		String currentBinIncludes="";
		File file = new File(filename);
		try {
			properties.load(new InputStreamReader(new FileInputStream(file)));
		} catch (IOException e) {
			//No need to do anything, we'll just add bin.includes as a property and try to store the file
		}
		if(!currentBinIncludes.isEmpty()){
			currentBinIncludes+=", ";
		}
		properties.setProperty("bin.includes", currentBinIncludes+"feature.properties");
		try {
			properties.store(new OutputStreamWriter(new FileOutputStream(file)), "");
		} catch (IOException e) {
			throw new IllegalArgumentException("Could not write build.properties file: "+ filename);
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
	 * Sets an attribute of the node to the attributeValue. 
	 * Creates the attribute if necessary. 
	 * 
	 * @param node The node to set the attribute for
	 * @param attributeName The name of the attribute 
	 * @param attributeValue The value the attribute should be set to
	 * @param document The file in which the nodes are contained
	 */
	private void setAttribute(Node node, String attributeName, String attributeValue, Document document) {
		Node attribute = node.getAttributes().getNamedItem(attributeName);
		if (attribute == null) {
			attribute = document.createAttribute(attributeName);
			node.getAttributes().setNamedItem(attribute);
		}
		attribute.setNodeValue(attributeValue);
	}

	/**
	 * Sets a text node as a child of the node.
	 * Will remove all other child nodes.
	 * 
	 * @param node The node to append the text node to
	 * @param text The text for the text node
	 * @param document The file in which the nodes are contained
	 */
	private void setText(Node node, String text, Document document) {
		for (int i = 0; i < node.getChildNodes().getLength(); i++) {
			Node child = node.getChildNodes().item(i);
			node.removeChild(child);
		}
		node.appendChild(document.createTextNode(text));
	}
	
	/**
	 * If the element does not exist yet as a child node of the
	 * node in the file, it is created
	 * @param node
	 * @param elementName
	 * @param document
	 */
	private void createChildNodeIfNecessary(Node node, String elementName, Document document){
		NodeList elements = node.getChildNodes();
		for (int i=0; i<elements.getLength(); i++){
			if (elements.item(i).getNodeName() == elementName){
				return;
			}
		}
		node.appendChild(document.createElement(elementName));
	}
}


