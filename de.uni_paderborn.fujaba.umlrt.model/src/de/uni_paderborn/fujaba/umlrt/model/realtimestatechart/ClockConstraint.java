/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.expressions.ComparingOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an arbitrary time constraint that can either be used as an invariant constraint of a state or as a transition guard.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getBound <em>Bound</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getClock <em>Clock</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getClockConstraintExpr <em>Clock Constraint Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getClockConstraint()
 * @model
 * @generated
 */
public interface ClockConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(NaturalNumber)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getClockConstraint_Bound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getBound();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getClockConstraints <em>Clock Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getClockConstraint_Clock()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getClockConstraints
	 * @model opposite="clockConstraints"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"ComparingOperator.LESS_OR_EQUAL"</code>.
	 * The literals are from the enumeration {@link org.storydriven.modeling.expressions.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.modeling.expressions.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getClockConstraint_Operator()
	 * @model default="ComparingOperator.LESS_OR_EQUAL" required="true"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.modeling.expressions.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);

	/**
	 * Returns the value of the '<em><b>Clock Constraint Expr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Constraint Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Constraint Expr</em>' attribute.
	 * @see #isSetClockConstraintExpr()
	 * @see #unsetClockConstraintExpr()
	 * @see #setClockConstraintExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getClockConstraint_ClockConstraintExpr()
	 * @model default="" unsettable="true" transient="true" volatile="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='toMyString()'"
	 * @generated
	 */
	String getClockConstraintExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getClockConstraintExpr <em>Clock Constraint Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Constraint Expr</em>' attribute.
	 * @see #isSetClockConstraintExpr()
	 * @see #unsetClockConstraintExpr()
	 * @see #getClockConstraintExpr()
	 * @generated
	 */
	void setClockConstraintExpr(String value);

	/**
	 * Unsets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getClockConstraintExpr <em>Clock Constraint Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClockConstraintExpr()
	 * @see #getClockConstraintExpr()
	 * @see #setClockConstraintExpr(String)
	 * @generated
	 */
	void unsetClockConstraintExpr();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getClockConstraintExpr <em>Clock Constraint Expr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clock Constraint Expr</em>' attribute is set.
	 * @see #unsetClockConstraintExpr()
	 * @see #getClockConstraintExpr()
	 * @see #setClockConstraintExpr(String)
	 * @generated
	 */
	boolean isSetClockConstraintExpr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(clock!=null && operator!=null && bound!=null) {\r\n\t\t\treturn clock.getName()+clock.getId() +\" \"+ operator.toString() +\" \" + bound.getValue();\r\n\t\t}else{\r\n\t\t\treturn \"\";\r\n\t\t}'"
	 * @generated
	 */
	String toMyString();

} // ClockConstraint
