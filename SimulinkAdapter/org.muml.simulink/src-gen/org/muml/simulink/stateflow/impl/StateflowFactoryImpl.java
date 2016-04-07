/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.Event;
import org.muml.simulink.stateflow.History;
import org.muml.simulink.stateflow.Junction;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.StateflowElement;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.stateflow.StateflowPackage;
import org.muml.simulink.stateflow.SubStateType;
import org.muml.simulink.stateflow.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateflowFactoryImpl extends EFactoryImpl implements StateflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateflowFactory init() {
		try {
			StateflowFactory theStateflowFactory = (StateflowFactory)EPackage.Registry.INSTANCE.getEFactory(StateflowPackage.eNS_URI);
			if (theStateflowFactory != null) {
				return theStateflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateflowFactoryImpl() {
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
			case StateflowPackage.STATEFLOW_MACHINE: return (EObject)createStateflowMachine();
			case StateflowPackage.CHART: return (EObject)createChart();
			case StateflowPackage.STATEFLOW_ELEMENT: return (EObject)createStateflowElement();
			case StateflowPackage.STATE: return (EObject)createState();
			case StateflowPackage.TRANSITION: return (EObject)createTransition();
			case StateflowPackage.JUNCTION: return (EObject)createJunction();
			case StateflowPackage.EVENT: return (EObject)createEvent();
			case StateflowPackage.HISTORY: return (EObject)createHistory();
			case StateflowPackage.EMBEDDED_FUNCTION: return (EObject)createEmbeddedFunction();
			case StateflowPackage.ACTION: return (EObject)createAction();
			case StateflowPackage.DATA: return (EObject)createData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StateflowPackage.SUB_STATE_TYPE:
				return createSubStateTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StateflowPackage.SUB_STATE_TYPE:
				return convertSubStateTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateflowMachine createStateflowMachine() {
		StateflowMachineImpl stateflowMachine = new StateflowMachineImpl();
		return stateflowMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart createChart() {
		ChartImpl chart = new ChartImpl();
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateflowElement createStateflowElement() {
		StateflowElementImpl stateflowElement = new StateflowElementImpl();
		return stateflowElement;
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
	public Junction createJunction() {
		JunctionImpl junction = new JunctionImpl();
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History createHistory() {
		HistoryImpl history = new HistoryImpl();
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedFunction createEmbeddedFunction() {
		EmbeddedFunctionImpl embeddedFunction = new EmbeddedFunctionImpl();
		return embeddedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubStateType createSubStateTypeFromString(EDataType eDataType, String initialValue) {
		SubStateType result = SubStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateflowPackage getStateflowPackage() {
		return (StateflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateflowPackage getPackage() {
		return StateflowPackage.eINSTANCE;
	}

} //StateflowFactoryImpl
