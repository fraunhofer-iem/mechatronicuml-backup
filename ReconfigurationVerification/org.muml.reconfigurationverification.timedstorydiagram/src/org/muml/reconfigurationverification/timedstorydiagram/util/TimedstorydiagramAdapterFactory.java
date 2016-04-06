/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.core.TypedElement;
import org.muml.reconfigurationverification.timedstorydiagram.*;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable;
import org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryPattern;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.Variable;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.ModifyingStoryNode;
import org.muml.storydiagram.activities.StoryNode;
import org.muml.storydiagram.calls.Callable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.StoryPattern;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage
 * @generated
 */
public class TimedstorydiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimedstorydiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedstorydiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimedstorydiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedstorydiagramSwitch<Adapter> modelSwitch =
		new TimedstorydiagramSwitch<Adapter>() {
			@Override
			public Adapter caseTimedGraphTransformationSystem(TimedGraphTransformationSystem object) {
				return createTimedGraphTransformationSystemAdapter();
			}
			@Override
			public Adapter caseTimedStoryDiagram(TimedStoryDiagram object) {
				return createTimedStoryDiagramAdapter();
			}
			@Override
			public Adapter caseInvariantStoryDiagram(InvariantStoryDiagram object) {
				return createInvariantStoryDiagramAdapter();
			}
			@Override
			public Adapter caseClockInstanceStoryDiagram(ClockInstanceStoryDiagram object) {
				return createClockInstanceStoryDiagramAdapter();
			}
			@Override
			public Adapter caseClockInstance(ClockInstance object) {
				return createClockInstanceAdapter();
			}
			@Override
			public Adapter caseClockInstanceConstraint(ClockInstanceConstraint object) {
				return createClockInstanceConstraintAdapter();
			}
			@Override
			public Adapter caseClockInstanceVariable(ClockInstanceVariable object) {
				return createClockInstanceVariableAdapter();
			}
			@Override
			public Adapter caseTimedStoryPattern(TimedStoryPattern object) {
				return createTimedStoryPatternAdapter();
			}
			@Override
			public Adapter caseTimedActivityNode(TimedActivityNode object) {
				return createTimedActivityNodeAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseCallable(Callable object) {
				return createCallableAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseAbstractVariable(AbstractVariable object) {
				return createAbstractVariableAdapter();
			}
			@Override
			public Adapter caseObjectVariable(ObjectVariable object) {
				return createObjectVariableAdapter();
			}
			@Override
			public Adapter caseStoryPattern(StoryPattern object) {
				return createStoryPatternAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseStoryNode(StoryNode object) {
				return createStoryNodeAdapter();
			}
			@Override
			public Adapter caseModifyingStoryNode(ModifyingStoryNode object) {
				return createModifyingStoryNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem <em>Timed Graph Transformation System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem
	 * @generated
	 */
	public Adapter createTimedGraphTransformationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram <em>Timed Story Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram
	 * @generated
	 */
	public Adapter createTimedStoryDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram <em>Invariant Story Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram
	 * @generated
	 */
	public Adapter createInvariantStoryDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram <em>Clock Instance Story Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram
	 * @generated
	 */
	public Adapter createClockInstanceStoryDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstance <em>Clock Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.ClockInstance
	 * @generated
	 */
	public Adapter createClockInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint <em>Clock Instance Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint
	 * @generated
	 */
	public Adapter createClockInstanceConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable <em>Clock Instance Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable
	 * @generated
	 */
	public Adapter createClockInstanceVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryPattern <em>Timed Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedStoryPattern
	 * @generated
	 */
	public Adapter createTimedStoryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode <em>Timed Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode
	 * @generated
	 */
	public Adapter createTimedActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.calls.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.calls.Callable
	 * @generated
	 */
	public Adapter createCallableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.activities.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.activities.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.patterns.AbstractVariable <em>Abstract Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.patterns.AbstractVariable
	 * @generated
	 */
	public Adapter createAbstractVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.patterns.ObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.patterns.ObjectVariable
	 * @generated
	 */
	public Adapter createObjectVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.patterns.StoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.patterns.StoryPattern
	 * @generated
	 */
	public Adapter createStoryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.activities.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.activities.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.activities.StoryNode <em>Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.activities.StoryNode
	 * @generated
	 */
	public Adapter createStoryNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.activities.ModifyingStoryNode <em>Modifying Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.activities.ModifyingStoryNode
	 * @generated
	 */
	public Adapter createModifyingStoryNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TimedstorydiagramAdapterFactory
