/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.fujaba.properties.GroupPropertySection;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.PropertyReference;
import de.fujaba.properties.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Property Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fujaba.properties.impl.GroupPropertySectionImpl#getReferencedProperties <em>Referenced Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupPropertySectionImpl extends PropertySectionImpl implements GroupPropertySection {
	/**
	 * The cached value of the '{@link #getReferencedProperties() <em>Referenced Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyReference> referencedProperties;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupPropertySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.GROUP_PROPERTY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyReference> getReferencedProperties() {
		if (referencedProperties == null) {
			referencedProperties = new EObjectContainmentEList<PropertyReference>(PropertyReference.class, this, PropertiesPackage.GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES);
		}
		return referencedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES:
				return ((InternalEList<?>)getReferencedProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES:
				return getReferencedProperties();
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
			case PropertiesPackage.GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES:
				getReferencedProperties().clear();
				getReferencedProperties().addAll((Collection<? extends PropertyReference>)newValue);
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
			case PropertiesPackage.GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES:
				getReferencedProperties().clear();
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
			case PropertiesPackage.GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES:
				return referencedProperties != null && !referencedProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupPropertySectionImpl
