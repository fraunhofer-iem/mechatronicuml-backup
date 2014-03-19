/**
 */
package de.uni_paderborn.fujaba.properties;

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
 *   <li>{@link de.uni_paderborn.fujaba.properties.Class#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Class#getPackage <em>Package</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Class#getPropertyCategories <em>Property Categories</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Class#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Class#getAllSuperClasses <em>All Super Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getClass_()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueFeatures UniqueCategoryTitles PropertiesFromSelfOrSuperclasses'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueFeatures='true -- properties->isUnique(genFeature)' UniqueCategoryTitles='propertyCategories->isUnique(title)' PropertiesFromSelfOrSuperclasses='properties->forAll(p | Set { self }->union(allSuperClasses).genClass.ecoreClass->includes(p.genFeature.ecoreFeature.eContainingClass))'"
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
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getClass_GenClass()
	 * @model required="true"
	 * @generated
	 */
	GenClass getGenClass();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Class#getGenClass <em>Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Class</em>' reference.
	 * @see #getGenClass()
	 * @generated
	 */
	void setGenClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.properties.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(de.uni_paderborn.fujaba.properties.Package)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getClass_Package()
	 * @see de.uni_paderborn.fujaba.properties.Package#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	de.uni_paderborn.fujaba.properties.Package getPackage();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Class#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(de.uni_paderborn.fujaba.properties.Package value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.properties.Property}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.properties.Property#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getClass_Properties()
	 * @see de.uni_paderborn.fujaba.properties.Property#getClazz
	 * @model opposite="clazz" containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Property Categories</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.properties.PropertyCategory}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.properties.PropertyCategory#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Categories</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getClass_PropertyCategories()
	 * @see de.uni_paderborn.fujaba.properties.PropertyCategory#getClazz
	 * @model opposite="clazz" containment="true"
	 * @generated
	 */
	EList<PropertyCategory> getPropertyCategories();

	/**
	 * Returns the value of the '<em><b>Super Classes</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.properties.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classes</em>' reference list.
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getClass_SuperClasses()
	 * @model
	 * @generated
	 */
	EList<Class> getSuperClasses();

	/**
	 * Returns the value of the '<em><b>All Super Classes</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.properties.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Super Classes</em>' reference list.
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getClass_AllSuperClasses()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self->closure(superClasses)'"
	 * @generated
	 */
	EList<Class> getAllSuperClasses();

} // Class
