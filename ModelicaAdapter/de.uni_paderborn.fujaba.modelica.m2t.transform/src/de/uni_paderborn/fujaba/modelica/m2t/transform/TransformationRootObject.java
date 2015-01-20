/**
 */
package de.uni_paderborn.fujaba.modelica.m2t.transform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Root Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.modelica.m2t.transform.TransformationRootObject#getEObject <em>EObject</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.TransformPackage#getTransformationRootObject()
 * @model
 * @generated
 */
public interface TransformationRootObject<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject</em>' reference.
	 * @see #setEObject(Object)
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.TransformPackage#getTransformationRootObject_EObject()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	T getEObject();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.TransformationRootObject#getEObject <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' reference.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(T value);

} // TransformationRootObject
