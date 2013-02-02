package de.uni_paderborn.fujaba.muml.messagetype.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
			return getMessageTypeRepositoryMessageTypesCompartment_7010SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
			return getMessageTypeParametersCompartment_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ModelElementCategory modelElement = (ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor> getMessageTypeRepositoryMessageTypesCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository modelElement = (de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMessageTypes().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.msgtype.MessageType childElement = (de.uni_paderborn.fujaba.muml.msgtype.MessageType) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor> getMessageTypeParametersCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.msgtype.MessageType modelElement = (de.uni_paderborn.fujaba.muml.msgtype.MessageType) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.behavior.Parameter childElement = (de.uni_paderborn.fujaba.muml.behavior.Parameter) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			return getMessageTypeRepository_2008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3007ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			return getMessageTypeRepository_2008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3007IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			return getMessageTypeRepository_2008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3007OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getMessageTypeRepository_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getMessageType_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getParameter_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getMessageTypeRepository_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getMessageType_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getParameter_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getMessageTypeRepository_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getMessageType_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlLinkDescriptor> getParameter_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
