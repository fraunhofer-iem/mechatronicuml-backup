/**
 */
package coordination;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link coordination.CoordinationSpecification#getRoles <em>Roles</em>}</li>
 *   <li>{@link coordination.CoordinationSpecification#getRoleConnectors <em>Role Connectors</em>}</li>
 * </ul>
 *
 * @see coordination.CoordinationPackage#getCoordinationSpecification()
 * @model
 * @generated
 */
public interface CoordinationSpecification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link coordination.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see coordination.CoordinationPackage#getCoordinationSpecification_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Role Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link coordination.RoleConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Connectors</em>' containment reference list.
	 * @see coordination.CoordinationPackage#getCoordinationSpecification_RoleConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleConnector> getRoleConnectors();

} // CoordinationSpecification
