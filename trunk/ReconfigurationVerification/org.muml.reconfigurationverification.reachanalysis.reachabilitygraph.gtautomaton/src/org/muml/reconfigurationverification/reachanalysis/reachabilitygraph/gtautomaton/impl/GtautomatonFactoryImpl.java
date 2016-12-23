/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.*;

import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GtautomatonFactoryImpl extends EFactoryImpl implements GtautomatonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GtautomatonFactory init() {
		try {
			GtautomatonFactory theGtautomatonFactory = (GtautomatonFactory)EPackage.Registry.INSTANCE.getEFactory(GtautomatonPackage.eNS_URI);
			if (theGtautomatonFactory != null) {
				return theGtautomatonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GtautomatonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtautomatonFactoryImpl() {
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
			case GtautomatonPackage.GT_STEP_GRAPH: return createGtStepGraph();
			case GtautomatonPackage.OBJECT_IDENTIFIER: return createObjectIdentifier();
			case GtautomatonPackage.EOBJECT_TO_IDENTIFIER: return (EObject)createEObjectToIdentifier();
			case GtautomatonPackage.IDENTIFIER_TO_EOBJECT: return (EObject)createIdentifierToEObject();
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION: return createGtAutomatonTransition();
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT: return createGtAutomatonClockConstraint();
			case GtautomatonPackage.GT_AUTOMATON: return createGtAutomaton();
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER: return (EObject)createClockInstanceStoryDiagramToIdentifier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtStepGraph createGtStepGraph() {
		GtStepGraphImpl gtStepGraph = new GtStepGraphImpl();
		return gtStepGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIdentifier createObjectIdentifier() {
		ObjectIdentifierImpl objectIdentifier = new ObjectIdentifierImpl();
		return objectIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EObject, String> createEObjectToIdentifier() {
		EObjectToIdentifierImpl eObjectToIdentifier = new EObjectToIdentifierImpl();
		return eObjectToIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EObject> createIdentifierToEObject() {
		IdentifierToEObjectImpl identifierToEObject = new IdentifierToEObjectImpl();
		return identifierToEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtAutomatonTransition createGtAutomatonTransition() {
		GtAutomatonTransitionImpl gtAutomatonTransition = new GtAutomatonTransitionImpl();
		return gtAutomatonTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtAutomatonClockConstraint createGtAutomatonClockConstraint() {
		GtAutomatonClockConstraintImpl gtAutomatonClockConstraint = new GtAutomatonClockConstraintImpl();
		return gtAutomatonClockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtAutomaton createGtAutomaton() {
		GtAutomatonImpl gtAutomaton = new GtAutomatonImpl();
		return gtAutomaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ClockInstanceStoryDiagram, EList<String>> createClockInstanceStoryDiagramToIdentifier() {
		ClockInstanceStoryDiagramToIdentifierImpl clockInstanceStoryDiagramToIdentifier = new ClockInstanceStoryDiagramToIdentifierImpl();
		return clockInstanceStoryDiagramToIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtautomatonPackage getGtautomatonPackage() {
		return (GtautomatonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GtautomatonPackage getPackage() {
		return GtautomatonPackage.eINSTANCE;
	}

} //GtautomatonFactoryImpl
