/**
 */
package migration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link migration.OclExpression#getOcl <em>Ocl</em>}</li>
 * </ul>
 * </p>
 *
 * @see migration.MigrationPackage#getOclExpression()
 * @model abstract="true"
 * @generated
 */
public interface OclExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Ocl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl</em>' attribute.
	 * @see #setOcl(String)
	 * @see migration.MigrationPackage#getOclExpression_Ocl()
	 * @model
	 * @generated
	 */
	String getOcl();

	/**
	 * Sets the value of the '{@link migration.OclExpression#getOcl <em>Ocl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl</em>' attribute.
	 * @see #getOcl()
	 * @generated
	 */
	void setOcl(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EClass getContext();

} // OclExpression
