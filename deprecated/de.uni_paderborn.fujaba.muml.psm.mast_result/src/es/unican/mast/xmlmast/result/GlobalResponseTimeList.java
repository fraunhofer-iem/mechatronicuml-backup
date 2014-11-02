/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Response Time List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.GlobalResponseTimeList#getGlobalResponseTime <em>Global Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalResponseTimeList()
 * @model extendedMetaData="name='Global_Response_Time_List' kind='elementOnly'"
 * @generated
 */
public interface GlobalResponseTimeList extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Response Time</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.GlobalResponseTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Response Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Response Time</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalResponseTimeList_GlobalResponseTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Global_Response_Time' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GlobalResponseTime> getGlobalResponseTime();

} // GlobalResponseTimeList
