/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.muml.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.simulink.msglib.MsglibFactory
 * @model kind="package"
 * @generated
 */
public interface MsglibPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "msglib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/simulink/msglib/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "msglib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsglibPackage eINSTANCE = org.muml.simulink.msglib.impl.MsglibPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.impl.CommunicationSwitchImpl <em>Communication Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.impl.CommunicationSwitchImpl
	 * @see org.muml.simulink.msglib.impl.MsglibPackageImpl#getCommunicationSwitch()
	 * @generated
	 */
	int COMMUNICATION_SWITCH = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__PARAMETERS = SimulinkPackage.BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__ID = SimulinkPackage.BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__PARENT = SimulinkPackage.BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__NAME = SimulinkPackage.BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__OUT_PORTS = SimulinkPackage.BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__IN_PORTS = SimulinkPackage.BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__INCOMING_LINES = SimulinkPackage.BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__OUTGOING_LINES = SimulinkPackage.BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH__DEBUG = SimulinkPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH_FEATURE_COUNT = SimulinkPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH___GET_PARAMETER__STRING = SimulinkPackage.BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH___GET_FULLY_QUALIFIED_NAME = SimulinkPackage.BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Communication Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SWITCH_OPERATION_COUNT = SimulinkPackage.BLOCK_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.impl.LinkLayerImpl <em>Link Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.impl.LinkLayerImpl
	 * @see org.muml.simulink.msglib.impl.MsglibPackageImpl#getLinkLayer()
	 * @generated
	 */
	int LINK_LAYER = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__PARAMETERS = SimulinkPackage.BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__ID = SimulinkPackage.BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__PARENT = SimulinkPackage.BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__NAME = SimulinkPackage.BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__OUT_PORTS = SimulinkPackage.BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__IN_PORTS = SimulinkPackage.BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__INCOMING_LINES = SimulinkPackage.BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__OUTGOING_LINES = SimulinkPackage.BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Delay Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__DELAY_MIN = SimulinkPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__DELAY_MAX = SimulinkPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Loss Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__MESSAGE_LOSS_PROBABILITY = SimulinkPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Retransmission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__MESSAGE_RETRANSMISSION = SimulinkPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Buffer Overflow Possible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__BUFFER_OVERFLOW_POSSIBLE = SimulinkPackage.BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__BUFFER_SIZE = SimulinkPackage.BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__SOURCE_BUFFER_SIZE = SimulinkPackage.BLOCK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Message Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER__MESSAGE_MAPPING = SimulinkPackage.BLOCK_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Link Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER_FEATURE_COUNT = SimulinkPackage.BLOCK_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER___GET_PARAMETER__STRING = SimulinkPackage.BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER___GET_FULLY_QUALIFIED_NAME = SimulinkPackage.BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Link Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LAYER_OPERATION_COUNT = SimulinkPackage.BLOCK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.CommunicationSwitch <em>Communication Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Switch</em>'.
	 * @see org.muml.simulink.msglib.CommunicationSwitch
	 * @generated
	 */
	EClass getCommunicationSwitch();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.CommunicationSwitch#getDebug <em>Debug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug</em>'.
	 * @see org.muml.simulink.msglib.CommunicationSwitch#getDebug()
	 * @see #getCommunicationSwitch()
	 * @generated
	 */
	EAttribute getCommunicationSwitch_Debug();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.LinkLayer <em>Link Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Layer</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer
	 * @generated
	 */
	EClass getLinkLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.LinkLayer#getDelayMin <em>Delay Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Min</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer#getDelayMin()
	 * @see #getLinkLayer()
	 * @generated
	 */
	EAttribute getLinkLayer_DelayMin();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.LinkLayer#getDelayMax <em>Delay Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Max</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer#getDelayMax()
	 * @see #getLinkLayer()
	 * @generated
	 */
	EAttribute getLinkLayer_DelayMax();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.LinkLayer#getMessageLossProbability <em>Message Loss Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Loss Probability</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer#getMessageLossProbability()
	 * @see #getLinkLayer()
	 * @generated
	 */
	EAttribute getLinkLayer_MessageLossProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.LinkLayer#isMessageRetransmission <em>Message Retransmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Retransmission</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer#isMessageRetransmission()
	 * @see #getLinkLayer()
	 * @generated
	 */
	EAttribute getLinkLayer_MessageRetransmission();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.LinkLayer#isBufferOverflowPossible <em>Buffer Overflow Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Overflow Possible</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer#isBufferOverflowPossible()
	 * @see #getLinkLayer()
	 * @generated
	 */
	EAttribute getLinkLayer_BufferOverflowPossible();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.LinkLayer#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer#getBufferSize()
	 * @see #getLinkLayer()
	 * @generated
	 */
	EAttribute getLinkLayer_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.LinkLayer#getSourceBufferSize <em>Source Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Buffer Size</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer#getSourceBufferSize()
	 * @see #getLinkLayer()
	 * @generated
	 */
	EAttribute getLinkLayer_SourceBufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.LinkLayer#getMessageMapping <em>Message Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Mapping</em>'.
	 * @see org.muml.simulink.msglib.LinkLayer#getMessageMapping()
	 * @see #getLinkLayer()
	 * @generated
	 */
	EAttribute getLinkLayer_MessageMapping();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MsglibFactory getMsglibFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.simulink.msglib.impl.CommunicationSwitchImpl <em>Communication Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.impl.CommunicationSwitchImpl
		 * @see org.muml.simulink.msglib.impl.MsglibPackageImpl#getCommunicationSwitch()
		 * @generated
		 */
		EClass COMMUNICATION_SWITCH = eINSTANCE.getCommunicationSwitch();
		/**
		 * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SWITCH__DEBUG = eINSTANCE.getCommunicationSwitch_Debug();
		/**
		 * The meta object literal for the '{@link org.muml.simulink.msglib.impl.LinkLayerImpl <em>Link Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.impl.LinkLayerImpl
		 * @see org.muml.simulink.msglib.impl.MsglibPackageImpl#getLinkLayer()
		 * @generated
		 */
		EClass LINK_LAYER = eINSTANCE.getLinkLayer();
		/**
		 * The meta object literal for the '<em><b>Delay Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LAYER__DELAY_MIN = eINSTANCE.getLinkLayer_DelayMin();
		/**
		 * The meta object literal for the '<em><b>Delay Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LAYER__DELAY_MAX = eINSTANCE.getLinkLayer_DelayMax();
		/**
		 * The meta object literal for the '<em><b>Message Loss Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LAYER__MESSAGE_LOSS_PROBABILITY = eINSTANCE.getLinkLayer_MessageLossProbability();
		/**
		 * The meta object literal for the '<em><b>Message Retransmission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LAYER__MESSAGE_RETRANSMISSION = eINSTANCE.getLinkLayer_MessageRetransmission();
		/**
		 * The meta object literal for the '<em><b>Buffer Overflow Possible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LAYER__BUFFER_OVERFLOW_POSSIBLE = eINSTANCE.getLinkLayer_BufferOverflowPossible();
		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LAYER__BUFFER_SIZE = eINSTANCE.getLinkLayer_BufferSize();
		/**
		 * The meta object literal for the '<em><b>Source Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LAYER__SOURCE_BUFFER_SIZE = eINSTANCE.getLinkLayer_SourceBufferSize();
		/**
		 * The meta object literal for the '<em><b>Message Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LAYER__MESSAGE_MAPPING = eINSTANCE.getLinkLayer_MessageMapping();

	}

} //MsglibPackage
