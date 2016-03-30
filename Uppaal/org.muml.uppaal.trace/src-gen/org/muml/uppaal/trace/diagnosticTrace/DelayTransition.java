/**
 */
package org.muml.uppaal.trace.diagnosticTrace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.diagnosticTrace.DelayTransition#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getDelayTransition()
 * @model
 * @generated
 */
public interface DelayTransition extends Transition
{
  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getDelayTransition_Duration()
   * @model
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link org.muml.uppaal.trace.diagnosticTrace.DelayTransition#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

} // DelayTransition
