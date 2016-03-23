/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TtccarplatooningFactoryImpl extends EFactoryImpl implements TtccarplatooningFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TtccarplatooningFactory init() {
		try {
			TtccarplatooningFactory theTtccarplatooningFactory = (TtccarplatooningFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/reachabilityAnalysis/ttcExample/0.1.0"); 
			if (theTtccarplatooningFactory != null) {
				return theTtccarplatooningFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TtccarplatooningFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtccarplatooningFactoryImpl() {
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
			case TtccarplatooningPackage.ENVIRONMENT: return createEnvironment();
			case TtccarplatooningPackage.CARPROCESS: return createCarprocess();
			case TtccarplatooningPackage.CAR_PARAMETER: return createCarParameter();
			case TtccarplatooningPackage.MESSAGE_QUEUE: return createMessageQueue();
			case TtccarplatooningPackage.MESSAGE: return createMessage();
			case TtccarplatooningPackage.STATECHART: return createStatechart();
			case TtccarplatooningPackage.STATE: return createState();
			case TtccarplatooningPackage.ACTIVE_STATE: return createActiveState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess createCarprocess() {
		CarprocessImpl carprocess = new CarprocessImpl();
		return carprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarParameter createCarParameter() {
		CarParameterImpl carParameter = new CarParameterImpl();
		return carParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageQueue createMessageQueue() {
		MessageQueueImpl messageQueue = new MessageQueueImpl();
		return messageQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statechart createStatechart() {
		StatechartImpl statechart = new StatechartImpl();
		return statechart;
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
	public ActiveState createActiveState() {
		ActiveStateImpl activeState = new ActiveStateImpl();
		return activeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtccarplatooningPackage getTtccarplatooningPackage() {
		return (TtccarplatooningPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TtccarplatooningPackage getPackage() {
		return TtccarplatooningPackage.eINSTANCE;
	}

} //TtccarplatooningFactoryImpl
