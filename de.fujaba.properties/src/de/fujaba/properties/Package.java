/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties;

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
 * <ul>
 *   <li>{@link de.fujaba.properties.Package#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link de.fujaba.properties.Package#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getPackage()
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
	 * @see de.fujaba.properties.PropertiesPackage#getPackage_GenPackage()
	 * @model required="true"
	 * @generated
	 */
	GenPackage getGenPackage();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Package#getGenPackage <em>Gen Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Package</em>' reference.
	 * @see #getGenPackage()
	 * @generated
	 */
	void setGenPackage(GenPackage value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link de.fujaba.properties.Class}.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see de.fujaba.properties.PropertiesPackage#getPackage_Classes()
	 * @see de.fujaba.properties.Class#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<de.fujaba.properties.Class> getClasses();

} // Package
