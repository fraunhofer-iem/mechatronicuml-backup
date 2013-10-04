/**
 */
package de.fujaba.properties;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.properties.Property#getGenFeature <em>Gen Feature</em>}</li>
 *   <li>{@link de.fujaba.properties.Property#getFilters <em>Filters</em>}</li>
 *   <li>{@link de.fujaba.properties.Property#getTab <em>Tab</em>}</li>
 *   <li>{@link de.fujaba.properties.Property#getEditor <em>Editor</em>}</li>
 *   <li>{@link de.fujaba.properties.Property#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link de.fujaba.properties.Property#getClazz <em>Clazz</em>}</li>
 *   <li>{@link de.fujaba.properties.Property#getCategory <em>Category</em>}</li>
 *   <li>{@link de.fujaba.properties.Property#isReconcile <em>Reconcile</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Feature</em>' reference.
	 * @see #setGenFeature(GenFeature)
	 * @see de.fujaba.properties.PropertiesPackage#getProperty_GenFeature()
	 * @model required="true"
	 * @generated
	 */
	GenFeature getGenFeature();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Property#getGenFeature <em>Gen Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Feature</em>' reference.
	 * @see #getGenFeature()
	 * @generated
	 */
	void setGenFeature(GenFeature value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link de.fujaba.properties.PropertyFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see de.fujaba.properties.PropertiesPackage#getProperty_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyFilter> getFilters();

	/**
	 * Returns the value of the '<em><b>Tab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab</em>' reference.
	 * @see #setTab(PropertyTab)
	 * @see de.fujaba.properties.PropertiesPackage#getProperty_Tab()
	 * @model required="true"
	 * @generated
	 */
	PropertyTab getTab();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Property#getTab <em>Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab</em>' reference.
	 * @see #getTab()
	 * @generated
	 */
	void setTab(PropertyTab value);

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.PropertyEditor#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference.
	 * @see #setEditor(PropertyEditor)
	 * @see de.fujaba.properties.PropertiesPackage#getProperty_Editor()
	 * @see de.fujaba.properties.PropertyEditor#getProperty
	 * @model opposite="property" containment="true" required="true"
	 * @generated
	 */
	PropertyEditor getEditor();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Property#getEditor <em>Editor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' containment reference.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(PropertyEditor value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see de.fujaba.properties.PropertiesPackage#getProperty_Tooltip()
	 * @model
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Property#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' container reference.
	 * @see #setClazz(de.fujaba.properties.Class)
	 * @see de.fujaba.properties.PropertiesPackage#getProperty_Clazz()
	 * @see de.fujaba.properties.Class#getProperties
	 * @model opposite="properties" required="true" transient="false"
	 * @generated
	 */
	de.fujaba.properties.Class getClazz();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Property#getClazz <em>Clazz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' container reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(de.fujaba.properties.Class value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.PropertyCategory#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(PropertyCategory)
	 * @see de.fujaba.properties.PropertiesPackage#getProperty_Category()
	 * @see de.fujaba.properties.PropertyCategory#getProperties
	 * @model opposite="properties"
	 * @generated
	 */
	PropertyCategory getCategory();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Property#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(PropertyCategory value);

	/**
	 * Returns the value of the '<em><b>Reconcile</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconcile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconcile</em>' attribute.
	 * @see #setReconcile(boolean)
	 * @see de.fujaba.properties.PropertiesPackage#getProperty_Reconcile()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isReconcile();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.Property#isReconcile <em>Reconcile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconcile</em>' attribute.
	 * @see #isReconcile()
	 * @generated
	 */
	void setReconcile(boolean value);

} // Property
