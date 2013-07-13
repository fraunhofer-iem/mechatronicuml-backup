/**
 */
package de.fujaba.properties;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.properties.PropertyCategory#getTitle <em>Title</em>}</li>
 *   <li>{@link de.fujaba.properties.PropertyCategory#isVertical <em>Vertical</em>}</li>
 *   <li>{@link de.fujaba.properties.PropertyCategory#isOpen <em>Open</em>}</li>
 *   <li>{@link de.fujaba.properties.PropertyCategory#getClazz <em>Clazz</em>}</li>
 *   <li>{@link de.fujaba.properties.PropertyCategory#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getPropertyCategory()
 * @model
 * @generated
 */
public interface PropertyCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.fujaba.properties.PropertiesPackage#getPropertyCategory_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.PropertyCategory#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Vertical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical</em>' attribute.
	 * @see #setVertical(boolean)
	 * @see de.fujaba.properties.PropertiesPackage#getPropertyCategory_Vertical()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isVertical();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.PropertyCategory#isVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical</em>' attribute.
	 * @see #isVertical()
	 * @generated
	 */
	void setVertical(boolean value);

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(boolean)
	 * @see de.fujaba.properties.PropertiesPackage#getPropertyCategory_Open()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.PropertyCategory#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.Class#getPropertyCategories <em>Property Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' container reference.
	 * @see #setClazz(de.fujaba.properties.Class)
	 * @see de.fujaba.properties.PropertiesPackage#getPropertyCategory_Clazz()
	 * @see de.fujaba.properties.Class#getPropertyCategories
	 * @model opposite="propertyCategories" required="true" transient="false"
	 * @generated
	 */
	de.fujaba.properties.Class getClazz();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.PropertyCategory#getClazz <em>Clazz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' container reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(de.fujaba.properties.Class value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link de.fujaba.properties.Property}.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.Property#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see de.fujaba.properties.PropertiesPackage#getPropertyCategory_Properties()
	 * @see de.fujaba.properties.Property#getCategory
	 * @model opposite="category"
	 * @generated
	 */
	EList<Property> getProperties();

} // PropertyCategory
