package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part;

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
import org.storydriven.core.ExtendableElement;

import de.fujaba.modelinstance.ModelElementCategory;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			return getStaticStructuredComponentComponentCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ModelElementCategory modelElement = (ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> getStaticStructuredComponent_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> getComponentPart_3012SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.ComponentPart modelElement = (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> getStaticStructuredComponentComponentCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedParts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.ComponentPart childElement = (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart.VISUAL_ID:
			return getHybridPort_3013ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return getDiscretePort_3014ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return getContinuousPort_3015ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart.VISUAL_ID:
			return getHybridPort_3013IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return getDiscretePort_3014IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return getContinuousPort_3015IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
			return getStaticStructuredComponent_2005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3010OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3011OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3012OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart.VISUAL_ID:
			return getHybridPort_3013OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return getDiscretePort_3014OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return getContinuousPort_3015OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
			return getAssemblyConnector_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
			return getDelegationConnector_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getStaticStructuredComponent_2005ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getComponentPart_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getAssemblyConnector_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDelegationConnector_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getStaticStructuredComponent_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3010IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.DiscretePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.DiscretePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3011IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ContinuousPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.ContinuousPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getComponentPart_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3013IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HybridPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HybridPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3014IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.DiscretePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.DiscretePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3015IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ContinuousPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.ContinuousPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnector_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnector_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getAssemblyConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDelegationConnector_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getStaticStructuredComponent_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3010OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.DiscretePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.DiscretePort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3011OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ContinuousPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.ContinuousPort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getComponentPart_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3013OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HybridPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HybridPort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3014OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.DiscretePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.DiscretePort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3015OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ContinuousPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.ContinuousPort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getAssemblyConnector_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDelegationConnector_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyConnector_4001(
			de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector link = (de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.AssemblyConnector_4001,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationConnector_4002(
			de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.DelegationConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.DelegationConnector link = (de.uni_paderborn.fujaba.muml.model.component.DelegationConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DelegationConnector_4002,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyConnector_4001(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector link = (de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.AssemblyConnector_4001,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationConnector_4002(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.component.DelegationConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.DelegationConnector link = (de.uni_paderborn.fujaba.muml.model.component.DelegationConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DelegationConnector_4002,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyConnector_4001(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint source) {
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
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector link = (de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.AssemblyConnector_4001,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationConnector_4002(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint source) {
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
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.DelegationConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.DelegationConnector link = (de.uni_paderborn.fujaba.muml.model.component.DelegationConnector) linkObject;
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpoints();
			Object theTarget = !targets.isEmpty() ? targets.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theTarget;
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DelegationConnector_4002,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

}
