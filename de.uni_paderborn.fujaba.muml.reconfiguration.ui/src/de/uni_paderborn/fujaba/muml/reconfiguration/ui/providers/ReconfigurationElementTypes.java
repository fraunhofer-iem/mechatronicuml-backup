package de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers;

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

public class ReconfigurationElementTypes{

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
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;


	public static final IElementType ReconfigurableStructuredComponent_2076 = getElementType("de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent_2076"); //$NON-NLS-1$
	public static final IElementType ReconfigurationMessagePort_3076= getElementType("de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort_3076"); //$NON-NLS-1$
	public static final IElementType ReconfigurationExecutionPort_3077= getElementType("de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort_3077");
	public static final IElementType RuleBasedReconfigurationController_7076= getElementType("de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController_7076");
	public static final IElementType Manager_2075= getElementType("de.uni_paderborn.fujaba.muml.reconfiguration.Manager_2075");
	public static final IElementType Executor_2077= getElementType("de.uni_paderborn.fujaba.muml.reconfiguration.Executor_2077");
	public static final IElementType ReconfigurationPortDelegationConnector_4076=getElementType("de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortDelegationConnector_4076");
	public static final IElementType ReconfigurationPortAssemblyConnector_4075=getElementType("de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortAssemblyConnector_4075");
	
	
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
					ReconfigurableStructuredComponent_2076,
					de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getReconfigurableStructuredComponent());
			elements.put(
					ReconfigurationMessagePort_3076,
					de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getReconfigurationMessagePort());
			elements.put(
					ReconfigurationExecutionPort_3077,
					de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getReconfigurationExecutionPort());
			elements.put(
					RuleBasedReconfigurationController_7076,
					de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getRuleBasedReconfigurationController());
			elements.put(
					Manager_2075,
					de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
							.getManager());

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
			KNOWN_ELEMENT_TYPES.add(ReconfigurableStructuredComponent_2076);
			KNOWN_ELEMENT_TYPES.add(ReconfigurationMessagePort_3076);
			KNOWN_ELEMENT_TYPES.add(ReconfigurationExecutionPort_3077);
			KNOWN_ELEMENT_TYPES.add(RuleBasedReconfigurationController_7076);
			KNOWN_ELEMENT_TYPES.add(Manager_2075);
			KNOWN_ELEMENT_TYPES.add(ReconfigurationPortDelegationConnector_4076);
			KNOWN_ELEMENT_TYPES.add(ReconfigurationPortAssemblyConnector_4075);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {

		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
			return ReconfigurableStructuredComponent_2076;
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
			return ReconfigurationMessagePort_3076;
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID:
			return ReconfigurationExecutionPort_3077;
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID:
			return RuleBasedReconfigurationController_7076;
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:
			return Manager_2075;
		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID:
			return ReconfigurationPortDelegationConnector_4076;
			//TODO add assembly
		
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
			return de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
