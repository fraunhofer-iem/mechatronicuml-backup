package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ModelinstanceDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceVisualIDRegistry
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
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			EObject childElement = (EObject) it.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor> getAtomicComponent_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.AtomicComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.AtomicComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceVisualIDRegistry
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
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceVisualIDRegistry
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
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceVisualIDRegistry
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
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getAtomicComponent_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getPort_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getAtomicComponent_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getPort_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getAtomicComponent_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.part.ModelinstanceLinkDescriptor> getPort_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
