package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part;

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
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7015SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7016SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
			return getStructuredComponentInstanceComponentInstanceContentsCompartment_7012SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			return getComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartment_7013SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			return getStructuredComponentInstanceComponentInstanceContentsCompartment_7014SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getComponentInstanceConfiguration_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDirectParentPortInstances()
				.iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getAtomicComponentInstance_2016SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.AtomicComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.AtomicComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDirectPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getStructuredComponentInstance_2015SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDirectPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getAtomicComponentInstance_3024SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.AtomicComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.AtomicComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDirectPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getStructuredComponentInstance_3025SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDirectPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.PortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGmfSubPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getStructuredComponentInstanceComponentInstanceContentsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration childElement = modelElement
					.getEmbeddedCIC();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponentInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getStructuredComponentInstanceComponentInstanceContentsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration childElement = modelElement
					.getEmbeddedCIC();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2017ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2018ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2019ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2020ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3027ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3028ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3029ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3030ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4005ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2017IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2018IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2019IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2020IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3027IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3028IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3029IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3030IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4005IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2017OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2018OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2019OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2020OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3027OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3028OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3029OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3030OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getComponentInstanceConfiguration_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getComponentInstanceConfiguration_3023ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAssemblyInstance_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDelegationInstance_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2017IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2018IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2019IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2020IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_2016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_2015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3026IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3027IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3028IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3029IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3030IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationInstance_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getComponentInstanceConfiguration_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAssemblyInstance_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDelegationInstance_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2017OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2018OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2019OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2020OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_2016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_2015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3026OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3027OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3028OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3029OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3030OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationInstance_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getComponentInstanceConfiguration_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAtomicComponentInstance_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getStructuredComponentInstance_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAssemblyInstance_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDelegationInstance_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyInstance_4005(
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyInstance_4005,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationInstance_4006(
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationInstance_4006,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyInstance_4005(
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
					.getConnectorInstance_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyInstance_4005,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationInstance_4006(
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.instance.InstancePackage.eINSTANCE
					.getConnectorInstance_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationInstance_4006,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyInstance_4005(
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance source) {
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) {
				container = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyInstance_4005,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationInstance_4006(
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance source) {
		de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) {
				container = (de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectorInstances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance dst = link
					.getTarget();
			de.uni_paderborn.fujaba.muml.model.instance.PortInstance src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationInstance_4006,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

}
