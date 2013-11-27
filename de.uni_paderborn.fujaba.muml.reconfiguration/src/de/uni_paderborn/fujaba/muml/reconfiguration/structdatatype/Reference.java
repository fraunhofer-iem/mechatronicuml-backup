/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype;

import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.types.DataType;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference is a field of a StructType. It specifies a relation to another StructType or an element of the MechatronicUML meta-model such as a component or port. 
 * A reference specifies a cardinality that defines the minimum and maximum number of elements that need to be referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference#getStructType <em>Struct Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Struct Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the containing struct type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Struct Type</em>' container reference.
	 * @see #setStructType(StructType)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getReference_StructType()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructType#getReferences
	 * @model opposite="references" required="true" transient="false"
	 * @generated
	 */
	StructType getStructType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference#getStructType <em>Struct Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct Type</em>' container reference.
	 * @see #getStructType()
	 * @generated
	 */
	void setStructType(StructType value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality defines the minimum and maximum number of objects that
	 * need to be referenced by this reference at run-time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getReference_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of this reference. The data type needs to be another struct type
	 * or an element of the MechatronicUML model such as a component or port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getReference_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Reference
