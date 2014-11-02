/**
 */
package es.unican.mast.xmlmast.trace;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.Message#getM <em>M</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.Message#getS <em>S</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.Message#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.trace.TracePackage#getMessage()
 * @model extendedMetaData="name='Message' kind='empty'"
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' attribute.
	 * @see #setM(BigInteger)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getMessage_M()
	 * @model dataType="es.unican.mast.xmlmast.trace.MessageIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='M'"
	 * @generated
	 */
	BigInteger getM();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.Message#getM <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' attribute.
	 * @see #getM()
	 * @generated
	 */
	void setM(BigInteger value);

	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #setS(int)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getMessage_S()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.trace.SourceIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='S'"
	 * @generated
	 */
	int getS();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.Message#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #getS()
	 * @generated
	 */
	void setS(int value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.trace.Message#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetS()
	 * @see #getS()
	 * @see #setS(int)
	 * @generated
	 */
	void unsetS();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.trace.Message#getS <em>S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>S</em>' attribute is set.
	 * @see #unsetS()
	 * @see #getS()
	 * @see #setS(int)
	 * @generated
	 */
	boolean isSetS();

	/**
	 * Returns the value of the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' attribute.
	 * @see #isSetT()
	 * @see #unsetT()
	 * @see #setT(float)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getMessage_T()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.trace.Time" required="true"
	 *        extendedMetaData="kind='attribute' name='T'"
	 * @generated
	 */
	float getT();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.Message#getT <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' attribute.
	 * @see #isSetT()
	 * @see #unsetT()
	 * @see #getT()
	 * @generated
	 */
	void setT(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.trace.Message#getT <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetT()
	 * @see #getT()
	 * @see #setT(float)
	 * @generated
	 */
	void unsetT();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.trace.Message#getT <em>T</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>T</em>' attribute is set.
	 * @see #unsetT()
	 * @see #getT()
	 * @see #setT(float)
	 * @generated
	 */
	boolean isSetT();

} // Message
