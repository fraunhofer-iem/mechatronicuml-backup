/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.modeling.SDMPackage;

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
 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstanceFactory
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
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/model/instance";

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
	InstancePackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getComponentInstance()
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
	int COMPONENT_INSTANCE__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_TYPE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Name Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_NAME_DERIVED = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Part Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PART_INSTANCES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PORT_INSTANCES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CONNECTOR_INSTANCES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___TO_STRING = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl <em>Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getConnectorInstance()
	 * @generated
	 */
	int CONNECTOR_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__UML_REALTIME_STATECHART = ComponentPackage.BEHAVIORAL_CONNECTOR__UML_REALTIME_STATECHART;

	/**
	 * The feature id for the '<em><b>Connector Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__CONNECTOR_CLASS = ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__ANNOTATION = ComponentPackage.BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__EXTENSION = ComponentPackage.BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__NAME = ComponentPackage.BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__SOURCE = ComponentPackage.BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__TARGET = ComponentPackage.BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE = ComponentPackage.BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE_FEATURE_COUNT = ComponentPackage.BEHAVIORAL_CONNECTOR_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___ECLASS = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___EIS_PROXY = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___ERESOURCE = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___ECONTAINER = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___ECONTAINING_FEATURE = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___ECONTENTS = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___EALL_CONTENTS = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___ECROSS_REFERENCES = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___GET_ANNOTATION__STRING = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 18;

	/**
	 * The number of operations of the '<em>Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE_OPERATION_COUNT = ComponentPackage.BEHAVIORAL_CONNECTOR_OPERATION_COUNT + 19;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.PortInstanceImpl <em>Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.PortInstanceImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getPortInstance()
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
	int PORT_INSTANCE__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT_TYPE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.AssemblyInstanceImpl <em>Assembly Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.AssemblyInstanceImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getAssemblyInstance()
	 * @generated
	 */
	int ASSEMBLY_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__UML_REALTIME_STATECHART = CONNECTOR_INSTANCE__UML_REALTIME_STATECHART;

	/**
	 * The feature id for the '<em><b>Connector Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__CONNECTOR_CLASS = CONNECTOR_INSTANCE__CONNECTOR_CLASS;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__ANNOTATION = CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__EXTENSION = CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__NAME = CONNECTOR_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__SOURCE = CONNECTOR_INSTANCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__TARGET = CONNECTOR_INSTANCE__TARGET;

	/**
	 * The feature id for the '<em><b>Parent Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__PARENT_COMPONENT_INSTANCE = CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Assembly Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__ASSEMBLY_TYPE = CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordination Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE__COORDINATION_PATTERN = CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembly Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE_FEATURE_COUNT = CONNECTOR_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___ECLASS = CONNECTOR_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___EIS_PROXY = CONNECTOR_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___ERESOURCE = CONNECTOR_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___ECONTAINER = CONNECTOR_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___ECONTAINING_FEATURE = CONNECTOR_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___ECONTAINMENT_FEATURE = CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___ECONTENTS = CONNECTOR_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___EALL_CONTENTS = CONNECTOR_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___ECROSS_REFERENCES = CONNECTOR_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___EGET__ESTRUCTURALFEATURE = CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___EINVOKE__EOPERATION_ELIST = CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___GET_EXTENSION__ECLASS = CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___PROVIDE_EXTENSION__ECLASS = CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___GET_ANNOTATION__STRING = CONNECTOR_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE___PROVIDE_ANNOTATION__STRING = CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Assembly Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INSTANCE_OPERATION_COUNT = CONNECTOR_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.DelegationInstanceImpl <em>Delegation Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.DelegationInstanceImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getDelegationInstance()
	 * @generated
	 */
	int DELEGATION_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__UML_REALTIME_STATECHART = CONNECTOR_INSTANCE__UML_REALTIME_STATECHART;

	/**
	 * The feature id for the '<em><b>Connector Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__CONNECTOR_CLASS = CONNECTOR_INSTANCE__CONNECTOR_CLASS;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__ANNOTATION = CONNECTOR_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__EXTENSION = CONNECTOR_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__NAME = CONNECTOR_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__SOURCE = CONNECTOR_INSTANCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__TARGET = CONNECTOR_INSTANCE__TARGET;

	/**
	 * The feature id for the '<em><b>Parent Component Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__PARENT_COMPONENT_INSTANCE = CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Delegation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__DELEGATION_TYPE = CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE_FEATURE_COUNT = CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECLASS = CONNECTOR_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EIS_PROXY = CONNECTOR_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ERESOURCE = CONNECTOR_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECONTAINER = CONNECTOR_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECONTAINING_FEATURE = CONNECTOR_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECONTAINMENT_FEATURE = CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECONTENTS = CONNECTOR_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EALL_CONTENTS = CONNECTOR_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECROSS_REFERENCES = CONNECTOR_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EGET__ESTRUCTURALFEATURE = CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EINVOKE__EOPERATION_ELIST = CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___GET_EXTENSION__ECLASS = CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___PROVIDE_EXTENSION__ECLASS = CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___GET_ANNOTATION__STRING = CONNECTOR_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___PROVIDE_ANNOTATION__STRING = CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Delegation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE_OPERATION_COUNT = CONNECTOR_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentNameDerived <em>Component Name Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name Derived</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentNameDerived()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_ComponentNameDerived();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getPartInstances <em>Part Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Instances</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getPartInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_PartInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getPortInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_PortInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getConnectorInstances <em>Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getConnectorInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ConnectorInstances();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#toString()
	 * @generated
	 */
	EOperation getComponentInstance__ToString();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance <em>Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance
	 * @generated
	 */
	EClass getConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getSource()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getTarget()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_Target();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getParentComponentInstance <em>Parent Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getParentComponentInstance()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_ParentComponentInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance
	 * @generated
	 */
	EClass getPortInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance#getPortType()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_PortType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance <em>Assembly Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance
	 * @generated
	 */
	EClass getAssemblyInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance#getAssemblyType <em>Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Type</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance#getAssemblyType()
	 * @see #getAssemblyInstance()
	 * @generated
	 */
	EReference getAssemblyInstance_AssemblyType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance#getCoordinationPattern()
	 * @see #getAssemblyInstance()
	 * @generated
	 */
	EReference getAssemblyInstance_CoordinationPattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance <em>Delegation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance
	 * @generated
	 */
	EClass getDelegationInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance#getDelegationType <em>Delegation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation Type</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance#getDelegationType()
	 * @see #getDelegationInstance()
	 * @generated
	 */
	EReference getDelegationInstance_DelegationType();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getComponentInstance()
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
		 * The meta object literal for the '<em><b>Component Name Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__COMPONENT_NAME_DERIVED = eINSTANCE.getComponentInstance_ComponentNameDerived();

		/**
		 * The meta object literal for the '<em><b>Part Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PART_INSTANCES = eINSTANCE.getComponentInstance_PartInstances();

		/**
		 * The meta object literal for the '<em><b>Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PORT_INSTANCES = eINSTANCE.getComponentInstance_PortInstances();

		/**
		 * The meta object literal for the '<em><b>Connector Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__CONNECTOR_INSTANCES = eINSTANCE.getComponentInstance_ConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_INSTANCE___TO_STRING = eINSTANCE.getComponentInstance__ToString();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl <em>Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getConnectorInstance()
		 * @generated
		 */
		EClass CONNECTOR_INSTANCE = eINSTANCE.getConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__SOURCE = eINSTANCE.getConnectorInstance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__TARGET = eINSTANCE.getConnectorInstance_Target();

		/**
		 * The meta object literal for the '<em><b>Parent Component Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE = eINSTANCE.getConnectorInstance_ParentComponentInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.PortInstanceImpl <em>Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.PortInstanceImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getPortInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.AssemblyInstanceImpl <em>Assembly Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.AssemblyInstanceImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getAssemblyInstance()
		 * @generated
		 */
		EClass ASSEMBLY_INSTANCE = eINSTANCE.getAssemblyInstance();

		/**
		 * The meta object literal for the '<em><b>Assembly Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INSTANCE__ASSEMBLY_TYPE = eINSTANCE.getAssemblyInstance_AssemblyType();

		/**
		 * The meta object literal for the '<em><b>Coordination Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INSTANCE__COORDINATION_PATTERN = eINSTANCE.getAssemblyInstance_CoordinationPattern();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.DelegationInstanceImpl <em>Delegation Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.DelegationInstanceImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl#getDelegationInstance()
		 * @generated
		 */
		EClass DELEGATION_INSTANCE = eINSTANCE.getDelegationInstance();

		/**
		 * The meta object literal for the '<em><b>Delegation Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_INSTANCE__DELEGATION_TYPE = eINSTANCE.getDelegationInstance_DelegationType();

	}

} //InstancePackage
