/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.storydiagrams.activities.ActivitiesPackage;

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
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowFactory
 * @model kind="package"
 * @generated
 */
public interface ControlflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controlflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/componentstorydiagram/controlflow/0.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controlflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlflowPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryDiagramImpl <em>Component Story Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryDiagramImpl
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStoryDiagram()
	 * @generated
	 */
	int COMPONENT_STORY_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__ANNOTATION = ActivitiesPackage.ACTIVITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__EXTENSION = ActivitiesPackage.ACTIVITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__COMMENT = ActivitiesPackage.ACTIVITY__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__IN_PARAMETER = ActivitiesPackage.ACTIVITY__IN_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__OUT_PARAMETER = ActivitiesPackage.ACTIVITY__OUT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__CONTAINED_PARAMETERS = ActivitiesPackage.ACTIVITY__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__NAME = ActivitiesPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__OWNING_OPERATION = ActivitiesPackage.ACTIVITY__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Activity Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__OWNED_ACTIVITY_EDGE = ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__PRECONDITION = ActivitiesPackage.ACTIVITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__OWNED_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__PARAMETERS = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM__RETURN_PARAMETERS = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Story Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_DIAGRAM_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl <em>Component Story Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStoryNode()
	 * @generated
	 */
	int COMPONENT_STORY_NODE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__ANNOTATION = ActivitiesPackage.ACTIVITY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__EXTENSION = ActivitiesPackage.ACTIVITY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__NAME = ActivitiesPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__COMMENT = ActivitiesPackage.ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OUTGOING = ActivitiesPackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OWNING_ACTIVITY = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OWNING_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__INCOMING = ActivitiesPackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Component Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Story Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStopNodeImpl <em>Component Stop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStopNodeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStopNode()
	 * @generated
	 */
	int COMPONENT_STOP_NODE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE__ANNOTATION = ActivitiesPackage.ACTIVITY_NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE__EXTENSION = ActivitiesPackage.ACTIVITY_NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE__NAME = ActivitiesPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE__COMMENT = ActivitiesPackage.ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE__OUTGOING = ActivitiesPackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE__OWNING_ACTIVITY = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE__OWNING_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE__INCOMING = ActivitiesPackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Component Stop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOP_NODE_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryDiagram <em>Component Story Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryDiagram
	 * @generated
	 */
	EClass getComponentStoryDiagram();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode <em>Component Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode
	 * @generated
	 */
	EClass getComponentStoryNode();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode#getComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Story Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode#getComponentStoryPattern()
	 * @see #getComponentStoryNode()
	 * @generated
	 */
	EReference getComponentStoryNode_ComponentStoryPattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStopNode <em>Component Stop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Stop Node</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStopNode
	 * @generated
	 */
	EClass getComponentStopNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlflowFactory getControlflowFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryDiagramImpl <em>Component Story Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryDiagramImpl
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStoryDiagram()
		 * @generated
		 */
		EClass COMPONENT_STORY_DIAGRAM = eINSTANCE.getComponentStoryDiagram();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl <em>Component Story Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStoryNode()
		 * @generated
		 */
		EClass COMPONENT_STORY_NODE = eINSTANCE.getComponentStoryNode();

		/**
		 * The meta object literal for the '<em><b>Component Story Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN = eINSTANCE.getComponentStoryNode_ComponentStoryPattern();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStopNodeImpl <em>Component Stop Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStopNodeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowPackageImpl#getComponentStopNode()
		 * @generated
		 */
		EClass COMPONENT_STOP_NODE = eINSTANCE.getComponentStopNode();

	}

} //ControlflowPackage
