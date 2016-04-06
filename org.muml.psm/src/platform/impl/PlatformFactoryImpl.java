/**
 */
package platform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import platform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory(PlatformPackage.eNS_URI);
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
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
			case PlatformPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case PlatformPackage.API_REPOSITORY: return createAPIRepository();
			case PlatformPackage.API_COMMAND: return createAPICommand();
			case PlatformPackage.ENUMERATION_VALUE: return createEnumerationValue();
			case PlatformPackage.ENUMERATION_DATA_TYPE: return createEnumerationDataType();
			case PlatformPackage.TIME_CONSTRAINT: return createTimeConstraint();
			case PlatformPackage.IMPORT: return createImport();
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
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
