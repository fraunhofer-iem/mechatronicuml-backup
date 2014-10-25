/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl;

import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.DiscoveryPortSpecification;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolInstantiationPortSpecification;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolinstantiationFactoryImpl extends EFactoryImpl implements ProtocolinstantiationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtocolinstantiationFactory init() {
		try {
			ProtocolinstantiationFactory theProtocolinstantiationFactory = (ProtocolinstantiationFactory)EPackage.Registry.INSTANCE.getEFactory(ProtocolinstantiationPackage.eNS_URI);
			if (theProtocolinstantiationFactory != null) {
				return theProtocolinstantiationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProtocolinstantiationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolinstantiationFactoryImpl() {
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
			case ProtocolinstantiationPackage.BROADCAST_PORT: return createBroadcastPort();
			case ProtocolinstantiationPackage.PROTOCOL_INSTANTIATION_PORT_SPECIFICATION: return createProtocolInstantiationPortSpecification();
			case ProtocolinstantiationPackage.DISCOVERY_PORT_SPECIFICATION: return createDiscoveryPortSpecification();
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
			case ProtocolinstantiationPackage.BROADCAST_PORT_KIND:
				return createBroadcastPortKindFromString(eDataType, initialValue);
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
			case ProtocolinstantiationPackage.BROADCAST_PORT_KIND:
				return convertBroadcastPortKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastPort createBroadcastPort() {
		BroadcastPortImpl broadcastPort = new BroadcastPortImpl();
		return broadcastPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolInstantiationPortSpecification createProtocolInstantiationPortSpecification() {
		ProtocolInstantiationPortSpecificationImpl protocolInstantiationPortSpecification = new ProtocolInstantiationPortSpecificationImpl();
		return protocolInstantiationPortSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryPortSpecification createDiscoveryPortSpecification() {
		DiscoveryPortSpecificationImpl discoveryPortSpecification = new DiscoveryPortSpecificationImpl();
		return discoveryPortSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastPortKind createBroadcastPortKindFromString(EDataType eDataType, String initialValue) {
		BroadcastPortKind result = BroadcastPortKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBroadcastPortKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolinstantiationPackage getProtocolinstantiationPackage() {
		return (ProtocolinstantiationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProtocolinstantiationPackage getPackage() {
		return ProtocolinstantiationPackage.eINSTANCE;
	}

} //ProtocolinstantiationFactoryImpl
