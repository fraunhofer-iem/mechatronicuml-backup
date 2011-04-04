package de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ComponentInstanceConfigurationDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor> getComponentInstanceConfiguration_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance childElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor> getComponentInstance_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortsDerived().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.component.Port childElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.PortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID:
			return getConnectorInstance_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID:
			return getConnectorInstance_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID:
			return getConnectorInstance_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getComponentInstanceConfiguration_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConnectorInstance_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getComponentInstance_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getPort_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getConnectorInstance_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getComponentInstance_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getPort_3004IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.Port modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectorInstance_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getConnectorInstance_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getComponentInstance_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getPort_3004OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.Port modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectorInstance_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getConnectorInstance_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getContainedTypeModelFacetLinks_ConnectorInstance_4001(
			de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration container) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.umlrt.model.component.Port src = link
					.getFromPort();
			result.add(new de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.providers.ComponentInstanceConfigurationElementTypes.ConnectorInstance_4001,
					de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getIncomingTypeModelFacetLinks_ConnectorInstance_4001(
			de.uni_paderborn.fujaba.umlrt.model.component.Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage.eINSTANCE
					.getConnectorInstance_ToPort()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Port src = link
					.getFromPort();
			result.add(new de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.providers.ComponentInstanceConfigurationElementTypes.ConnectorInstance_4001,
					de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> getOutgoingTypeModelFacetLinks_ConnectorInstance_4001(
			de.uni_paderborn.fujaba.umlrt.model.component.Port source) {
		de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration) {
				container = (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.umlrt.model.component.Port src = link
					.getFromPort();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.providers.ComponentInstanceConfigurationElementTypes.ConnectorInstance_4001,
					de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

}
