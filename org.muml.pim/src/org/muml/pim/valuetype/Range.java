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
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a two-dimensional range specification of an arbitrary 
 * model object. It consists of a lower and an upper bound. Intuitively, the upper
 * bound must be greater or equal to the lower bound.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.valuetype.Range#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.muml.pim.valuetype.Range#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.valuetype.ValuetypePackage#getRange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LowerBoundMustBeLessOrEqualThanUpperBound'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL LowerBoundMustBeLessOrEqualThanUpperBound='-- lower bound of range must be less or equal than upper bound\r\nself.lowerBound &lt;= self.upperBound'"
 * @generated
 */
public interface Range extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the lower bound of the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(long)
	 * @see org.muml.pim.valuetype.ValuetypePackage#getRange_LowerBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getLowerBound();

	/**
	 * Sets the value of the '{@link org.muml.pim.valuetype.Range#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(long value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the upper bound of the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(long)
	 * @see org.muml.pim.valuetype.ValuetypePackage#getRange_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	long getUpperBound();

	/**
	 * Sets the value of the '{@link org.muml.pim.valuetype.Range#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(long value);

} // Range
