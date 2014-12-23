/**
 */
package migration;

import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link migration.Constraint#getEmbeddingCreateClass <em>Embedding Create Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see migration.MigrationPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends OclExpression {

	/**
	 * Returns the value of the '<em><b>Embedding Create Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link migration.CreateClass#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedding Create Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedding Create Class</em>' container reference.
	 * @see #setEmbeddingCreateClass(CreateClass)
	 * @see migration.MigrationPackage#getConstraint_EmbeddingCreateClass()
	 * @see migration.CreateClass#getConstraints
	 * @model opposite="constraints" required="true" transient="false"
	 * @generated
	 */
	CreateClass getEmbeddingCreateClass();

	/**
	 * Sets the value of the '{@link migration.Constraint#getEmbeddingCreateClass <em>Embedding Create Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedding Create Class</em>' container reference.
	 * @see #getEmbeddingCreateClass()
	 * @generated
	 */
	void setEmbeddingCreateClass(CreateClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getEmbeddingCreateClass().getSourceClass();'"
	 * @generated
	 */
	EClass getContext();

} // Constraint
