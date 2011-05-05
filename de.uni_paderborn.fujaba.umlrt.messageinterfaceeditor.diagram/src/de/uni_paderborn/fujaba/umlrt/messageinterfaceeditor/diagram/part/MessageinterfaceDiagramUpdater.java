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

/**
 * @generated
 */
public class MessageinterfaceDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getMessageInterfaceDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceNodeDescriptor> getMessageInterfaceDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram modelElement = (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMessageInterfaces().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface childElement = (de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getMessageInterfaceDiagram_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart.VISUAL_ID:
			return getMessageInterface_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart.VISUAL_ID:
			return getMessageInterface_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceEditPart.VISUAL_ID:
			return getMessageInterface_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getMessageInterfaceDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getMessageInterface_2001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface modelElement = (de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MessageInterface_SuperType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getMessageInterface_2001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface modelElement = (de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MessageInterface_SuperType_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getMessageInterface_2001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface modelElement = (de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MessageInterface_SuperType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getIncomingFeatureModelFacetLinks_MessageInterface_SuperType_4002(
			de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage.eINSTANCE
					.getMessageInterface_SuperType()) {
				result.add(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MessageinterfaceElementTypes.MessageInterfaceSuperType_4002,
						de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceSuperTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> getOutgoingFeatureModelFacetLinks_MessageInterface_SuperType_4002(
			de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface source) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor>();
		for (Iterator<?> destinations = source.getSuperType().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface destination = (de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.part.MessageinterfaceLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MessageinterfaceElementTypes.MessageInterfaceSuperType_4002,
					de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceSuperTypeEditPart.VISUAL_ID));
		}
		return result;
	}

}
