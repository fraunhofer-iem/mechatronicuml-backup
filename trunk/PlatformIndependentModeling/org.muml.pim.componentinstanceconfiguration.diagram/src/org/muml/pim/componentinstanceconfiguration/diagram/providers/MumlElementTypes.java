/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.componentinstanceconfiguration.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin;
import org.muml.pim.instance.InstancePackage;

/**
 * @generated
 */
public class MumlElementTypes {

	/**
	 * @generated
	 */
	private MumlElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ComponentInstanceConfiguration_1000 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.ComponentInstanceConfiguration_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HybridPortInstance_2021 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.HybridPortInstance_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteSinglePortInstance_2022 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.DiscreteSinglePortInstance_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteMultiPortInstance_2023 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.DiscreteMultiPortInstance_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPortInstance_2024 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.ContinuousPortInstance_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicComponentInstance_2016 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.AtomicComponentInstance_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredComponentInstance_2015 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.StructuredComponentInstance_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocolInstance_2025 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.CoordinationProtocolInstance_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteSinglePortInstance_3026 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.DiscreteSinglePortInstance_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HybridPortInstance_3031 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.HybridPortInstance_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteSinglePortInstance_3032 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.DiscreteSinglePortInstance_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DiscreteMultiPortInstance_3033 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.DiscreteMultiPortInstance_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousPortInstance_3034 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.ContinuousPortInstance_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstanceConfiguration_3023 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.ComponentInstanceConfiguration_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicComponentInstance_3024 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.AtomicComponentInstance_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredComponentInstance_3025 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.StructuredComponentInstance_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocolInstance_3035 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.CoordinationProtocolInstance_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssemblyConnectorInstance_4001 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.AssemblyConnectorInstance_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DelegationConnectorInstance_4002 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.DelegationConnectorInstance_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationProtocolInstancePortInstances_4003 = getElementType(
			"org.muml.pim.componentinstanceconfiguration.diagram.CoordinationProtocolInstancePortInstances_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ComponentInstanceConfiguration_1000,
					InstancePackage.eINSTANCE.getComponentInstanceConfiguration());

			elements.put(HybridPortInstance_2021, InstancePackage.eINSTANCE.getHybridPortInstance());

			elements.put(DiscreteSinglePortInstance_2022, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance());

			elements.put(DiscreteMultiPortInstance_2023, InstancePackage.eINSTANCE.getDiscreteMultiPortInstance());

			elements.put(ContinuousPortInstance_2024, InstancePackage.eINSTANCE.getContinuousPortInstance());

			elements.put(AtomicComponentInstance_2016, InstancePackage.eINSTANCE.getAtomicComponentInstance());

			elements.put(StructuredComponentInstance_2015, InstancePackage.eINSTANCE.getStructuredComponentInstance());

			elements.put(CoordinationProtocolInstance_2025,
					InstancePackage.eINSTANCE.getCoordinationProtocolInstance());

			elements.put(DiscreteSinglePortInstance_3026, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance());

			elements.put(HybridPortInstance_3031, InstancePackage.eINSTANCE.getHybridPortInstance());

			elements.put(DiscreteSinglePortInstance_3032, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance());

			elements.put(DiscreteMultiPortInstance_3033, InstancePackage.eINSTANCE.getDiscreteMultiPortInstance());

			elements.put(ContinuousPortInstance_3034, InstancePackage.eINSTANCE.getContinuousPortInstance());

			elements.put(ComponentInstanceConfiguration_3023,
					InstancePackage.eINSTANCE.getComponentInstanceConfiguration());

			elements.put(AtomicComponentInstance_3024, InstancePackage.eINSTANCE.getAtomicComponentInstance());

			elements.put(StructuredComponentInstance_3025, InstancePackage.eINSTANCE.getStructuredComponentInstance());

			elements.put(CoordinationProtocolInstance_3035,
					InstancePackage.eINSTANCE.getCoordinationProtocolInstance());

			elements.put(AssemblyConnectorInstance_4001, InstancePackage.eINSTANCE.getAssemblyConnectorInstance());

			elements.put(DelegationConnectorInstance_4002, InstancePackage.eINSTANCE.getDelegationConnectorInstance());

			elements.put(CoordinationProtocolInstancePortInstances_4003,
					InstancePackage.eINSTANCE.getCoordinationProtocolInstance_PortInstances());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ComponentInstanceConfiguration_1000);
			KNOWN_ELEMENT_TYPES.add(HybridPortInstance_2021);
			KNOWN_ELEMENT_TYPES.add(DiscreteSinglePortInstance_2022);
			KNOWN_ELEMENT_TYPES.add(DiscreteMultiPortInstance_2023);
			KNOWN_ELEMENT_TYPES.add(ContinuousPortInstance_2024);
			KNOWN_ELEMENT_TYPES.add(AtomicComponentInstance_2016);
			KNOWN_ELEMENT_TYPES.add(StructuredComponentInstance_2015);
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocolInstance_2025);
			KNOWN_ELEMENT_TYPES.add(DiscreteSinglePortInstance_3026);
			KNOWN_ELEMENT_TYPES.add(HybridPortInstance_3031);
			KNOWN_ELEMENT_TYPES.add(DiscreteSinglePortInstance_3032);
			KNOWN_ELEMENT_TYPES.add(DiscreteMultiPortInstance_3033);
			KNOWN_ELEMENT_TYPES.add(ContinuousPortInstance_3034);
			KNOWN_ELEMENT_TYPES.add(ComponentInstanceConfiguration_3023);
			KNOWN_ELEMENT_TYPES.add(AtomicComponentInstance_3024);
			KNOWN_ELEMENT_TYPES.add(StructuredComponentInstance_3025);
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocolInstance_3035);
			KNOWN_ELEMENT_TYPES.add(AssemblyConnectorInstance_4001);
			KNOWN_ELEMENT_TYPES.add(DelegationConnectorInstance_4002);
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocolInstancePortInstances_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return ComponentInstanceConfiguration_1000;
		case HybridPortInstanceEditPart.VISUAL_ID:
			return HybridPortInstance_2021;
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return DiscreteSinglePortInstance_2022;
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return DiscreteMultiPortInstance_2023;
		case ContinuousPortInstanceEditPart.VISUAL_ID:
			return ContinuousPortInstance_2024;
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			return AtomicComponentInstance_2016;
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			return StructuredComponentInstance_2015;
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return CoordinationProtocolInstance_2025;
		case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return DiscreteSinglePortInstance_3026;
		case HybridPortInstance2EditPart.VISUAL_ID:
			return HybridPortInstance_3031;
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return DiscreteSinglePortInstance_3032;
		case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return DiscreteMultiPortInstance_3033;
		case ContinuousPortInstance2EditPart.VISUAL_ID:
			return ContinuousPortInstance_3034;
		case ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return ComponentInstanceConfiguration_3023;
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			return AtomicComponentInstance_3024;
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			return StructuredComponentInstance_3025;
		case CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return CoordinationProtocolInstance_3035;
		case AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return AssemblyConnectorInstance_4001;
		case DelegationConnectorInstanceEditPart.VISUAL_ID:
			return DelegationConnectorInstance_4002;
		case CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID:
			return CoordinationProtocolInstancePortInstances_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
