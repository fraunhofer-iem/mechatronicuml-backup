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
