/**
 */
package coordination;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Quality Of Service Assumptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link coordination.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}</li>
 *   <li>{@link coordination.ConnectorQualityOfServiceAssumptions#isPreserveMessageOrder <em>Preserve Message Order</em>}</li>
 * </ul>
 *
 * @see coordination.CoordinationPackage#getConnectorQualityOfServiceAssumptions()
 * @model
 * @generated
 */
public interface ConnectorQualityOfServiceAssumptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Loss Possible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Loss Possible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Loss Possible</em>' attribute.
	 * @see #setMessageLossPossible(boolean)
	 * @see coordination.CoordinationPackage#getConnectorQualityOfServiceAssumptions_MessageLossPossible()
	 * @model
	 * @generated
	 */
	boolean isMessageLossPossible();

	/**
	 * Sets the value of the '{@link coordination.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Loss Possible</em>' attribute.
	 * @see #isMessageLossPossible()
	 * @generated
	 */
	void setMessageLossPossible(boolean value);

	/**
	 * Returns the value of the '<em><b>Preserve Message Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preserve Message Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preserve Message Order</em>' attribute.
	 * @see #setPreserveMessageOrder(boolean)
	 * @see coordination.CoordinationPackage#getConnectorQualityOfServiceAssumptions_PreserveMessageOrder()
	 * @model
	 * @generated
	 */
	boolean isPreserveMessageOrder();

	/**
	 * Sets the value of the '{@link coordination.ConnectorQualityOfServiceAssumptions#isPreserveMessageOrder <em>Preserve Message Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preserve Message Order</em>' attribute.
	 * @see #isPreserveMessageOrder()
	 * @generated
	 */
	void setPreserveMessageOrder(boolean value);

} // ConnectorQualityOfServiceAssumptions
