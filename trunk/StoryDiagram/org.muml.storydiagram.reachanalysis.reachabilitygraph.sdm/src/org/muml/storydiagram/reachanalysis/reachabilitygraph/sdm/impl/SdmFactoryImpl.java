/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.*;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdmFactoryImpl extends EFactoryImpl implements SdmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SdmFactory init() {
		try {
			SdmFactory theSdmFactory = (SdmFactory)EPackage.Registry.INSTANCE.getEFactory(SdmPackage.eNS_URI);
			if (theSdmFactory != null) {
				return theSdmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SdmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdmFactoryImpl() {
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
			case SdmPackage.STEP_GRAPH: return createStepGraph();
			case SdmPackage.SDM_TRANSITION: return createSDMTransition();
			case SdmPackage.INDEX_ENTRY: return (EObject)createIndexEntry();
			case SdmPackage.SUCCESSOR_STEP_GRAPHS: return createSuccessorStepGraphs();
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM: return createGraphTransformationSystem();
			case SdmPackage.SDM_REACHABILITY_GRAPH: return createSDMReachabilityGraph();
			case SdmPackage.MATCHING_ENTRY: return (EObject)createMatchingEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepGraph createStepGraph() {
		StepGraphImpl stepGraph = new StepGraphImpl();
		return stepGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDMTransition createSDMTransition() {
		SDMTransitionImpl sdmTransition = new SDMTransitionImpl();
		return sdmTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EObject, EObject> createIndexEntry() {
		IndexEntryImpl indexEntry = new IndexEntryImpl();
		return indexEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessorStepGraphs createSuccessorStepGraphs() {
		SuccessorStepGraphsImpl successorStepGraphs = new SuccessorStepGraphsImpl();
		return successorStepGraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphTransformationSystem createGraphTransformationSystem() {
		GraphTransformationSystemImpl graphTransformationSystem = new GraphTransformationSystemImpl();
		return graphTransformationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDMReachabilityGraph createSDMReachabilityGraph() {
		SDMReachabilityGraphImpl sdmReachabilityGraph = new SDMReachabilityGraphImpl();
		return sdmReachabilityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EObject> createMatchingEntry() {
		MatchingEntryImpl matchingEntry = new MatchingEntryImpl();
		return matchingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdmPackage getSdmPackage() {
		return (SdmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SdmPackage getPackage() {
		return SdmPackage.eINSTANCE;
	}

} //SdmFactoryImpl
