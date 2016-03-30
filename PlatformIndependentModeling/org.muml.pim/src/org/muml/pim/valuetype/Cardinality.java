/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.valuetype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a two-dimensional range specification of an arbitrary 
 * model object. It consists of a lower and an upper bound where both need to
 * be greater or equal to zero. Intuitively, the upper bound must be greater or
 * equal to the lower bound.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.valuetype.Cardinality#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.muml.pim.valuetype.Cardinality#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.valuetype.ValuetypePackage#getCardinality()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LowerBoundMustBeLessOrEqualThanUpperBound'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL LowerBoundMustBeLessOrEqualThanUpperBound='-- lower bound of cardinality must be less or equal than upper bound\r\n(not self.lowerBound.oclIsUndefined() and not self.upperBound.oclIsUndefined()) implies\n(\n\t((not self.lowerBound.infinity and not self.upperBound.infinity) implies (self.lowerBound.value <= self.upperBound.value))\r\n\tand (self.lowerBound.infinity implies self.upperBound.infinity)\n)'"
 * @generated
 */
public interface Cardinality extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound of this cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(NaturalNumber)
	 * @see org.muml.pim.valuetype.ValuetypePackage#getCardinality_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getLowerBound();

	/**
	 * Sets the value of the '{@link org.muml.pim.valuetype.Cardinality#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of this cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(NaturalNumber)
	 * @see org.muml.pim.valuetype.ValuetypePackage#getCardinality_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getUpperBound();

	/**
	 * Sets the value of the '{@link org.muml.pim.valuetype.Cardinality#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(NaturalNumber value);

} // Cardinality
