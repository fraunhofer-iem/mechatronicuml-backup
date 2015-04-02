/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class VariablesFactoryImpl extends EFactoryImpl implements VariablesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VariablesFactory init() {
		try {
			VariablesFactory theVariablesFactory = (VariablesFactory)EPackage.Registry.INSTANCE.getEFactory(VariablesPackage.eNS_URI);
			if (theVariablesFactory != null) {
				return theVariablesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VariablesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablesFactoryImpl() {
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
			case VariablesPackage.DIRECT_VARIABLE: return createDirectVariable();
			case VariablesPackage.NAMED_VARIABLE: return createNamedVariable();
			case VariablesPackage.STRUCTURED_VARIABLE: return createStructuredVariable();
			case VariablesPackage.ARRAY_VARIABLE: return createArrayVariable();
			case VariablesPackage.FIELD_SELECTOR: return createFieldSelector();
			case VariablesPackage.GLOBAL_VAR: return createGlobalVar();
			case VariablesPackage.FB_NAME: return createFBName();
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
			case VariablesPackage.LOCATION_PREFIX:
				return createLocationPrefixFromString(eDataType, initialValue);
			case VariablesPackage.SIZE_PREFIX:
				return createSizePrefixFromString(eDataType, initialValue);
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
			case VariablesPackage.LOCATION_PREFIX:
				return convertLocationPrefixToString(eDataType, instanceValue);
			case VariablesPackage.SIZE_PREFIX:
				return convertSizePrefixToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectVariable createDirectVariable() {
		DirectVariableImpl directVariable = new DirectVariableImpl();
		return directVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedVariable createNamedVariable() {
		NamedVariableImpl namedVariable = new NamedVariableImpl();
		return namedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredVariable createStructuredVariable() {
		StructuredVariableImpl structuredVariable = new StructuredVariableImpl();
		return structuredVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayVariable createArrayVariable() {
		ArrayVariableImpl arrayVariable = new ArrayVariableImpl();
		return arrayVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldSelector createFieldSelector() {
		FieldSelectorImpl fieldSelector = new FieldSelectorImpl();
		return fieldSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVar createGlobalVar() {
		GlobalVarImpl globalVar = new GlobalVarImpl();
		return globalVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBName createFBName() {
		FBNameImpl fbName = new FBNameImpl();
		return fbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPrefix createLocationPrefixFromString(EDataType eDataType, String initialValue) {
		LocationPrefix result = LocationPrefix.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationPrefixToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizePrefix createSizePrefixFromString(EDataType eDataType, String initialValue) {
		SizePrefix result = SizePrefix.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizePrefixToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablesPackage getVariablesPackage() {
		return (VariablesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VariablesPackage getPackage() {
		return VariablesPackage.eINSTANCE;
	}

} //VariablesFactoryImpl
