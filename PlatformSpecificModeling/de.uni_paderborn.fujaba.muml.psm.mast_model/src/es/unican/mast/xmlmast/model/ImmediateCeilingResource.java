/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Ceiling Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getPreassigned <em>Preassigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getImmediateCeilingResource()
 * @model extendedMetaData="name='Immediate_Ceiling_Resource' kind='empty'"
 * @generated
 */
public interface ImmediateCeilingResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Ceiling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceiling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling</em>' attribute.
	 * @see #setCeiling(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getImmediateCeilingResource_Ceiling()
	 * @model dataType="es.unican.mast.xmlmast.model.Priority"
	 *        extendedMetaData="kind='attribute' name='Ceiling'"
	 * @generated
	 */
	BigInteger getCeiling();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getCeiling <em>Ceiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling</em>' attribute.
	 * @see #getCeiling()
	 * @generated
	 */
	void setCeiling(BigInteger value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getImmediateCeilingResource_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getImmediateCeilingResource_Preassigned()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Preassigned'"
	 * @generated
	 */
	Assertion getPreassigned();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getPreassigned <em>Preassigned</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	void unsetPreassigned();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getPreassigned <em>Preassigned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preassigned</em>' attribute is set.
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	boolean isSetPreassigned();

} // ImmediateCeilingResource
