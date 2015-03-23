/**
 */
package de.uni_paderborn.uppaal.trace.diagnosticTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace#getProperty <em>Property</em>}</li>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace#getLine <em>Line</em>}</li>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace#getResult <em>Result</em>}</li>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace#getTraceItems <em>Trace Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(int)
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getTrace_Property()
   * @model
   * @generated
   */
  int getProperty();

  /**
   * Sets the value of the '{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(int value);

  /**
   * Returns the value of the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line</em>' attribute.
   * @see #setLine(int)
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getTrace_Line()
   * @model
   * @generated
   */
  int getLine();

  /**
   * Sets the value of the '{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace#getLine <em>Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line</em>' attribute.
   * @see #getLine()
   * @generated
   */
  void setLine(int value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute.
   * The literals are from the enumeration {@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Result}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute.
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.Result
   * @see #setResult(Result)
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getTrace_Result()
   * @model
   * @generated
   */
  Result getResult();

  /**
   * Sets the value of the '{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace#getResult <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' attribute.
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.Result
   * @see #getResult()
   * @generated
   */
  void setResult(Result value);

  /**
   * Returns the value of the '<em><b>Trace Items</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_paderborn.uppaal.trace.diagnosticTrace.TraceItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trace Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trace Items</em>' containment reference list.
   * @see de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage#getTrace_TraceItems()
   * @model containment="true"
   * @generated
   */
  EList<TraceItem> getTraceItems();

} // Trace
