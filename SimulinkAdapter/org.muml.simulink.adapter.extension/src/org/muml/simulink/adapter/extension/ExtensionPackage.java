/**
 */
package org.muml.simulink.adapter.extension;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.muml.mumlcore.CorePackage;

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
 * @see org.muml.simulink.adapter.extension.ExtensionFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.muml.org/simulink/adapter/extension/1.0.0";

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
	ExtensionPackage eINSTANCE = org.muml.simulink.adapter.extension.impl.ExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.extension.impl.SimulinkAnnotationExtensionImpl <em>Simulink Annotation Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.extension.impl.SimulinkAnnotationExtensionImpl
	 * @see org.muml.simulink.adapter.extension.impl.ExtensionPackageImpl#getSimulinkAnnotationExtension()
	 * @generated
	 */
	int SIMULINK_ANNOTATION_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION__EANNOTATIONS = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION__SOURCE = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION__DETAILS = CorePackage.EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION__EMODEL_ELEMENT = CorePackage.EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION__CONTENTS = CorePackage.EXTENSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION__REFERENCES = CorePackage.EXTENSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Simulink Annotation Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION___GET_EANNOTATION__STRING_1 = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simulink Annotation Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ANNOTATION_EXTENSION_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.extension.SimulinkAnnotationExtension <em>Simulink Annotation Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulink Annotation Extension</em>'.
	 * @see org.muml.simulink.adapter.extension.SimulinkAnnotationExtension
	 * @generated
	 */
	EClass getSimulinkAnnotationExtension();

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
		 * The meta object literal for the '{@link org.muml.simulink.adapter.extension.impl.SimulinkAnnotationExtensionImpl <em>Simulink Annotation Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.extension.impl.SimulinkAnnotationExtensionImpl
		 * @see org.muml.simulink.adapter.extension.impl.ExtensionPackageImpl#getSimulinkAnnotationExtension()
		 * @generated
		 */
		EClass SIMULINK_ANNOTATION_EXTENSION = eINSTANCE.getSimulinkAnnotationExtension();

	}

} //ExtensionPackage
