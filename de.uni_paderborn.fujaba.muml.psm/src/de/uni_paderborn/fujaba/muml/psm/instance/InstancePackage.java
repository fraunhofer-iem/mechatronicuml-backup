/**
 */
package de.uni_paderborn.fujaba.muml.psm.instance;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.uni_paderborn.fujaba.muml.psm.instance.InstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface InstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/psm/instance/0.4.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancePackage eINSTANCE = de.uni_paderborn.fujaba.muml.psm.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.instance.impl.ParameterisableDiscreteSinglePortInstanceImpl <em>Parameterisable Discrete Single Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.instance.impl.ParameterisableDiscreteSinglePortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.instance.impl.InstancePackageImpl#getParameterisableDiscreteSinglePortInstance()
	 * @generated
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__ANNOTATION = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__EXTENSION = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__NAME = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__COMMENT = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__CONNECTOR_INSTANCES = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__TYPE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__PORT_TYPE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__COMPONENT_INSTANCE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__PORT_PART = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__PORT_PART;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__REFINED_ROLE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__NEXT = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__PREVIOUS = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__FIRST = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__FIRST;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__LAST = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__LAST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameterisable Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___ECLASS = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___EIS_PROXY = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___ERESOURCE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINER = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINING_FEATURE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINMENT_FEATURE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___ECONTENTS = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___EALL_CONTENTS = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___ECROSS_REFERENCES = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___GET_EXTENSION__ECLASS = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___GET_ANNOTATION__STRING = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Parameterisable Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE_OPERATION_COUNT = de.uni_paderborn.fujaba.muml.instance.InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.instance.ParameterisableDiscreteSinglePortInstance <em>Parameterisable Discrete Single Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterisable Discrete Single Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.instance.ParameterisableDiscreteSinglePortInstance
	 * @generated
	 */
	EClass getParameterisableDiscreteSinglePortInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.psm.instance.ParameterisableDiscreteSinglePortInstance#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.instance.ParameterisableDiscreteSinglePortInstance#getBindings()
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
	InstanceFactory getInstanceFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.instance.impl.ParameterisableDiscreteSinglePortInstanceImpl <em>Parameterisable Discrete Single Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.instance.impl.ParameterisableDiscreteSinglePortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.instance.impl.InstancePackageImpl#getParameterisableDiscreteSinglePortInstance()
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

} //InstancePackage
