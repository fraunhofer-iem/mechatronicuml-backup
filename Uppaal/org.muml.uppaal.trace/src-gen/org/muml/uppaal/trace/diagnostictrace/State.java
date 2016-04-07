/**
 */
package org.muml.uppaal.trace.diagnosticTrace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.diagnosticTrace.State#getLocationActivities <em>Location Activities</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnosticTrace.State#getVariableValues <em>Variable Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getState()
 * @model
 * @generated
 */
public interface State extends TraceItem
{
  /**
   * Returns the value of the '<em><b>Location Activities</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.uppaal.trace.diagnosticTrace.LocationActivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location Activities</em>' containment reference list.
   * @see org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getState_LocationActivities()
   * @model containment="true"
   * @generated
   */
  EList<LocationActivity> getLocationActivities();

  /**
   * Returns the value of the '<em><b>Variable Values</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.uppaal.trace.diagnosticTrace.VariableValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Values</em>' containment reference list.
   * @see org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getState_VariableValues()
   * @model containment="true"
   * @generated
   */
  EList<VariableValue> getVariableValues();

} // State
