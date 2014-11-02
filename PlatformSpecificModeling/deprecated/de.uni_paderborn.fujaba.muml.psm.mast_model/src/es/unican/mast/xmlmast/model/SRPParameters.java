/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRP Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.SRPParameters#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SRPParameters#getPreemptionLevel <em>Preemption Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getSRPParameters()
 * @model extendedMetaData="name='SRP_Parameters' kind='empty'"
 * @generated
 */
public interface SRPParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Preassigned</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.Assertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preassigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preassigned</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @see #isSetPreassigned()
	 * @see #unsetPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSRPParameters_Preassigned()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Preassigned'"
	 * @generated
	 */
	Assertion getPreassigned();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SRPParameters#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preassigned</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @see #isSetPreassigned()
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @generated
	 */
	void setPreassigned(Assertion value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.SRPParameters#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	void unsetPreassigned();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.SRPParameters#getPreassigned <em>Preassigned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preassigned</em>' attribute is set.
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	boolean isSetPreassigned();

	/**
	 * Returns the value of the '<em><b>Preemption Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preemption Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preemption Level</em>' attribute.
	 * @see #setPreemptionLevel(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSRPParameters_PreemptionLevel()
	 * @model dataType="es.unican.mast.xmlmast.model.PreemptionLevel" required="true"
	 *        extendedMetaData="kind='attribute' name='Preemption_Level'"
	 * @generated
	 */
	BigInteger getPreemptionLevel();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SRPParameters#getPreemptionLevel <em>Preemption Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemption Level</em>' attribute.
	 * @see #getPreemptionLevel()
	 * @generated
	 */
	void setPreemptionLevel(BigInteger value);

} // SRPParameters
