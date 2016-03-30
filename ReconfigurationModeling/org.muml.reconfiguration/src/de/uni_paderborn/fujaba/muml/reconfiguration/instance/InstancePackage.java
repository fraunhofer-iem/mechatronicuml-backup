/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.instance;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * <!-- begin-model-doc -->
 * This package defines instances for reconfigurable components, the corresponding reconfiguration ports, and the reconfiguration controllers.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstanceFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/reconfiguration/instance/0.4.0";

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
	InstancePackage eINSTANCE = de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableComponentInstanceImpl <em>Reconfigurable Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurableComponentInstance()
	 * @generated
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE__ANNOTATION = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE__EXTENSION = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE__NAME = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE__COMPONENT_TYPE = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE__PORT_INSTANCES = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE__COMPONENT_PART = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE__PARENT_CIC = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE__TOP_LEVEL = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE__TOP_LEVEL;

	/**
	 * The number of structural features of the '<em>Reconfigurable Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE_FEATURE_COUNT = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___ECLASS = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___EIS_PROXY = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___ERESOURCE = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___ECONTAINER = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___ECONTAINING_FEATURE = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___ECONTENTS = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___EALL_CONTENTS = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___ECROSS_REFERENCES = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___GET_ANNOTATION__STRING = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Reconfigurable Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_INSTANCE_OPERATION_COUNT = org.muml.pim.instance.InstancePackage.COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationPortInstanceImpl <em>Reconfiguration Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurationPortInstance()
	 * @generated
	 */
	int RECONFIGURATION_PORT_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__ANNOTATION = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__EXTENSION = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__NAME = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__COMMENT = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__CONNECTOR_INSTANCES = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__TYPE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__PORT_TYPE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__COMPONENT_INSTANCE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE__PORT_PART = org.muml.pim.instance.InstancePackage.PORT_INSTANCE__PORT_PART;

	/**
	 * The number of structural features of the '<em>Reconfiguration Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE_FEATURE_COUNT = org.muml.pim.instance.InstancePackage.PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___ECLASS = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___EIS_PROXY = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___ERESOURCE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___ECONTAINER = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___ECONTAINING_FEATURE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___ECONTAINMENT_FEATURE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___ECONTENTS = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___EALL_CONTENTS = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___ECROSS_REFERENCES = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___GET_EXTENSION__ECLASS = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___GET_ANNOTATION__STRING = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = org.muml.pim.instance.InstancePackage.PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Reconfiguration Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INSTANCE_OPERATION_COUNT = org.muml.pim.instance.InstancePackage.PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationMessagePortInstanceImpl <em>Reconfiguration Message Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationMessagePortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurationMessagePortInstance()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__ANNOTATION = RECONFIGURATION_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__EXTENSION = RECONFIGURATION_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__NAME = RECONFIGURATION_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__COMMENT = RECONFIGURATION_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__CONNECTOR_INSTANCES = RECONFIGURATION_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__TYPE = RECONFIGURATION_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__PORT_TYPE = RECONFIGURATION_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__COMPONENT_INSTANCE = RECONFIGURATION_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = RECONFIGURATION_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE__PORT_PART = RECONFIGURATION_PORT_INSTANCE__PORT_PART;

	/**
	 * The number of structural features of the '<em>Reconfiguration Message Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE_FEATURE_COUNT = RECONFIGURATION_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___ECLASS = RECONFIGURATION_PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___EIS_PROXY = RECONFIGURATION_PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___ERESOURCE = RECONFIGURATION_PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___ECONTAINER = RECONFIGURATION_PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___ECONTAINING_FEATURE = RECONFIGURATION_PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___ECONTAINMENT_FEATURE = RECONFIGURATION_PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___ECONTENTS = RECONFIGURATION_PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___EALL_CONTENTS = RECONFIGURATION_PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___ECROSS_REFERENCES = RECONFIGURATION_PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RECONFIGURATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = RECONFIGURATION_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = RECONFIGURATION_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___GET_EXTENSION__ECLASS = RECONFIGURATION_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = RECONFIGURATION_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___GET_ANNOTATION__STRING = RECONFIGURATION_PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = RECONFIGURATION_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Reconfiguration Message Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INSTANCE_OPERATION_COUNT = RECONFIGURATION_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationExecutionPortInstanceImpl <em>Reconfiguration Execution Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationExecutionPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurationExecutionPortInstance()
	 * @generated
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__ANNOTATION = RECONFIGURATION_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__EXTENSION = RECONFIGURATION_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__NAME = RECONFIGURATION_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__COMMENT = RECONFIGURATION_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__CONNECTOR_INSTANCES = RECONFIGURATION_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__TYPE = RECONFIGURATION_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__PORT_TYPE = RECONFIGURATION_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__COMPONENT_INSTANCE = RECONFIGURATION_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = RECONFIGURATION_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE__PORT_PART = RECONFIGURATION_PORT_INSTANCE__PORT_PART;

	/**
	 * The number of structural features of the '<em>Reconfiguration Execution Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE_FEATURE_COUNT = RECONFIGURATION_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___ECLASS = RECONFIGURATION_PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___EIS_PROXY = RECONFIGURATION_PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___ERESOURCE = RECONFIGURATION_PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___ECONTAINER = RECONFIGURATION_PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___ECONTAINING_FEATURE = RECONFIGURATION_PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___ECONTAINMENT_FEATURE = RECONFIGURATION_PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___ECONTENTS = RECONFIGURATION_PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___EALL_CONTENTS = RECONFIGURATION_PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___ECROSS_REFERENCES = RECONFIGURATION_PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RECONFIGURATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = RECONFIGURATION_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = RECONFIGURATION_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___GET_EXTENSION__ECLASS = RECONFIGURATION_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = RECONFIGURATION_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___GET_ANNOTATION__STRING = RECONFIGURATION_PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = RECONFIGURATION_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Reconfiguration Execution Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INSTANCE_OPERATION_COUNT = RECONFIGURATION_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InternalReconfigurationCommunicationPortInstanceImpl <em>Internal Reconfiguration Communication Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InternalReconfigurationCommunicationPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getInternalReconfigurationCommunicationPortInstance()
	 * @generated
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__ANNOTATION = RECONFIGURATION_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__EXTENSION = RECONFIGURATION_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__NAME = RECONFIGURATION_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__COMMENT = RECONFIGURATION_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__CONNECTOR_INSTANCES = RECONFIGURATION_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__TYPE = RECONFIGURATION_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__PORT_TYPE = RECONFIGURATION_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__COMPONENT_INSTANCE = RECONFIGURATION_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = RECONFIGURATION_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE__PORT_PART = RECONFIGURATION_PORT_INSTANCE__PORT_PART;

	/**
	 * The number of structural features of the '<em>Internal Reconfiguration Communication Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE_FEATURE_COUNT = RECONFIGURATION_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___ECLASS = RECONFIGURATION_PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___EIS_PROXY = RECONFIGURATION_PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___ERESOURCE = RECONFIGURATION_PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___ECONTAINER = RECONFIGURATION_PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___ECONTAINING_FEATURE = RECONFIGURATION_PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___ECONTAINMENT_FEATURE = RECONFIGURATION_PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___ECONTENTS = RECONFIGURATION_PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___EALL_CONTENTS = RECONFIGURATION_PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___ECROSS_REFERENCES = RECONFIGURATION_PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RECONFIGURATION_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = RECONFIGURATION_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = RECONFIGURATION_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = RECONFIGURATION_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___GET_EXTENSION__ECLASS = RECONFIGURATION_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = RECONFIGURATION_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___GET_ANNOTATION__STRING = RECONFIGURATION_PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = RECONFIGURATION_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Internal Reconfiguration Communication Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE_OPERATION_COUNT = RECONFIGURATION_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ControllerInstanceImpl <em>Controller Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ControllerInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getControllerInstance()
	 * @generated
	 */
	int CONTROLLER_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Controller Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___PROVIDE_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___GET_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE___PROVIDE_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Controller Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INSTANCE_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationControllerInstanceImpl <em>Reconfiguration Controller Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationControllerInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurationControllerInstance()
	 * @generated
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE__ANNOTATION = CONTROLLER_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE__EXTENSION = CONTROLLER_INSTANCE__EXTENSION;

	/**
	 * The number of structural features of the '<em>Reconfiguration Controller Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE_FEATURE_COUNT = CONTROLLER_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___ECLASS = CONTROLLER_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___EIS_PROXY = CONTROLLER_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___ERESOURCE = CONTROLLER_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINER = CONTROLLER_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINING_FEATURE = CONTROLLER_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINMENT_FEATURE = CONTROLLER_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___ECONTENTS = CONTROLLER_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___EALL_CONTENTS = CONTROLLER_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___ECROSS_REFERENCES = CONTROLLER_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE = CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CONTROLLER_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CONTROLLER_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CONTROLLER_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___EINVOKE__EOPERATION_ELIST = CONTROLLER_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___GET_EXTENSION__ECLASS = CONTROLLER_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___PROVIDE_EXTENSION__ECLASS = CONTROLLER_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___GET_ANNOTATION__STRING = CONTROLLER_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE___PROVIDE_ANNOTATION__STRING = CONTROLLER_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Reconfiguration Controller Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_INSTANCE_OPERATION_COUNT = CONTROLLER_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.RuleBasedReconfigurationControllerInstanceImpl <em>Rule Based Reconfiguration Controller Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.RuleBasedReconfigurationControllerInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getRuleBasedReconfigurationControllerInstance()
	 * @generated
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__ANNOTATION = RECONFIGURATION_CONTROLLER_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXTENSION = RECONFIGURATION_CONTROLLER_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Manager Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE = RECONFIGURATION_CONTROLLER_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executor Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE = RECONFIGURATION_CONTROLLER_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Based Reconfiguration Controller Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE_FEATURE_COUNT = RECONFIGURATION_CONTROLLER_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___ECLASS = RECONFIGURATION_CONTROLLER_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___EIS_PROXY = RECONFIGURATION_CONTROLLER_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___ERESOURCE = RECONFIGURATION_CONTROLLER_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINER = RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINING_FEATURE = RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINMENT_FEATURE = RECONFIGURATION_CONTROLLER_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___ECONTENTS = RECONFIGURATION_CONTROLLER_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___EALL_CONTENTS = RECONFIGURATION_CONTROLLER_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___ECROSS_REFERENCES = RECONFIGURATION_CONTROLLER_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE = RECONFIGURATION_CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RECONFIGURATION_CONTROLLER_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = RECONFIGURATION_CONTROLLER_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = RECONFIGURATION_CONTROLLER_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___EUNSET__ESTRUCTURALFEATURE = RECONFIGURATION_CONTROLLER_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___EINVOKE__EOPERATION_ELIST = RECONFIGURATION_CONTROLLER_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___GET_EXTENSION__ECLASS = RECONFIGURATION_CONTROLLER_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___PROVIDE_EXTENSION__ECLASS = RECONFIGURATION_CONTROLLER_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___GET_ANNOTATION__STRING = RECONFIGURATION_CONTROLLER_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE___PROVIDE_ANNOTATION__STRING = RECONFIGURATION_CONTROLLER_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Rule Based Reconfiguration Controller Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE_OPERATION_COUNT = RECONFIGURATION_CONTROLLER_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ManagerInstanceImpl <em>Manager Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ManagerInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getManagerInstance()
	 * @generated
	 */
	int MANAGER_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE__MANAGER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reconfiguration Controller Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE__PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Manager Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Manager Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ExecutorInstanceImpl <em>Executor Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ExecutorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getExecutorInstance()
	 * @generated
	 */
	int EXECUTOR_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE__EXECUTOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reconfiguration Controller Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE__PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Executor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Executor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableAtomicComponentInstanceImpl <em>Reconfigurable Atomic Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableAtomicComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurableAtomicComponentInstance()
	 * @generated
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE__ANNOTATION = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE__EXTENSION = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE__NAME = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE__COMPONENT_TYPE = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE__PORT_INSTANCES = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE__COMPONENT_PART = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE__PARENT_CIC = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE__TOP_LEVEL = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE__TOP_LEVEL;

	/**
	 * The number of structural features of the '<em>Reconfigurable Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___ECLASS = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___EIS_PROXY = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___ERESOURCE = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___ECONTAINER = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___ECONTAINING_FEATURE = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___ECONTENTS = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___EALL_CONTENTS = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___ECROSS_REFERENCES = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___GET_ANNOTATION__STRING = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Reconfigurable Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE_OPERATION_COUNT = org.muml.pim.instance.InstancePackage.ATOMIC_COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableStructuredComponentInstanceImpl <em>Reconfigurable Structured Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableStructuredComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurableStructuredComponentInstance()
	 * @generated
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__ANNOTATION = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__EXTENSION = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__NAME = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__COMPONENT_TYPE = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__PORT_INSTANCES = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__COMPONENT_PART = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__PARENT_CIC = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__TOP_LEVEL = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Embedded CIC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC;

	/**
	 * The feature id for the '<em><b>Controller Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reconfigurable Structured Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE_FEATURE_COUNT = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___ECLASS = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___EIS_PROXY = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___ERESOURCE = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___ECONTAINER = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___ECONTAINING_FEATURE = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___ECONTENTS = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___EALL_CONTENTS = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___ECROSS_REFERENCES = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___GET_ANNOTATION__STRING = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Reconfigurable Structured Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE_OPERATION_COUNT = org.muml.pim.instance.InstancePackage.STRUCTURED_COMPONENT_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableComponentInstance <em>Reconfigurable Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableComponentInstance
	 * @generated
	 */
	EClass getReconfigurableComponentInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationPortInstance <em>Reconfiguration Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationPortInstance
	 * @generated
	 */
	EClass getReconfigurationPortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationMessagePortInstance <em>Reconfiguration Message Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Message Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationMessagePortInstance
	 * @generated
	 */
	EClass getReconfigurationMessagePortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance <em>Reconfiguration Execution Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Execution Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance
	 * @generated
	 */
	EClass getReconfigurationExecutionPortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance <em>Internal Reconfiguration Communication Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Reconfiguration Communication Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance
	 * @generated
	 */
	EClass getInternalReconfigurationCommunicationPortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Controller Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationControllerInstance
	 * @generated
	 */
	EClass getReconfigurationControllerInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ControllerInstance <em>Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ControllerInstance
	 * @generated
	 */
	EClass getControllerInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance <em>Rule Based Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Based Reconfiguration Controller Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance
	 * @generated
	 */
	EClass getRuleBasedReconfigurationControllerInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance#getManagerInstance <em>Manager Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manager Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance#getManagerInstance()
	 * @see #getRuleBasedReconfigurationControllerInstance()
	 * @generated
	 */
	EReference getRuleBasedReconfigurationControllerInstance_ManagerInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance#getExecutorInstance <em>Executor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance#getExecutorInstance()
	 * @see #getRuleBasedReconfigurationControllerInstance()
	 * @generated
	 */
	EReference getRuleBasedReconfigurationControllerInstance_ExecutorInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance <em>Manager Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance
	 * @generated
	 */
	EClass getManagerInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getManager()
	 * @see #getManagerInstance()
	 * @generated
	 */
	EReference getManagerInstance_Manager();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Controller Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getReconfigurationControllerInstance()
	 * @see #getManagerInstance()
	 * @generated
	 */
	EReference getManagerInstance_ReconfigurationControllerInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getPortInstances()
	 * @see #getManagerInstance()
	 * @generated
	 */
	EReference getManagerInstance_PortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance <em>Executor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance
	 * @generated
	 */
	EClass getExecutorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getExecutor()
	 * @see #getExecutorInstance()
	 * @generated
	 */
	EReference getExecutorInstance_Executor();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Controller Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getReconfigurationControllerInstance()
	 * @see #getExecutorInstance()
	 * @generated
	 */
	EReference getExecutorInstance_ReconfigurationControllerInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getPortInstances()
	 * @see #getExecutorInstance()
	 * @generated
	 */
	EReference getExecutorInstance_PortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance <em>Reconfigurable Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Atomic Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance
	 * @generated
	 */
	EClass getReconfigurableAtomicComponentInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance <em>Reconfigurable Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Structured Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance
	 * @generated
	 */
	EClass getReconfigurableStructuredComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance#getControllerInstance <em>Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance#getControllerInstance()
	 * @see #getReconfigurableStructuredComponentInstance()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponentInstance_ControllerInstance();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableComponentInstanceImpl <em>Reconfigurable Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurableComponentInstance()
		 * @generated
		 */
		EClass RECONFIGURABLE_COMPONENT_INSTANCE = eINSTANCE.getReconfigurableComponentInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationPortInstanceImpl <em>Reconfiguration Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurationPortInstance()
		 * @generated
		 */
		EClass RECONFIGURATION_PORT_INSTANCE = eINSTANCE.getReconfigurationPortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationMessagePortInstanceImpl <em>Reconfiguration Message Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationMessagePortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurationMessagePortInstance()
		 * @generated
		 */
		EClass RECONFIGURATION_MESSAGE_PORT_INSTANCE = eINSTANCE.getReconfigurationMessagePortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationExecutionPortInstanceImpl <em>Reconfiguration Execution Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationExecutionPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurationExecutionPortInstance()
		 * @generated
		 */
		EClass RECONFIGURATION_EXECUTION_PORT_INSTANCE = eINSTANCE.getReconfigurationExecutionPortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InternalReconfigurationCommunicationPortInstanceImpl <em>Internal Reconfiguration Communication Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InternalReconfigurationCommunicationPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getInternalReconfigurationCommunicationPortInstance()
		 * @generated
		 */
		EClass INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE = eINSTANCE.getInternalReconfigurationCommunicationPortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationControllerInstanceImpl <em>Reconfiguration Controller Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurationControllerInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurationControllerInstance()
		 * @generated
		 */
		EClass RECONFIGURATION_CONTROLLER_INSTANCE = eINSTANCE.getReconfigurationControllerInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ControllerInstanceImpl <em>Controller Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ControllerInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getControllerInstance()
		 * @generated
		 */
		EClass CONTROLLER_INSTANCE = eINSTANCE.getControllerInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.RuleBasedReconfigurationControllerInstanceImpl <em>Rule Based Reconfiguration Controller Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.RuleBasedReconfigurationControllerInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getRuleBasedReconfigurationControllerInstance()
		 * @generated
		 */
		EClass RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE = eINSTANCE.getRuleBasedReconfigurationControllerInstance();

		/**
		 * The meta object literal for the '<em><b>Manager Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE = eINSTANCE.getRuleBasedReconfigurationControllerInstance_ManagerInstance();

		/**
		 * The meta object literal for the '<em><b>Executor Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE = eINSTANCE.getRuleBasedReconfigurationControllerInstance_ExecutorInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ManagerInstanceImpl <em>Manager Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ManagerInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getManagerInstance()
		 * @generated
		 */
		EClass MANAGER_INSTANCE = eINSTANCE.getManagerInstance();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_INSTANCE__MANAGER = eINSTANCE.getManagerInstance_Manager();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Controller Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE = eINSTANCE.getManagerInstance_ReconfigurationControllerInstance();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_INSTANCE__PORT_INSTANCES = eINSTANCE.getManagerInstance_PortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ExecutorInstanceImpl <em>Executor Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ExecutorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getExecutorInstance()
		 * @generated
		 */
		EClass EXECUTOR_INSTANCE = eINSTANCE.getExecutorInstance();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_INSTANCE__EXECUTOR = eINSTANCE.getExecutorInstance_Executor();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Controller Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE = eINSTANCE.getExecutorInstance_ReconfigurationControllerInstance();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_INSTANCE__PORT_INSTANCES = eINSTANCE.getExecutorInstance_PortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableAtomicComponentInstanceImpl <em>Reconfigurable Atomic Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableAtomicComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurableAtomicComponentInstance()
		 * @generated
		 */
		EClass RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE = eINSTANCE.getReconfigurableAtomicComponentInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableStructuredComponentInstanceImpl <em>Reconfigurable Structured Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableStructuredComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.InstancePackageImpl#getReconfigurableStructuredComponentInstance()
		 * @generated
		 */
		EClass RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE = eINSTANCE.getReconfigurableStructuredComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Controller Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE = eINSTANCE.getReconfigurableStructuredComponentInstance_ControllerInstance();

	}

} //InstancePackage
