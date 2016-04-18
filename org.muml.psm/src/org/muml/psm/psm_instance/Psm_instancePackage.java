/**
 */
package org.muml.psm.psm_instance;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.pim.instance.InstancePackage;

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
 * <!-- begin-model-doc -->
 * The package extends the instance-package of muml. Here all parameters of a statechart will be bound within an instance of a discrete port.
 * <!-- end-model-doc -->
 * @see org.muml.psm.psm_instance.Psm_instanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface Psm_instancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "psm_instance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/instance/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "psm_instance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Psm_instancePackage eINSTANCE = org.muml.psm.psm_instance.impl.Psm_instancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.psm_instance.impl.ParameterisableDiscreteSinglePortInstanceImpl <em>Parameterisable Discrete Single Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.psm_instance.impl.ParameterisableDiscreteSinglePortInstanceImpl
	 * @see org.muml.psm.psm_instance.impl.Psm_instancePackageImpl#getParameterisableDiscreteSinglePortInstance()
	 * @generated
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__EXTENSIONS = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__NAME = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__COMMENT = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__CONNECTOR_INSTANCES = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__TYPE = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__PORT_TYPE = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__COMPONENT_INSTANCE = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__PORT_PART = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__PORT_PART;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__REFINED_ROLE = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__NEXT = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__PREVIOUS = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__FIRST = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__FIRST;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__LAST = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__LAST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameterisable Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___GET_EXTENSION__ECLASS = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Parameterisable Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE_OPERATION_COUNT = InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance <em>Parameterisable Discrete Single Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterisable Discrete Single Port Instance</em>'.
	 * @see org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance
	 * @generated
	 */
	EClass getParameterisableDiscreteSinglePortInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance#getBindings()
	 * @see #getParameterisableDiscreteSinglePortInstance()
	 * @generated
	 */
	EReference getParameterisableDiscreteSinglePortInstance_Bindings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Psm_instanceFactory getPsm_instanceFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.psm_instance.impl.ParameterisableDiscreteSinglePortInstanceImpl <em>Parameterisable Discrete Single Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.psm_instance.impl.ParameterisableDiscreteSinglePortInstanceImpl
		 * @see org.muml.psm.psm_instance.impl.Psm_instancePackageImpl#getParameterisableDiscreteSinglePortInstance()
		 * @generated
		 */
		EClass PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE = eINSTANCE.getParameterisableDiscreteSinglePortInstance();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS = eINSTANCE.getParameterisableDiscreteSinglePortInstance_Bindings();

	}

} //Psm_instancePackage
