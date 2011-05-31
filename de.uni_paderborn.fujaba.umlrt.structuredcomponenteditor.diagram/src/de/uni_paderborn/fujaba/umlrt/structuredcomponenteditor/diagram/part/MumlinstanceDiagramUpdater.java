package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part;

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
import org.storydriven.modeling.ExtendableElement;

/**
 * @generated
 */
public class MumlinstanceDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2002SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			return getStructuredComponentComponentCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> getStructuredComponent_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> getComponentPart_3005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.ComponentPart modelElement = (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortsDerived().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> getStructuredComponentComponentCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedParts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart childElement = (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getPort_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4003ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getAssembly_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getPort_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4003IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getAssembly_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getPort_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getAssembly_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getStructuredComponent_2002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Delegation_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Assembly_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getComponentPart_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getDelegation_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getAssembly_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getStructuredComponent_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3004IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.Port modelElement = (de.uni_paderborn.fujaba.muml.model.component.Port) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getComponentPart_3005IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ComponentPart modelElement = (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3006IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.Port modelElement = (de.uni_paderborn.fujaba.muml.model.component.Port) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getDelegation_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getAssembly_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getStructuredComponent_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3004OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.Port modelElement = (de.uni_paderborn.fujaba.muml.model.component.Port) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getComponentPart_3005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ComponentPart modelElement = (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3006OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.Port modelElement = (de.uni_paderborn.fujaba.muml.model.component.Port) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getDelegation_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getAssembly_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getContainedTypeModelFacetLinks_Delegation_4003(
			de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Delegation link = (de.uni_paderborn.fujaba.muml.model.component.Delegation) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Delegation_4003,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getContainedTypeModelFacetLinks_Assembly_4004(
			de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Assembly link = (de.uni_paderborn.fujaba.muml.model.component.Assembly) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart dst = link
					.getTo();
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart src = link
					.getFrom();
			result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Assembly_4004,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getIncomingTypeModelFacetLinks_Delegation_4003(
			de.uni_paderborn.fujaba.muml.model.component.Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
					.getConnectorType_ToPort()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.component.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Delegation link = (de.uni_paderborn.fujaba.muml.model.component.Delegation) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Delegation_4003,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getIncomingTypeModelFacetLinks_Assembly_4004(
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
					.getAssembly_To()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Assembly link = (de.uni_paderborn.fujaba.muml.model.component.Assembly) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart src = link
					.getFrom();
			result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Assembly_4004,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getOutgoingTypeModelFacetLinks_Delegation_4003(
			de.uni_paderborn.fujaba.muml.model.component.Port source) {
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) {
				container = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Delegation link = (de.uni_paderborn.fujaba.muml.model.component.Delegation) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Delegation_4003,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getOutgoingTypeModelFacetLinks_Assembly_4004(
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart source) {
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) {
				container = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Assembly link = (de.uni_paderborn.fujaba.muml.model.component.Assembly) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart dst = link
					.getTo();
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart src = link
					.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Assembly_4004,
					de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

}
