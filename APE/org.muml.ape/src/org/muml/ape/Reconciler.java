/**
 */
package org.muml.ape;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconciler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.Reconciler#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.muml.ape.Reconciler#isReconcilePackages <em>Reconcile Packages</em>}</li>
 *   <li>{@link org.muml.ape.Reconciler#isReconcileClasses <em>Reconcile Classes</em>}</li>
 *   <li>{@link org.muml.ape.Reconciler#isReconcileProperties <em>Reconcile Properties</em>}</li>
 *   <li>{@link org.muml.ape.Reconciler#getCustomTransformations <em>Custom Transformations</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getReconciler()
 * @model
 * @generated
 */
public interface Reconciler extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.muml.ape.PropertiesPackage#getReconciler_Enabled()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.muml.ape.Reconciler#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Reconcile Packages</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconcile Packages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconcile Packages</em>' attribute.
	 * @see #setReconcilePackages(boolean)
	 * @see org.muml.ape.PropertiesPackage#getReconciler_ReconcilePackages()
	 * @model default="true"
	 * @generated
	 */
	boolean isReconcilePackages();

	/**
	 * Sets the value of the '{@link org.muml.ape.Reconciler#isReconcilePackages <em>Reconcile Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconcile Packages</em>' attribute.
	 * @see #isReconcilePackages()
	 * @generated
	 */
	void setReconcilePackages(boolean value);

	/**
	 * Returns the value of the '<em><b>Reconcile Classes</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconcile Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconcile Classes</em>' attribute.
	 * @see #setReconcileClasses(boolean)
	 * @see org.muml.ape.PropertiesPackage#getReconciler_ReconcileClasses()
	 * @model default="true"
	 * @generated
	 */
	boolean isReconcileClasses();

	/**
	 * Sets the value of the '{@link org.muml.ape.Reconciler#isReconcileClasses <em>Reconcile Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconcile Classes</em>' attribute.
	 * @see #isReconcileClasses()
	 * @generated
	 */
	void setReconcileClasses(boolean value);

	/**
	 * Returns the value of the '<em><b>Reconcile Properties</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconcile Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconcile Properties</em>' attribute.
	 * @see #setReconcileProperties(boolean)
	 * @see org.muml.ape.PropertiesPackage#getReconciler_ReconcileProperties()
	 * @model default="true"
	 * @generated
	 */
	boolean isReconcileProperties();

	/**
	 * Sets the value of the '{@link org.muml.ape.Reconciler#isReconcileProperties <em>Reconcile Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconcile Properties</em>' attribute.
	 * @see #isReconcileProperties()
	 * @generated
	 */
	void setReconcileProperties(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.ape.CustomTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Transformations</em>' containment reference list.
	 * @see org.muml.ape.PropertiesPackage#getReconciler_CustomTransformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomTransformation> getCustomTransformations();

} // Reconciler
