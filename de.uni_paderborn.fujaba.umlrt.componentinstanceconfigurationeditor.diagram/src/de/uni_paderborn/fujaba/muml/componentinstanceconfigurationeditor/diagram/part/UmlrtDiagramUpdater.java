package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part;

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
public class UmlrtDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2004SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3006SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceComponentCompartmentEditPart.VISUAL_ID:
			return getComponentInstanceComponentCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> getComponentInstanceConfiguration_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> getComponentInstance_2004SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> getComponentInstance_3006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> getComponentInstanceComponentCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart.VISUAL_ID:
			return getPortInstance_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart.VISUAL_ID:
			return getPortInstance_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart.VISUAL_ID:
			return getPortInstance_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getComponentInstanceConfiguration_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyInstance_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationInstance_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getComponentInstance_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getPortInstance_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getComponentInstance_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getPortInstance_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getAssemblyInstance_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getDelegationInstance_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getComponentInstance_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getPortInstance_3005IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.PortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getComponentInstance_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getPortInstance_3007IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.PortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getAssemblyInstance_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getDelegationInstance_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getComponentInstance_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getPortInstance_3005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.PortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getComponentInstance_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getPortInstance_3007OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.PortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getAssemblyInstance_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getDelegationInstance_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyInstance_4003(
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.UmlrtElementTypes.AssemblyInstance_4003,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getContainedTypeModelFacetLinks_DelegationInstance_4004(
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.UmlrtElementTypes.DelegationInstance_4004,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyInstance_4003(
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
					.getConnectorInstance_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.UmlrtElementTypes.AssemblyInstance_4003,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationInstance_4004(
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
					.getConnectorInstance_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.UmlrtElementTypes.DelegationInstance_4004,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyInstance_4003(
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance source) {
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) {
				container = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.UmlrtElementTypes.AssemblyInstance_4003,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationInstance_4004(
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance source) {
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) {
				container = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.UmlrtLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.UmlrtElementTypes.DelegationInstance_4004,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

}
