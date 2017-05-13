/**
 */
package realtimestatechart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import realtimestatechart.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartFactoryImpl extends EFactoryImpl implements RealtimestatechartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RealtimestatechartFactory init() {
		try {
			RealtimestatechartFactory theRealtimestatechartFactory = (RealtimestatechartFactory)EPackage.Registry.INSTANCE.getEFactory(RealtimestatechartPackage.eNS_URI);
			if (theRealtimestatechartFactory != null) {
				return theRealtimestatechartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RealtimestatechartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartFactoryImpl() {
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
			case RealtimestatechartPackage.REALTIMESTATECHART: return createRealtimestatechart();
			case RealtimestatechartPackage.STATE: return createState();
			case RealtimestatechartPackage.TRANSITION: return createTransition();
			case RealtimestatechartPackage.NAMED_ELEMENT: return createNamedElement();
			case RealtimestatechartPackage.STATE_ENTRY_POINT: return createStateEntryPoint();
			case RealtimestatechartPackage.STATE_EXIT_POINT: return createStateExitPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realtimestatechart createRealtimestatechart() {
		RealtimestatechartImpl realtimestatechart = new RealtimestatechartImpl();
		return realtimestatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEntryPoint createStateEntryPoint() {
		StateEntryPointImpl stateEntryPoint = new StateEntryPointImpl();
		return stateEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateExitPoint createStateExitPoint() {
		StateExitPointImpl stateExitPoint = new StateExitPointImpl();
		return stateExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartPackage getRealtimestatechartPackage() {
		return (RealtimestatechartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RealtimestatechartPackage getPackage() {
		return RealtimestatechartPackage.eINSTANCE;
	}

} //RealtimestatechartFactoryImpl
