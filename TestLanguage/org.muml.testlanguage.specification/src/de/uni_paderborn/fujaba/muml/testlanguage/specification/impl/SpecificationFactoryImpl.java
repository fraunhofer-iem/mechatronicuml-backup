/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification.impl;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SpecificationFactoryImpl extends EFactoryImpl implements
		SpecificationFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static SpecificationFactory init() {
		try {
			SpecificationFactory theSpecificationFactory = (SpecificationFactory) EPackage.Registry.INSTANCE
					.getEFactory(SpecificationPackage.eNS_URI);
			if (theSpecificationFactory != null) {
				return theSpecificationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SpecificationPackage.PORT_SPECIFICATION:
			return createPortSpecification();
		case SpecificationPackage.DEFAULT:
			return createDefault();
		case SpecificationPackage.LOAD_MODEL:
			return createLoadModel();
		case SpecificationPackage.COMPARE_MODELS:
			return createCompareModels();
		case SpecificationPackage.VALIDATE_MODEL:
			return createValidateModel();
		case SpecificationPackage.SAVE_MODEL:
			return createSaveModel();
		case SpecificationPackage.TRANSFORMATION:
			return createTransformation();
		case SpecificationPackage.EXECUTE_UPPAAL:
			return createExecuteUPPAAL();
		case SpecificationPackage.PRIMITIVE_STRING:
			return createPrimitiveString();
		case SpecificationPackage.ASSERT_BOOL:
			return createAssertBool();
		case SpecificationPackage.ASSERT_DIAGNOSTIC_TRACE:
			return createAssertDiagnosticTrace();
		case SpecificationPackage.ASSERT_RESULT:
			return createAssertResult();
		case SpecificationPackage.CHECK_MTCTL:
			return createCheckMTCTL();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SpecificationPackage.PORT_TYPE:
			return createPortTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SpecificationPackage.PORT_TYPE:
			return convertPortTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PortSpecification createPortSpecification() {
		PortSpecificationImpl portSpecification = new PortSpecificationImpl();
		return portSpecification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Default createDefault() {
		DefaultImpl default_ = new DefaultImpl();
		return default_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LoadModel createLoadModel() {
		LoadModelImpl loadModel = new LoadModelImpl();
		return loadModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompareModels createCompareModels() {
		CompareModelsImpl compareModels = new CompareModelsImpl();
		return compareModels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidateModel createValidateModel() {
		ValidateModelImpl validateModel = new ValidateModelImpl();
		return validateModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SaveModel createSaveModel() {
		SaveModelImpl saveModel = new SaveModelImpl();
		return saveModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExecuteUPPAAL createExecuteUPPAAL() {
		ExecuteUPPAALImpl executeUPPAAL = new ExecuteUPPAALImpl();
		return executeUPPAAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PrimitiveString createPrimitiveString() {
		PrimitiveStringImpl primitiveString = new PrimitiveStringImpl();
		return primitiveString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssertBool createAssertBool() {
		AssertBoolImpl assertBool = new AssertBoolImpl();
		return assertBool;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssertDiagnosticTrace createAssertDiagnosticTrace() {
		AssertDiagnosticTraceImpl assertDiagnosticTrace = new AssertDiagnosticTraceImpl();
		return assertDiagnosticTrace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssertResult createAssertResult() {
		AssertResultImpl assertResult = new AssertResultImpl();
		return assertResult;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CheckMTCTL createCheckMTCTL() {
		CheckMTCTLImpl checkMTCTL = new CheckMTCTLImpl();
		return checkMTCTL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType,
			String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecificationPackage getSpecificationPackage() {
		return (SpecificationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpecificationPackage getPackage() {
		return SpecificationPackage.eINSTANCE;
	}

} // SpecificationFactoryImpl
