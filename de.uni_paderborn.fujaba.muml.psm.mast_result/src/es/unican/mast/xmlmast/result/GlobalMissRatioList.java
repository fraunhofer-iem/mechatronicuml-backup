/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Miss Ratio List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.GlobalMissRatioList#getGlobalMissRatio <em>Global Miss Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalMissRatioList()
 * @model extendedMetaData="name='Global_Miss_Ratio_List' kind='elementOnly'"
 * @generated
 */
public interface GlobalMissRatioList extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Miss Ratio</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.GlobalMissRatio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Miss Ratio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Miss Ratio</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalMissRatioList_GlobalMissRatio()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Global_Miss_Ratio' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GlobalMissRatio> getGlobalMissRatio();

} // GlobalMissRatioList
