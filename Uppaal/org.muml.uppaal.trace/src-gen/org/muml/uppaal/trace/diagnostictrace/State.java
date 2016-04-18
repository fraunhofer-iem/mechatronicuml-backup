/**
 */
package org.muml.uppaal.trace.diagnostictrace;

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
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.State#getLocationActivities <em>Location Activities</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.State#getVariableValues <em>Variable Values</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.diagnostictrace.DiagnostictracePackage#getState()
 * @model
 * @generated
 */
public interface State extends TraceItem
{
  /**
   * Returns the value of the '<em><b>Location Activities</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.uppaal.trace.diagnostictrace.LocationActivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location Activities</em>' containment reference list.
   * @see org.muml.uppaal.trace.diagnostictrace.DiagnostictracePackage#getState_LocationActivities()
   * @model containment="true"
   * @generated
   */
  EList<LocationActivity> getLocationActivities();

  /**
   * Returns the value of the '<em><b>Variable Values</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.uppaal.trace.diagnostictrace.VariableValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Values</em>' containment reference list.
   * @see org.muml.uppaal.trace.diagnostictrace.DiagnostictracePackage#getState_VariableValues()
   * @model containment="true"
   * @generated
   */
  EList<VariableValue> getVariableValues();

} // State
