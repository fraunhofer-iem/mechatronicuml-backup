/**
 */
package es.unican.mast.xmlmast.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Msg Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.MsgTypeList#getMsgType <em>Msg Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.trace.TracePackage#getMsgTypeList()
 * @model extendedMetaData="name='Msg_Type_List' kind='elementOnly'"
 * @generated
 */
public interface MsgTypeList extends EObject {
	/**
	 * Returns the value of the '<em><b>Msg Type</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.trace.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Type</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getMsgTypeList_MsgType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Msg_Type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MessageType> getMsgType();

} // MsgTypeList
