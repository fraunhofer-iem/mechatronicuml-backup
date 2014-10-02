/**
 */
package de.uni_paderborn.uppaal.trace.diagnosticTrace;

import de.uni_paderborn.uppaal.declarations.Variable;

import de.uni_paderborn.uppaal.templates.SynchronizationKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Synchronization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.ChannelSynchronization#getChannel <em>Channel</em>}</li>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.ChannelSynchronization#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getChannelSynchronization()
 * @model
 * @generated
 */
public interface ChannelSynchronization extends Synchronization
{
  /**
   * Returns the value of the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel</em>' reference.
   * @see #setChannel(Variable)
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getChannelSynchronization_Channel()
   * @model
   * @generated
   */
  Variable getChannel();

  /**
   * Sets the value of the '{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.ChannelSynchronization#getChannel <em>Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' reference.
   * @see #getChannel()
   * @generated
   */
  void setChannel(Variable value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link de.uni_paderborn.uppaal.templates.SynchronizationKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see de.uni_paderborn.uppaal.templates.SynchronizationKind
   * @see #setKind(SynchronizationKind)
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getChannelSynchronization_Kind()
   * @model
   * @generated
   */
  SynchronizationKind getKind();

  /**
   * Sets the value of the '{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.ChannelSynchronization#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see de.uni_paderborn.uppaal.templates.SynchronizationKind
   * @see #getKind()
   * @generated
   */
  void setKind(SynchronizationKind value);

} // ChannelSynchronization
