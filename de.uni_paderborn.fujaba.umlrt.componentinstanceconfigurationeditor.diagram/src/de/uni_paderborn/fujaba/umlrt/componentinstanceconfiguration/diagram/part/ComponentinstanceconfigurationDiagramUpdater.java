package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part;

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
public class ComponentinstanceconfigurationDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3003SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceComponentCompartmentEditPart.VISUAL_ID:
			return getComponentInstanceComponentCompartment_7003SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceComponentCompartment2EditPart.VISUAL_ID:
			return getComponentInstanceComponentCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> getComponentInstanceConfiguration_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance childElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> getComponentInstance_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> getComponentInstance_3003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> getComponentInstanceComponentCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance childElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> getComponentInstanceComponentCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance childElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getComponentInstanceConfiguration_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getComponentInstance_2002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getPortInstance_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getComponentInstance_3003ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getAssemblyInstance_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getDelegationInstance_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getComponentInstance_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getPortInstance_3001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getComponentInstance_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getAssemblyInstance_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getDelegationInstance_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getComponentInstance_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getPortInstance_3001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance modelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getComponentInstance_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getAssemblyInstance_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getDelegationInstance_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyInstance_4001(
			de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance container) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.AssemblyInstance_4001,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getContainedTypeModelFacetLinks_DelegationInstance_4002(
			de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance container) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.DelegationInstance_4002,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyInstance_4001(
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage.eINSTANCE
					.getConnectorInstance_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.AssemblyInstance_4001,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationInstance_4002(
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage.eINSTANCE
					.getConnectorInstance_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.DelegationInstance_4002,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyInstance_4001(
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance source) {
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) {
				container = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.AssemblyInstance_4001,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationInstance_4002(
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance source) {
		de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) {
				container = (de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.DelegationInstance_4002,
					de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

}
