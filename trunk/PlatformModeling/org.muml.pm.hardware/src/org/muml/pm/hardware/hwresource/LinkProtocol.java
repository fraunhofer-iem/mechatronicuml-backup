/**
 */
package org.muml.pm.hardware.hwresource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a link protocol used by link media and link ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.LinkProtocol#getLinkProtocol <em>Link Protocol</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getLinkProtocol()
 * @model
 * @generated
 */
public interface LinkProtocol extends CommunicationProtocol {
	/**
	 * Returns the value of the '<em><b>Link Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwresource.LinkProtocolKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The link protocol type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Protocol</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.LinkProtocolKind
	 * @see #setLinkProtocol(LinkProtocolKind)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getLinkProtocol_LinkProtocol()
	 * @model required="true"
	 * @generated
	 */
	LinkProtocolKind getLinkProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.LinkProtocol#getLinkProtocol <em>Link Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Protocol</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.LinkProtocolKind
	 * @see #getLinkProtocol()
	 * @generated
	 */
	void setLinkProtocol(LinkProtocolKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (linkProtocol == null) {\n\t\t\treturn linkProtocol.toString();\n\t\t}\n\t\treturn super.toString();'"
	 * @generated
	 */
	String toString();

} // LinkProtocol
