/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Constraint CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class either represents a SAME_LOCATION or DIFFERENT_LOCATION
 * constraint. A constraint of the type SAME_LOCATION specifies that a set of
 * component instances have to be allocated to the same hardware resource
 * instance. The DIFFERENT_LOCATION type constraint is the opposite
 * of the SAME_LOCATION type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getLocationConstraintCS()
 * @model
 * @generated
 */
public interface LocationConstraintCS extends ConstraintCS {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of location tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(LocationTupleDescriptorCS)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getLocationConstraintCS_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocationTupleDescriptorCS getTupleDescriptor();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(LocationTupleDescriptorCS value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the type of the location constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes
	 * @see #setType(LocationConstraintTypes)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getLocationConstraintCS_Type()
	 * @model required="true"
	 * @generated
	 */
	LocationConstraintTypes getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(LocationConstraintTypes value);

} // LocationConstraintCS
