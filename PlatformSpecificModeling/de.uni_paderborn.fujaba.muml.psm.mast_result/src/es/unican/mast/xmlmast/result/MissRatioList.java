/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Miss Ratio List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.MissRatioList#getMissRatio <em>Miss Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getMissRatioList()
 * @model extendedMetaData="name='Miss_Ratio_List' kind='elementOnly'"
 * @generated
 */
public interface MissRatioList extends EObject {
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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getMissRatioList_MissRatio()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Miss_Ratio' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MissRatio> getMissRatio();

} // MissRatioList
