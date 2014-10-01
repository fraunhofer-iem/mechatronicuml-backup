/**
 */
package es.unican.mast.xmlmast.result;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preemption Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.PreemptionLevel#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getPreemptionLevel()
 * @model extendedMetaData="name='Preemption_Level' kind='empty'"
 * @generated
 */
public interface PreemptionLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(BigInteger)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getPreemptionLevel_Level()
	 * @model dataType="es.unican.mast.xmlmast.result.PreemptionLevelType"
	 *        extendedMetaData="kind='attribute' name='Level'"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.PreemptionLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

} // PreemptionLevel
