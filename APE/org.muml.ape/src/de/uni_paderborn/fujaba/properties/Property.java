/**
 */
package de.uni_paderborn.fujaba.properties;

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
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getGenFeature <em>Gen Feature</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getVisibilityFilters <em>Visibility Filters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getReadOnlyFilters <em>Read Only Filters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getTab <em>Tab</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getEditor <em>Editor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#isReconcile <em>Reconcile</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getCreationConstraint <em>Creation Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getCreationOppositeConstraint <em>Creation Opposite Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.Property#getInitializeOCLExpression <em>Initialize OCL Expression</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CreationConstraintForContainments CreationOppositeConstraintForContainers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CreationConstraintForContainments='-- Creation Constraint must only be defined for Properties of containment references.\n(not creationConstraint.oclIsUndefined()) implies (genFeature.ecoreFeature.oclIsKindOf(ecore::EReference) and genFeature.ecoreFeature.oclAsType(ecore::EReference).containment)' CreationOppositeConstraintForContainers='-- Creation Opposite Constraint must only be defined for Properties with an EOpposite of type containment reference.\n(not creationOppositeConstraint.oclIsUndefined()) implies (genFeature.ecoreFeature.oclIsKindOf(ecore::EReference) and genFeature.ecoreFeature.oclAsType(ecore::EReference).container)'"
 * @generated
 */
public interface Property extends OrderedElement {
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
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_GenFeature()
	 * @model required="true"
	 * @generated
	 */
	GenFeature getGenFeature();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Property#getGenFeature <em>Gen Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Feature</em>' reference.
	 * @see #getGenFeature()
	 * @generated
	 */
	void setGenFeature(GenFeature value);

	/**
	 * Returns the value of the '<em><b>Visibility Filters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.properties.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Filters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_VisibilityFilters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getVisibilityFilters();

	/**
	 * Returns the value of the '<em><b>Read Only Filters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.properties.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only Filters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_ReadOnlyFilters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getReadOnlyFilters();

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
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_Tab()
	 * @model required="true"
	 * @generated
	 */
	PropertyTab getTab();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Property#getTab <em>Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab</em>' reference.
	 * @see #getTab()
	 * @generated
	 */
	void setTab(PropertyTab value);

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.properties.PropertyEditor#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference.
	 * @see #setEditor(PropertyEditor)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_Editor()
	 * @see de.uni_paderborn.fujaba.properties.PropertyEditor#getProperty
	 * @model opposite="property" containment="true"
	 * @generated
	 */
	PropertyEditor getEditor();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Property#getEditor <em>Editor</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_Tooltip()
	 * @model
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Property#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

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
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_Reconcile()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isReconcile();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Property#isReconcile <em>Reconcile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconcile</em>' attribute.
	 * @see #isReconcile()
	 * @generated
	 */
	void setReconcile(boolean value);

	/**
	 * Returns the value of the '<em><b>Creation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Constraint</em>' containment reference.
	 * @see #setCreationConstraint(CreationConstraint)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_CreationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	CreationConstraint getCreationConstraint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Property#getCreationConstraint <em>Creation Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Constraint</em>' containment reference.
	 * @see #getCreationConstraint()
	 * @generated
	 */
	void setCreationConstraint(CreationConstraint value);

	/**
	 * Returns the value of the '<em><b>Creation Opposite Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Opposite Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Opposite Constraint</em>' containment reference.
	 * @see #setCreationOppositeConstraint(CreationConstraint)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_CreationOppositeConstraint()
	 * @model containment="true"
	 * @generated
	 */
	CreationConstraint getCreationOppositeConstraint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Property#getCreationOppositeConstraint <em>Creation Opposite Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Opposite Constraint</em>' containment reference.
	 * @see #getCreationOppositeConstraint()
	 * @generated
	 */
	void setCreationOppositeConstraint(CreationConstraint value);

	/**
	 * Returns the value of the '<em><b>Initialize OCL Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize OCL Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialize OCL Expression</em>' attribute.
	 * @see #setInitializeOCLExpression(String)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getProperty_InitializeOCLExpression()
	 * @model
	 * @generated
	 */
	String getInitializeOCLExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.Property#getInitializeOCLExpression <em>Initialize OCL Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize OCL Expression</em>' attribute.
	 * @see #getInitializeOCLExpression()
	 * @generated
	 */
	void setInitializeOCLExpression(String value);

} // Property
