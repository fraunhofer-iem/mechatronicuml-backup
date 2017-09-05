/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>genspec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getSource <em>Source</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getTarget <em>Target</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getSearchPaths <em>Search Paths</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getTransports <em>Transports</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getgenspec()
 * @model
 * @generated
 */
public interface genspec extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ModelFile)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getgenspec_Source()
	 * @model containment="true" required="true" derived="true" ordered="false"
	 * @generated
	 */
	ModelFile getSource();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModelFile value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetDir)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getgenspec_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TargetDir getTarget();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetDir value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference.
	 * @see #setInstances(Instances)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getgenspec_Instances()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Instances getInstances();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getInstances <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' containment reference.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(Instances value);

	/**
	 * Returns the value of the '<em><b>Search Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Paths</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Paths</em>' containment reference.
	 * @see #setSearchPaths(SearchPaths)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getgenspec_SearchPaths()
	 * @model containment="true"
	 * @generated
	 */
	SearchPaths getSearchPaths();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getSearchPaths <em>Search Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Paths</em>' containment reference.
	 * @see #getSearchPaths()
	 * @generated
	 */
	void setSearchPaths(SearchPaths value);

	/**
	 * Returns the value of the '<em><b>Transports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transports</em>' containment reference.
	 * @see #setTransports(Transports)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getgenspec_Transports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transports getTransports();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getTransports <em>Transports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transports</em>' containment reference.
	 * @see #getTransports()
	 * @generated
	 */
	void setTransports(Transports value);

} // genspec
