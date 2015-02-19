package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MumlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getComponentInstanceConfiguration().isSuperTypeOf(
						domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) domainElement)) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getHybridPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteSinglePortInstance().isSuperTypeOf(
							domainElement.eClass())
					&& isDiscreteSinglePortInstance_2022((de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance) domainElement)) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteMultiPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getContinuousPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getAtomicComponentInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getStructuredComponentInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getCoordinationProtocolInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getHybridPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteSinglePortInstance().isSuperTypeOf(
							domainElement.eClass())
					&& isDiscreteSinglePortInstance_3032((de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance) domainElement)) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteMultiPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getContinuousPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getHybridPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteSinglePortInstance().isSuperTypeOf(
							domainElement.eClass())
					&& isDiscreteSinglePortInstance_3032((de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance) domainElement)) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteMultiPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getContinuousPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getHybridPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteSinglePortInstance().isSuperTypeOf(
							domainElement.eClass())
					&& isDiscreteSinglePortInstance_3032((de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance) domainElement)) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteMultiPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getContinuousPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getHybridPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteSinglePortInstance().isSuperTypeOf(
							domainElement.eClass())
					&& isDiscreteSinglePortInstance_3032((de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance) domainElement)) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteMultiPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getContinuousPortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteSinglePortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getDiscreteSinglePortInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getComponentInstanceConfiguration().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getAtomicComponentInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getStructuredComponentInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getCoordinationProtocolInstance().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
					.getComponentInstanceConfiguration().isSuperTypeOf(
							domainElement.eClass())) {
				return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getModelID(containerView);
		if (!de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getAssemblyConnectorInstance().isSuperTypeOf(
						domainElement.eClass())
				&& isAssemblyConnectorInstance_4001((de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance) domainElement)) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID;
		}
		if (de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getDelegationConnectorInstance().isSuperTypeOf(
						domainElement.eClass())
				&& isDelegationConnectorInstance_4002((de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance) domainElement)) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isDiscreteSinglePortInstance_2022(
			de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance domainElement) {
		Object result = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
				.getExpression(
						1,
						de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
								.getDiscreteSinglePortInstance(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDiscreteSinglePortInstance_3032(
			de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance domainElement) {
		Object result = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
				.getExpression(
						1,
						de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
								.getDiscreteSinglePortInstance(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAssemblyConnectorInstance_4001(
			de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance domainElement) {
		Object result = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
				.getExpression(
						10,
						de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
								.getAssemblyConnectorInstance(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDelegationConnectorInstance_4002(
			de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance domainElement) {
		Object result = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
				.getExpression(
						11,
						de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
								.getDelegationConnectorInstance(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return false;
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
