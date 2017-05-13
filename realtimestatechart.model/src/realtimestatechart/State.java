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
 *   <li>{@link realtimestatechart.State#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link realtimestatechart.State#getExitPoints <em>Exit Points</em>}</li>
 * </ul>
 *
 * @see realtimestatechart.RealtimestatechartPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex, NamedElement {
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

	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' containment reference list.
	 * The list contents are of type {@link realtimestatechart.StateEntryPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' containment reference list.
	 * @see realtimestatechart.RealtimestatechartPackage#getState_EntryPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateEntryPoint> getEntryPoints();

	/**
	 * Returns the value of the '<em><b>Exit Points</b></em>' containment reference list.
	 * The list contents are of type {@link realtimestatechart.StateExitPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Points</em>' containment reference list.
	 * @see realtimestatechart.RealtimestatechartPackage#getState_ExitPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateExitPoint> getExitPoints();

} // State
