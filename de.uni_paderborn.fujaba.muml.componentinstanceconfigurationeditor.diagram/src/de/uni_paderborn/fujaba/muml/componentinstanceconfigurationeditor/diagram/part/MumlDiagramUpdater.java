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
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7017SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7018SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getParentPortInstances().iterator(); it
				.hasNext();) {
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
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
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
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
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
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
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
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7017SemanticChildren(
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
			de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance childElement = (de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance) it
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7018SemanticChildren(
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
			de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance childElement = (de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance) it
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
			return getHybridPortInstance_2021ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002ContainedLinks(view);
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
			return getHybridPortInstance_2021IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002IncomingLinks(view);
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
			return getHybridPortInstance_2021OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002OutgoingLinks(view);
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
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2024ContainedLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3032ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3034ContainedLinks(
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
		result.addAll(getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAssemblyConnectorInstance_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDelegationConnectorInstance_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2021IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2022IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2023IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2024IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
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
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3031IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3032IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3033IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3034IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAssemblyConnectorInstance_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDelegationConnectorInstance_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2021OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2022OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2023OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2024OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
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
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3031OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3032OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3033OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3034OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance modelElement = (de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(modelElement));
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getAssemblyConnectorInstance_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDelegationConnectorInstance_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_DelegationConnectorInstance_4002(
			de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration container) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> links = container.getPortConnectorInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_DelegationConnectorInstance_4002(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage.eINSTANCE
					.getConnectorInstance_ConnectorEndpointInstances()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theSource;
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_AssemblyConnectorInstance_4001(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance source) {
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
		for (Iterator<?> links = container.getPortConnectorInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance link = (de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_DelegationConnectorInstance_4002(
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance source) {
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
		for (Iterator<?> links = container.getPortConnectorInstances()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance link = (de.uni_paderborn.fujaba.muml.model.instance.DelegationConnectorInstance) linkObject;
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getConnectorEndpointInstances();
			Object theTarget = !targets.isEmpty() ? targets.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance dst = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theTarget;
			List sources = link.getConnectorEndpointInstances();
			Object theSource = !sources.isEmpty() ? sources
					.get(sources.size() - 1) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance src = (de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpointInstance) theSource;
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002,
					de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

}
