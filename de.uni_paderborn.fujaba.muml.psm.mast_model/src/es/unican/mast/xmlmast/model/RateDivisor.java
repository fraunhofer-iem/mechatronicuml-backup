/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Divisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.RateDivisor#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RateDivisor#getOutputEvent <em>Output Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RateDivisor#getRateFactor <em>Rate Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getRateDivisor()
 * @model extendedMetaData="name='Rate_Divisor' kind='empty'"
 * @generated
 */
public interface RateDivisor extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Event</em>' attribute.
	 * @see #setInputEvent(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRateDivisor_InputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Input_Event'"
	 * @generated
	 */
	String getInputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RateDivisor#getInputEvent <em>Input Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Event</em>' attribute.
	 * @see #getInputEvent()
	 * @generated
	 */
	void setInputEvent(String value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRateDivisor_OutputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Output_Event'"
	 * @generated
	 */
	String getOutputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RateDivisor#getOutputEvent <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Event</em>' attribute.
	 * @see #getOutputEvent()
	 * @generated
	 */
	void setOutputEvent(String value);

	/**
	 * Returns the value of the '<em><b>Rate Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Factor</em>' attribute.
	 * @see #setRateFactor(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRateDivisor_RateFactor()
	 * @model dataType="es.unican.mast.xmlmast.model.Positive" required="true"
	 *        extendedMetaData="kind='attribute' name='Rate_Factor'"
	 * @generated
	 */
	BigInteger getRateFactor();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RateDivisor#getRateFactor <em>Rate Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Factor</em>' attribute.
	 * @see #getRateFactor()
	 * @generated
	 */
	void setRateFactor(BigInteger value);

} // RateDivisor
