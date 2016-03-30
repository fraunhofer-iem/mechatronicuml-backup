/**
 */
package org.muml.testlanguage.specification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Port Specification</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.muml.testlanguage.specification.PortSpecification#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link org.muml.testlanguage.specification.PortSpecification#isOptional
 * <em>Optional</em>}</li>
 * <li>
 * {@link org.muml.testlanguage.specification.PortSpecification#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link org.muml.testlanguage.specification.PortSpecification#getDataType
 * <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getPortSpecification()
 * @model
 * @generated
 */
public interface PortSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getPortSpecification_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.PortSpecification#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getPortSpecification_Optional()
	 * @model required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.PortSpecification#isOptional
	 * <em>Optional</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. The default
	 * value is <code>"IN"</code>. The literals are from the enumeration
	 * {@link org.muml.testlanguage.specification.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.muml.testlanguage.specification.PortType
	 * @see #setType(PortType)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getPortSpecification_Type()
	 * @model default="IN" required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.PortSpecification#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see org.muml.testlanguage.specification.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Class)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getPortSpecification_DataType()
	 * @model
	 * @generated
	 */
	Class<?> getDataType();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.PortSpecification#getDataType
	 * <em>Data Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Class<?> value);

} // PortSpecification
