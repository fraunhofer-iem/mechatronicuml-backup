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
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7011SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7008SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getParentPortInstancesDerived()
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
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID) {
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
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7011SemanticChildren(
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
		for (Iterator<?> it = modelElement.getSubPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlNodeDescriptor> getDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment_7008SemanticChildren(
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
		for (Iterator<?> it = modelElement.getSubPortInstances().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance childElement = (de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID) {
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2011ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2012ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2013ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2014ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3021ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3018ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3019ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3020ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3022ContainedLinks(view);
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
			return getHybridPortInstance_2011IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2012IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2013IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2014IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3021IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3018IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3019IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3020IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3022IncomingLinks(view);
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
			return getHybridPortInstance_2011OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2012OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2013OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2014OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3021OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3018OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3019OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3020OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3022OutgoingLinks(view);
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2014ContainedLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3022ContainedLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2011IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2012IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2013IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2014IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3021IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3018IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3019IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3020IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3022IncomingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_2011OutgoingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_2012OutgoingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_2013OutgoingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_2014OutgoingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3021OutgoingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getHybridPortInstance_3018OutgoingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteSinglePortInstance_3019OutgoingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getDiscreteMultiPortInstance_3020OutgoingLinks(
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
	public static List<de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlLinkDescriptor> getContinuousPortInstance_3022OutgoingLinks(
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
