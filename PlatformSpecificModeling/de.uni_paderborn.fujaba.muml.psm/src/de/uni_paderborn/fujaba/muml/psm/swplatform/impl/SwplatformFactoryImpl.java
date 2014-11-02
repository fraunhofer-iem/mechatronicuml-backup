/**
 */
package de.uni_paderborn.fujaba.muml.psm.swplatform.impl;

import de.uni_paderborn.fujaba.muml.psm.swplatform.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwplatformFactoryImpl extends EFactoryImpl implements SwplatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SwplatformFactory init() {
		try {
			SwplatformFactory theSwplatformFactory = (SwplatformFactory)EPackage.Registry.INSTANCE.getEFactory(SwplatformPackage.eNS_URI);
			if (theSwplatformFactory != null) {
				return theSwplatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SwplatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwplatformFactoryImpl() {
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
			case SwplatformPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case SwplatformPackage.API_REPOSITORY: return createAPIRepository();
			case SwplatformPackage.API_COMMAND: return createAPICommand();
			case SwplatformPackage.ENUMERATION_VALUE: return createEnumerationValue();
			case SwplatformPackage.ENUMERATION_DATA_TYPE: return createEnumerationDataType();
			case SwplatformPackage.TIME_CONSTRAINT: return createTimeConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIRepository createAPIRepository() {
		APIRepositoryImpl apiRepository = new APIRepositoryImpl();
		return apiRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICommand createAPICommand() {
		APICommandImpl apiCommand = new APICommandImpl();
		return apiCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValue createEnumerationValue() {
		EnumerationValueImpl enumerationValue = new EnumerationValueImpl();
		return enumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationDataType createEnumerationDataType() {
		EnumerationDataTypeImpl enumerationDataType = new EnumerationDataTypeImpl();
		return enumerationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraint createTimeConstraint() {
		TimeConstraintImpl timeConstraint = new TimeConstraintImpl();
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwplatformPackage getSwplatformPackage() {
		return (SwplatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SwplatformPackage getPackage() {
		return SwplatformPackage.eINSTANCE;
	}

} //SwplatformFactoryImpl
