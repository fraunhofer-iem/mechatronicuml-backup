/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramFactory;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedstorydiagramFactoryImpl extends EFactoryImpl implements TimedstorydiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimedstorydiagramFactory init() {
		try {
			TimedstorydiagramFactory theTimedstorydiagramFactory = (TimedstorydiagramFactory)EPackage.Registry.INSTANCE.getEFactory(TimedstorydiagramPackage.eNS_URI);
			if (theTimedstorydiagramFactory != null) {
				return theTimedstorydiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimedstorydiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedstorydiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM: return createTimedGraphTransformationSystem();
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM: return createTimedStoryDiagram();
			case TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM: return createInvariantStoryDiagram();
			case TimedstorydiagramPackage.CLOCK_INSTANCE_STORY_DIAGRAM: return createClockInstanceStoryDiagram();
			case TimedstorydiagramPackage.CLOCK_INSTANCE: return createClockInstance();
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT: return createClockInstanceConstraint();
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE: return createClockInstanceVariable();
			case TimedstorydiagramPackage.TIMED_STORY_PATTERN: return createTimedStoryPattern();
			case TimedstorydiagramPackage.TIMED_ACTIVITY_NODE: return createTimedActivityNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedGraphTransformationSystem createTimedGraphTransformationSystem() {
		TimedGraphTransformationSystemImpl timedGraphTransformationSystem = new TimedGraphTransformationSystemImpl();
		return timedGraphTransformationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStoryDiagram createTimedStoryDiagram() {
		TimedStoryDiagramImpl timedStoryDiagram = new TimedStoryDiagramImpl();
		return timedStoryDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvariantStoryDiagram createInvariantStoryDiagram() {
		InvariantStoryDiagramImpl invariantStoryDiagram = new InvariantStoryDiagramImpl();
		return invariantStoryDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceStoryDiagram createClockInstanceStoryDiagram() {
		ClockInstanceStoryDiagramImpl clockInstanceStoryDiagram = new ClockInstanceStoryDiagramImpl();
		return clockInstanceStoryDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstance createClockInstance() {
		ClockInstanceImpl clockInstance = new ClockInstanceImpl();
		return clockInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceConstraint createClockInstanceConstraint() {
		ClockInstanceConstraintImpl clockInstanceConstraint = new ClockInstanceConstraintImpl();
		return clockInstanceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceVariable createClockInstanceVariable() {
		ClockInstanceVariableImpl clockInstanceVariable = new ClockInstanceVariableImpl();
		return clockInstanceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStoryPattern createTimedStoryPattern() {
		TimedStoryPatternImpl timedStoryPattern = new TimedStoryPatternImpl();
		return timedStoryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedActivityNode createTimedActivityNode() {
		TimedActivityNodeImpl timedActivityNode = new TimedActivityNodeImpl();
		return timedActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedstorydiagramPackage getTimedstorydiagramPackage() {
		return (TimedstorydiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimedstorydiagramPackage getPackage() {
		return TimedstorydiagramPackage.eINSTANCE;
	}

} //TimedstorydiagramFactoryImpl
