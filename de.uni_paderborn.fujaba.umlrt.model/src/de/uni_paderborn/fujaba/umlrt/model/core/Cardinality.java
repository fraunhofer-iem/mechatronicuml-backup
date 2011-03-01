/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the cardinality of an arbitrary model object. It consists of a lower and an upper bound.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getCardinality()
 * @model
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getCardinality_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getLowerBound();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getLowerBound <em>Lower Bound</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getCardinality_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getUpperBound();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(NaturalNumber value);

} // Cardinality
