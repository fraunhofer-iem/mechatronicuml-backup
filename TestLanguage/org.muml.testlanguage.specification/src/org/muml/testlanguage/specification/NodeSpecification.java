/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Node Specification</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.muml.testlanguage.specification.NodeSpecification#getPortSpecifications
 * <em>Port Specifications</em>}</li>
 * <li>
 * {@link org.muml.testlanguage.specification.NodeSpecification#getLabel
 * <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getNodeSpecification()
 * @model abstract="true"
 * @generated
 */
public interface NodeSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Specifications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link org.muml.testlanguage.specification.PortSpecification}
	 * . <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Specifications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Port Specifications</em>' containment
	 *         reference list.
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getNodeSpecification_PortSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortSpecification> getPortSpecifications();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute. The default
	 * value is <code>"Node"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getNodeSpecification_Label()
	 * @model default="Node" required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.NodeSpecification#getLabel
	 * <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "de.uni_paderborn.fujaba.muml.testlanguage.specification.ExecutionException de.uni_paderborn.fujaba.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs)
			throws ExecutionException, Exception;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return false;'"
	 * @generated
	 */
	boolean notifyChanged(Object notification);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return this.addPortSpecification(type, name, optional, null);'"
	 * @generated
	 */
	PortSpecification addPortSpecification(PortType type, String name,
			boolean optional);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" dataTypeRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='PortSpecification spec = SpecificationFactory.eINSTANCE.createPortSpecification();\r\nspec.setType(type);\r\nspec.setName(name);\r\nspec.setOptional(optional);\r\nspec.setDataType(dataType);\r\nthis.getPortSpecifications().add(spec);\r\nreturn spec;'"
	 * @generated
	 */
	PortSpecification addPortSpecification(PortType type, String name,
			boolean optional, Class<?> dataType);

} // NodeSpecification
