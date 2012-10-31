/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

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
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/model/pattern/0.3.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleConnectorImpl <em>Role Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getRoleConnector()
	 * @generated
	 */
	int ROLE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__BEHAVIOR = CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__BIDIRECTIONAL = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__SOURCE = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__TARGET = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordination Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__COORDINATION_PATTERN = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Role Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR_FEATURE_COUNT = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.CoordinationPatternImpl <em>Coordination Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.CoordinationPatternImpl
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getCoordinationPattern()
	 * @generated
	 */
	int COORDINATION_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ANNOTATION = org.storydriven.core.CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__EXTENSION = org.storydriven.core.CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__NAME = org.storydriven.core.CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__CONSTRAINT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ROLES = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__CONNECTOR = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__PATTERN = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_FEATURE_COUNT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ANNOTATION = org.storydriven.core.CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EXTENSION = org.storydriven.core.CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = org.storydriven.core.CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONSTRAINT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__BEHAVIOR = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Role Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INCOMING_ROLE_CONNECTOR = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordination Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COORDINATION_PATTERN = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SENDER_MESSAGE_TYPES = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RECEIVER_MESSAGE_TYPES = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CARDINALITY = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PORT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ADAPTATION_BEHAVIOR = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_AND_ADAPTATION_BEHAVIOR = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ORDERED = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Outgoing Role Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OUTGOING_ROLE_CONNECTOR = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_CONNECTOR = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Multi Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_MULTI_ROLE = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RECEIVER_MESSAGE_BUFFER = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 15;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.MessageBufferImpl
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getMessageBuffer()
	 * @generated
	 */
	int MESSAGE_BUFFER = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__ANNOTATION = org.storydriven.core.CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__EXTENSION = org.storydriven.core.CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__NAME = org.storydriven.core.CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__COMMENT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__BUFFER_SIZE = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__MESSAGE_TYPE = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__ROLE = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER_FEATURE_COUNT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.ConnectorQualityOfServiceAssumptionsImpl <em>Connector Quality Of Service Assumptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.ConnectorQualityOfServiceAssumptionsImpl
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__ANNOTATION = org.storydriven.core.CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__EXTENSION = org.storydriven.core.CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__NAME = org.storydriven.core.CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Message Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Message Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Loss Possible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector Quality Of Service Assumptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS_FEATURE_COUNT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector
	 * @generated
	 */
	EClass getRoleConnector();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#isBidirectional()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EAttribute getRoleConnector_Bidirectional();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getSource()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getTarget()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_Target();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getCoordinationPattern()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_CoordinationPattern();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector Quality Of Service Assumptions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getConnectorQualityOfServiceAssumptions()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_ConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern
	 * @generated
	 */
	EClass getCoordinationPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRoles()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_Roles();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getConnector()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getPattern()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_Pattern();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getIncomingRoleConnector <em>Incoming Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Role Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getIncomingRoleConnector()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_IncomingRoleConnector();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleConnector()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RoleConnector();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#isIsMultiRole <em>Is Multi Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Role</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#isIsMultiRole()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_IsMultiRole();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receiver Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageBuffer()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ReceiverMessageBuffer();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer
	 * @generated
	 */
	EClass getMessageBuffer();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getBufferSize()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_BufferSize();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getMessageType()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_MessageType();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Role</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getRole()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_Role();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Quality Of Service Assumptions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions
	 * @generated
	 */
	EClass getConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions#getMinMessageDelay <em>Min Message Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Message Delay</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions#getMinMessageDelay()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EReference getConnectorQualityOfServiceAssumptions_MinMessageDelay();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay <em>Max Message Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Message Delay</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EReference getConnectorQualityOfServiceAssumptions_MaxMessageDelay();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Loss Possible</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions#isMessageLossPossible()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EAttribute getConnectorQualityOfServiceAssumptions_MessageLossPossible();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Pattern</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getCoordinationPattern()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_CoordinationPattern();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getSenderMessageTypes <em>Sender Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getSenderMessageTypes()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_SenderMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageTypes <em>Receiver Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageTypes()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ReceiverMessageTypes();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getCardinality()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Cardinality();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getPort()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Port();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getAdaptationBehavior <em>Adaptation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptation Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getAdaptationBehavior()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_AdaptationBehavior();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role And Adaptation Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleAndAdaptationBehavior()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RoleAndAdaptationBehavior();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#isOrdered()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Ordered();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getOutgoingRoleConnector <em>Outgoing Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing Role Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getOutgoingRoleConnector()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_OutgoingRoleConnector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternFactory getPatternFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleConnectorImpl <em>Role Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getRoleConnector()
		 * @generated
		 */
		EClass ROLE_CONNECTOR = eINSTANCE.getRoleConnector();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_CONNECTOR__BIDIRECTIONAL = eINSTANCE.getRoleConnector_Bidirectional();

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
		 * The meta object literal for the '<em><b>Coordination Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTOR__COORDINATION_PATTERN = eINSTANCE.getRoleConnector_CoordinationPattern();

		/**
		 * The meta object literal for the '<em><b>Connector Quality Of Service Assumptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = eINSTANCE.getRoleConnector_ConnectorQualityOfServiceAssumptions();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.CoordinationPatternImpl <em>Coordination Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.CoordinationPatternImpl
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getCoordinationPattern()
		 * @generated
		 */
		EClass COORDINATION_PATTERN = eINSTANCE.getCoordinationPattern();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__ROLES = eINSTANCE.getCoordinationPattern_Roles();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__CONNECTOR = eINSTANCE.getCoordinationPattern_Connector();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__PATTERN = eINSTANCE.getCoordinationPattern_Pattern();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Incoming Role Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INCOMING_ROLE_CONNECTOR = eINSTANCE.getRole_IncomingRoleConnector();

		/**
		 * The meta object literal for the '<em><b>Role Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_CONNECTOR = eINSTANCE.getRole_RoleConnector();

		/**
		 * The meta object literal for the '<em><b>Is Multi Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__IS_MULTI_ROLE = eINSTANCE.getRole_IsMultiRole();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RECEIVER_MESSAGE_BUFFER = eINSTANCE.getRole_ReceiverMessageBuffer();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.MessageBufferImpl
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getMessageBuffer()
		 * @generated
		 */
		EClass MESSAGE_BUFFER = eINSTANCE.getMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__BUFFER_SIZE = eINSTANCE.getMessageBuffer_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__MESSAGE_TYPE = eINSTANCE.getMessageBuffer_MessageType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__ROLE = eINSTANCE.getMessageBuffer_Role();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.ConnectorQualityOfServiceAssumptionsImpl <em>Connector Quality Of Service Assumptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.ConnectorQualityOfServiceAssumptionsImpl
		 * @see de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl#getConnectorQualityOfServiceAssumptions()
		 * @generated
		 */
		EClass CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = eINSTANCE.getConnectorQualityOfServiceAssumptions();

		/**
		 * The meta object literal for the '<em><b>Min Message Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY = eINSTANCE.getConnectorQualityOfServiceAssumptions_MinMessageDelay();

		/**
		 * The meta object literal for the '<em><b>Max Message Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY = eINSTANCE.getConnectorQualityOfServiceAssumptions_MaxMessageDelay();

		/**
		 * The meta object literal for the '<em><b>Message Loss Possible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE = eINSTANCE.getConnectorQualityOfServiceAssumptions_MessageLossPossible();

		/**
		 * The meta object literal for the '<em><b>Coordination Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__COORDINATION_PATTERN = eINSTANCE.getRole_CoordinationPattern();

		/**
		 * The meta object literal for the '<em><b>Sender Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SENDER_MESSAGE_TYPES = eINSTANCE.getRole_SenderMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RECEIVER_MESSAGE_TYPES = eINSTANCE.getRole_ReceiverMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CARDINALITY = eINSTANCE.getRole_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PORT = eINSTANCE.getRole_Port();

		/**
		 * The meta object literal for the '<em><b>Adaptation Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ADAPTATION_BEHAVIOR = eINSTANCE.getRole_AdaptationBehavior();

		/**
		 * The meta object literal for the '<em><b>Role And Adaptation Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_AND_ADAPTATION_BEHAVIOR = eINSTANCE.getRole_RoleAndAdaptationBehavior();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ORDERED = eINSTANCE.getRole_Ordered();

		/**
		 * The meta object literal for the '<em><b>Outgoing Role Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__OUTGOING_ROLE_CONNECTOR = eINSTANCE.getRole_OutgoingRoleConnector();

	}

} //PatternPackage
