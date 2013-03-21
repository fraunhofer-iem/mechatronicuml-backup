/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.fujaba.properties.GroupPropertyEditor;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Property Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fujaba.properties.impl.GroupPropertyEditorImpl#getNavigatedProperties <em>Navigated Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupPropertyEditorImpl extends PropertyEditorImpl implements GroupPropertyEditor {
	/**
	 * The cached value of the '{@link #getNavigatedProperties() <em>Navigated Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigatedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigatedProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupPropertyEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.GROUP_PROPERTY_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigatedProperties() {
		if (navigatedProperties == null) {
			navigatedProperties = new EObjectResolvingEList<Property>(Property.class, this, PropertiesPackage.GROUP_PROPERTY_EDITOR__NAVIGATED_PROPERTIES);
		}
		return navigatedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.GROUP_PROPERTY_EDITOR__NAVIGATED_PROPERTIES:
				return getNavigatedProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PropertiesPackage.GROUP_PROPERTY_EDITOR__NAVIGATED_PROPERTIES:
				getNavigatedProperties().clear();
				getNavigatedProperties().addAll((Collection<? extends Property>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PropertiesPackage.GROUP_PROPERTY_EDITOR__NAVIGATED_PROPERTIES:
				getNavigatedProperties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PropertiesPackage.GROUP_PROPERTY_EDITOR__NAVIGATED_PROPERTIES:
				return navigatedProperties != null && !navigatedProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupPropertyEditorImpl
