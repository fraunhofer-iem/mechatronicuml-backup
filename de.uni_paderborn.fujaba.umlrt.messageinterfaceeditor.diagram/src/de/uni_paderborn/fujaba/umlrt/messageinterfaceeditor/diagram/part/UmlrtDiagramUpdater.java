package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part;

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
public class UmlrtDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceMessageTypeCompartmentEditPart.VISUAL_ID:
			return getMessageInterfaceMessageTypeCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor> getMessageInterfaceMessageTypeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface modelElement = (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMessageTypes().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.msgiface.MessageType childElement = (de.uni_paderborn.fujaba.muml.model.msgiface.MessageType) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart.VISUAL_ID:
			return getMessageInterface_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart.VISUAL_ID:
			return getMessageInterface_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart.VISUAL_ID:
			return getMessageInterface_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getMessageInterface_2002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface modelElement = (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MessageInterface_SuperType_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getMessageType_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getMessageInterface_2002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface modelElement = (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MessageInterface_SuperType_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getMessageType_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getMessageInterface_2002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface modelElement = (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MessageInterface_SuperType_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getMessageType_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getIncomingFeatureModelFacetLinks_MessageInterface_SuperType_4003(
			de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage.eINSTANCE
					.getMessageInterface_SuperType()) {
				result.add(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterfaceSuperType_4003,
						de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceSuperTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> getOutgoingFeatureModelFacetLinks_MessageInterface_SuperType_4003(
			de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface source) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor>();
		for (Iterator<?> destinations = source.getSuperType().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface destination = (de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.UmlrtLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterfaceSuperType_4003,
					de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceSuperTypeEditPart.VISUAL_ID));
		}
		return result;
	}

}
