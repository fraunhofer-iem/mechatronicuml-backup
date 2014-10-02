/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.timedstorydiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

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
 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TimedstorydiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timedstorydiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/timedstorydiagram/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.uni_paderborn.fujaba.muml.timedstorydiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimedstorydiagramPackage eINSTANCE = de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedGraphTransformationSystemImpl <em>Timed Graph Transformation System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedGraphTransformationSystemImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getTimedGraphTransformationSystem()
	 * @generated
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clock Instance Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Graph Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Helper Story Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Graph Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Timed Graph Transformation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GRAPH_TRANSFORMATION_SYSTEM_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedStoryDiagramImpl <em>Timed Story Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedStoryDiagramImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getTimedStoryDiagram()
	 * @generated
	 */
	int TIMED_STORY_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__ANNOTATION = ActivitiesPackage.ACTIVITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__EXTENSION = ActivitiesPackage.ACTIVITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__COMMENT = ActivitiesPackage.ACTIVITY__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__IN_PARAMETER = ActivitiesPackage.ACTIVITY__IN_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__OUT_PARAMETER = ActivitiesPackage.ACTIVITY__OUT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__CONTAINED_PARAMETERS = ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__NAME = ActivitiesPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__OWNING_OPERATION = ActivitiesPackage.ACTIVITY__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Activity Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__OWNED_ACTIVITY_EDGE = ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__PRECONDITION = ActivitiesPackage.ACTIVITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__OWNED_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Clock Inst Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__RESETS = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__MIN_DURATION = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM__MAX_DURATION = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Timed Story Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_DIAGRAM_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.InvariantStoryDiagramImpl <em>Invariant Story Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.InvariantStoryDiagramImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getInvariantStoryDiagram()
	 * @generated
	 */
	int INVARIANT_STORY_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__ANNOTATION = ActivitiesPackage.ACTIVITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__EXTENSION = ActivitiesPackage.ACTIVITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__COMMENT = ActivitiesPackage.ACTIVITY__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__IN_PARAMETER = ActivitiesPackage.ACTIVITY__IN_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__OUT_PARAMETER = ActivitiesPackage.ACTIVITY__OUT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__CONTAINED_PARAMETERS = ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__NAME = ActivitiesPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__OWNING_OPERATION = ActivitiesPackage.ACTIVITY__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Activity Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__OWNED_ACTIVITY_EDGE = ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__PRECONDITION = ActivitiesPackage.ACTIVITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__OWNED_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Clock Inst Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invariant Story Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_STORY_DIAGRAM_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceStoryDiagramImpl <em>Clock Instance Story Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceStoryDiagramImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getClockInstanceStoryDiagram()
	 * @generated
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__ANNOTATION = ActivitiesPackage.ACTIVITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__EXTENSION = ActivitiesPackage.ACTIVITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__COMMENT = ActivitiesPackage.ACTIVITY__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__IN_PARAMETER = ActivitiesPackage.ACTIVITY__IN_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__OUT_PARAMETER = ActivitiesPackage.ACTIVITY__OUT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__CONTAINED_PARAMETERS = ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__NAME = ActivitiesPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__OWNING_OPERATION = ActivitiesPackage.ACTIVITY__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Activity Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__OWNED_ACTIVITY_EDGE = ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__PRECONDITION = ActivitiesPackage.ACTIVITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM__OWNED_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE;

	/**
	 * The number of structural features of the '<em>Clock Instance Story Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceImpl <em>Clock Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getClockInstance()
	 * @generated
	 */
	int CLOCK_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE__ID = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE__HAS_NODE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clock Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceConstraintImpl <em>Clock Instance Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getClockInstanceConstraint()
	 * @generated
	 */
	int CLOCK_INSTANCE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Clock Instance Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_CONSTRAINT__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_CONSTRAINT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Clock Instance Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceVariableImpl <em>Clock Instance Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getClockInstanceVariable()
	 * @generated
	 */
	int CLOCK_INSTANCE_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__ANNOTATION = PatternsPackage.OBJECT_VARIABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__EXTENSION = PatternsPackage.OBJECT_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__TYPE = PatternsPackage.OBJECT_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__GENERIC_TYPE = PatternsPackage.OBJECT_VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__VARIABLE_NAME = PatternsPackage.OBJECT_VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__NAME = PatternsPackage.OBJECT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__PATTERN = PatternsPackage.OBJECT_VARIABLE__PATTERN;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__BINDING_STATE = PatternsPackage.OBJECT_VARIABLE__BINDING_STATE;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__BINDING_EXPRESSION = PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__CONSTRAINT = PatternsPackage.OBJECT_VARIABLE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__INCOMING_LINK = PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__OUTGOING_LINK = PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK;

	/**
	 * The feature id for the '<em><b>Link Order Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__LINK_ORDER_CONSTRAINT = PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__BINDING_SEMANTICS = PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__BINDING_OPERATOR = PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__ATTRIBUTE_ASSIGNMENT = PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__CLASSIFIER = PatternsPackage.OBJECT_VARIABLE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Clock Instance Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS = PatternsPackage.OBJECT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Instance Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_VARIABLE_FEATURE_COUNT = PatternsPackage.OBJECT_VARIABLE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedStoryPatternImpl <em>Timed Story Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedStoryPatternImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getTimedStoryPattern()
	 * @generated
	 */
	int TIMED_STORY_PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__ANNOTATION = PatternsPackage.STORY_PATTERN__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__EXTENSION = PatternsPackage.STORY_PATTERN__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__COMMENT = PatternsPackage.STORY_PATTERN__COMMENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__VARIABLE = PatternsPackage.STORY_PATTERN__VARIABLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__CONSTRAINT = PatternsPackage.STORY_PATTERN__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Link Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__LINK_VARIABLE = PatternsPackage.STORY_PATTERN__LINK_VARIABLE;

	/**
	 * The feature id for the '<em><b>Parent Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__PARENT_PATTERN = PatternsPackage.STORY_PATTERN__PARENT_PATTERN;

	/**
	 * The feature id for the '<em><b>Contained Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__CONTAINED_PATTERN = PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__BINDING_SEMANTICS = PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__TEMPLATE_SIGNATURE = PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Non Modifying Story Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN__NON_MODIFYING_STORY_PATTERN = PatternsPackage.STORY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STORY_PATTERN_FEATURE_COUNT = PatternsPackage.STORY_PATTERN_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedActivityNodeImpl <em>Timed Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedActivityNodeImpl
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getTimedActivityNode()
	 * @generated
	 */
	int TIMED_ACTIVITY_NODE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__ANNOTATION = ActivitiesPackage.MODIFYING_STORY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__EXTENSION = ActivitiesPackage.MODIFYING_STORY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__NAME = ActivitiesPackage.MODIFYING_STORY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__COMMENT = ActivitiesPackage.MODIFYING_STORY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__OUTGOING = ActivitiesPackage.MODIFYING_STORY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__OWNING_ACTIVITY = ActivitiesPackage.MODIFYING_STORY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__OWNING_ACTIVITY_NODE = ActivitiesPackage.MODIFYING_STORY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__INCOMING = ActivitiesPackage.MODIFYING_STORY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__FOR_EACH = ActivitiesPackage.MODIFYING_STORY_NODE__FOR_EACH;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__STORY_PATTERN = ActivitiesPackage.MODIFYING_STORY_NODE__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__OWNED_RULE = ActivitiesPackage.MODIFYING_STORY_NODE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Owned Timed Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE__OWNED_TIMED_STORY_PATTERN = ActivitiesPackage.MODIFYING_STORY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_NODE_FEATURE_COUNT = ActivitiesPackage.MODIFYING_STORY_NODE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem <em>Timed Graph Transformation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Graph Transformation System</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem
	 * @generated
	 */
	EClass getTimedGraphTransformationSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getRules()
	 * @see #getTimedGraphTransformationSystem()
	 * @generated
	 */
	EReference getTimedGraphTransformationSystem_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getInvariants()
	 * @see #getTimedGraphTransformationSystem()
	 * @generated
	 */
	EReference getTimedGraphTransformationSystem_Invariants();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getClockInstanceRules <em>Clock Instance Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Instance Rules</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getClockInstanceRules()
	 * @see #getTimedGraphTransformationSystem()
	 * @generated
	 */
	EReference getTimedGraphTransformationSystem_ClockInstanceRules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getInitialGraphObjects <em>Initial Graph Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Graph Objects</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getInitialGraphObjects()
	 * @see #getTimedGraphTransformationSystem()
	 * @generated
	 */
	EReference getTimedGraphTransformationSystem_InitialGraphObjects();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getUnchangeableNodes <em>Unchangeable Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Nodes</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getUnchangeableNodes()
	 * @see #getTimedGraphTransformationSystem()
	 * @generated
	 */
	EReference getTimedGraphTransformationSystem_UnchangeableNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getHelperStoryDiagrams <em>Helper Story Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper Story Diagrams</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getHelperStoryDiagrams()
	 * @see #getTimedGraphTransformationSystem()
	 * @generated
	 */
	EReference getTimedGraphTransformationSystem_HelperStoryDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getTypeGraphObjects <em>Type Graph Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Graph Objects</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem#getTypeGraphObjects()
	 * @see #getTimedGraphTransformationSystem()
	 * @generated
	 */
	EReference getTimedGraphTransformationSystem_TypeGraphObjects();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram <em>Timed Story Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Story Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram
	 * @generated
	 */
	EClass getTimedStoryDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram#getClockInstConstraint <em>Clock Inst Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Inst Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram#getClockInstConstraint()
	 * @see #getTimedStoryDiagram()
	 * @generated
	 */
	EReference getTimedStoryDiagram_ClockInstConstraint();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram#getResets <em>Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resets</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram#getResets()
	 * @see #getTimedStoryDiagram()
	 * @generated
	 */
	EReference getTimedStoryDiagram_Resets();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram#getMinDuration <em>Min Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Duration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram#getMinDuration()
	 * @see #getTimedStoryDiagram()
	 * @generated
	 */
	EAttribute getTimedStoryDiagram_MinDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram#getMaxDuration <em>Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram#getMaxDuration()
	 * @see #getTimedStoryDiagram()
	 * @generated
	 */
	EAttribute getTimedStoryDiagram_MaxDuration();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.InvariantStoryDiagram <em>Invariant Story Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant Story Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.InvariantStoryDiagram
	 * @generated
	 */
	EClass getInvariantStoryDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.InvariantStoryDiagram#getClockInstConstraint <em>Clock Inst Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clock Inst Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.InvariantStoryDiagram#getClockInstConstraint()
	 * @see #getInvariantStoryDiagram()
	 * @generated
	 */
	EReference getInvariantStoryDiagram_ClockInstConstraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceStoryDiagram <em>Clock Instance Story Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Instance Story Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceStoryDiagram
	 * @generated
	 */
	EClass getClockInstanceStoryDiagram();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance <em>Clock Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance
	 * @generated
	 */
	EClass getClockInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance#getId()
	 * @see #getClockInstance()
	 * @generated
	 */
	EAttribute getClockInstance_Id();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance#getHasNode <em>Has Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance#getHasNode()
	 * @see #getClockInstance()
	 * @generated
	 */
	EReference getClockInstance_HasNode();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint <em>Clock Instance Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Instance Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint
	 * @generated
	 */
	EClass getClockInstanceConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getClockInstanceVariable <em>Clock Instance Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock Instance Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getClockInstanceVariable()
	 * @see #getClockInstanceConstraint()
	 * @generated
	 */
	EReference getClockInstanceConstraint_ClockInstanceVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getOperator()
	 * @see #getClockInstanceConstraint()
	 * @generated
	 */
	EAttribute getClockInstanceConstraint_Operator();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getValue()
	 * @see #getClockInstanceConstraint()
	 * @generated
	 */
	EAttribute getClockInstanceConstraint_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceVariable <em>Clock Instance Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Instance Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceVariable
	 * @generated
	 */
	EClass getClockInstanceVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceVariable#getClockInstanceConstraints <em>Clock Instance Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Instance Constraints</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceVariable#getClockInstanceConstraints()
	 * @see #getClockInstanceVariable()
	 * @generated
	 */
	EReference getClockInstanceVariable_ClockInstanceConstraints();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryPattern <em>Timed Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Story Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryPattern
	 * @generated
	 */
	EClass getTimedStoryPattern();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryPattern#isNonModifyingStoryPattern <em>Non Modifying Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Modifying Story Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryPattern#isNonModifyingStoryPattern()
	 * @see #getTimedStoryPattern()
	 * @generated
	 */
	EAttribute getTimedStoryPattern_NonModifyingStoryPattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedActivityNode <em>Timed Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Activity Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedActivityNode
	 * @generated
	 */
	EClass getTimedActivityNode();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedActivityNode#getOwnedTimedStoryPattern <em>Owned Timed Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Timed Story Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedActivityNode#getOwnedTimedStoryPattern()
	 * @see #getTimedActivityNode()
	 * @generated
	 */
	EReference getTimedActivityNode_OwnedTimedStoryPattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimedstorydiagramFactory getTimedstorydiagramFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedGraphTransformationSystemImpl <em>Timed Graph Transformation System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedGraphTransformationSystemImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getTimedGraphTransformationSystem()
		 * @generated
		 */
		EClass TIMED_GRAPH_TRANSFORMATION_SYSTEM = eINSTANCE.getTimedGraphTransformationSystem();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES = eINSTANCE.getTimedGraphTransformationSystem_Rules();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS = eINSTANCE.getTimedGraphTransformationSystem_Invariants();

		/**
		 * The meta object literal for the '<em><b>Clock Instance Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES = eINSTANCE.getTimedGraphTransformationSystem_ClockInstanceRules();

		/**
		 * The meta object literal for the '<em><b>Initial Graph Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS = eINSTANCE.getTimedGraphTransformationSystem_InitialGraphObjects();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES = eINSTANCE.getTimedGraphTransformationSystem_UnchangeableNodes();

		/**
		 * The meta object literal for the '<em><b>Helper Story Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS = eINSTANCE.getTimedGraphTransformationSystem_HelperStoryDiagrams();

		/**
		 * The meta object literal for the '<em><b>Type Graph Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS = eINSTANCE.getTimedGraphTransformationSystem_TypeGraphObjects();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedStoryDiagramImpl <em>Timed Story Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedStoryDiagramImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getTimedStoryDiagram()
		 * @generated
		 */
		EClass TIMED_STORY_DIAGRAM = eINSTANCE.getTimedStoryDiagram();

		/**
		 * The meta object literal for the '<em><b>Clock Inst Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT = eINSTANCE.getTimedStoryDiagram_ClockInstConstraint();

		/**
		 * The meta object literal for the '<em><b>Resets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_STORY_DIAGRAM__RESETS = eINSTANCE.getTimedStoryDiagram_Resets();

		/**
		 * The meta object literal for the '<em><b>Min Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_STORY_DIAGRAM__MIN_DURATION = eINSTANCE.getTimedStoryDiagram_MinDuration();

		/**
		 * The meta object literal for the '<em><b>Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_STORY_DIAGRAM__MAX_DURATION = eINSTANCE.getTimedStoryDiagram_MaxDuration();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.InvariantStoryDiagramImpl <em>Invariant Story Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.InvariantStoryDiagramImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getInvariantStoryDiagram()
		 * @generated
		 */
		EClass INVARIANT_STORY_DIAGRAM = eINSTANCE.getInvariantStoryDiagram();

		/**
		 * The meta object literal for the '<em><b>Clock Inst Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT = eINSTANCE.getInvariantStoryDiagram_ClockInstConstraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceStoryDiagramImpl <em>Clock Instance Story Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceStoryDiagramImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getClockInstanceStoryDiagram()
		 * @generated
		 */
		EClass CLOCK_INSTANCE_STORY_DIAGRAM = eINSTANCE.getClockInstanceStoryDiagram();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceImpl <em>Clock Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getClockInstance()
		 * @generated
		 */
		EClass CLOCK_INSTANCE = eINSTANCE.getClockInstance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_INSTANCE__ID = eINSTANCE.getClockInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Has Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_INSTANCE__HAS_NODE = eINSTANCE.getClockInstance_HasNode();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceConstraintImpl <em>Clock Instance Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getClockInstanceConstraint()
		 * @generated
		 */
		EClass CLOCK_INSTANCE_CONSTRAINT = eINSTANCE.getClockInstanceConstraint();

		/**
		 * The meta object literal for the '<em><b>Clock Instance Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE = eINSTANCE.getClockInstanceConstraint_ClockInstanceVariable();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_INSTANCE_CONSTRAINT__OPERATOR = eINSTANCE.getClockInstanceConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_INSTANCE_CONSTRAINT__VALUE = eINSTANCE.getClockInstanceConstraint_Value();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceVariableImpl <em>Clock Instance Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.ClockInstanceVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getClockInstanceVariable()
		 * @generated
		 */
		EClass CLOCK_INSTANCE_VARIABLE = eINSTANCE.getClockInstanceVariable();

		/**
		 * The meta object literal for the '<em><b>Clock Instance Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS = eINSTANCE.getClockInstanceVariable_ClockInstanceConstraints();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedStoryPatternImpl <em>Timed Story Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedStoryPatternImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getTimedStoryPattern()
		 * @generated
		 */
		EClass TIMED_STORY_PATTERN = eINSTANCE.getTimedStoryPattern();

		/**
		 * The meta object literal for the '<em><b>Non Modifying Story Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_STORY_PATTERN__NON_MODIFYING_STORY_PATTERN = eINSTANCE.getTimedStoryPattern_NonModifyingStoryPattern();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedActivityNodeImpl <em>Timed Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedActivityNodeImpl
		 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.impl.TimedstorydiagramPackageImpl#getTimedActivityNode()
		 * @generated
		 */
		EClass TIMED_ACTIVITY_NODE = eINSTANCE.getTimedActivityNode();

		/**
		 * The meta object literal for the '<em><b>Owned Timed Story Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTIVITY_NODE__OWNED_TIMED_STORY_PATTERN = eINSTANCE.getTimedActivityNode_OwnedTimedStoryPattern();

	}

} //TimedstorydiagramPackage
