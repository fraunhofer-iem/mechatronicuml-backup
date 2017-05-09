/**
 */
package realtimestatechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realtimestatechart.State#getSubStatecharts <em>Sub Statecharts</em>}</li>
 * </ul>
 *
 * @see realtimestatechart.RealtimestatechartPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Statecharts</b></em>' containment reference list.
	 * The list contents are of type {@link realtimestatechart.Realtimestatechart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Statecharts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Statecharts</em>' containment reference list.
	 * @see realtimestatechart.RealtimestatechartPackage#getState_SubStatecharts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realtimestatechart> getSubStatecharts();

} // State
