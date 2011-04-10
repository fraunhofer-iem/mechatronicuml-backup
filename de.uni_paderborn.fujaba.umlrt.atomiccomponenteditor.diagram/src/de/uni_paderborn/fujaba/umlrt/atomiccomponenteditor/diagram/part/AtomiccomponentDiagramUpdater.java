package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AtomiccomponentDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getAtomicComponentDiagram_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor> getAtomicComponentDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram modelElement = (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent childElement = modelElement
					.getAtomicComponent();
			int visualID = de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor> getAtomicComponent_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent modelElement = (de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.component.Port childElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getAtomicComponentDiagram_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getAtomicComponentDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getAtomicComponent_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getAtomicComponent_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getPort_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getAtomicComponent_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.AtomiccomponentLinkDescriptor> getPort_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
