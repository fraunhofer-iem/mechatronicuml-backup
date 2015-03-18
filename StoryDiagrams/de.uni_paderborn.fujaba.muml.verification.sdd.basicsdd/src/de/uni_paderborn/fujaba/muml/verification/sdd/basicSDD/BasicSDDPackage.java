/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD;

import de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface BasicSDDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basicSDD";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/verification/sdd/basicSDD/0.4.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basicSDD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicSDDPackage eINSTANCE = de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.BasicSDDPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.StoryDecisionDiagramImpl <em>Story Decision Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.StoryDecisionDiagramImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.BasicSDDPackageImpl#getStoryDecisionDiagram()
	 * @generated
	 */
	int STORY_DECISION_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM__ANNOTATION = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM__EXTENSION = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM__NAME = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM__NODES = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM__EDGES = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EDGES;

	/**
	 * The number of structural features of the '<em>Story Decision Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM_FEATURE_COUNT = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___ECLASS = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___EIS_PROXY = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___ERESOURCE = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___ECONTAINER = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___ECONTAINING_FEATURE = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___ECONTAINMENT_FEATURE = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___ECONTENTS = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___EALL_CONTENTS = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___ECROSS_REFERENCES = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___EGET__ESTRUCTURALFEATURE = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___ESET__ESTRUCTURALFEATURE_OBJECT = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___EIS_SET__ESTRUCTURALFEATURE = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___EUNSET__ESTRUCTURALFEATURE = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___EINVOKE__EOPERATION_ELIST = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___GET_EXTENSION__ECLASS = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___PROVIDE_EXTENSION__ECLASS = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___GET_ANNOTATION__STRING = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM___PROVIDE_ANNOTATION__STRING = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Story Decision Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_DECISION_DIAGRAM_OPERATION_COUNT = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.StoryPatternNodeImpl <em>Story Pattern Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.StoryPatternNodeImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.BasicSDDPackageImpl#getStoryPatternNode()
	 * @generated
	 */
	int STORY_PATTERN_NODE = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__OUTGOING_EDGES = SDDPackage.PATTERN_NODE__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__INCOMING_EDGES = SDDPackage.PATTERN_NODE__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__ANNOTATION = SDDPackage.PATTERN_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__EXTENSION = SDDPackage.PATTERN_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__NAME = SDDPackage.PATTERN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__TYPE = SDDPackage.PATTERN_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__PATTERN = SDDPackage.PATTERN_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE_FEATURE_COUNT = SDDPackage.PATTERN_NODE_FEATURE_COUNT + 1;


	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___ECLASS = SDDPackage.PATTERN_NODE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___EIS_PROXY = SDDPackage.PATTERN_NODE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___ERESOURCE = SDDPackage.PATTERN_NODE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___ECONTAINER = SDDPackage.PATTERN_NODE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___ECONTAINING_FEATURE = SDDPackage.PATTERN_NODE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___ECONTAINMENT_FEATURE = SDDPackage.PATTERN_NODE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___ECONTENTS = SDDPackage.PATTERN_NODE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___EALL_CONTENTS = SDDPackage.PATTERN_NODE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___ECROSS_REFERENCES = SDDPackage.PATTERN_NODE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___EGET__ESTRUCTURALFEATURE = SDDPackage.PATTERN_NODE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDDPackage.PATTERN_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = SDDPackage.PATTERN_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___EIS_SET__ESTRUCTURALFEATURE = SDDPackage.PATTERN_NODE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___EUNSET__ESTRUCTURALFEATURE = SDDPackage.PATTERN_NODE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___EINVOKE__EOPERATION_ELIST = SDDPackage.PATTERN_NODE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___GET_EXTENSION__ECLASS = SDDPackage.PATTERN_NODE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___PROVIDE_EXTENSION__ECLASS = SDDPackage.PATTERN_NODE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___GET_ANNOTATION__STRING = SDDPackage.PATTERN_NODE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE___PROVIDE_ANNOTATION__STRING = SDDPackage.PATTERN_NODE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Story Pattern Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE_OPERATION_COUNT = SDDPackage.PATTERN_NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryDecisionDiagram <em>Story Decision Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Decision Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryDecisionDiagram
	 * @generated
	 */
	EClass getStoryDecisionDiagram();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryPatternNode <em>Story Pattern Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryPatternNode
	 * @generated
	 */
	EClass getStoryPatternNode();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryPatternNode#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryPatternNode#getPattern()
	 * @see #getStoryPatternNode()
	 * @generated
	 */
	EReference getStoryPatternNode_Pattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicSDDFactory getBasicSDDFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.StoryDecisionDiagramImpl <em>Story Decision Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.StoryDecisionDiagramImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.BasicSDDPackageImpl#getStoryDecisionDiagram()
		 * @generated
		 */
		EClass STORY_DECISION_DIAGRAM = eINSTANCE.getStoryDecisionDiagram();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.StoryPatternNodeImpl <em>Story Pattern Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.StoryPatternNodeImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.BasicSDDPackageImpl#getStoryPatternNode()
		 * @generated
		 */
		EClass STORY_PATTERN_NODE = eINSTANCE.getStoryPatternNode();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_NODE__PATTERN = eINSTANCE.getStoryPatternNode_Pattern();

	}

} //BasicSDDPackage
