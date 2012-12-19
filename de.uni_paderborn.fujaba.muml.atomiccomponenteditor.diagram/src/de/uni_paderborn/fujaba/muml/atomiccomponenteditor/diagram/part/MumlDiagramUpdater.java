package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ModelElementCategory modelElement = (ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor> getAtomicComponent_2006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.component.AtomicComponent modelElement = (de.uni_paderborn.fujaba.muml.model.component.AtomicComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.component.Port childElement = (de.uni_paderborn.fujaba.muml.model.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3008ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3009ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3008IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3009IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3008OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3009OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getAtomicComponent_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getAtomicComponent_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getAtomicComponent_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getHybridPort_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getDiscretePort_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlLinkDescriptor> getContinuousPort_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
