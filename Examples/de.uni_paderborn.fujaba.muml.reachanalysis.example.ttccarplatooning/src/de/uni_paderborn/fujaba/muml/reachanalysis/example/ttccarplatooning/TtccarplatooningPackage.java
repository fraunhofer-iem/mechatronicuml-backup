/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.TtccarplatooningFactory
 * @model kind="package"
 * @generated
 */
public interface TtccarplatooningPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ttccarplatooning";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/reachabilityAnalysis/ttcExample/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ttccarplatooning";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TtccarplatooningPackage eINSTANCE = de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.EnvironmentImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Max Num Of Cars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__MAX_NUM_OF_CARS = 0;

	/**
	 * The feature id for the '<em><b>Cars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CARS = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.CarprocessImpl <em>Carprocess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.CarprocessImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getCarprocess()
	 * @generated
	 */
	int CARPROCESS = 1;

	/**
	 * The feature id for the '<em><b>Cur State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS__CUR_STATE = 0;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS__QUEUE = 1;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS__STATECHART = 2;

	/**
	 * The feature id for the '<em><b>Follower</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS__FOLLOWER = 3;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS__LEADER = 4;

	/**
	 * The feature id for the '<em><b>Aux</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS__AUX = 5;

	/**
	 * The feature id for the '<em><b>Bldr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS__BLDR = 6;

	/**
	 * The feature id for the '<em><b>Car Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS__CAR_PARAMETER = 7;

	/**
	 * The number of structural features of the '<em>Carprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARPROCESS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.CarParameterImpl <em>Car Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.CarParameterImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getCarParameter()
	 * @generated
	 */
	int CAR_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Car</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_PARAMETER__CAR = 1;

	/**
	 * The number of structural features of the '<em>Car Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageQueueImpl <em>Message Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageQueueImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getMessageQueue()
	 * @generated
	 */
	int MESSAGE_QUEUE = 3;

	/**
	 * The feature id for the '<em><b>Carprocess</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE__CARPROCESS = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE__MESSAGES = 1;

	/**
	 * The number of structural features of the '<em>Message Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.StatechartImpl <em>Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.StatechartImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getStatechart()
	 * @generated
	 */
	int STATECHART = 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART__STATES = 0;

	/**
	 * The number of structural features of the '<em>Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.StateImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getState()
	 * @generated
	 */
	int STATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATECHART = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.ActiveStateImpl <em>Active State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.ActiveStateImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getActiveState()
	 * @generated
	 */
	int ACTIVE_STATE = 7;

	/**
	 * The feature id for the '<em><b>Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE__IN = 1;

	/**
	 * The number of structural features of the '<em>Active State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment#getMaxNumOfCars <em>Max Num Of Cars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Num Of Cars</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment#getMaxNumOfCars()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_MaxNumOfCars();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment#getCars <em>Cars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cars</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment#getCars()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Cars();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess <em>Carprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carprocess</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess
	 * @generated
	 */
	EClass getCarprocess();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getCurState <em>Cur State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cur State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getCurState()
	 * @see #getCarprocess()
	 * @generated
	 */
	EReference getCarprocess_CurState();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queue</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getQueue()
	 * @see #getCarprocess()
	 * @generated
	 */
	EReference getCarprocess_Queue();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getStatechart()
	 * @see #getCarprocess()
	 * @generated
	 */
	EReference getCarprocess_Statechart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getFollower <em>Follower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Follower</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getFollower()
	 * @see #getCarprocess()
	 * @generated
	 */
	EReference getCarprocess_Follower();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leader</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getLeader()
	 * @see #getCarprocess()
	 * @generated
	 */
	EReference getCarprocess_Leader();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getAux <em>Aux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aux</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getAux()
	 * @see #getCarprocess()
	 * @generated
	 */
	EReference getCarprocess_Aux();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getBldr <em>Bldr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bldr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getBldr()
	 * @see #getCarprocess()
	 * @generated
	 */
	EReference getCarprocess_Bldr();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getCarParameter <em>Car Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Car Parameter</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess#getCarParameter()
	 * @see #getCarprocess()
	 * @generated
	 */
	EReference getCarprocess_CarParameter();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.CarParameter <em>Car Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car Parameter</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.CarParameter
	 * @generated
	 */
	EClass getCarParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.CarParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.CarParameter#getName()
	 * @see #getCarParameter()
	 * @generated
	 */
	EAttribute getCarParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.CarParameter#getCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Car</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.CarParameter#getCar()
	 * @see #getCarParameter()
	 * @generated
	 */
	EReference getCarParameter_Car();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.MessageQueue <em>Message Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Queue</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.MessageQueue
	 * @generated
	 */
	EClass getMessageQueue();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.MessageQueue#getCarprocess <em>Carprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Carprocess</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.MessageQueue#getCarprocess()
	 * @see #getMessageQueue()
	 * @generated
	 */
	EReference getMessageQueue_Carprocess();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.MessageQueue#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.MessageQueue#getMessages()
	 * @see #getMessageQueue()
	 * @generated
	 */
	EReference getMessageQueue_Messages();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Message#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Message#getParameters()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Statechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Statechart
	 * @generated
	 */
	EClass getStatechart();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Statechart#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Statechart#getStates()
	 * @see #getStatechart()
	 * @generated
	 */
	EReference getStatechart_States();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.State#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.State#getStatechart()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Statechart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.ActiveState <em>Active State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.ActiveState
	 * @generated
	 */
	EClass getActiveState();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.ActiveState#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.ActiveState#getActive()
	 * @see #getActiveState()
	 * @generated
	 */
	EReference getActiveState_Active();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.ActiveState#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.ActiveState#getIn()
	 * @see #getActiveState()
	 * @generated
	 */
	EReference getActiveState_In();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TtccarplatooningFactory getTtccarplatooningFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.EnvironmentImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Max Num Of Cars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__MAX_NUM_OF_CARS = eINSTANCE.getEnvironment_MaxNumOfCars();

		/**
		 * The meta object literal for the '<em><b>Cars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__CARS = eINSTANCE.getEnvironment_Cars();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.CarprocessImpl <em>Carprocess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.CarprocessImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getCarprocess()
		 * @generated
		 */
		EClass CARPROCESS = eINSTANCE.getCarprocess();

		/**
		 * The meta object literal for the '<em><b>Cur State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARPROCESS__CUR_STATE = eINSTANCE.getCarprocess_CurState();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARPROCESS__QUEUE = eINSTANCE.getCarprocess_Queue();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARPROCESS__STATECHART = eINSTANCE.getCarprocess_Statechart();

		/**
		 * The meta object literal for the '<em><b>Follower</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARPROCESS__FOLLOWER = eINSTANCE.getCarprocess_Follower();

		/**
		 * The meta object literal for the '<em><b>Leader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARPROCESS__LEADER = eINSTANCE.getCarprocess_Leader();

		/**
		 * The meta object literal for the '<em><b>Aux</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARPROCESS__AUX = eINSTANCE.getCarprocess_Aux();

		/**
		 * The meta object literal for the '<em><b>Bldr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARPROCESS__BLDR = eINSTANCE.getCarprocess_Bldr();

		/**
		 * The meta object literal for the '<em><b>Car Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARPROCESS__CAR_PARAMETER = eINSTANCE.getCarprocess_CarParameter();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.CarParameterImpl <em>Car Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.CarParameterImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getCarParameter()
		 * @generated
		 */
		EClass CAR_PARAMETER = eINSTANCE.getCarParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR_PARAMETER__NAME = eINSTANCE.getCarParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Car</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR_PARAMETER__CAR = eINSTANCE.getCarParameter_Car();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageQueueImpl <em>Message Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageQueueImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getMessageQueue()
		 * @generated
		 */
		EClass MESSAGE_QUEUE = eINSTANCE.getMessageQueue();

		/**
		 * The meta object literal for the '<em><b>Carprocess</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_QUEUE__CARPROCESS = eINSTANCE.getMessageQueue_Carprocess();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_QUEUE__MESSAGES = eINSTANCE.getMessageQueue_Messages();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PARAMETERS = eINSTANCE.getMessage_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.StatechartImpl <em>Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.StatechartImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getStatechart()
		 * @generated
		 */
		EClass STATECHART = eINSTANCE.getStatechart();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATECHART__STATES = eINSTANCE.getStatechart_States();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.StateImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATECHART = eINSTANCE.getState_Statechart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.ActiveStateImpl <em>Active State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.ActiveStateImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.TtccarplatooningPackageImpl#getActiveState()
		 * @generated
		 */
		EClass ACTIVE_STATE = eINSTANCE.getActiveState();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_STATE__ACTIVE = eINSTANCE.getActiveState_Active();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_STATE__IN = eINSTANCE.getActiveState_In();

	}

} //TtccarplatooningPackage
