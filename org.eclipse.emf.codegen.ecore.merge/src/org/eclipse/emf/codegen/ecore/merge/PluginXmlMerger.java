package org.eclipse.emf.codegen.ecore.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;

public class PluginXmlMerger {

	public PluginXmlMerger() {

	}

	public Document merge(Document before, Document after) {
		// Create a copy of the after document.
		//Document merged = copyDocument(after);
		Document merged = after;
		
		// Merge custom elements from before
		Element beforePluginElement = findPluginElement(before);
		Element mergedPluginElement = findPluginElement(merged);
		Node firstChild = mergedPluginElement.getFirstChild();
		for (Element customElement : getCustomElements(beforePluginElement)) {
			Node copy = merged.importNode(customElement, true);
			mergedPluginElement.insertBefore(copy, firstChild);
		}

		return merged;
	}

	public static Document copyDocument(Document after) {
		Document copy = null;
		try {
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder;
			docBuilder = dbfac.newDocumentBuilder();
			copy = docBuilder.newDocument();

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return null;
		}
		
		
		for (int i = 0; i < after.getChildNodes().getLength(); i++) {
			Node node = after.getChildNodes().item(i);
			copy.appendChild(copy.importNode(node, true));
		}
		
		return copy;
	}

	private Collection<Element> getCustomElements(Element pluginElement) {
		List<Element> customElements = new ArrayList<Element>();
		for (int i = 0; i < pluginElement.getChildNodes().getLength(); i++) {
			Node node = pluginElement.getChildNodes().item(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				if (containsCustomInstruction(element)) {
					customElements.add(element);
				}
			}
		}
		return customElements;
	}

	private boolean containsCustomInstruction(Element element) {
		for (int j = 0; j < element.getChildNodes().getLength(); j++) {
			Node child = element.getChildNodes().item(j);
			if (child instanceof ProcessingInstruction) {
				ProcessingInstruction instruction = (ProcessingInstruction) child;
				if (isCustomInstruction(instruction)) {
					return false;
				}
			}
		}
		return true;
	}

	protected boolean isCustomInstruction(
			ProcessingInstruction instruction) {
		return "emfgen".equals(instruction.getTarget())
				&& "generated=\"true\"".equals(instruction.getData());
	}

	protected Element findPluginElement(Document document) {
		NodeList nodes = document.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (node instanceof Element) {
				Element element = (Element) nodes.item(i);
				if ("plugin".equals(element.getTagName())) {
					return element;
				}
			}
		}
		return null;
	}

}
