/**
 */
package de.uni_paderborn.fujaba.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.OrderedElement#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getOrderedElement()
 * @model abstract="true"
 * @generated
 */
public interface OrderedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.properties.Class#getOrderedElements <em>Ordered Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' container reference.
	 * @see #setClazz(de.uni_paderborn.fujaba.properties.Class)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getOrderedElement_Clazz()
	 * @see de.uni_paderborn.fujaba.properties.Class#getOrderedElements
	 * @model opposite="orderedElements" required="true" transient="false"
	 * @generated
	 */
	de.uni_paderborn.fujaba.properties.Class getClazz();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.OrderedElement#getClazz <em>Clazz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' container reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(de.uni_paderborn.fujaba.properties.Class value);

} // OrderedElement
