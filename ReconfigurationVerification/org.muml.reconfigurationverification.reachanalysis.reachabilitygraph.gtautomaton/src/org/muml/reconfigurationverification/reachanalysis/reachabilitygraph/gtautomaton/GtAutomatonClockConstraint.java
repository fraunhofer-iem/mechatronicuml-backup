/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton;

import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.expressions.common.ComparingOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gt Automaton Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getClockInstanceIdentifier <em>Clock Instance Identifier</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomatonClockConstraint()
 * @model
 * @generated
 */
public interface GtAutomatonClockConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Instance Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instance Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instance Identifier</em>' attribute.
	 * @see #setClockInstanceIdentifier(String)
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomatonClockConstraint_ClockInstanceIdentifier()
	 * @model
	 * @generated
	 */
	String getClockInstanceIdentifier();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getClockInstanceIdentifier <em>Clock Instance Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Instance Identifier</em>' attribute.
	 * @see #getClockInstanceIdentifier()
	 * @generated
	 */
	void setClockInstanceIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.mumlcore.expressions.common.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomatonClockConstraint_Operator()
	 * @model
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomatonClockConstraint_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // GtAutomatonClockConstraint
