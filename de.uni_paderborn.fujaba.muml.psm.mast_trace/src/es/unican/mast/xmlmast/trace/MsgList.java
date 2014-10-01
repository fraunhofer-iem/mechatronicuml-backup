/**
 */
package es.unican.mast.xmlmast.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Msg List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.MsgList#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.trace.TracePackage#getMsgList()
 * @model extendedMetaData="name='Msg_List' kind='elementOnly'"
 * @generated
 */
public interface MsgList extends EObject {
	/**
	 * Returns the value of the '<em><b>Msg</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.trace.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getMsgList_Msg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Msg' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Message> getMsg();

} // MsgList
