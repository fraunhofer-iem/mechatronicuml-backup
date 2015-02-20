/**
 */
package de.uni_paderborn.fujaba.simulink.model.reconfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import de.uni_paderborn.fujaba.simulink.model.SimulinkPackage;

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
 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.ReconfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ReconfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reconfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.uni_paderborn.fujaba.simulink.model.reconfiguration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reconfiguration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReconfigurationPackage eINSTANCE = de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.ReconfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.MultiTargetControlImpl <em>Multi Target Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.MultiTargetControlImpl
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.ReconfigurationPackageImpl#getMultiTargetControl()
	 * @generated
	 */
	int MULTI_TARGET_CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL__PARAMETERS = SimulinkPackage.BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL__ID = SimulinkPackage.BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL__PARENT = SimulinkPackage.BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL__NAME = SimulinkPackage.BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL__OUT_PORTS = SimulinkPackage.BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL__IN_PORTS = SimulinkPackage.BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL__INCOMING_LINES = SimulinkPackage.BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL__OUTGOING_LINES = SimulinkPackage.BLOCK__OUTGOING_LINES;

	/**
	 * The number of structural features of the '<em>Multi Target Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL_FEATURE_COUNT = SimulinkPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL___GET_PARAMETER__STRING = SimulinkPackage.BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL___GET_FULLY_QUALIFIED_NAME = SimulinkPackage.BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Multi Target Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TARGET_CONTROL_OPERATION_COUNT = SimulinkPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.MultiSourceControlImpl <em>Multi Source Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.MultiSourceControlImpl
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.ReconfigurationPackageImpl#getMultiSourceControl()
	 * @generated
	 */
	int MULTI_SOURCE_CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL__PARAMETERS = SimulinkPackage.BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL__ID = SimulinkPackage.BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL__PARENT = SimulinkPackage.BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL__NAME = SimulinkPackage.BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL__OUT_PORTS = SimulinkPackage.BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL__IN_PORTS = SimulinkPackage.BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL__INCOMING_LINES = SimulinkPackage.BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL__OUTGOING_LINES = SimulinkPackage.BLOCK__OUTGOING_LINES;

	/**
	 * The number of structural features of the '<em>Multi Source Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL_FEATURE_COUNT = SimulinkPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL___GET_PARAMETER__STRING = SimulinkPackage.BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL___GET_FULLY_QUALIFIED_NAME = SimulinkPackage.BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Multi Source Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SOURCE_CONTROL_OPERATION_COUNT = SimulinkPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.FadingComponentImpl <em>Fading Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.FadingComponentImpl
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.ReconfigurationPackageImpl#getFadingComponent()
	 * @generated
	 */
	int FADING_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__PARAMETERS = SimulinkPackage.BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__ID = SimulinkPackage.BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__PARENT = SimulinkPackage.BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__NAME = SimulinkPackage.BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__OUT_PORTS = SimulinkPackage.BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__IN_PORTS = SimulinkPackage.BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__INCOMING_LINES = SimulinkPackage.BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__OUTGOING_LINES = SimulinkPackage.BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__TIME = SimulinkPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fading Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_FEATURE_COUNT = SimulinkPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT___GET_PARAMETER__STRING = SimulinkPackage.BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT___GET_FULLY_QUALIFIED_NAME = SimulinkPackage.BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Fading Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_OPERATION_COUNT = SimulinkPackage.BLOCK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.MultiTargetControl <em>Multi Target Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Target Control</em>'.
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.MultiTargetControl
	 * @generated
	 */
	EClass getMultiTargetControl();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.MultiSourceControl <em>Multi Source Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Source Control</em>'.
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.MultiSourceControl
	 * @generated
	 */
	EClass getMultiSourceControl();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.FadingComponent <em>Fading Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fading Component</em>'.
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.FadingComponent
	 * @generated
	 */
	EClass getFadingComponent();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.FadingComponent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time</em>'.
	 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.FadingComponent#getTime()
	 * @see #getFadingComponent()
	 * @generated
	 */
	EAttribute getFadingComponent_Time();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReconfigurationFactory getReconfigurationFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.MultiTargetControlImpl <em>Multi Target Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.MultiTargetControlImpl
		 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.ReconfigurationPackageImpl#getMultiTargetControl()
		 * @generated
		 */
		EClass MULTI_TARGET_CONTROL = eINSTANCE.getMultiTargetControl();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.MultiSourceControlImpl <em>Multi Source Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.MultiSourceControlImpl
		 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.ReconfigurationPackageImpl#getMultiSourceControl()
		 * @generated
		 */
		EClass MULTI_SOURCE_CONTROL = eINSTANCE.getMultiSourceControl();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.FadingComponentImpl <em>Fading Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.FadingComponentImpl
		 * @see de.uni_paderborn.fujaba.simulink.model.reconfiguration.impl.ReconfigurationPackageImpl#getFadingComponent()
		 * @generated
		 */
		EClass FADING_COMPONENT = eINSTANCE.getFadingComponent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADING_COMPONENT__TIME = eINSTANCE.getFadingComponent_Time();

	}

} //ReconfigurationPackage
