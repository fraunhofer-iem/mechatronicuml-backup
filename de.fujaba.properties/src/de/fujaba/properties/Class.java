/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.properties.Class#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link de.fujaba.properties.Class#getPackage <em>Package</em>}</li>
 *   <li>{@link de.fujaba.properties.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.fujaba.properties.Class#getPropertyCategories <em>Property Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getClass_()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueFeatures'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueFeatures='properties->isUnique(genFeature)'"
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Class</em>' reference.
	 * @see #setGenClass(GenClass)
	 * @see de.fujaba.properties.PropertiesPackage#getClass_GenClass()
	 * @model required="true"
	 * @generated
	 */
	GenClass getGenClass();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Class#getGenClass <em>Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Class</em>' reference.
	 * @see #getGenClass()
	 * @generated
	 */
	void setGenClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(de.fujaba.properties.Package)
	 * @see de.fujaba.properties.PropertiesPackage#getClass_Package()
	 * @see de.fujaba.properties.Package#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	de.fujaba.properties.Package getPackage();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Class#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(de.fujaba.properties.Package value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.fujaba.properties.Property}.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.Property#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see de.fujaba.properties.PropertiesPackage#getClass_Properties()
	 * @see de.fujaba.properties.Property#getClazz
	 * @model opposite="clazz" containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Property Categories</b></em>' containment reference list.
	 * The list contents are of type {@link de.fujaba.properties.PropertyCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Categories</em>' containment reference list.
	 * @see de.fujaba.properties.PropertiesPackage#getClass_PropertyCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyCategory> getPropertyCategories();

} // Class
