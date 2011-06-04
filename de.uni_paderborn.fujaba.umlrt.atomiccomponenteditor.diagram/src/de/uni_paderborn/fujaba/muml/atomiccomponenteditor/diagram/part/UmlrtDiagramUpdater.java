package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.ExtendableElement;

/**
 * @generated
 */
public class UmlrtDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor> getAtomicComponent_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.AtomicComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.AtomicComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getAtomicComponent_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getAtomicComponent_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getPort_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getAtomicComponent_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.UmlrtLinkDescriptor> getPort_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
