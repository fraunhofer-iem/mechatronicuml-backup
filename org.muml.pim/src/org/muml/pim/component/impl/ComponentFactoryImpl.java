/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.ComponentFactory;
import org.muml.pim.component.ComponentKind;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.ContinuousPort;
import org.muml.pim.component.CoordinationProtocolPart;
import org.muml.pim.component.DelegationConnector;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.HybridPort;
import org.muml.pim.component.PortDirectionKind;
import org.muml.pim.component.PortPart;
import org.muml.pim.component.StaticAtomicComponent;
import org.muml.pim.component.StaticStructuredComponent;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentFactoryImpl extends EFactoryImpl implements ComponentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentFactory init() {
		try {
			ComponentFactory theComponentFactory = (ComponentFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentPackage.eNS_URI);
			if (theComponentFactory != null) {
				return theComponentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentPackage.CONTINUOUS_PORT: return createContinuousPort();
			case ComponentPackage.DISCRETE_PORT: return createDiscretePort();
			case ComponentPackage.COMPONENT_PART: return createComponentPart();
			case ComponentPackage.STATIC_STRUCTURED_COMPONENT: return createStaticStructuredComponent();
			case ComponentPackage.ASSEMBLY_CONNECTOR: return createAssemblyConnector();
			case ComponentPackage.DELEGATION_CONNECTOR: return createDelegationConnector();
			case ComponentPackage.HYBRID_PORT: return createHybridPort();
			case ComponentPackage.COORDINATION_PROTOCOL_PART: return createCoordinationProtocolPart();
			case ComponentPackage.PORT_PART: return createPortPart();
			case ComponentPackage.STATIC_ATOMIC_COMPONENT: return createStaticAtomicComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ComponentPackage.COMPONENT_KIND:
				return createComponentKindFromString(eDataType, initialValue);
			case ComponentPackage.PORT_DIRECTION_KIND:
				return createPortDirectionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ComponentPackage.COMPONENT_KIND:
				return convertComponentKindToString(eDataType, instanceValue);
			case ComponentPackage.PORT_DIRECTION_KIND:
				return convertPortDirectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPort createContinuousPort() {
		ContinuousPortImpl continuousPort = new ContinuousPortImpl();
		return continuousPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretePort createDiscretePort() {
		DiscretePortImpl discretePort = new DiscretePortImpl();
		return discretePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart createComponentPart() {
		ComponentPartImpl componentPart = new ComponentPartImpl();
		return componentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticStructuredComponent createStaticStructuredComponent() {
		StaticStructuredComponentImpl staticStructuredComponent = new StaticStructuredComponentImpl();
		return staticStructuredComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector createAssemblyConnector() {
		AssemblyConnectorImpl assemblyConnector = new AssemblyConnectorImpl();
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnector createDelegationConnector() {
		DelegationConnectorImpl delegationConnector = new DelegationConnectorImpl();
		return delegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridPort createHybridPort() {
		HybridPortImpl hybridPort = new HybridPortImpl();
		return hybridPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolPart createCoordinationProtocolPart() {
		CoordinationProtocolPartImpl coordinationProtocolPart = new CoordinationProtocolPartImpl();
		return coordinationProtocolPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPart createPortPart() {
		PortPartImpl portPart = new PortPartImpl();
		return portPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticAtomicComponent createStaticAtomicComponent() {
		StaticAtomicComponentImpl staticAtomicComponent = new StaticAtomicComponentImpl();
		return staticAtomicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKind createComponentKindFromString(EDataType eDataType, String initialValue) {
		ComponentKind result = ComponentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirectionKind createPortDirectionKindFromString(EDataType eDataType, String initialValue) {
		PortDirectionKind result = PortDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPackage getComponentPackage() {
		return (ComponentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentPackage getPackage() {
		return ComponentPackage.eINSTANCE;
	}

} //ComponentFactoryImpl
