/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype;

import de.uni_paderborn.fujaba.muml.types.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructType#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getStructType()
 * @model
 * @generated
 */
public interface StructType extends DataType {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Attribute}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Attribute#getStructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getStructType_Attributes()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Attribute#getStructType
	 * @model opposite="structType" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference#getStructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getStructType_References()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference#getStructType
	 * @model opposite="structType" containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

} // StructType
