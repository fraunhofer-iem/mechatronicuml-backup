/**
 */
package instance;

import component.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.PortInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getPortInstance()
 * @model
 * @generated
 */
public interface PortInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Port)
	 * @see instance.InstancePackage#getPortInstance_Type()
	 * @model
	 * @generated
	 */
	Port getType();

	/**
	 * Sets the value of the '{@link instance.PortInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Port value);

} // PortInstance
