/**
 */
package de.uni_paderborn.fujaba.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.Property;
import de.uni_paderborn.fujaba.properties.PropertyCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyCategoryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyCategoryImpl#isVertical <em>Vertical</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyCategoryImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyCategoryImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyCategoryImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyCategoryImpl extends EObjectImpl implements PropertyCategory {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean vertical = VERTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean open = OPEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.PROPERTY_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_CATEGORY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVertical() {
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertical(boolean newVertical) {
		boolean oldVertical = vertical;
		vertical = newVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_CATEGORY__VERTICAL, oldVertical, vertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpen(boolean newOpen) {
		boolean oldOpen = open;
		open = newOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_CATEGORY__OPEN, oldOpen, open));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.properties.Class getClazz() {
		if (eContainerFeatureID() != PropertiesPackage.PROPERTY_CATEGORY__CLAZZ) return null;
		return (de.uni_paderborn.fujaba.properties.Class)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClazz(de.uni_paderborn.fujaba.properties.Class newClazz, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClazz, PropertiesPackage.PROPERTY_CATEGORY__CLAZZ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(de.uni_paderborn.fujaba.properties.Class newClazz) {
		if (newClazz != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.PROPERTY_CATEGORY__CLAZZ && newClazz != null)) {
			if (EcoreUtil.isAncestor(this, newClazz))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClazz != null)
				msgs = ((InternalEObject)newClazz).eInverseAdd(this, PropertiesPackage.CLASS__PROPERTY_CATEGORIES, de.uni_paderborn.fujaba.properties.Class.class, msgs);
			msgs = basicSetClazz(newClazz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_CATEGORY__CLAZZ, newClazz, newClazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectWithInverseResolvingEList<Property>(Property.class, this, PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES, PropertiesPackage.PROPERTY__CATEGORY);
		}
		return properties;
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
			case PropertiesPackage.PROPERTY_CATEGORY__CLAZZ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClazz((de.uni_paderborn.fujaba.properties.Class)otherEnd, msgs);
			case PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
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
			case PropertiesPackage.PROPERTY_CATEGORY__CLAZZ:
				return basicSetClazz(null, msgs);
			case PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.PROPERTY_CATEGORY__CLAZZ:
				return eInternalContainer().eInverseRemove(this, PropertiesPackage.CLASS__PROPERTY_CATEGORIES, de.uni_paderborn.fujaba.properties.Class.class, msgs);
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
			case PropertiesPackage.PROPERTY_CATEGORY__TITLE:
				return getTitle();
			case PropertiesPackage.PROPERTY_CATEGORY__VERTICAL:
				return isVertical();
			case PropertiesPackage.PROPERTY_CATEGORY__OPEN:
				return isOpen();
			case PropertiesPackage.PROPERTY_CATEGORY__CLAZZ:
				return getClazz();
			case PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES:
				return getProperties();
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
			case PropertiesPackage.PROPERTY_CATEGORY__TITLE:
				setTitle((String)newValue);
				return;
			case PropertiesPackage.PROPERTY_CATEGORY__VERTICAL:
				setVertical((Boolean)newValue);
				return;
			case PropertiesPackage.PROPERTY_CATEGORY__OPEN:
				setOpen((Boolean)newValue);
				return;
			case PropertiesPackage.PROPERTY_CATEGORY__CLAZZ:
				setClazz((de.uni_paderborn.fujaba.properties.Class)newValue);
				return;
			case PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case PropertiesPackage.PROPERTY_CATEGORY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PropertiesPackage.PROPERTY_CATEGORY__VERTICAL:
				setVertical(VERTICAL_EDEFAULT);
				return;
			case PropertiesPackage.PROPERTY_CATEGORY__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case PropertiesPackage.PROPERTY_CATEGORY__CLAZZ:
				setClazz((de.uni_paderborn.fujaba.properties.Class)null);
				return;
			case PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES:
				getProperties().clear();
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
			case PropertiesPackage.PROPERTY_CATEGORY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PropertiesPackage.PROPERTY_CATEGORY__VERTICAL:
				return vertical != VERTICAL_EDEFAULT;
			case PropertiesPackage.PROPERTY_CATEGORY__OPEN:
				return open != OPEN_EDEFAULT;
			case PropertiesPackage.PROPERTY_CATEGORY__CLAZZ:
				return getClazz() != null;
			case PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", vertical: ");
		result.append(vertical);
		result.append(", open: ");
		result.append(open);
		result.append(')');
		return result.toString();
	}

} //PropertyCategoryImpl
