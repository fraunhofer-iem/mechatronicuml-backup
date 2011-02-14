package structuredcomponenteditor.diagram.part;

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

import structuredcomponenteditor.StructuredComponentDiagram;
import structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart;
import structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;
import structuredcomponenteditor.diagram.edit.parts.DelegationEditPart;
import structuredcomponenteditor.diagram.edit.parts.Port2EditPart;
import structuredcomponenteditor.diagram.edit.parts.PortEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart;
import structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes;

/**
 * @generated
 */
public class StructuredcomponentDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<StructuredcomponentNodeDescriptor> getSemanticChildren(
			View view) {
		switch (StructuredcomponentVisualIDRegistry.getVisualID(view)) {
		case StructuredComponentDiagramEditPart.VISUAL_ID:
			return getStructuredComponentDiagram_1000SemanticChildren(view);
		case StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001SemanticChildren(view);
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3002SemanticChildren(view);
		case StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			return getStructuredComponentComponentCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentNodeDescriptor> getStructuredComponentDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StructuredComponentDiagram modelElement = (StructuredComponentDiagram) view
				.getElement();
		LinkedList<StructuredcomponentNodeDescriptor> result = new LinkedList<StructuredcomponentNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent childElement = modelElement
					.getStructuredComponent();
			int visualID = StructuredcomponentVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == StructuredComponentEditPart.VISUAL_ID) {
				result.add(new StructuredcomponentNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentNodeDescriptor> getStructuredComponent_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent) view
				.getElement();
		LinkedList<StructuredcomponentNodeDescriptor> result = new LinkedList<StructuredcomponentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.component.Port childElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) it
					.next();
			int visualID = StructuredcomponentVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new StructuredcomponentNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentNodeDescriptor> getComponentPart_3002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart) view
				.getElement();
		LinkedList<StructuredcomponentNodeDescriptor> result = new LinkedList<StructuredcomponentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortsDerived().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.component.Port childElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) it
					.next();
			int visualID = StructuredcomponentVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == Port2EditPart.VISUAL_ID) {
				result.add(new StructuredcomponentNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentNodeDescriptor> getStructuredComponentComponentCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent) containerView
				.getElement();
		LinkedList<StructuredcomponentNodeDescriptor> result = new LinkedList<StructuredcomponentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmbeddedParts().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart childElement = (de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart) it
					.next();
			int visualID = StructuredcomponentVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ComponentPartEditPart.VISUAL_ID) {
				result.add(new StructuredcomponentNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getContainedLinks(
			View view) {
		switch (StructuredcomponentVisualIDRegistry.getVisualID(view)) {
		case StructuredComponentDiagramEditPart.VISUAL_ID:
			return getStructuredComponentDiagram_1000ContainedLinks(view);
		case StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001ContainedLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3001ContainedLinks(view);
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3002ContainedLinks(view);
		case Port2EditPart.VISUAL_ID:
			return getPort_3003ContainedLinks(view);
		case DelegationEditPart.VISUAL_ID:
			return getDelegation_4001ContainedLinks(view);
		case AssemblyEditPart.VISUAL_ID:
			return getAssembly_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getIncomingLinks(
			View view) {
		switch (StructuredcomponentVisualIDRegistry.getVisualID(view)) {
		case StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001IncomingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3001IncomingLinks(view);
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3002IncomingLinks(view);
		case Port2EditPart.VISUAL_ID:
			return getPort_3003IncomingLinks(view);
		case DelegationEditPart.VISUAL_ID:
			return getDelegation_4001IncomingLinks(view);
		case AssemblyEditPart.VISUAL_ID:
			return getAssembly_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (StructuredcomponentVisualIDRegistry.getVisualID(view)) {
		case StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001OutgoingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3001OutgoingLinks(view);
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3002OutgoingLinks(view);
		case Port2EditPart.VISUAL_ID:
			return getPort_3003OutgoingLinks(view);
		case DelegationEditPart.VISUAL_ID:
			return getDelegation_4001OutgoingLinks(view);
		case AssemblyEditPart.VISUAL_ID:
			return getAssembly_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getStructuredComponentDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getStructuredComponent_2001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent) view
				.getElement();
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getComponentPart_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getPort_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getDelegation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getAssembly_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getStructuredComponent_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getPort_3001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.Port modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getComponentPart_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getPort_3003IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.Port modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Assembly_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getDelegation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getAssembly_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getStructuredComponent_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getPort_3001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.Port modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) view
				.getElement();
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getComponentPart_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getPort_3003OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.Port modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) view
				.getElement();
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Assembly_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getDelegation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StructuredcomponentLinkDescriptor> getAssembly_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<StructuredcomponentLinkDescriptor> getContainedTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent container) {
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.component.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Delegation link = (de.uni_paderborn.fujaba.umlrt.model.component.Delegation) linkObject;
			if (DelegationEditPart.VISUAL_ID != StructuredcomponentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.umlrt.model.component.Port src = link
					.getFromPort();
			result.add(new StructuredcomponentLinkDescriptor(src, dst, link,
					StructuredcomponentElementTypes.Delegation_4001,
					DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StructuredcomponentLinkDescriptor> getContainedTypeModelFacetLinks_Assembly_4002(
			de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent container) {
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Assembly link = (de.uni_paderborn.fujaba.umlrt.model.component.Assembly) linkObject;
			if (AssemblyEditPart.VISUAL_ID != StructuredcomponentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Port dst = link
					.getToPort();
			de.uni_paderborn.fujaba.umlrt.model.component.Port src = link
					.getFromPort();
			result.add(new StructuredcomponentLinkDescriptor(src, dst, link,
					StructuredcomponentElementTypes.Assembly_4002,
					AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StructuredcomponentLinkDescriptor> getIncomingTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.umlrt.model.component.Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage.eINSTANCE
					.getConnectorType_ToPort()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.umlrt.model.component.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Delegation link = (de.uni_paderborn.fujaba.umlrt.model.component.Delegation) setting
					.getEObject();
			if (DelegationEditPart.VISUAL_ID != StructuredcomponentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Port src = link
					.getFromPort();
			result.add(new StructuredcomponentLinkDescriptor(src, target, link,
					StructuredcomponentElementTypes.Delegation_4001,
					DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StructuredcomponentLinkDescriptor> getIncomingTypeModelFacetLinks_Assembly_4002(
			de.uni_paderborn.fujaba.umlrt.model.component.Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage.eINSTANCE
					.getConnectorType_ToPort()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.umlrt.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Assembly link = (de.uni_paderborn.fujaba.umlrt.model.component.Assembly) setting
					.getEObject();
			if (AssemblyEditPart.VISUAL_ID != StructuredcomponentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Port src = link
					.getFromPort();
			result.add(new StructuredcomponentLinkDescriptor(src, target, link,
					StructuredcomponentElementTypes.Assembly_4002,
					AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StructuredcomponentLinkDescriptor> getOutgoingTypeModelFacetLinks_Delegation_4001(
			de.uni_paderborn.fujaba.umlrt.model.component.Port source) {
		de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent) {
				container = (de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.component.Delegation) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Delegation link = (de.uni_paderborn.fujaba.umlrt.model.component.Delegation) linkObject;
			if (DelegationEditPart.VISUAL_ID != StructuredcomponentVisualIDRegistry
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
			result.add(new StructuredcomponentLinkDescriptor(src, dst, link,
					StructuredcomponentElementTypes.Delegation_4001,
					DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StructuredcomponentLinkDescriptor> getOutgoingTypeModelFacetLinks_Assembly_4002(
			de.uni_paderborn.fujaba.umlrt.model.component.Port source) {
		de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent) {
				container = (de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<StructuredcomponentLinkDescriptor> result = new LinkedList<StructuredcomponentLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.component.Assembly) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.component.Assembly link = (de.uni_paderborn.fujaba.umlrt.model.component.Assembly) linkObject;
			if (AssemblyEditPart.VISUAL_ID != StructuredcomponentVisualIDRegistry
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
			result.add(new StructuredcomponentLinkDescriptor(src, dst, link,
					StructuredcomponentElementTypes.Assembly_4002,
					AssemblyEditPart.VISUAL_ID));
		}
		return result;
	}

}
