/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core;

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
 * @see de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/model/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.NaturalNumberImpl <em>Natural Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.NaturalNumberImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getNaturalNumber()
	 * @generated
	 */
	int NATURAL_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Infinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER__INFINITY = 1;

	/**
	 * The number of structural features of the '<em>Natural Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Value As Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___GET_VALUE_AS_OBJECT = 0;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___SET_VALUE__INFINITY = 1;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___SET_VALUE__STRING = 2;

	/**
	 * The operation id for the '<em>Long Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___LONG_VALUE = 3;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___TO_STRING = 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___EQUALS__EOBJECT = 5;

	/**
	 * The number of operations of the '<em>Natural Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CardinalityImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.InfinityImpl <em>Infinity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.InfinityImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getInfinity()
	 * @generated
	 */
	int INFINITY = 2;

	/**
	 * The number of structural features of the '<em>Infinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Byte Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___BYTE_VALUE = 0;

	/**
	 * The operation id for the '<em>Double Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___DOUBLE_VALUE = 1;

	/**
	 * The operation id for the '<em>Float Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___FLOAT_VALUE = 2;

	/**
	 * The operation id for the '<em>Int Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___INT_VALUE = 3;

	/**
	 * The operation id for the '<em>Long Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___LONG_VALUE = 4;

	/**
	 * The operation id for the '<em>Short Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___SHORT_VALUE = 5;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___TO_STRING = 6;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___EQUALS__EOBJECT = 7;

	/**
	 * The number of operations of the '<em>Infinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getBehavioralElement()
	 * @generated
	 */
	int BEHAVIORAL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT__STATECHART = 0;

	/**
	 * The number of structural features of the '<em>Behavioral Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavioral Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.ConstrainableElementImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getConstrainableElement()
	 * @generated
	 */
	int CONSTRAINABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constrainable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constrainable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl <em>Abstract Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getAbstractStatechart()
	 * @generated
	 */
	int ABSTRACT_STATECHART = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__EVENT_QUEUE_SIZE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__WCET_DOCUMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__SECURITY_LEVEL = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__SYSTEM_WCET_MAP = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__UTILISATION = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__SCHEDULE_DOCUMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>UML Realtime Start State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__UML_REALTIME_START_STATE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__TRANSITIONS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__VERTICES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__ECLASS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Provided Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__PROVIDED_MSG_IFACE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Required Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__REQUIRED_MSG_IFACE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__IS_EMBEDDED = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__CLOCKS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Embedding Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART__EMBEDDING_REGION = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Abstract Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___GET_HIGHEST_PARENT_STATECHART = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add All UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Complex UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___TO_STRING = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART___CLONE = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Abstract Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATECHART_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber <em>Natural Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Number</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber
	 * @generated
	 */
	EClass getNaturalNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValue()
	 * @see #getNaturalNumber()
	 * @generated
	 */
	EAttribute getNaturalNumber_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#isInfinity <em>Infinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinity</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#isInfinity()
	 * @see #getNaturalNumber()
	 * @generated
	 */
	EAttribute getNaturalNumber_Infinity();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValueAsObject() <em>Get Value As Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value As Object</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValueAsObject()
	 * @generated
	 */
	EOperation getNaturalNumber__GetValueAsObject();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#setValue(de.uni_paderborn.fujaba.umlrt.model.core.Infinity) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#setValue(de.uni_paderborn.fujaba.umlrt.model.core.Infinity)
	 * @generated
	 */
	EOperation getNaturalNumber__SetValue__Infinity();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getNaturalNumber__SetValue__String();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#longValue() <em>Long Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Long Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#longValue()
	 * @generated
	 */
	EOperation getNaturalNumber__LongValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#toString()
	 * @generated
	 */
	EOperation getNaturalNumber__ToString();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#equals(org.eclipse.emf.ecore.EObject) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#equals(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNaturalNumber__Equals__EObject();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getLowerBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getUpperBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_UpperBound();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity <em>Infinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infinity</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity
	 * @generated
	 */
	EClass getInfinity();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#byteValue() <em>Byte Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Byte Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#byteValue()
	 * @generated
	 */
	EOperation getInfinity__ByteValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#doubleValue() <em>Double Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Double Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#doubleValue()
	 * @generated
	 */
	EOperation getInfinity__DoubleValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#floatValue() <em>Float Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Float Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#floatValue()
	 * @generated
	 */
	EOperation getInfinity__FloatValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#intValue() <em>Int Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Int Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#intValue()
	 * @generated
	 */
	EOperation getInfinity__IntValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#longValue() <em>Long Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Long Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#longValue()
	 * @generated
	 */
	EOperation getInfinity__LongValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#shortValue() <em>Short Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Short Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#shortValue()
	 * @generated
	 */
	EOperation getInfinity__ShortValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#toString()
	 * @generated
	 */
	EOperation getInfinity__ToString();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#equals(org.eclipse.emf.ecore.EObject) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#equals(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getInfinity__Equals__EObject();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement
	 * @generated
	 */
	EClass getBehavioralElement();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement#getStatechart()
	 * @see #getBehavioralElement()
	 * @generated
	 */
	EReference getBehavioralElement_Statechart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrainable Element</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement
	 * @generated
	 */
	EClass getConstrainableElement();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement#getConstraint()
	 * @see #getConstrainableElement()
	 * @generated
	 */
	EReference getConstrainableElement_Constraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart <em>Abstract Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart
	 * @generated
	 */
	EClass getAbstractStatechart();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getEventQueueSize <em>Event Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Queue Size</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getEventQueueSize()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EAttribute getAbstractStatechart_EventQueueSize();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getWcetDocument <em>Wcet Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet Document</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getWcetDocument()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EAttribute getAbstractStatechart_WcetDocument();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Level</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getSecurityLevel()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EAttribute getAbstractStatechart_SecurityLevel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getSystemWcetMap <em>System Wcet Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Wcet Map</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getSystemWcetMap()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EAttribute getAbstractStatechart_SystemWcetMap();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getUtilisation <em>Utilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilisation</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getUtilisation()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EAttribute getAbstractStatechart_Utilisation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getScheduleDocument <em>Schedule Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Document</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getScheduleDocument()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EAttribute getAbstractStatechart_ScheduleDocument();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getUMLRealtimeStartState <em>UML Realtime Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Realtime Start State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getUMLRealtimeStartState()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_UMLRealtimeStartState();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Complex Realtime State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getUMLComplexRealtimeState()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_UMLComplexRealtimeState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getTransitions()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getVertices()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_Vertices();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getEClass()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_EClass();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getBehavioralElement()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_BehavioralElement();

	/**
	 * Returns the meta object for the map '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getProvidedMsgIFace <em>Provided Msg IFace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Provided Msg IFace</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getProvidedMsgIFace()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_ProvidedMsgIFace();

	/**
	 * Returns the meta object for the map '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getRequiredMsgIFace <em>Required Msg IFace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Required Msg IFace</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getRequiredMsgIFace()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_RequiredMsgIFace();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#isIsEmbedded <em>Is Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Embedded</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#isIsEmbedded()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EAttribute getAbstractStatechart_IsEmbedded();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getClocks()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_Clocks();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getEmbeddingRegion <em>Embedding Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Embedding Region</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getEmbeddingRegion()
	 * @see #getAbstractStatechart()
	 * @generated
	 */
	EReference getAbstractStatechart_EmbeddingRegion();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getHighestParentStatechart() <em>Get Highest Parent Statechart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Highest Parent Statechart</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getHighestParentStatechart()
	 * @generated
	 */
	EOperation getAbstractStatechart__GetHighestParentStatechart();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#addAllUMLRealtimeStates(java.util.Set, boolean) <em>Add All UML Realtime States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All UML Realtime States</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#addAllUMLRealtimeStates(java.util.Set, boolean)
	 * @generated
	 */
	EOperation getAbstractStatechart__AddAllUMLRealtimeStates__Set_boolean();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#addComplexUMLRealtimeStates(java.util.Set) <em>Add Complex UML Realtime States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Complex UML Realtime States</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#addComplexUMLRealtimeStates(java.util.Set)
	 * @generated
	 */
	EOperation getAbstractStatechart__AddComplexUMLRealtimeStates__Set();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#addAllUMLRealtimeTransitions(java.util.Set) <em>Add All UML Realtime Transitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#addAllUMLRealtimeTransitions(java.util.Set)
	 * @generated
	 */
	EOperation getAbstractStatechart__AddAllUMLRealtimeTransitions__Set();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#iteratorOfAllUMLClocks(boolean) <em>Iterator Of All UML Clocks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#iteratorOfAllUMLClocks(boolean)
	 * @generated
	 */
	EOperation getAbstractStatechart__IteratorOfAllUMLClocks__boolean();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#addAllUMLClocks(java.util.Set, boolean) <em>Add All UML Clocks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All UML Clocks</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#addAllUMLClocks(java.util.Set, boolean)
	 * @generated
	 */
	EOperation getAbstractStatechart__AddAllUMLClocks__Set_boolean();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#toString()
	 * @generated
	 */
	EOperation getAbstractStatechart__ToString();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#clone()
	 * @generated
	 */
	EOperation getAbstractStatechart__Clone();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.NaturalNumberImpl <em>Natural Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.NaturalNumberImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getNaturalNumber()
		 * @generated
		 */
		EClass NATURAL_NUMBER = eINSTANCE.getNaturalNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_NUMBER__VALUE = eINSTANCE.getNaturalNumber_Value();

		/**
		 * The meta object literal for the '<em><b>Infinity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_NUMBER__INFINITY = eINSTANCE.getNaturalNumber_Infinity();

		/**
		 * The meta object literal for the '<em><b>Get Value As Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___GET_VALUE_AS_OBJECT = eINSTANCE.getNaturalNumber__GetValueAsObject();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___SET_VALUE__INFINITY = eINSTANCE.getNaturalNumber__SetValue__Infinity();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___SET_VALUE__STRING = eINSTANCE.getNaturalNumber__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Long Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___LONG_VALUE = eINSTANCE.getNaturalNumber__LongValue();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___TO_STRING = eINSTANCE.getNaturalNumber__ToString();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___EQUALS__EOBJECT = eINSTANCE.getNaturalNumber__Equals__EObject();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CardinalityImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__LOWER_BOUND = eINSTANCE.getCardinality_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__UPPER_BOUND = eINSTANCE.getCardinality_UpperBound();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.InfinityImpl <em>Infinity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.InfinityImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getInfinity()
		 * @generated
		 */
		EClass INFINITY = eINSTANCE.getInfinity();

		/**
		 * The meta object literal for the '<em><b>Byte Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___BYTE_VALUE = eINSTANCE.getInfinity__ByteValue();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___DOUBLE_VALUE = eINSTANCE.getInfinity__DoubleValue();

		/**
		 * The meta object literal for the '<em><b>Float Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___FLOAT_VALUE = eINSTANCE.getInfinity__FloatValue();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___INT_VALUE = eINSTANCE.getInfinity__IntValue();

		/**
		 * The meta object literal for the '<em><b>Long Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___LONG_VALUE = eINSTANCE.getInfinity__LongValue();

		/**
		 * The meta object literal for the '<em><b>Short Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___SHORT_VALUE = eINSTANCE.getInfinity__ShortValue();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___TO_STRING = eINSTANCE.getInfinity__ToString();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___EQUALS__EOBJECT = eINSTANCE.getInfinity__Equals__EObject();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getBehavioralElement()
		 * @generated
		 */
		EClass BEHAVIORAL_ELEMENT = eINSTANCE.getBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_ELEMENT__STATECHART = eINSTANCE.getBehavioralElement_Statechart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.ConstrainableElementImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getConstrainableElement()
		 * @generated
		 */
		EClass CONSTRAINABLE_ELEMENT = eINSTANCE.getConstrainableElement();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINABLE_ELEMENT__CONSTRAINT = eINSTANCE.getConstrainableElement_Constraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl <em>Abstract Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getAbstractStatechart()
		 * @generated
		 */
		EClass ABSTRACT_STATECHART = eINSTANCE.getAbstractStatechart();

		/**
		 * The meta object literal for the '<em><b>Event Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATECHART__EVENT_QUEUE_SIZE = eINSTANCE.getAbstractStatechart_EventQueueSize();

		/**
		 * The meta object literal for the '<em><b>Wcet Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATECHART__WCET_DOCUMENT = eINSTANCE.getAbstractStatechart_WcetDocument();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATECHART__SECURITY_LEVEL = eINSTANCE.getAbstractStatechart_SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>System Wcet Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATECHART__SYSTEM_WCET_MAP = eINSTANCE.getAbstractStatechart_SystemWcetMap();

		/**
		 * The meta object literal for the '<em><b>Utilisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATECHART__UTILISATION = eINSTANCE.getAbstractStatechart_Utilisation();

		/**
		 * The meta object literal for the '<em><b>Schedule Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATECHART__SCHEDULE_DOCUMENT = eINSTANCE.getAbstractStatechart_ScheduleDocument();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Start State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__UML_REALTIME_START_STATE = eINSTANCE.getAbstractStatechart_UMLRealtimeStartState();

		/**
		 * The meta object literal for the '<em><b>UML Complex Realtime State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE = eINSTANCE.getAbstractStatechart_UMLComplexRealtimeState();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__TRANSITIONS = eINSTANCE.getAbstractStatechart_Transitions();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__VERTICES = eINSTANCE.getAbstractStatechart_Vertices();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__ECLASS = eINSTANCE.getAbstractStatechart_EClass();

		/**
		 * The meta object literal for the '<em><b>Behavioral Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT = eINSTANCE.getAbstractStatechart_BehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Provided Msg IFace</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__PROVIDED_MSG_IFACE = eINSTANCE.getAbstractStatechart_ProvidedMsgIFace();

		/**
		 * The meta object literal for the '<em><b>Required Msg IFace</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__REQUIRED_MSG_IFACE = eINSTANCE.getAbstractStatechart_RequiredMsgIFace();

		/**
		 * The meta object literal for the '<em><b>Is Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATECHART__IS_EMBEDDED = eINSTANCE.getAbstractStatechart_IsEmbedded();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__CLOCKS = eINSTANCE.getAbstractStatechart_Clocks();

		/**
		 * The meta object literal for the '<em><b>Embedding Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATECHART__EMBEDDING_REGION = eINSTANCE.getAbstractStatechart_EmbeddingRegion();

		/**
		 * The meta object literal for the '<em><b>Get Highest Parent Statechart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATECHART___GET_HIGHEST_PARENT_STATECHART = eINSTANCE.getAbstractStatechart__GetHighestParentStatechart();

		/**
		 * The meta object literal for the '<em><b>Add All UML Realtime States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = eINSTANCE.getAbstractStatechart__AddAllUMLRealtimeStates__Set_boolean();

		/**
		 * The meta object literal for the '<em><b>Add Complex UML Realtime States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = eINSTANCE.getAbstractStatechart__AddComplexUMLRealtimeStates__Set();

		/**
		 * The meta object literal for the '<em><b>Add All UML Realtime Transitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = eINSTANCE.getAbstractStatechart__AddAllUMLRealtimeTransitions__Set();

		/**
		 * The meta object literal for the '<em><b>Iterator Of All UML Clocks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = eINSTANCE.getAbstractStatechart__IteratorOfAllUMLClocks__boolean();

		/**
		 * The meta object literal for the '<em><b>Add All UML Clocks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = eINSTANCE.getAbstractStatechart__AddAllUMLClocks__Set_boolean();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATECHART___TO_STRING = eINSTANCE.getAbstractStatechart__ToString();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATECHART___CLONE = eINSTANCE.getAbstractStatechart__Clone();

	}

} //CorePackage
