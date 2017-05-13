/**
 */
package coordination;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see coordination.CoordinationFactory
 * @model kind="package"
 * @generated
 */
public interface CoordinationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "coordination";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://coordination";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "coordination";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoordinationPackage eINSTANCE = coordination.impl.CoordinationPackageImpl.init();

	/**
	 * The meta object id for the '{@link coordination.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coordination.impl.NamedElementImpl
	 * @see coordination.impl.CoordinationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link coordination.impl.CoordinationSpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coordination.impl.CoordinationSpecificationImpl
	 * @see coordination.impl.CoordinationPackageImpl#getCoordinationSpecification()
	 * @generated
	 */
	int COORDINATION_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SPECIFICATION__ROLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SPECIFICATION__ROLE_CONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SPECIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coordination.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coordination.impl.RoleImpl
	 * @see coordination.impl.CoordinationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coordination.impl.RoleConnectorImpl <em>Role Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coordination.impl.RoleConnectorImpl
	 * @see coordination.impl.CoordinationPackageImpl#getRoleConnector()
	 * @generated
	 */
	int ROLE_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Connector QOS Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Role Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link coordination.impl.ConnectorQualityOfServiceAssumptionsImpl <em>Connector Quality Of Service Assumptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coordination.impl.ConnectorQualityOfServiceAssumptionsImpl
	 * @see coordination.impl.CoordinationPackageImpl#getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Message Loss Possible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE = 0;

	/**
	 * The feature id for the '<em><b>Preserve Message Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER = 1;

	/**
	 * The number of structural features of the '<em>Connector Quality Of Service Assumptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connector Quality Of Service Assumptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link coordination.impl.CoordinationPatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coordination.impl.CoordinationPatternImpl
	 * @see coordination.impl.CoordinationPackageImpl#getCoordinationPattern()
	 * @generated
	 */
	int COORDINATION_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__NAME = COORDINATION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ROLES = COORDINATION_SPECIFICATION__ROLES;

	/**
	 * The feature id for the '<em><b>Role Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ROLE_CONNECTORS = COORDINATION_SPECIFICATION__ROLE_CONNECTORS;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_FEATURE_COUNT = COORDINATION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_OPERATION_COUNT = COORDINATION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coordination.impl.CoordinationProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coordination.impl.CoordinationProtocolImpl
	 * @see coordination.impl.CoordinationPackageImpl#getCoordinationProtocol()
	 * @generated
	 */
	int COORDINATION_PROTOCOL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__NAME = COORDINATION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ROLES = COORDINATION_SPECIFICATION__ROLES;

	/**
	 * The feature id for the '<em><b>Role Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ROLE_CONNECTORS = COORDINATION_SPECIFICATION__ROLE_CONNECTORS;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_FEATURE_COUNT = COORDINATION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPERATION_COUNT = COORDINATION_SPECIFICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link coordination.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see coordination.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link coordination.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see coordination.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link coordination.CoordinationSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see coordination.CoordinationSpecification
	 * @generated
	 */
	EClass getCoordinationSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link coordination.CoordinationSpecification#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see coordination.CoordinationSpecification#getRoles()
	 * @see #getCoordinationSpecification()
	 * @generated
	 */
	EReference getCoordinationSpecification_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link coordination.CoordinationSpecification#getRoleConnectors <em>Role Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Connectors</em>'.
	 * @see coordination.CoordinationSpecification#getRoleConnectors()
	 * @see #getCoordinationSpecification()
	 * @generated
	 */
	EReference getCoordinationSpecification_RoleConnectors();

	/**
	 * Returns the meta object for class '{@link coordination.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see coordination.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link coordination.RoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connector</em>'.
	 * @see coordination.RoleConnector
	 * @generated
	 */
	EClass getRoleConnector();

	/**
	 * Returns the meta object for the containment reference '{@link coordination.RoleConnector#getConnectorQOSAssumptions <em>Connector QOS Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector QOS Assumptions</em>'.
	 * @see coordination.RoleConnector#getConnectorQOSAssumptions()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_ConnectorQOSAssumptions();

	/**
	 * Returns the meta object for the reference '{@link coordination.RoleConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see coordination.RoleConnector#getSource()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link coordination.RoleConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see coordination.RoleConnector#getTarget()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_Target();

	/**
	 * Returns the meta object for class '{@link coordination.ConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Quality Of Service Assumptions</em>'.
	 * @see coordination.ConnectorQualityOfServiceAssumptions
	 * @generated
	 */
	EClass getConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the meta object for the attribute '{@link coordination.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Loss Possible</em>'.
	 * @see coordination.ConnectorQualityOfServiceAssumptions#isMessageLossPossible()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EAttribute getConnectorQualityOfServiceAssumptions_MessageLossPossible();

	/**
	 * Returns the meta object for the attribute '{@link coordination.ConnectorQualityOfServiceAssumptions#isPreserveMessageOrder <em>Preserve Message Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preserve Message Order</em>'.
	 * @see coordination.ConnectorQualityOfServiceAssumptions#isPreserveMessageOrder()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EAttribute getConnectorQualityOfServiceAssumptions_PreserveMessageOrder();

	/**
	 * Returns the meta object for class '{@link coordination.CoordinationPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see coordination.CoordinationPattern
	 * @generated
	 */
	EClass getCoordinationPattern();

	/**
	 * Returns the meta object for class '{@link coordination.CoordinationProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see coordination.CoordinationProtocol
	 * @generated
	 */
	EClass getCoordinationProtocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoordinationFactory getCoordinationFactory();

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
		 * The meta object literal for the '{@link coordination.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coordination.impl.NamedElementImpl
		 * @see coordination.impl.CoordinationPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link coordination.impl.CoordinationSpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coordination.impl.CoordinationSpecificationImpl
		 * @see coordination.impl.CoordinationPackageImpl#getCoordinationSpecification()
		 * @generated
		 */
		EClass COORDINATION_SPECIFICATION = eINSTANCE.getCoordinationSpecification();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SPECIFICATION__ROLES = eINSTANCE.getCoordinationSpecification_Roles();

		/**
		 * The meta object literal for the '<em><b>Role Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SPECIFICATION__ROLE_CONNECTORS = eINSTANCE.getCoordinationSpecification_RoleConnectors();

		/**
		 * The meta object literal for the '{@link coordination.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coordination.impl.RoleImpl
		 * @see coordination.impl.CoordinationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link coordination.impl.RoleConnectorImpl <em>Role Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coordination.impl.RoleConnectorImpl
		 * @see coordination.impl.CoordinationPackageImpl#getRoleConnector()
		 * @generated
		 */
		EClass ROLE_CONNECTOR = eINSTANCE.getRoleConnector();

		/**
		 * The meta object literal for the '<em><b>Connector QOS Assumptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS = eINSTANCE.getRoleConnector_ConnectorQOSAssumptions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTOR__SOURCE = eINSTANCE.getRoleConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTOR__TARGET = eINSTANCE.getRoleConnector_Target();

		/**
		 * The meta object literal for the '{@link coordination.impl.ConnectorQualityOfServiceAssumptionsImpl <em>Connector Quality Of Service Assumptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coordination.impl.ConnectorQualityOfServiceAssumptionsImpl
		 * @see coordination.impl.CoordinationPackageImpl#getConnectorQualityOfServiceAssumptions()
		 * @generated
		 */
		EClass CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = eINSTANCE.getConnectorQualityOfServiceAssumptions();

		/**
		 * The meta object literal for the '<em><b>Message Loss Possible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE = eINSTANCE.getConnectorQualityOfServiceAssumptions_MessageLossPossible();

		/**
		 * The meta object literal for the '<em><b>Preserve Message Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER = eINSTANCE.getConnectorQualityOfServiceAssumptions_PreserveMessageOrder();

		/**
		 * The meta object literal for the '{@link coordination.impl.CoordinationPatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coordination.impl.CoordinationPatternImpl
		 * @see coordination.impl.CoordinationPackageImpl#getCoordinationPattern()
		 * @generated
		 */
		EClass COORDINATION_PATTERN = eINSTANCE.getCoordinationPattern();

		/**
		 * The meta object literal for the '{@link coordination.impl.CoordinationProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coordination.impl.CoordinationProtocolImpl
		 * @see coordination.impl.CoordinationPackageImpl#getCoordinationProtocol()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL = eINSTANCE.getCoordinationProtocol();

	}

} //CoordinationPackage
