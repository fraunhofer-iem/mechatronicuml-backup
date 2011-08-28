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
import org.storydriven.modeling.ExtendableElement;

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
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			return getStructuredComponentComponentCompartment_7001SemanticChildren(view);
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
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> getStructuredComponent_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
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
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> getComponentPart_3005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.ComponentPart modelElement = (de.uni_paderborn.fujaba.muml.model.component.ComponentPart) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortsDerived().iterator(); it
				.hasNext();) {
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
			if (visualID == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePort2EditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlNodeDescriptor> getStructuredComponentComponentCompartment_7001SemanticChildren(
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
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3003ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3004ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart.VISUAL_ID:
			return getHybridPort_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return getDiscretePort_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return getContinuousPort_3008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePort2EditPart.VISUAL_ID:
			return getHardwarePort_3009ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getAssembly_4002ContainedLinks(view);
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
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3003IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3004IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart.VISUAL_ID:
			return getHybridPort_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return getDiscretePort_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return getContinuousPort_3008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePort2EditPart.VISUAL_ID:
			return getHardwarePort_3009IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getAssembly_4002IncomingLinks(view);
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
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPort2EditPart.VISUAL_ID:
			return getHybridPort_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePort2EditPart.VISUAL_ID:
			return getDiscretePort_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPort2EditPart.VISUAL_ID:
			return getContinuousPort_3008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HardwarePort2EditPart.VISUAL_ID:
			return getHardwarePort_3009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getAssembly_4002OutgoingLinks(view);
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
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getStructuredComponent_2001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.StructuredComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.StructuredComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHardwarePort_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getComponentPart_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHardwarePort_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDelegation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getAssembly_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getStructuredComponent_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HybridPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HybridPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.DiscretePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.DiscretePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3003IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ContinuousPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.ContinuousPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHardwarePort_3004IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HardwarePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HardwarePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getComponentPart_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3006IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HybridPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HybridPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3007IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.DiscretePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.DiscretePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3008IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ContinuousPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.ContinuousPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHardwarePort_3009IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HardwarePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HardwarePort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDelegation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getAssembly_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getStructuredComponent_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HybridPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HybridPort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.DiscretePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.DiscretePort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3003OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ContinuousPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.ContinuousPort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHardwarePort_3004OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HardwarePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HardwarePort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getComponentPart_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3006OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HybridPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HybridPort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3007OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.DiscretePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.DiscretePort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3008OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.ContinuousPort modelElement = (de.uni_paderborn.fujaba.muml.model.component.ContinuousPort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getHardwarePort_3009OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.component.HardwarePort modelElement = (de.uni_paderborn.fujaba.muml.model.component.HardwarePort) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getDelegation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getAssembly_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Delegation link = (de.uni_paderborn.fujaba.muml.model.component.Delegation) linkObject;
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_Assembly_4002(
			de.uni_paderborn.fujaba.muml.model.component.StructuredComponent container) {
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Assembly link = (de.uni_paderborn.fujaba.muml.model.component.Assembly) linkObject;
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.muml.model.component.Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
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
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_Assembly_4002(
			de.uni_paderborn.fujaba.muml.model.component.Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.component.ComponentPackage.eINSTANCE
					.getConnectorType_ToPort()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Assembly link = (de.uni_paderborn.fujaba.muml.model.component.Assembly) setting
					.getEObject();
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_Delegation_4001(
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
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Delegation link = (de.uni_paderborn.fujaba.muml.model.component.Delegation) linkObject;
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4001,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_Assembly_4002(
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
		LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.component.Assembly link = (de.uni_paderborn.fujaba.muml.model.component.Assembly) linkObject;
			// BEGIN: Bugfix (MechatronicUML)
			// TODO: Create Bug for this and reference its ID
			// if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry.getLinkWithClassVisualID(link)) {
			//	continue;
			// }
			// END: Bugfix
			de.uni_paderborn.fujaba.muml.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.muml.model.component.Port src = link
					.getFromPort();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4002,
					de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

}
