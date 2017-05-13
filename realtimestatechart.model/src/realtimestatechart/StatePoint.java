/**
 */
package realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realtimestatechart.StatePoint#isEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @see realtimestatechart.RealtimestatechartPackage#getStatePoint()
 * @model
 * @generated
 */
public interface StatePoint extends Vertex {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' attribute.
	 * @see #setEntry(boolean)
	 * @see realtimestatechart.RealtimestatechartPackage#getStatePoint_Entry()
	 * @model
	 * @generated
	 */
	boolean isEntry();

	/**
	 * Sets the value of the '{@link realtimestatechart.StatePoint#isEntry <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' attribute.
	 * @see #isEntry()
	 * @generated
	 */
	void setEntry(boolean value);

} // StatePoint
