package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.ExtendableElement;

/**
 * @generated
 */
public class MumlinstanceDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor> getAtomicComponent_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.AtomicComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.AtomicComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2003ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2003IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getAtomicComponent_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getAtomicComponent_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getAtomicComponent_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.MumlinstanceLinkDescriptor> getPort_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
