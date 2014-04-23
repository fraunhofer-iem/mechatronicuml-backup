/**
 */
package de.uni_paderborn.fujaba.properties.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.Property;
import de.uni_paderborn.fujaba.properties.PropertyCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ClassImpl#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ClassImpl#getPropertyCategories <em>Property Categories</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ClassImpl#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ClassImpl#getAllSuperClasses <em>All Super Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EObjectImpl implements de.uni_paderborn.fujaba.properties.Class {
	/**
	 * The cached value of the '{@link #getGenClass() <em>Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenClass()
	 * @generated
	 * @ordered
	 */
	protected GenClass genClass;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getPropertyCategories() <em>Property Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyCategory> propertyCategories;

	/**
	 * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<de.uni_paderborn.fujaba.properties.Class> superClasses;

	/**
	 * The cached setting delegate for the '{@link #getAllSuperClasses() <em>All Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_SUPER_CLASSES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PropertiesPackage.Literals.CLASS__ALL_SUPER_CLASSES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getGenClass() {
		if (genClass != null && genClass.eIsProxy()) {
			InternalEObject oldGenClass = (InternalEObject)genClass;
			genClass = (GenClass)eResolveProxy(oldGenClass);
			if (genClass != oldGenClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.CLASS__GEN_CLASS, oldGenClass, genClass));
			}
		}
		return genClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetGenClass() {
		return genClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenClass(GenClass newGenClass) {
		GenClass oldGenClass = genClass;
		genClass = newGenClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CLASS__GEN_CLASS, oldGenClass, genClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.properties.Package getPackage() {
		if (eContainerFeatureID() != PropertiesPackage.CLASS__PACKAGE) return null;
		return (de.uni_paderborn.fujaba.properties.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(de.uni_paderborn.fujaba.properties.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, PropertiesPackage.CLASS__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(de.uni_paderborn.fujaba.properties.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.CLASS__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, PropertiesPackage.PACKAGE__CLASSES, de.uni_paderborn.fujaba.properties.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CLASS__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentWithInverseEList<Property>(Property.class, this, PropertiesPackage.CLASS__PROPERTIES, PropertiesPackage.PROPERTY__CLAZZ);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyCategory> getPropertyCategories() {
		if (propertyCategories == null) {
			propertyCategories = new EObjectContainmentWithInverseEList<PropertyCategory>(PropertyCategory.class, this, PropertiesPackage.CLASS__PROPERTY_CATEGORIES, PropertiesPackage.PROPERTY_CATEGORY__CLAZZ);
		}
		return propertyCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.uni_paderborn.fujaba.properties.Class> getSuperClasses() {
		if (superClasses == null) {
			superClasses = new EObjectResolvingEList<de.uni_paderborn.fujaba.properties.Class>(de.uni_paderborn.fujaba.properties.Class.class, this, PropertiesPackage.CLASS__SUPER_CLASSES);
		}
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<de.uni_paderborn.fujaba.properties.Class> getAllSuperClasses() {
		return (EList<de.uni_paderborn.fujaba.properties.Class>)ALL_SUPER_CLASSES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.CLASS__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((de.uni_paderborn.fujaba.properties.Package)otherEnd, msgs);
			case PropertiesPackage.CLASS__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyCategories()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.CLASS__PACKAGE:
				return basicSetPackage(null, msgs);
			case PropertiesPackage.CLASS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				return ((InternalEList<?>)getPropertyCategories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PropertiesPackage.CLASS__PACKAGE:
				return eInternalContainer().eInverseRemove(this, PropertiesPackage.PACKAGE__CLASSES, de.uni_paderborn.fujaba.properties.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.CLASS__GEN_CLASS:
				if (resolve) return getGenClass();
				return basicGetGenClass();
			case PropertiesPackage.CLASS__PACKAGE:
				return getPackage();
			case PropertiesPackage.CLASS__PROPERTIES:
				return getProperties();
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				return getPropertyCategories();
			case PropertiesPackage.CLASS__SUPER_CLASSES:
				return getSuperClasses();
			case PropertiesPackage.CLASS__ALL_SUPER_CLASSES:
				return getAllSuperClasses();
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
			case PropertiesPackage.CLASS__GEN_CLASS:
				setGenClass((GenClass)newValue);
				return;
			case PropertiesPackage.CLASS__PACKAGE:
				setPackage((de.uni_paderborn.fujaba.properties.Package)newValue);
				return;
			case PropertiesPackage.CLASS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				getPropertyCategories().clear();
				getPropertyCategories().addAll((Collection<? extends PropertyCategory>)newValue);
				return;
			case PropertiesPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends de.uni_paderborn.fujaba.properties.Class>)newValue);
				return;
			case PropertiesPackage.CLASS__ALL_SUPER_CLASSES:
				getAllSuperClasses().clear();
				getAllSuperClasses().addAll((Collection<? extends de.uni_paderborn.fujaba.properties.Class>)newValue);
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
			case PropertiesPackage.CLASS__GEN_CLASS:
				setGenClass((GenClass)null);
				return;
			case PropertiesPackage.CLASS__PACKAGE:
				setPackage((de.uni_paderborn.fujaba.properties.Package)null);
				return;
			case PropertiesPackage.CLASS__PROPERTIES:
				getProperties().clear();
				return;
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				getPropertyCategories().clear();
				return;
			case PropertiesPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				return;
			case PropertiesPackage.CLASS__ALL_SUPER_CLASSES:
				getAllSuperClasses().clear();
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
			case PropertiesPackage.CLASS__GEN_CLASS:
				return genClass != null;
			case PropertiesPackage.CLASS__PACKAGE:
				return getPackage() != null;
			case PropertiesPackage.CLASS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				return propertyCategories != null && !propertyCategories.isEmpty();
			case PropertiesPackage.CLASS__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
			case PropertiesPackage.CLASS__ALL_SUPER_CLASSES:
				return ALL_SUPER_CLASSES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
