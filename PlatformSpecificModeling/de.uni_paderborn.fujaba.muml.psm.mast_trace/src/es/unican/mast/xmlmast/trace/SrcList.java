/**
 */
package es.unican.mast.xmlmast.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.SrcList#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.trace.TracePackage#getSrcList()
 * @model extendedMetaData="name='Src_List' kind='elementOnly'"
 * @generated
 */
public interface SrcList extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.trace.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getSrcList_Src()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Src' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Source> getSrc();

} // SrcList
