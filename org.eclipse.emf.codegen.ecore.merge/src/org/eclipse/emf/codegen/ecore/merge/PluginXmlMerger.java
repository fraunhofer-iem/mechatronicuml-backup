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
import org.w3c.dom.Text;

public class PluginXmlMerger {

	private static String GENERATED_TAG_NAME = "emfgen";
	private static String GENERATED_TAG_DATA = "generated=\"true\"";
	private static String PLUGIN_TAG = "plugin";
	
	private int indent;

	public PluginXmlMerger(int indent) {
		this.indent = indent;
	}

	public Document merge(Document before, Document after) {
		// Create a copy of the after document.
		Document merged = copyDocument(after);

		// Merge custom elements from before into it.
		Element beforePluginElement = findPluginElement(before);
		Element mergedPluginElement = findPluginElement(merged);
		Node firstChild = mergedPluginElement.getFirstChild();
		for (Node customElement : getCustomElements(beforePluginElement)) {
			Node copy = merged.importNode(customElement, true);

			// Trim text
			if (copy instanceof Text) {
				Text textNode = (Text) copy;
				String textContent = textNode.getTextContent();
				textContent = textContent.trim();
				textNode.setTextContent(textContent);
			}

			mergedPluginElement.insertBefore(copy, firstChild);
		}

		return merged;
	}

	public static Document copyDocument(Document originalDocument) {
		Document copyDocument = null;
		try {
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder;
			docBuilder = dbfac.newDocumentBuilder();
			copyDocument = docBuilder.newDocument();

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return null;
		}

		for (int i = 0; i < originalDocument.getChildNodes().getLength(); i++) {
			Node node = originalDocument.getChildNodes().item(i);
			Node copyNode = copyDocument.importNode(node, true);
			copyDocument.appendChild(copyNode);
		}

		return copyDocument;
	}

	private Collection<Node> getCustomElements(Element pluginElement) {
		List<Node> customElements = new ArrayList<Node>();
		for (int i = 0; i < pluginElement.getChildNodes().getLength(); i++) {
			Node node = pluginElement.getChildNodes().item(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				if (containsGeneratedTag(element)) {
					continue;
				}
			}
			customElements.add(node);
		}
		return customElements;
	}

	private boolean containsGeneratedTag(Element element) {
		for (int j = 0; j < element.getChildNodes().getLength(); j++) {
			Node child = element.getChildNodes().item(j);
			if (child instanceof ProcessingInstruction) {
				ProcessingInstruction instruction = (ProcessingInstruction) child;
				if (isGeneratedTag(instruction)) {
					return true;
				}
			}
		}
		return false;
	}

	protected boolean isGeneratedTag(ProcessingInstruction instruction) {
		return GENERATED_TAG_NAME.equals(instruction.getTarget())
				&& GENERATED_TAG_DATA.equals(instruction.getData());
	}

	protected Element findPluginElement(Document document) {
		NodeList nodes = document.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (node instanceof Element) {
				Element element = (Element) nodes.item(i);
				if (PLUGIN_TAG.equals(element.getTagName())) {
					return element;
				}
			}
		}
		return null;
	}

	public void addAnnotation(Document document) {
		Element pluginElement = findPluginElement(document);
		if (pluginElement != null) {
			for (int j = 0; j < pluginElement.getChildNodes().getLength(); j++) {
				Node node = pluginElement.getChildNodes().item(j);
				if (node instanceof Element) {
					Element element = (Element) node;
					addAnnotation(element);
				}
			}
		}
	}

	private void addAnnotation(Element element) {
		if (!containsGeneratedTag(element)) {
			Document document = element.getOwnerDocument();
			Node firstChild = element.getFirstChild();
			element.insertBefore(createIndentTextNode(document, indent * 2), firstChild);
			ProcessingInstruction annotation = document
					.createProcessingInstruction(GENERATED_TAG_NAME,
							GENERATED_TAG_DATA);
			element.insertBefore(annotation, firstChild);
		}
	}
	
	private Text createIndentTextNode(Document document, int indent) {
		StringBuilder builder = new StringBuilder();
		builder.append('\n');
		for (int i = 0; i < indent; i++) {
			builder.append(' ');
		}
		return document.createTextNode(builder.toString());
	}

}
