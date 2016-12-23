/**
 */
package org.muml.ape.impl;

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
import org.muml.ape.BaseInsertPoint;
import org.muml.ape.OrderedElement;
import org.muml.ape.PropertiesPackage;
import org.muml.ape.Property;
import org.muml.ape.PropertyCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.impl.ClassImpl#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link org.muml.ape.impl.ClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.muml.ape.impl.ClassImpl#getOrderedElements <em>Ordered Elements</em>}</li>
 *   <li>{@link org.muml.ape.impl.ClassImpl#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link org.muml.ape.impl.ClassImpl#getAllSuperClasses <em>All Super Classes</em>}</li>
 *   <li>{@link org.muml.ape.impl.ClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.muml.ape.impl.ClassImpl#getBaseInsertPoints <em>Base Insert Points</em>}</li>
 *   <li>{@link org.muml.ape.impl.ClassImpl#getPropertyCategories <em>Property Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends EObjectImpl implements org.muml.ape.Class {
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
	 * The cached value of the '{@link #getOrderedElements() <em>Ordered Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderedElement> orderedElements;

	/**
	 * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.muml.ape.Class> superClasses;

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
	 * The cached setting delegate for the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROPERTIES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PropertiesPackage.Literals.CLASS__PROPERTIES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getBaseInsertPoints() <em>Base Insert Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseInsertPoints()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BASE_INSERT_POINTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PropertiesPackage.Literals.CLASS__BASE_INSERT_POINTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPropertyCategories() <em>Property Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyCategories()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROPERTY_CATEGORIES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PropertiesPackage.Literals.CLASS__PROPERTY_CATEGORIES).getSettingDelegate();

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
	public org.muml.ape.Package getPackage() {
		if (eContainerFeatureID() != PropertiesPackage.CLASS__PACKAGE) return null;
		return (org.muml.ape.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(org.muml.ape.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, PropertiesPackage.CLASS__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.muml.ape.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.CLASS__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, PropertiesPackage.PACKAGE__CLASSES, org.muml.ape.Package.class, msgs);
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
	public EList<OrderedElement> getOrderedElements() {
		if (orderedElements == null) {
			orderedElements = new EObjectContainmentWithInverseEList<OrderedElement>(OrderedElement.class, this, PropertiesPackage.CLASS__ORDERED_ELEMENTS, PropertiesPackage.ORDERED_ELEMENT__CLAZZ);
		}
		return orderedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.muml.ape.Class> getSuperClasses() {
		if (superClasses == null) {
			superClasses = new EObjectResolvingEList<org.muml.ape.Class>(org.muml.ape.Class.class, this, PropertiesPackage.CLASS__SUPER_CLASSES);
		}
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.muml.ape.Class> getAllSuperClasses() {
		return (EList<org.muml.ape.Class>)ALL_SUPER_CLASSES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperties() {
		return (EList<Property>)PROPERTIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BaseInsertPoint> getBaseInsertPoints() {
		return (EList<BaseInsertPoint>)BASE_INSERT_POINTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PropertyCategory> getPropertyCategories() {
		return (EList<PropertyCategory>)PROPERTY_CATEGORIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
				return basicSetPackage((org.muml.ape.Package)otherEnd, msgs);
			case PropertiesPackage.CLASS__ORDERED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrderedElements()).basicAdd(otherEnd, msgs);
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
			case PropertiesPackage.CLASS__ORDERED_ELEMENTS:
				return ((InternalEList<?>)getOrderedElements()).basicRemove(otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, PropertiesPackage.PACKAGE__CLASSES, org.muml.ape.Package.class, msgs);
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
			case PropertiesPackage.CLASS__ORDERED_ELEMENTS:
				return getOrderedElements();
			case PropertiesPackage.CLASS__SUPER_CLASSES:
				return getSuperClasses();
			case PropertiesPackage.CLASS__ALL_SUPER_CLASSES:
				return getAllSuperClasses();
			case PropertiesPackage.CLASS__PROPERTIES:
				return getProperties();
			case PropertiesPackage.CLASS__BASE_INSERT_POINTS:
				return getBaseInsertPoints();
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				return getPropertyCategories();
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
				setPackage((org.muml.ape.Package)newValue);
				return;
			case PropertiesPackage.CLASS__ORDERED_ELEMENTS:
				getOrderedElements().clear();
				getOrderedElements().addAll((Collection<? extends OrderedElement>)newValue);
				return;
			case PropertiesPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends org.muml.ape.Class>)newValue);
				return;
			case PropertiesPackage.CLASS__ALL_SUPER_CLASSES:
				getAllSuperClasses().clear();
				getAllSuperClasses().addAll((Collection<? extends org.muml.ape.Class>)newValue);
				return;
			case PropertiesPackage.CLASS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case PropertiesPackage.CLASS__BASE_INSERT_POINTS:
				getBaseInsertPoints().clear();
				getBaseInsertPoints().addAll((Collection<? extends BaseInsertPoint>)newValue);
				return;
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				getPropertyCategories().clear();
				getPropertyCategories().addAll((Collection<? extends PropertyCategory>)newValue);
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
				setPackage((org.muml.ape.Package)null);
				return;
			case PropertiesPackage.CLASS__ORDERED_ELEMENTS:
				getOrderedElements().clear();
				return;
			case PropertiesPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				return;
			case PropertiesPackage.CLASS__ALL_SUPER_CLASSES:
				getAllSuperClasses().clear();
				return;
			case PropertiesPackage.CLASS__PROPERTIES:
				getProperties().clear();
				return;
			case PropertiesPackage.CLASS__BASE_INSERT_POINTS:
				getBaseInsertPoints().clear();
				return;
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				getPropertyCategories().clear();
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
			case PropertiesPackage.CLASS__ORDERED_ELEMENTS:
				return orderedElements != null && !orderedElements.isEmpty();
			case PropertiesPackage.CLASS__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
			case PropertiesPackage.CLASS__ALL_SUPER_CLASSES:
				return ALL_SUPER_CLASSES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PropertiesPackage.CLASS__PROPERTIES:
				return PROPERTIES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PropertiesPackage.CLASS__BASE_INSERT_POINTS:
				return BASE_INSERT_POINTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PropertiesPackage.CLASS__PROPERTY_CATEGORIES:
				return PROPERTY_CATEGORIES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
