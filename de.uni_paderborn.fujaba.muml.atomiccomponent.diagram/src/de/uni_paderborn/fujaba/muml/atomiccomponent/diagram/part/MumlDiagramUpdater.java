package de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.core.ExtendableElement;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor> getAtomicComponent_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.component.AtomicComponent modelElement = (de.uni_paderborn.fujaba.muml.component.AtomicComponent) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.component.Port childElement = (de.uni_paderborn.fujaba.muml.component.Port) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.HybridPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3006ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3006IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getAtomicComponent_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getHybridPort_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getDiscretePort_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getContinuousPort_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getAtomicComponent_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getHybridPort_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getDiscretePort_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getContinuousPort_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getAtomicComponent_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getHybridPort_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getDiscretePort_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlLinkDescriptor> getContinuousPort_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
