/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.mumlcore.ExtendableElement;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.*;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedsdmPackage
 * @generated
 */
public class TimedsdmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimedsdmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedsdmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimedsdmPackage.eINSTANCE;
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
	protected TimedsdmSwitch<Adapter> modelSwitch =
		new TimedsdmSwitch<Adapter>() {
			@Override
			public Adapter caseTimedStepGraph(TimedStepGraph object) {
				return createTimedStepGraphAdapter();
			}
			@Override
			public Adapter caseTimedGTSDelayTransition(TimedGTSDelayTransition object) {
				return createTimedGTSDelayTransitionAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseReachabilityGraphState(ReachabilityGraphState object) {
				return createReachabilityGraphStateAdapter();
			}
			@Override
			public Adapter caseStepGraph(StepGraph object) {
				return createStepGraphAdapter();
			}
			@Override
			public Adapter caseReachabilityGraphTransition(ReachabilityGraphTransition object) {
				return createReachabilityGraphTransitionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedStepGraph <em>Timed Step Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedStepGraph
	 * @generated
	 */
	public Adapter createTimedStepGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedGTSDelayTransition <em>Timed GTS Delay Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedGTSDelayTransition
	 * @generated
	 */
	public Adapter createTimedGTSDelayTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.mumlcore.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.mumlcore.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState
	 * @generated
	 */
	public Adapter createReachabilityGraphStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph <em>Step Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph
	 * @generated
	 */
	public Adapter createStepGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition
	 * @generated
	 */
	public Adapter createReachabilityGraphTransitionAdapter() {
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

} //TimedsdmAdapterFactory
