/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.reachanalysis.reachabilitygraph.ActionTransition;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.mumlcore.ExtendableElement;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.*;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage
 * @generated
 */
public class SdmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SdmPackage.eINSTANCE;
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
	protected SdmSwitch<Adapter> modelSwitch =
		new SdmSwitch<Adapter>() {
			@Override
			public Adapter caseStepGraph(StepGraph object) {
				return createStepGraphAdapter();
			}
			@Override
			public Adapter caseSDMTransition(SDMTransition object) {
				return createSDMTransitionAdapter();
			}
			@Override
			public Adapter caseIndexEntry(Map.Entry<EObject, EObject> object) {
				return createIndexEntryAdapter();
			}
			@Override
			public Adapter caseSuccessorStepGraphs(SuccessorStepGraphs object) {
				return createSuccessorStepGraphsAdapter();
			}
			@Override
			public Adapter caseGraphTransformationSystem(GraphTransformationSystem object) {
				return createGraphTransformationSystemAdapter();
			}
			@Override
			public Adapter caseSDMReachabilityGraph(SDMReachabilityGraph object) {
				return createSDMReachabilityGraphAdapter();
			}
			@Override
			public Adapter caseMatchingEntry(Map.Entry<String, EObject> object) {
				return createMatchingEntryAdapter();
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
			public Adapter caseReachabilityGraphTransition(ReachabilityGraphTransition object) {
				return createReachabilityGraphTransitionAdapter();
			}
			@Override
			public Adapter caseActionTransition(ActionTransition object) {
				return createActionTransitionAdapter();
			}
			@Override
			public Adapter caseReachabilityGraph(ReachabilityGraph object) {
				return createReachabilityGraphAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition <em>SDM Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition
	 * @generated
	 */
	public Adapter createSDMTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createIndexEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs <em>Successor Step Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs
	 * @generated
	 */
	public Adapter createSuccessorStepGraphsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem <em>Graph Transformation System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem
	 * @generated
	 */
	public Adapter createGraphTransformationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph <em>SDM Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph
	 * @generated
	 */
	public Adapter createSDMReachabilityGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Matching Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createMatchingEntryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.muml.core.reachanalysis.reachabilitygraph.ActionTransition <em>Action Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ActionTransition
	 * @generated
	 */
	public Adapter createActionTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph <em>Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph
	 * @generated
	 */
	public Adapter createReachabilityGraphAdapter() {
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

} //SdmAdapterFactory
