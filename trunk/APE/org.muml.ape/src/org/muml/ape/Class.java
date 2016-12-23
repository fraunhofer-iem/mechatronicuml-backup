/**
 */
package org.muml.ape;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.Class#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link org.muml.ape.Class#getPackage <em>Package</em>}</li>
 *   <li>{@link org.muml.ape.Class#getOrderedElements <em>Ordered Elements</em>}</li>
 *   <li>{@link org.muml.ape.Class#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link org.muml.ape.Class#getAllSuperClasses <em>All Super Classes</em>}</li>
 *   <li>{@link org.muml.ape.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.muml.ape.Class#getBaseInsertPoints <em>Base Insert Points</em>}</li>
 *   <li>{@link org.muml.ape.Class#getPropertyCategories <em>Property Categories</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getClass_()
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
	 * @see org.muml.ape.PropertiesPackage#getClass_GenClass()
	 * @model required="true"
	 * @generated
	 */
	GenClass getGenClass();

	/**
	 * Sets the value of the '{@link org.muml.ape.Class#getGenClass <em>Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Class</em>' reference.
	 * @see #getGenClass()
	 * @generated
	 */
	void setGenClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.ape.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(org.muml.ape.Package)
	 * @see org.muml.ape.PropertiesPackage#getClass_Package()
	 * @see org.muml.ape.Package#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	org.muml.ape.Package getPackage();

	/**
	 * Sets the value of the '{@link org.muml.ape.Class#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.muml.ape.Package value);

	/**
	 * Returns the value of the '<em><b>Ordered Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.ape.OrderedElement}.
	 * It is bidirectional and its opposite is '{@link org.muml.ape.OrderedElement#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Elements</em>' containment reference list.
	 * @see org.muml.ape.PropertiesPackage#getClass_OrderedElements()
	 * @see org.muml.ape.OrderedElement#getClazz
	 * @model opposite="clazz" containment="true"
	 * @generated
	 */
	EList<OrderedElement> getOrderedElements();

	/**
	 * Returns the value of the '<em><b>Super Classes</b></em>' reference list.
	 * The list contents are of type {@link org.muml.ape.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classes</em>' reference list.
	 * @see org.muml.ape.PropertiesPackage#getClass_SuperClasses()
	 * @model
	 * @generated
	 */
	EList<Class> getSuperClasses();

	/**
	 * Returns the value of the '<em><b>All Super Classes</b></em>' reference list.
	 * The list contents are of type {@link org.muml.ape.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Super Classes</em>' reference list.
	 * @see org.muml.ape.PropertiesPackage#getClass_AllSuperClasses()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self->closure(superClasses)'"
	 * @generated
	 */
	EList<Class> getAllSuperClasses();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link org.muml.ape.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see org.muml.ape.PropertiesPackage#getClass_Properties()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='orderedElements->select(p | p.oclIsKindOf(Property)).oclAsType(Property)->asOrderedSet()'"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Base Insert Points</b></em>' reference list.
	 * The list contents are of type {@link org.muml.ape.BaseInsertPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Insert Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Insert Points</em>' reference list.
	 * @see org.muml.ape.PropertiesPackage#getClass_BaseInsertPoints()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='orderedElements->select(p | p.oclIsKindOf(BaseInsertPoint)).oclAsType(BaseInsertPoint)->asOrderedSet()'"
	 * @generated
	 */
	EList<BaseInsertPoint> getBaseInsertPoints();

	/**
	 * Returns the value of the '<em><b>Property Categories</b></em>' reference list.
	 * The list contents are of type {@link org.muml.ape.PropertyCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Categories</em>' reference list.
	 * @see org.muml.ape.PropertiesPackage#getClass_PropertyCategories()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='orderedElements->select(p | p.oclIsKindOf(PropertyCategory)).oclAsType(PropertyCategory)->asOrderedSet()'"
	 * @generated
	 */
	EList<PropertyCategory> getPropertyCategories();

} // Class
