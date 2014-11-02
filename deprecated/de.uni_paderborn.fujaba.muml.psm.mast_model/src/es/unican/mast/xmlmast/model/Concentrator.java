/**
 */
package es.unican.mast.xmlmast.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concentrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.Concentrator#getInputEventsList <em>Input Events List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.Concentrator#getOutputEvent <em>Output Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getConcentrator()
 * @model extendedMetaData="name='Concentrator' kind='empty'"
 * @generated
 */
public interface Concentrator extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Events List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Events List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Events List</em>' attribute.
	 * @see #setInputEventsList(List)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getConcentrator_InputEventsList()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRefList" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='Input_Events_List'"
	 * @generated
	 */
	List<String> getInputEventsList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.Concentrator#getInputEventsList <em>Input Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Events List</em>' attribute.
	 * @see #getInputEventsList()
	 * @generated
	 */
	void setInputEventsList(List<String> value);

	/**
	 * Returns the value of the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Event</em>' attribute.
	 * @see #setOutputEvent(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getConcentrator_OutputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Output_Event'"
	 * @generated
	 */
	String getOutputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.Concentrator#getOutputEvent <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Event</em>' attribute.
	 * @see #getOutputEvent()
	 * @generated
	 */
	void setOutputEvent(String value);

} // Concentrator
