/**
 */
package migration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link migration.FeatureInitializer#getEmbeddingCreateClass <em>Embedding Create Class</em>}</li>
 *   <li>{@link migration.FeatureInitializer#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see migration.MigrationPackage#getFeatureInitializer()
 * @model abstract="true"
 * @generated
 */
public interface FeatureInitializer extends EObject {
	/**
	 * Returns the value of the '<em><b>Embedding Create Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link migration.CreateClass#getFeatureInitializers <em>Feature Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedding Create Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedding Create Class</em>' container reference.
	 * @see #setEmbeddingCreateClass(CreateClass)
	 * @see migration.MigrationPackage#getFeatureInitializer_EmbeddingCreateClass()
	 * @see migration.CreateClass#getFeatureInitializers
	 * @model opposite="featureInitializers" required="true" transient="false"
	 * @generated
	 */
	CreateClass getEmbeddingCreateClass();

	/**
	 * Sets the value of the '{@link migration.FeatureInitializer#getEmbeddingCreateClass <em>Embedding Create Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedding Create Class</em>' container reference.
	 * @see #getEmbeddingCreateClass()
	 * @generated
	 */
	void setEmbeddingCreateClass(CreateClass value);

	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature</em>' reference.
	 * @see #setTargetFeature(EStructuralFeature)
	 * @see migration.MigrationPackage#getFeatureInitializer_TargetFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getTargetFeature();

	/**
	 * Sets the value of the '{@link migration.FeatureInitializer#getTargetFeature <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' reference.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(EStructuralFeature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// Derive embedding Mapping\nEObject element = this;\nwhile (element.eContainer() != null && !(element instanceof Mapping)) {\n\telement = element.eContainer();\n}\nif (element instanceof Mapping) {\n\treturn (Mapping) element;\n}\nreturn null;'"
	 * @generated
	 */
	Mapping getMapping();

} // FeatureInitializer
