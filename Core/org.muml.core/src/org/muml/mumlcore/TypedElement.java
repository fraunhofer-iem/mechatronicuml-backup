/**
 */
package org.muml.mumlcore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all meta-model elements that are typed by means of an EClassifier or an EGenericType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.mumlcore.TypedElement#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link org.muml.mumlcore.TypedElement#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see org.muml.mumlcore.CorePackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EMF EGenericType that is used to type this typed element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Type</em>' containment reference.
	 * @see #isSetGenericType()
	 * @see #unsetGenericType()
	 * @see #setGenericType(EGenericType)
	 * @see org.muml.mumlcore.CorePackage#getTypedElement_GenericType()
	 * @model containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
	EGenericType getGenericType();

	/**
	 * Sets the value of the '{@link org.muml.mumlcore.TypedElement#getGenericType <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Type</em>' containment reference.
	 * @see #isSetGenericType()
	 * @see #unsetGenericType()
	 * @see #getGenericType()
	 * @generated
	 */
	void setGenericType(EGenericType value);

	/**
	 * Unsets the value of the '{@link org.muml.mumlcore.TypedElement#getGenericType <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenericType()
	 * @see #getGenericType()
	 * @see #setGenericType(EGenericType)
	 * @generated
	 */
	void unsetGenericType();

	/**
	 * Returns whether the value of the '{@link org.muml.mumlcore.TypedElement#getGenericType <em>Generic Type</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generic Type</em>' containment reference is set.
	 * @see #unsetGenericType()
	 * @see #getGenericType()
	 * @see #setGenericType(EGenericType)
	 * @generated
	 */
	boolean isSetGenericType();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this ObjectVariable, given as an EClass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see org.muml.mumlcore.CorePackage#getTypedElement_Classifier()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.genericType <> null) then self.genericType.eClassifier else null endif'"
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='EGenericType genericType = getGenericType();\nif (genericType == null) {\n\tgenericType = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEGenericType();\n\tsetGenericType(genericType);\n}\ngenericType.setEClassifier(classifier);'"
	 * @generated
	 */
	void setClassifier(EClassifier classifier);

} // TypedElement
