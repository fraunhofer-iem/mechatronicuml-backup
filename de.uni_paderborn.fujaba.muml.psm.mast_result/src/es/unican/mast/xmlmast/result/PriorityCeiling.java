/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Priority Ceiling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.PriorityCeiling#getCeiling <em>Ceiling</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getPriorityCeiling()
 * @model extendedMetaData="name='Priority_Ceiling' kind='empty'"
 * @generated
 */
public interface PriorityCeiling extends EObject {
	/**
	 * Returns the value of the '<em><b>Ceiling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceiling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling</em>' attribute.
	 * @see #isSetCeiling()
	 * @see #unsetCeiling()
	 * @see #setCeiling(int)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getPriorityCeiling_Ceiling()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Priority"
	 *        extendedMetaData="kind='attribute' name='Ceiling'"
	 * @generated
	 */
	int getCeiling();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.PriorityCeiling#getCeiling <em>Ceiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling</em>' attribute.
	 * @see #isSetCeiling()
	 * @see #unsetCeiling()
	 * @see #getCeiling()
	 * @generated
	 */
	void setCeiling(int value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.PriorityCeiling#getCeiling <em>Ceiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCeiling()
	 * @see #getCeiling()
	 * @see #setCeiling(int)
	 * @generated
	 */
	void unsetCeiling();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.PriorityCeiling#getCeiling <em>Ceiling</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ceiling</em>' attribute is set.
	 * @see #unsetCeiling()
	 * @see #getCeiling()
	 * @see #setCeiling(int)
	 * @generated
	 */
	boolean isSetCeiling();

} // PriorityCeiling
