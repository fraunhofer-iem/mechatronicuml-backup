/**
 */
package org.muml.ape;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.Package#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link org.muml.ape.Package#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.muml.ape.Package#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueClasses'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueClasses='classes->isUnique(genClass)'"
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Package</em>' reference.
	 * @see #setGenPackage(GenPackage)
	 * @see org.muml.ape.PropertiesPackage#getPackage_GenPackage()
	 * @model required="true"
	 * @generated
	 */
	GenPackage getGenPackage();

	/**
	 * Sets the value of the '{@link org.muml.ape.Package#getGenPackage <em>Gen Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Package</em>' reference.
	 * @see #getGenPackage()
	 * @generated
	 */
	void setGenPackage(GenPackage value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.ape.Class}.
	 * It is bidirectional and its opposite is '{@link org.muml.ape.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see org.muml.ape.PropertiesPackage#getPackage_Classes()
	 * @see org.muml.ape.Class#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<org.muml.ape.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.ape.PropertyGenerator#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' container reference.
	 * @see #setGenerator(PropertyGenerator)
	 * @see org.muml.ape.PropertiesPackage#getPackage_Generator()
	 * @see org.muml.ape.PropertyGenerator#getPackages
	 * @model opposite="packages" required="true" transient="false"
	 * @generated
	 */
	PropertyGenerator getGenerator();

	/**
	 * Sets the value of the '{@link org.muml.ape.Package#getGenerator <em>Generator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' container reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(PropertyGenerator value);

} // Package
