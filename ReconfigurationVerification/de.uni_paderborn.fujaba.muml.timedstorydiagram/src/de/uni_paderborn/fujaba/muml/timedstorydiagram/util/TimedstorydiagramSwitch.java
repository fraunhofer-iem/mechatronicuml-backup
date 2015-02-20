/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.timedstorydiagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;
import org.storydriven.core.TypedElement;
import org.storydriven.storydiagrams.Variable;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceStoryDiagram;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceVariable;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.InvariantStoryDiagram;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedActivityNode;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryDiagram;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryPattern;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage
 * @generated
 */
public class TimedstorydiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimedstorydiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedstorydiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = TimedstorydiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM: {
				TimedGraphTransformationSystem timedGraphTransformationSystem = (TimedGraphTransformationSystem)theEObject;
				T result = caseTimedGraphTransformationSystem(timedGraphTransformationSystem);
				if (result == null) result = caseNamedElement(timedGraphTransformationSystem);
				if (result == null) result = caseExtendableElement(timedGraphTransformationSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM: {
				TimedStoryDiagram timedStoryDiagram = (TimedStoryDiagram)theEObject;
				T result = caseTimedStoryDiagram(timedStoryDiagram);
				if (result == null) result = caseActivity(timedStoryDiagram);
				if (result == null) result = caseCallable(timedStoryDiagram);
				if (result == null) result = caseNamedElement(timedStoryDiagram);
				if (result == null) result = caseCommentableElement(timedStoryDiagram);
				if (result == null) result = caseExtendableElement(timedStoryDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM: {
				InvariantStoryDiagram invariantStoryDiagram = (InvariantStoryDiagram)theEObject;
				T result = caseInvariantStoryDiagram(invariantStoryDiagram);
				if (result == null) result = caseActivity(invariantStoryDiagram);
				if (result == null) result = caseCallable(invariantStoryDiagram);
				if (result == null) result = caseNamedElement(invariantStoryDiagram);
				if (result == null) result = caseCommentableElement(invariantStoryDiagram);
				if (result == null) result = caseExtendableElement(invariantStoryDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimedstorydiagramPackage.CLOCK_INSTANCE_STORY_DIAGRAM: {
				ClockInstanceStoryDiagram clockInstanceStoryDiagram = (ClockInstanceStoryDiagram)theEObject;
				T result = caseClockInstanceStoryDiagram(clockInstanceStoryDiagram);
				if (result == null) result = caseActivity(clockInstanceStoryDiagram);
				if (result == null) result = caseCallable(clockInstanceStoryDiagram);
				if (result == null) result = caseNamedElement(clockInstanceStoryDiagram);
				if (result == null) result = caseCommentableElement(clockInstanceStoryDiagram);
				if (result == null) result = caseExtendableElement(clockInstanceStoryDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimedstorydiagramPackage.CLOCK_INSTANCE: {
				ClockInstance clockInstance = (ClockInstance)theEObject;
				T result = caseClockInstance(clockInstance);
				if (result == null) result = caseNamedElement(clockInstance);
				if (result == null) result = caseExtendableElement(clockInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT: {
				ClockInstanceConstraint clockInstanceConstraint = (ClockInstanceConstraint)theEObject;
				T result = caseClockInstanceConstraint(clockInstanceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE: {
				ClockInstanceVariable clockInstanceVariable = (ClockInstanceVariable)theEObject;
				T result = caseClockInstanceVariable(clockInstanceVariable);
				if (result == null) result = caseObjectVariable(clockInstanceVariable);
				if (result == null) result = caseAbstractVariable(clockInstanceVariable);
				if (result == null) result = caseVariable(clockInstanceVariable);
				if (result == null) result = caseNamedElement(clockInstanceVariable);
				if (result == null) result = caseTypedElement(clockInstanceVariable);
				if (result == null) result = caseExtendableElement(clockInstanceVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimedstorydiagramPackage.TIMED_STORY_PATTERN: {
				TimedStoryPattern timedStoryPattern = (TimedStoryPattern)theEObject;
				T result = caseTimedStoryPattern(timedStoryPattern);
				if (result == null) result = caseStoryPattern(timedStoryPattern);
				if (result == null) result = caseCommentableElement(timedStoryPattern);
				if (result == null) result = caseExtendableElement(timedStoryPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimedstorydiagramPackage.TIMED_ACTIVITY_NODE: {
				TimedActivityNode timedActivityNode = (TimedActivityNode)theEObject;
				T result = caseTimedActivityNode(timedActivityNode);
				if (result == null) result = caseModifyingStoryNode(timedActivityNode);
				if (result == null) result = caseStoryNode(timedActivityNode);
				if (result == null) result = caseActivityNode(timedActivityNode);
				if (result == null) result = caseNamedElement(timedActivityNode);
				if (result == null) result = caseCommentableElement(timedActivityNode);
				if (result == null) result = caseExtendableElement(timedActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Graph Transformation System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Graph Transformation System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedGraphTransformationSystem(TimedGraphTransformationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Story Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedStoryDiagram(TimedStoryDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariant Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariant Story Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvariantStoryDiagram(InvariantStoryDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Instance Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Instance Story Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockInstanceStoryDiagram(ClockInstanceStoryDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockInstance(ClockInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Instance Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Instance Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockInstanceConstraint(ClockInstanceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Instance Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Instance Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockInstanceVariable(ClockInstanceVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Story Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Story Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedStoryPattern(TimedStoryPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedActivityNode(TimedActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallable(Callable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariable(AbstractVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectVariable(ObjectVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryPattern(StoryPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryNode(StoryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifying Story Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifying Story Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyingStoryNode(ModifyingStoryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TimedstorydiagramSwitch
