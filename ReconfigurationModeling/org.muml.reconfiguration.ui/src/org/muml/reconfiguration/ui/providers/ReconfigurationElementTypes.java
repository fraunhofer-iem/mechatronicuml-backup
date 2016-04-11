package org.muml.reconfiguration.ui.providers;

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

public class ReconfigurationElementTypes {

	/**
	 * @generated
	 */
	private ReconfigurationElementTypes() {

	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	public static final IElementType ReconfigurableAtomicComponent_2078 = getElementType("org.muml.reconfiguration.ReconfigurableAtomicComponent_2078");
	public static final IElementType ReconfigurableStructuredComponent_2076 = getElementType("org.muml.reconfiguration.ReconfigurableStructuredComponent_2076");
	public static final IElementType ReconfigurationMessagePort_3076 = getElementType("org.muml.reconfiguration.ReconfigurationMessagePort_3076");
	public static final IElementType ReconfigurationExecutionPort_3077 = getElementType("org.muml.reconfiguration.ReconfigurationExecutionPort_3077");
	public static final IElementType RuleBasedReconfigurationController_7076 = getElementType("org.muml.reconfiguration.RuleBasedReconfigurationController_7076");
	public static final IElementType Manager_2075 = getElementType("org.muml.reconfiguration.Manager_2075");
	public static final IElementType Executor_2077 = getElementType("org.muml.reconfiguration.Executor_2077");
	public static final IElementType ReconfigurationPortDelegationConnector_4076 = getElementType("org.muml.reconfiguration.ReconfigurationPortDelegationConnector_4076");
	public static final IElementType ReconfigurationPortAssemblyConnector_4075 = getElementType("org.muml.reconfiguration.ReconfigurationPortAssemblyConnector_4075");
	public static final IElementType ComponentPart_3012 = getElementType("org.muml.pim.component.diagram.ComponentPart_3012");
	public static final IElementType DiscretePort_3010 = getElementType("org.muml.pim.component.diagram.DiscretePort_3010");
	public static final IElementType HybridPort_3013 = getElementType("org.muml.pim.component.diagram.HybridPort_3013");
	public static final IElementType ContinuousPort_3011 = getElementType("org.muml.pim.component.diagram.ContinuousPort_3011");
	public static final IElementType FadingComponent_2079 = getElementType("org.muml.reconfiguration.FadingComponent_2079");
	public static final IElementType BroadcastPort_3078 = getElementType("org.muml.reconfiguration.BroadcastPort_3078");
	public static final IElementType CoordinationProtocolPart_3016 = getElementType("org.muml.pim.component.diagram.CoordinationProtocolPart_3016");
	
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

			elements.put(
					ReconfigurableAtomicComponent_2078,
					org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getReconfigurableAtomicComponent());
			elements.put(
					ReconfigurableStructuredComponent_2076,
					org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getReconfigurableStructuredComponent());
			elements.put(
					ReconfigurationMessagePort_3076,
					org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getReconfigurationMessagePort());
			elements.put(
					ReconfigurationExecutionPort_3077,
					org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getReconfigurationExecutionPort());
			elements.put(
					RuleBasedReconfigurationController_7076,
					org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getRuleBasedReconfigurationController());
			elements.put(
					Manager_2075,
					org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getManager());

			elements.put(
					ComponentPart_3012,
					org.muml.pim.component.ComponentPackage.eINSTANCE
							.getComponentPart());

			elements.put(
					DiscretePort_3010,
					org.muml.pim.component.ComponentPackage.eINSTANCE
							.getDiscretePort());
			elements.put(
					HybridPort_3013,
					org.muml.pim.component.ComponentPackage.eINSTANCE
							.getHybridPort());
			elements.put(
					ContinuousPort_3011,
					org.muml.pim.component.ComponentPackage.eINSTANCE
							.getContinuousPort());
			
			elements.put(
					CoordinationProtocolPart_3016,
					org.muml.pim.component.ComponentPackage.eINSTANCE
							.getCoordinationProtocolPart());

			elements.put(
					FadingComponent_2079,
					org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getFadingComponent());
			elements.put(
					BroadcastPort_3078,
					org.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage.eINSTANCE
							.getBroadcastPort());
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
			KNOWN_ELEMENT_TYPES.add(ReconfigurableAtomicComponent_2078);
			KNOWN_ELEMENT_TYPES.add(ReconfigurableStructuredComponent_2076);
			KNOWN_ELEMENT_TYPES.add(ReconfigurationMessagePort_3076);
			KNOWN_ELEMENT_TYPES.add(ReconfigurationExecutionPort_3077);
			KNOWN_ELEMENT_TYPES.add(RuleBasedReconfigurationController_7076);
			KNOWN_ELEMENT_TYPES.add(Manager_2075);
			KNOWN_ELEMENT_TYPES
					.add(ReconfigurationPortDelegationConnector_4076);
			KNOWN_ELEMENT_TYPES.add(ReconfigurationPortAssemblyConnector_4075);
			KNOWN_ELEMENT_TYPES.add(ComponentPart_3012);
			KNOWN_ELEMENT_TYPES.add(DiscretePort_3010);
			KNOWN_ELEMENT_TYPES.add(HybridPort_3013);
			KNOWN_ELEMENT_TYPES.add(CoordinationProtocolPart_3016);
			KNOWN_ELEMENT_TYPES.add(ContinuousPort_3011);
			KNOWN_ELEMENT_TYPES.add(FadingComponent_2079);
			KNOWN_ELEMENT_TYPES.add(BroadcastPort_3078);
			// TODO add Coordination Protocol Occurence
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID:
			return ReconfigurableAtomicComponent_2078;
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
			return ReconfigurableStructuredComponent_2076;
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
			return ReconfigurationMessagePort_3076;
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID:
			return ReconfigurationExecutionPort_3077;
		case org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID:
			return RuleBasedReconfigurationController_7076;
		case org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:
			return Manager_2075;
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID:
			return ReconfigurationPortDelegationConnector_4076;
		case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return ComponentPart_3012;
		case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return DiscretePort_3010;
		case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return HybridPort_3013;
		case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return ContinuousPort_3011;
		case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
			return CoordinationProtocolPart_3016;
		case org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID:
			return FadingComponent_2079;
		case org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID:
			return BroadcastPort_3078;
			// TODO add Coordination Protocol Occurence

		}

		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
