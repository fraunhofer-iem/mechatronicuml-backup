/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage;

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
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentsddPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentsdd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/verification/sdd/componentsdd/0.4.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentsdd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsddPackage eINSTANCE = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentsddPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentStoryDecisionDiagramImpl <em>Component Story Decision Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentStoryDecisionDiagramImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentsddPackageImpl#getComponentStoryDecisionDiagram()
	 * @generated
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__ANNOTATION = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__EXTENSION = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__NAME = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__NODES = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__EDGES = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EDGES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__COMMENT = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconfigurable Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invariant SDD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM__INVARIANT_SDD = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Story Decision Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DECISION_DIAGRAM_FEATURE_COUNT = SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentStoryPatternNodeImpl <em>Component Story Pattern Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentStoryPatternNodeImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentsddPackageImpl#getComponentStoryPatternNode()
	 * @generated
	 */
	int COMPONENT_STORY_PATTERN_NODE = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_NODE__OUTGOING_EDGES = SDDPackage.PATTERN_NODE__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_NODE__INCOMING_EDGES = SDDPackage.PATTERN_NODE__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_NODE__ANNOTATION = SDDPackage.PATTERN_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_NODE__EXTENSION = SDDPackage.PATTERN_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_NODE__NAME = SDDPackage.PATTERN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_NODE__TYPE = SDDPackage.PATTERN_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_NODE__PATTERN = SDDPackage.PATTERN_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Story Pattern Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_PATTERN_NODE_FEATURE_COUNT = SDDPackage.PATTERN_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.EvaluateComponentSDDExpressionImpl <em>Evaluate Component SDD Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.EvaluateComponentSDDExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentsddPackageImpl#getEvaluateComponentSDDExpression()
	 * @generated
	 */
	int EVALUATE_COMPONENT_SDD_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_COMPONENT_SDD_EXPRESSION__ANNOTATION = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_COMPONENT_SDD_EXPRESSION__EXTENSION = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_COMPONENT_SDD_EXPRESSION__COMMENT = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Component SDD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluate Component SDD Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_COMPONENT_SDD_EXPRESSION_FEATURE_COUNT = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram <em>Component Story Decision Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Decision Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram
	 * @generated
	 */
	EClass getComponentStoryDecisionDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram#isInvariantSDD <em>Invariant SDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invariant SDD</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram#isInvariantSDD()
	 * @see #getComponentStoryDecisionDiagram()
	 * @generated
	 */
	EAttribute getComponentStoryDecisionDiagram_InvariantSDD();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode <em>Component Story Pattern Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Pattern Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode
	 * @generated
	 */
	EClass getComponentStoryPatternNode();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode#getPattern()
	 * @see #getComponentStoryPatternNode()
	 * @generated
	 */
	EReference getComponentStoryPatternNode_Pattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression <em>Evaluate Component SDD Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Component SDD Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression
	 * @generated
	 */
	EClass getEvaluateComponentSDDExpression();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression#getComponentSDD <em>Component SDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component SDD</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression#getComponentSDD()
	 * @see #getEvaluateComponentSDDExpression()
	 * @generated
	 */
	EReference getEvaluateComponentSDDExpression_ComponentSDD();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsddFactory getComponentsddFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentStoryDecisionDiagramImpl <em>Component Story Decision Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentStoryDecisionDiagramImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentsddPackageImpl#getComponentStoryDecisionDiagram()
		 * @generated
		 */
		EClass COMPONENT_STORY_DECISION_DIAGRAM = eINSTANCE.getComponentStoryDecisionDiagram();

		/**
		 * The meta object literal for the '<em><b>Invariant SDD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STORY_DECISION_DIAGRAM__INVARIANT_SDD = eINSTANCE.getComponentStoryDecisionDiagram_InvariantSDD();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentStoryPatternNodeImpl <em>Component Story Pattern Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentStoryPatternNodeImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentsddPackageImpl#getComponentStoryPatternNode()
		 * @generated
		 */
		EClass COMPONENT_STORY_PATTERN_NODE = eINSTANCE.getComponentStoryPatternNode();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STORY_PATTERN_NODE__PATTERN = eINSTANCE.getComponentStoryPatternNode_Pattern();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.EvaluateComponentSDDExpressionImpl <em>Evaluate Component SDD Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.EvaluateComponentSDDExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentsddPackageImpl#getEvaluateComponentSDDExpression()
		 * @generated
		 */
		EClass EVALUATE_COMPONENT_SDD_EXPRESSION = eINSTANCE.getEvaluateComponentSDDExpression();

		/**
		 * The meta object literal for the '<em><b>Component SDD</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD = eINSTANCE.getEvaluateComponentSDDExpression_ComponentSDD();

	}

} //ComponentsddPackage
