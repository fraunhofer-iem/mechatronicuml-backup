/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifaceFactory
 * @model kind="package"
 * @generated
 */
public interface MsgifacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "msgiface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/model/msgiface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "msgiface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsgifacePackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MsgifacePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageInterfaceImpl <em>Message Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageInterfaceImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MsgifacePackageImpl#getMessageInterface()
	 * @generated
	 */
	int MESSAGE_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EANNOTATIONS = EcorePackage.ECLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__NAME = EcorePackage.ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__INSTANCE_CLASS_NAME = EcorePackage.ECLASS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__INSTANCE_CLASS = EcorePackage.ECLASS__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__DEFAULT_VALUE = EcorePackage.ECLASS__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__INSTANCE_TYPE_NAME = EcorePackage.ECLASS__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EPACKAGE = EcorePackage.ECLASS__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__ETYPE_PARAMETERS = EcorePackage.ECLASS__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__ABSTRACT = EcorePackage.ECLASS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__INTERFACE = EcorePackage.ECLASS__INTERFACE;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__ESUPER_TYPES = EcorePackage.ECLASS__ESUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EOPERATIONS = EcorePackage.ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EALL_ATTRIBUTES = EcorePackage.ECLASS__EALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EALL_REFERENCES = EcorePackage.ECLASS__EALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EREFERENCES = EcorePackage.ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EATTRIBUTES = EcorePackage.ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EALL_CONTAINMENTS = EcorePackage.ECLASS__EALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EALL_OPERATIONS = EcorePackage.ECLASS__EALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EALL_STRUCTURAL_FEATURES = EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EALL_SUPER_TYPES = EcorePackage.ECLASS__EALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EID_ATTRIBUTE = EcorePackage.ECLASS__EID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__ESTRUCTURAL_FEATURES = EcorePackage.ECLASS__ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EGENERIC_SUPER_TYPES = EcorePackage.ECLASS__EGENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__EALL_GENERIC_SUPER_TYPES = EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE__INHERITS = EcorePackage.ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE_FEATURE_COUNT = EcorePackage.ECLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_EANNOTATION__STRING = EcorePackage.ECLASS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___IS_INSTANCE__OBJECT = EcorePackage.ECLASS___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_CLASSIFIER_ID = EcorePackage.ECLASS___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___IS_SUPER_TYPE_OF__ECLASS = EcorePackage.ECLASS___IS_SUPER_TYPE_OF__ECLASS;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_FEATURE_COUNT = EcorePackage.ECLASS___GET_FEATURE_COUNT;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_ESTRUCTURAL_FEATURE__INT = EcorePackage.ECLASS___GET_ESTRUCTURAL_FEATURE__INT;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_FEATURE_ID__ESTRUCTURALFEATURE = EcorePackage.ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_ESTRUCTURAL_FEATURE__STRING = EcorePackage.ECLASS___GET_ESTRUCTURAL_FEATURE__STRING;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_OPERATION_COUNT = EcorePackage.ECLASS___GET_OPERATION_COUNT;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_EOPERATION__INT = EcorePackage.ECLASS___GET_EOPERATION__INT;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_OPERATION_ID__EOPERATION = EcorePackage.ECLASS___GET_OPERATION_ID__EOPERATION;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE___GET_OVERRIDE__EOPERATION = EcorePackage.ECLASS___GET_OVERRIDE__EOPERATION;

	/**
	 * The number of operations of the '<em>Message Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE_OPERATION_COUNT = EcorePackage.ECLASS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface <em>Message Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Interface</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface
	 * @generated
	 */
	EClass getMessageInterface();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getInherits <em>Inherits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getInherits()
	 * @see #getMessageInterface()
	 * @generated
	 */
	EReference getMessageInterface_Inherits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MsgifaceFactory getMsgifaceFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageInterfaceImpl <em>Message Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageInterfaceImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MsgifacePackageImpl#getMessageInterface()
		 * @generated
		 */
		EClass MESSAGE_INTERFACE = eINSTANCE.getMessageInterface();
		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_INTERFACE__INHERITS = eINSTANCE.getMessageInterface_Inherits();

	}

} //MsgifacePackage
