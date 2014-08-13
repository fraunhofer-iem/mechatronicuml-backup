/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Miss Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.GlobalMissRatio#getMissRatio <em>Miss Ratio</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.GlobalMissRatio#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalMissRatio()
 * @model extendedMetaData="name='Global_Miss_Ratio' kind='elementOnly'"
 * @generated
 */
public interface GlobalMissRatio extends EObject {
	/**
	 * Returns the value of the '<em><b>Miss Ratio</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.MissRatio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miss Ratio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miss Ratio</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalMissRatio_MissRatio()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Miss_Ratio' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MissRatio> getMissRatio();

	/**
	 * Returns the value of the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Event</em>' attribute.
	 * @see #setReferencedEvent(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalMissRatio_ReferencedEvent()
	 * @model dataType="es.unican.mast.xmlmast.result.ExternalReference"
	 *        extendedMetaData="kind='attribute' name='Referenced_Event'"
	 * @generated
	 */
	String getReferencedEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.GlobalMissRatio#getReferencedEvent <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' attribute.
	 * @see #getReferencedEvent()
	 * @generated
	 */
	void setReferencedEvent(String value);

} // GlobalMissRatio
