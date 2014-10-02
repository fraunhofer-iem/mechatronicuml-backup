/**
 */
package de.uni_paderborn.uppaal.trace.diagnosticTrace;

import de.uni_paderborn.uppaal.templates.Location;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.LocationActivity#getProcess <em>Process</em>}</li>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.LocationActivity#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getLocationActivity()
 * @model
 * @generated
 */
public interface LocationActivity extends EObject
{
  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference.
   * @see #setProcess(ProcessIdentifier)
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getLocationActivity_Process()
   * @model containment="true"
   * @generated
   */
  ProcessIdentifier getProcess();

  /**
   * Sets the value of the '{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.LocationActivity#getProcess <em>Process</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' containment reference.
   * @see #getProcess()
   * @generated
   */
  void setProcess(ProcessIdentifier value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' reference.
   * @see #setLocation(Location)
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getLocationActivity_Location()
   * @model
   * @generated
   */
  Location getLocation();

  /**
   * Sets the value of the '{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.LocationActivity#getLocation <em>Location</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Location value);

} // LocationActivity
