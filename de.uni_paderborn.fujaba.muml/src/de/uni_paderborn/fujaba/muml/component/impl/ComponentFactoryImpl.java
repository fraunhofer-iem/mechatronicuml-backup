/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.impl;

import de.uni_paderborn.fujaba.muml.component.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.component.DelegationConnector;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.HybridPort;
import de.uni_paderborn.fujaba.muml.component.PortDirectionKind;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent;


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
			ComponentFactory theComponentFactory = (ComponentFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/component/0.3.20"); 
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
			case ComponentPackage.ATOMIC_COMPONENT: return createAtomicComponent();
			case ComponentPackage.ASSEMBLY_CONNECTOR: return createAssemblyConnector();
			case ComponentPackage.DELEGATION_CONNECTOR: return createDelegationConnector();
			case ComponentPackage.HYBRID_PORT: return createHybridPort();
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE: return createCoordinationProtocolOccurrence();
			case ComponentPackage.PORT_PART: return createPortPart();
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
	public AtomicComponent createAtomicComponent() {
		AtomicComponentImpl atomicComponent = new AtomicComponentImpl();
		return atomicComponent;
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
	public CoordinationProtocolOccurrence createCoordinationProtocolOccurrence() {
		CoordinationProtocolOccurrenceImpl coordinationProtocolOccurrence = new CoordinationProtocolOccurrenceImpl();
		return coordinationProtocolOccurrence;
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
