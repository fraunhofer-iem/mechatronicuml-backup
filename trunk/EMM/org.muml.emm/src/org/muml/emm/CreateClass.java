/**
 */
package org.muml.emm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.emm.CreateClass#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link org.muml.emm.CreateClass#getFeatureInitializers <em>Feature Initializers</em>}</li>
 *   <li>{@link org.muml.emm.CreateClass#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.muml.emm.MigrationPackage#getCreateClass()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoAbstractTarget'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoAbstractTarget='not targetClass.oclIsUndefined() implies not targetClass.abstract'"
 * @generated
 */
public interface CreateClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' reference.
	 * @see #setTargetClass(EClass)
	 * @see org.muml.emm.MigrationPackage#getCreateClass_TargetClass()
	 * @model
	 * @generated
	 */
	EClass getTargetClass();

	/**
	 * Sets the value of the '{@link org.muml.emm.CreateClass#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Feature Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.emm.FeatureInitializer}.
	 * It is bidirectional and its opposite is '{@link org.muml.emm.FeatureInitializer#getEmbeddingCreateClass <em>Embedding Create Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Initializers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Initializers</em>' containment reference list.
	 * @see org.muml.emm.MigrationPackage#getCreateClass_FeatureInitializers()
	 * @see org.muml.emm.FeatureInitializer#getEmbeddingCreateClass
	 * @model opposite="embeddingCreateClass" containment="true"
	 * @generated
	 */
	EList<FeatureInitializer> getFeatureInitializers();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.emm.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.emm.Constraint#getEmbeddingCreateClass <em>Embedding Create Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.muml.emm.MigrationPackage#getCreateClass_Constraints()
	 * @see org.muml.emm.Constraint#getEmbeddingCreateClass
	 * @model opposite="embeddingCreateClass" containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EClass getSourceClass();

} // CreateClass
