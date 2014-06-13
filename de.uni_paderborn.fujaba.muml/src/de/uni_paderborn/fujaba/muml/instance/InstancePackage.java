/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The package instance contains all classes for building configurations of component instances.
 * 
 * Component instances are built from component types and connected by connectors. The resulting structure is a component instance configuration.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.instance.InstanceFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/instance/0.4.0";

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
	InstancePackage eINSTANCE = de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_PART = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PARENT_CIC = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.PortConnectorInstanceImpl <em>Port Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.PortConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getPortConnectorInstance()
	 * @generated
	 */
	int PORT_CONNECTOR_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__ANNOTATION = ConnectorPackage.CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__EXTENSION = ConnectorPackage.CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = ConnectorPackage.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE__PORT_INSTANCES = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___ECLASS = ConnectorPackage.CONNECTOR_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___EIS_PROXY = ConnectorPackage.CONNECTOR_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___ERESOURCE = ConnectorPackage.CONNECTOR_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___ECONTAINER = ConnectorPackage.CONNECTOR_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___ECONTAINING_FEATURE = ConnectorPackage.CONNECTOR_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE = ConnectorPackage.CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___ECONTENTS = ConnectorPackage.CONNECTOR_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___EALL_CONTENTS = ConnectorPackage.CONNECTOR_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___ECROSS_REFERENCES = ConnectorPackage.CONNECTOR_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ConnectorPackage.CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = ConnectorPackage.CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST = ConnectorPackage.CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___GET_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Port Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.PortInstanceImpl <em>Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.PortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getPortInstance()
	 * @generated
	 */
	int PORT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__ANNOTATION = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__EXTENSION = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__NAME = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__CONNECTOR_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT_TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__COMPONENT_INSTANCE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT_PART = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EIS_PROXY = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ERESOURCE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECONTAINER = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECONTAINING_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECONTAINMENT_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EALL_CONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECROSS_REFERENCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___GET_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.AssemblyConnectorInstanceImpl <em>Assembly Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.AssemblyConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getAssemblyConnectorInstance()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__ANNOTATION = PORT_CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__EXTENSION = PORT_CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__COMMENT = PORT_CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__TYPE = PORT_CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = PORT_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__PORT_INSTANCES = PORT_CONNECTOR_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Assembly Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_FEATURE_COUNT = PORT_CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___ECLASS = PORT_CONNECTOR_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___EIS_PROXY = PORT_CONNECTOR_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___ERESOURCE = PORT_CONNECTOR_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___ECONTAINER = PORT_CONNECTOR_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___ECONTAINING_FEATURE = PORT_CONNECTOR_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE = PORT_CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___ECONTENTS = PORT_CONNECTOR_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___EALL_CONTENTS = PORT_CONNECTOR_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___ECROSS_REFERENCES = PORT_CONNECTOR_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE = PORT_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PORT_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = PORT_CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = PORT_CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = PORT_CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST = PORT_CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = PORT_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = PORT_CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___GET_ANNOTATION__STRING = PORT_CONNECTOR_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING = PORT_CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Assembly Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_OPERATION_COUNT = PORT_CONNECTOR_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.DelegationConnectorInstanceImpl <em>Delegation Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.DelegationConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getDelegationConnectorInstance()
	 * @generated
	 */
	int DELEGATION_CONNECTOR_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__ANNOTATION = PORT_CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__EXTENSION = PORT_CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__COMMENT = PORT_CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__TYPE = PORT_CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = PORT_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__PORT_INSTANCES = PORT_CONNECTOR_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Delegation Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE = PORT_CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE_FEATURE_COUNT = PORT_CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___ECLASS = PORT_CONNECTOR_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___EIS_PROXY = PORT_CONNECTOR_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___ERESOURCE = PORT_CONNECTOR_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___ECONTAINER = PORT_CONNECTOR_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___ECONTAINING_FEATURE = PORT_CONNECTOR_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE = PORT_CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___ECONTENTS = PORT_CONNECTOR_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___EALL_CONTENTS = PORT_CONNECTOR_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___ECROSS_REFERENCES = PORT_CONNECTOR_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE = PORT_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PORT_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = PORT_CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = PORT_CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = PORT_CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST = PORT_CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = PORT_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = PORT_CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___GET_ANNOTATION__STRING = PORT_CONNECTOR_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING = PORT_CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Delegation Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_INSTANCE_OPERATION_COUNT = PORT_CONNECTOR_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceConfigurationImpl <em>Component Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceConfigurationImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getComponentInstanceConfiguration()
	 * @generated
	 */
	int COMPONENT_INSTANCE_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Structured Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__PARENT_STRUCTURED_COMPONENT_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;


	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.ContinuousPortInstanceImpl <em>Continuous Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.ContinuousPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getContinuousPortInstance()
	 * @generated
	 */
	int CONTINUOUS_PORT_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__ANNOTATION = PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__EXTENSION = PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__NAME = PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__COMMENT = PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__CONNECTOR_INSTANCES = PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__TYPE = PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__PORT_TYPE = PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__COMPONENT_INSTANCE = PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE__PORT_PART = PORT_INSTANCE__PORT_PART;

	/**
	 * The number of structural features of the '<em>Continuous Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___ECLASS = PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___EIS_PROXY = PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___ERESOURCE = PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___ECONTAINER = PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___ECONTAINING_FEATURE = PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___ECONTAINMENT_FEATURE = PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___ECONTENTS = PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___EALL_CONTENTS = PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___ECROSS_REFERENCES = PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___GET_EXTENSION__ECLASS = PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___GET_ANNOTATION__STRING = PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Continuous Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_INSTANCE_OPERATION_COUNT = PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.DiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.DiscretePortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getDiscretePortInstance()
	 * @generated
	 */
	int DISCRETE_PORT_INSTANCE = 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.HybridPortInstanceImpl <em>Hybrid Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.HybridPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getHybridPortInstance()
	 * @generated
	 */
	int HYBRID_PORT_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__ANNOTATION = PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__EXTENSION = PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__NAME = PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__COMMENT = PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__CONNECTOR_INSTANCES = PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__TYPE = PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__PORT_TYPE = PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__COMPONENT_INSTANCE = PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE__PORT_PART = PORT_INSTANCE__PORT_PART;

	/**
	 * The number of structural features of the '<em>Hybrid Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___ECLASS = PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___EIS_PROXY = PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___ERESOURCE = PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___ECONTAINER = PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___ECONTAINING_FEATURE = PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___ECONTAINMENT_FEATURE = PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___ECONTENTS = PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___EALL_CONTENTS = PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___ECROSS_REFERENCES = PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___GET_EXTENSION__ECLASS = PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___GET_ANNOTATION__STRING = PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Hybrid Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_INSTANCE_OPERATION_COUNT = PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__ANNOTATION = PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__EXTENSION = PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__NAME = PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__COMMENT = PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES = PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__TYPE = PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__PORT_TYPE = PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE = PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__PORT_PART = PORT_INSTANCE__PORT_PART;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE__REFINED_ROLE = PORT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Discrete Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___ECLASS = PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___EIS_PROXY = PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___ERESOURCE = PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___ECONTAINER = PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___ECONTAINING_FEATURE = PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___ECONTAINMENT_FEATURE = PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___ECONTENTS = PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___EALL_CONTENTS = PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___ECROSS_REFERENCES = PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___GET_EXTENSION__ECLASS = PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___GET_ANNOTATION__STRING = PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Discrete Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_INSTANCE_OPERATION_COUNT = PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.DiscreteSinglePortInstanceImpl <em>Discrete Single Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.DiscreteSinglePortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getDiscreteSinglePortInstance()
	 * @generated
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__ANNOTATION = DISCRETE_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__EXTENSION = DISCRETE_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__NAME = DISCRETE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__COMMENT = DISCRETE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__TYPE = DISCRETE_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__PORT_TYPE = DISCRETE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__COMPONENT_INSTANCE = DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__PORT_PART = DISCRETE_PORT_INSTANCE__PORT_PART;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__REFINED_ROLE = DISCRETE_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__NEXT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__PREVIOUS = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__FIRST = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE__LAST = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE_FEATURE_COUNT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___ECLASS = DISCRETE_PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___EIS_PROXY = DISCRETE_PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___ERESOURCE = DISCRETE_PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINER = DISCRETE_PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINING_FEATURE = DISCRETE_PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___ECONTAINMENT_FEATURE = DISCRETE_PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___ECONTENTS = DISCRETE_PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___EALL_CONTENTS = DISCRETE_PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___ECROSS_REFERENCES = DISCRETE_PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = DISCRETE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = DISCRETE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = DISCRETE_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = DISCRETE_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = DISCRETE_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = DISCRETE_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___GET_EXTENSION__ECLASS = DISCRETE_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = DISCRETE_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___GET_ANNOTATION__STRING = DISCRETE_PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = DISCRETE_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Discrete Single Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_PORT_INSTANCE_OPERATION_COUNT = DISCRETE_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.DiscreteMultiPortInstanceImpl <em>Discrete Multi Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.DiscreteMultiPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getDiscreteMultiPortInstance()
	 * @generated
	 */
	int DISCRETE_MULTI_PORT_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__ANNOTATION = DISCRETE_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__EXTENSION = DISCRETE_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__NAME = DISCRETE_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__COMMENT = DISCRETE_PORT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__TYPE = DISCRETE_PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__PORT_TYPE = DISCRETE_PORT_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__COMPONENT_INSTANCE = DISCRETE_PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = DISCRETE_PORT_INSTANCE__PORT_CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__PORT_PART = DISCRETE_PORT_INSTANCE__PORT_PART;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__SENDER_MESSAGE_TYPES = DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__REFINED_ROLE = DISCRETE_PORT_INSTANCE__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__FIRST = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__LAST = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Discrete Multi Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE_FEATURE_COUNT = DISCRETE_PORT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___ECLASS = DISCRETE_PORT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___EIS_PROXY = DISCRETE_PORT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___ERESOURCE = DISCRETE_PORT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___ECONTAINER = DISCRETE_PORT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___ECONTAINING_FEATURE = DISCRETE_PORT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___ECONTAINMENT_FEATURE = DISCRETE_PORT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___ECONTENTS = DISCRETE_PORT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___EALL_CONTENTS = DISCRETE_PORT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___ECROSS_REFERENCES = DISCRETE_PORT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = DISCRETE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = DISCRETE_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = DISCRETE_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = DISCRETE_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = DISCRETE_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = DISCRETE_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___GET_EXTENSION__ECLASS = DISCRETE_PORT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = DISCRETE_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___GET_ANNOTATION__STRING = DISCRETE_PORT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = DISCRETE_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Discrete Multi Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_PORT_INSTANCE_OPERATION_COUNT = DISCRETE_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.CoordinationProtocolInstanceImpl <em>Coordination Protocol Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.CoordinationProtocolInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getCoordinationProtocolInstance()
	 * @generated
	 */
	int COORDINATION_PROTOCOL_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordination Protocol Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_PART = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordination Protocol Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Coordination Protocol Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.StructuredComponentInstanceImpl <em>Structured Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.StructuredComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getStructuredComponentInstance()
	 * @generated
	 */
	int STRUCTURED_COMPONENT_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__ANNOTATION = COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__EXTENSION = COMPONENT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__COMPONENT_TYPE = COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__PORT_INSTANCES = COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__COMPONENT_PART = COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__PARENT_CIC = COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The feature id for the '<em><b>Embedded CIC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___ECLASS = COMPONENT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___EIS_PROXY = COMPONENT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___ERESOURCE = COMPONENT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___ECONTAINER = COMPONENT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___ECONTAINING_FEATURE = COMPONENT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE = COMPONENT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___ECONTENTS = COMPONENT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___EALL_CONTENTS = COMPONENT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___ECROSS_REFERENCES = COMPONENT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE = COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST = COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = COMPONENT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS = COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___GET_ANNOTATION__STRING = COMPONENT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING = COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Structured Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.AtomicComponentInstanceImpl <em>Atomic Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.AtomicComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getAtomicComponentInstance()
	 * @generated
	 */
	int ATOMIC_COMPONENT_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__ANNOTATION = COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__EXTENSION = COMPONENT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__COMPONENT_TYPE = COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__PORT_INSTANCES = COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__COMPONENT_PART = COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE__PARENT_CIC = COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The number of structural features of the '<em>Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___ECLASS = COMPONENT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___EIS_PROXY = COMPONENT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___ERESOURCE = COMPONENT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___ECONTAINER = COMPONENT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___ECONTAINING_FEATURE = COMPONENT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE = COMPONENT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___ECONTENTS = COMPONENT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___EALL_CONTENTS = COMPONENT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___ECROSS_REFERENCES = COMPONENT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE = COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST = COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = COMPONENT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS = COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___GET_ANNOTATION__STRING = COMPONENT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING = COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getComponentType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getPortInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_PortInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getComponentPart()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentPart();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getParentCIC <em>Parent CIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent CIC</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getParentCIC()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ParentCIC();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance <em>Port Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance
	 * @generated
	 */
	EClass getPortConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance#getPortConnectorType <em>Port Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Connector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance#getPortConnectorType()
	 * @see #getPortConnectorInstance()
	 * @generated
	 */
	EReference getPortConnectorInstance_PortConnectorType();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance#getPortInstances()
	 * @see #getPortConnectorInstance()
	 * @generated
	 */
	EReference getPortConnectorInstance_PortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance
	 * @generated
	 */
	EClass getPortInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortType()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortType();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance#getComponentInstance()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_ComponentInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortConnectorInstances <em>Port Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortConnectorInstances()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortConnectorInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortPart <em>Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortPart()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance <em>Assembly Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance
	 * @generated
	 */
	EClass getAssemblyConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance#getAssemblyConnectorType <em>Assembly Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance#getAssemblyConnectorType()
	 * @see #getAssemblyConnectorInstance()
	 * @generated
	 */
	EReference getAssemblyConnectorInstance_AssemblyConnectorType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance <em>Delegation Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance
	 * @generated
	 */
	EClass getDelegationConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance#getDelegationConnectorType <em>Delegation Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation Connector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance#getDelegationConnectorType()
	 * @see #getDelegationConnectorInstance()
	 * @generated
	 */
	EReference getDelegationConnectorInstance_DelegationConnectorType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration <em>Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration
	 * @generated
	 */
	EClass getComponentInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getComponentInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getPortConnectorInstances <em>Port Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getPortConnectorInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_PortConnectorInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getParentPortInstances <em>Parent Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getParentPortInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ParentPortInstances();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getParentStructuredComponentInstance <em>Parent Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structured Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getParentStructuredComponentInstance()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ParentStructuredComponentInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance <em>Continuous Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance
	 * @generated
	 */
	EClass getContinuousPortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.HybridPortInstance <em>Hybrid Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.HybridPortInstance
	 * @generated
	 */
	EClass getHybridPortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance
	 * @generated
	 */
	EClass getDiscretePortInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance#getReceiverMessageTypes <em>Receiver Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance#getReceiverMessageTypes()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_ReceiverMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance#getSenderMessageTypes <em>Sender Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance#getSenderMessageTypes()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_SenderMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance#getReceiverMessageBuffer()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_ReceiverMessageBuffer();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance#getRefinedRole <em>Refined Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Role</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance#getRefinedRole()
	 * @see #getDiscretePortInstance()
	 * @generated
	 */
	EReference getDiscretePortInstance_RefinedRole();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance <em>Discrete Single Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Single Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance
	 * @generated
	 */
	EClass getDiscreteSinglePortInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance <em>Discrete Multi Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Multi Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance
	 * @generated
	 */
	EClass getDiscreteMultiPortInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance#getGmfSubPortInstances <em>Gmf Sub Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gmf Sub Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance#getGmfSubPortInstances()
	 * @see #getDiscreteMultiPortInstance()
	 * @generated
	 */
	EReference getDiscreteMultiPortInstance_GmfSubPortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance <em>Coordination Protocol Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance
	 * @generated
	 */
	EClass getCoordinationProtocolInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getPortInstances()
	 * @see #getCoordinationProtocolInstance()
	 * @generated
	 */
	EReference getCoordinationProtocolInstance_PortInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getCoordinationProtocolPart()
	 * @see #getCoordinationProtocolInstance()
	 * @generated
	 */
	EReference getCoordinationProtocolInstance_CoordinationProtocolPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance <em>Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance
	 * @generated
	 */
	EClass getStructuredComponentInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded CIC</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance#getEmbeddedCIC()
	 * @see #getStructuredComponentInstance()
	 * @generated
	 */
	EReference getStructuredComponentInstance_EmbeddedCIC();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance <em>Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance
	 * @generated
	 */
	EClass getAtomicComponentInstance();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_TYPE = eINSTANCE.getComponentInstance_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PORT_INSTANCES = eINSTANCE.getComponentInstance_PortInstances();

		/**
		 * The meta object literal for the '<em><b>Component Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_PART = eINSTANCE.getComponentInstance_ComponentPart();

		/**
		 * The meta object literal for the '<em><b>Parent CIC</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PARENT_CIC = eINSTANCE.getComponentInstance_ParentCIC();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.PortConnectorInstanceImpl <em>Port Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.PortConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getPortConnectorInstance()
		 * @generated
		 */
		EClass PORT_CONNECTOR_INSTANCE = eINSTANCE.getPortConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Port Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE = eINSTANCE.getPortConnectorInstance_PortConnectorType();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR_INSTANCE__PORT_INSTANCES = eINSTANCE.getPortConnectorInstance_PortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.PortInstanceImpl <em>Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.PortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getPortInstance()
		 * @generated
		 */
		EClass PORT_INSTANCE = eINSTANCE.getPortInstance();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__PORT_TYPE = eINSTANCE.getPortInstance_PortType();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__COMPONENT_INSTANCE = eINSTANCE.getPortInstance_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Port Connector Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__PORT_CONNECTOR_INSTANCES = eINSTANCE.getPortInstance_PortConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Port Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__PORT_PART = eINSTANCE.getPortInstance_PortPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.AssemblyConnectorInstanceImpl <em>Assembly Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.AssemblyConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getAssemblyConnectorInstance()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR_INSTANCE = eINSTANCE.getAssemblyConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE = eINSTANCE.getAssemblyConnectorInstance_AssemblyConnectorType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.DelegationConnectorInstanceImpl <em>Delegation Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.DelegationConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getDelegationConnectorInstance()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR_INSTANCE = eINSTANCE.getDelegationConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Delegation Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE = eINSTANCE.getDelegationConnectorInstance_DelegationConnectorType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceConfigurationImpl <em>Component Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceConfigurationImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getComponentInstanceConfiguration()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_CONFIGURATION = eINSTANCE.getComponentInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_ComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Port Connector Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_PortConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Parent Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_ParentPortInstances();

		/**
		 * The meta object literal for the '<em><b>Parent Structured Component Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__PARENT_STRUCTURED_COMPONENT_INSTANCE = eINSTANCE.getComponentInstanceConfiguration_ParentStructuredComponentInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.ContinuousPortInstanceImpl <em>Continuous Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.ContinuousPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getContinuousPortInstance()
		 * @generated
		 */
		EClass CONTINUOUS_PORT_INSTANCE = eINSTANCE.getContinuousPortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.HybridPortInstanceImpl <em>Hybrid Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.HybridPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getHybridPortInstance()
		 * @generated
		 */
		EClass HYBRID_PORT_INSTANCE = eINSTANCE.getHybridPortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.DiscretePortInstanceImpl <em>Discrete Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.DiscretePortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getDiscretePortInstance()
		 * @generated
		 */
		EClass DISCRETE_PORT_INSTANCE = eINSTANCE.getDiscretePortInstance();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES = eINSTANCE.getDiscretePortInstance_ReceiverMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Sender Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES = eINSTANCE.getDiscretePortInstance_SenderMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Buffer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER = eINSTANCE.getDiscretePortInstance_ReceiverMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Refined Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT_INSTANCE__REFINED_ROLE = eINSTANCE.getDiscretePortInstance_RefinedRole();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.DiscreteSinglePortInstanceImpl <em>Discrete Single Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.DiscreteSinglePortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getDiscreteSinglePortInstance()
		 * @generated
		 */
		EClass DISCRETE_SINGLE_PORT_INSTANCE = eINSTANCE.getDiscreteSinglePortInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.DiscreteMultiPortInstanceImpl <em>Discrete Multi Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.DiscreteMultiPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getDiscreteMultiPortInstance()
		 * @generated
		 */
		EClass DISCRETE_MULTI_PORT_INSTANCE = eINSTANCE.getDiscreteMultiPortInstance();

		/**
		 * The meta object literal for the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES = eINSTANCE.getDiscreteMultiPortInstance_GmfSubPortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.CoordinationProtocolInstanceImpl <em>Coordination Protocol Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.CoordinationProtocolInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getCoordinationProtocolInstance()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL_INSTANCE = eINSTANCE.getCoordinationProtocolInstance();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES = eINSTANCE.getCoordinationProtocolInstance_PortInstances();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_PART = eINSTANCE.getCoordinationProtocolInstance_CoordinationProtocolPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.StructuredComponentInstanceImpl <em>Structured Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.StructuredComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getStructuredComponentInstance()
		 * @generated
		 */
		EClass STRUCTURED_COMPONENT_INSTANCE = eINSTANCE.getStructuredComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Embedded CIC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC = eINSTANCE.getStructuredComponentInstance_EmbeddedCIC();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.instance.impl.AtomicComponentInstanceImpl <em>Atomic Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.AtomicComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl#getAtomicComponentInstance()
		 * @generated
		 */
		EClass ATOMIC_COMPONENT_INSTANCE = eINSTANCE.getAtomicComponentInstance();

	}

} //InstancePackage
