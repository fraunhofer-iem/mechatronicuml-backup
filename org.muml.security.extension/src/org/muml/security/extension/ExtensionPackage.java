/**
 */
package org.muml.security.extension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.muml.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.security.extension.ExtensionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/security/extension/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionPackage eINSTANCE = org.muml.security.extension.impl.ExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.security.extension.impl.SecurityExtensionImpl <em>Security Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.security.extension.impl.SecurityExtensionImpl
	 * @see org.muml.security.extension.impl.ExtensionPackageImpl#getSecurityExtension()
	 * @generated
	 */
	int SECURITY_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Sensitivity Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION__SENSITIVITY_FLAG = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___ECLASS = CorePackage.EXTENSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___EIS_PROXY = CorePackage.EXTENSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___ERESOURCE = CorePackage.EXTENSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___ECONTAINER = CorePackage.EXTENSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___ECONTAINING_FEATURE = CorePackage.EXTENSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___ECONTAINMENT_FEATURE = CorePackage.EXTENSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___ECONTENTS = CorePackage.EXTENSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___EALL_CONTENTS = CorePackage.EXTENSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___ECROSS_REFERENCES = CorePackage.EXTENSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Security Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_EXTENSION_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.security.extension.sensitivity <em>sensitivity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.security.extension.sensitivity
	 * @see org.muml.security.extension.impl.ExtensionPackageImpl#getsensitivity()
	 * @generated
	 */
	int SENSITIVITY = 1;


	/**
	 * Returns the meta object for class '{@link org.muml.security.extension.SecurityExtension <em>Security Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Extension</em>'.
	 * @see org.muml.security.extension.SecurityExtension
	 * @generated
	 */
	EClass getSecurityExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.security.extension.SecurityExtension#getSensitivityFlag <em>Sensitivity Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensitivity Flag</em>'.
	 * @see org.muml.security.extension.SecurityExtension#getSensitivityFlag()
	 * @see #getSecurityExtension()
	 * @generated
	 */
	EAttribute getSecurityExtension_SensitivityFlag();

	/**
	 * Returns the meta object for enum '{@link org.muml.security.extension.sensitivity <em>sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>sensitivity</em>'.
	 * @see org.muml.security.extension.sensitivity
	 * @generated
	 */
	EEnum getsensitivity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionFactory getExtensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.security.extension.impl.SecurityExtensionImpl <em>Security Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.security.extension.impl.SecurityExtensionImpl
		 * @see org.muml.security.extension.impl.ExtensionPackageImpl#getSecurityExtension()
		 * @generated
		 */
		EClass SECURITY_EXTENSION = eINSTANCE.getSecurityExtension();

		/**
		 * The meta object literal for the '<em><b>Sensitivity Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_EXTENSION__SENSITIVITY_FLAG = eINSTANCE.getSecurityExtension_SensitivityFlag();

		/**
		 * The meta object literal for the '{@link org.muml.security.extension.sensitivity <em>sensitivity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.security.extension.sensitivity
		 * @see org.muml.security.extension.impl.ExtensionPackageImpl#getsensitivity()
		 * @generated
		 */
		EEnum SENSITIVITY = eINSTANCE.getsensitivity();

	}

} //ExtensionPackage
