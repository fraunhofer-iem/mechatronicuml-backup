/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.OperationResults#getSlack <em>Slack</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.OperationResults#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getOperationResults()
 * @model extendedMetaData="name='Operation_Results' kind='elementOnly'"
 * @generated
 */
public interface OperationResults extends EObject {
	/**
	 * Returns the value of the '<em><b>Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slack</em>' containment reference.
	 * @see #setSlack(Slack)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getOperationResults_Slack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Slack' namespace='##targetNamespace'"
	 * @generated
	 */
	Slack getSlack();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.OperationResults#getSlack <em>Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slack</em>' containment reference.
	 * @see #getSlack()
	 * @generated
	 */
	void setSlack(Slack value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getOperationResults_Name()
	 * @model dataType="es.unican.mast.xmlmast.result.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.OperationResults#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OperationResults
