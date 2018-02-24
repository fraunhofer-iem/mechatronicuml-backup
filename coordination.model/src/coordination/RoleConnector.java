/**
 */
package coordination;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link coordination.RoleConnector#getConnectorQOSAssumptions <em>Connector QOS Assumptions</em>}</li>
 *   <li>{@link coordination.RoleConnector#getSource <em>Source</em>}</li>
 *   <li>{@link coordination.RoleConnector#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see coordination.CoordinationPackage#getRoleConnector()
 * @model
 * @generated
 */
public interface RoleConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector QOS Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector QOS Assumptions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector QOS Assumptions</em>' containment reference.
	 * @see #setConnectorQOSAssumptions(ConnectorQualityOfServiceAssumptions)
	 * @see coordination.CoordinationPackage#getRoleConnector_ConnectorQOSAssumptions()
	 * @model containment="true"
	 * @generated
	 */
	ConnectorQualityOfServiceAssumptions getConnectorQOSAssumptions();

	/**
	 * Sets the value of the '{@link coordination.RoleConnector#getConnectorQOSAssumptions <em>Connector QOS Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector QOS Assumptions</em>' containment reference.
	 * @see #getConnectorQOSAssumptions()
	 * @generated
	 */
	void setConnectorQOSAssumptions(ConnectorQualityOfServiceAssumptions value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Role)
	 * @see coordination.CoordinationPackage#getRoleConnector_Source()
	 * @model
	 * @generated
	 */
	Role getSource();

	/**
	 * Sets the value of the '{@link coordination.RoleConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Role value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Role)
	 * @see coordination.CoordinationPackage#getRoleConnector_Target()
	 * @model
	 * @generated
	 */
	Role getTarget();

	/**
	 * Sets the value of the '{@link coordination.RoleConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Role value);

} // RoleConnector
