/**
 */
package org.muml.ape.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.ape.PropertiesPackage;
import org.muml.ape.PropertyGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.impl.PackageImpl#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link org.muml.ape.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.muml.ape.impl.PackageImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements org.muml.ape.Package {
	/**
	 * The cached value of the '{@link #getGenPackage() <em>Gen Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenPackage()
	 * @generated
	 * @ordered
	 */
	protected GenPackage genPackage;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.muml.ape.Class> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage getGenPackage() {
		if (genPackage != null && genPackage.eIsProxy()) {
			InternalEObject oldGenPackage = (InternalEObject)genPackage;
			genPackage = (GenPackage)eResolveProxy(oldGenPackage);
			if (genPackage != oldGenPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PACKAGE__GEN_PACKAGE, oldGenPackage, genPackage));
			}
		}
		return genPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage basicGetGenPackage() {
		return genPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPackage(GenPackage newGenPackage) {
		GenPackage oldGenPackage = genPackage;
		genPackage = newGenPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PACKAGE__GEN_PACKAGE, oldGenPackage, genPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.muml.ape.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<org.muml.ape.Class>(org.muml.ape.Class.class, this, PropertiesPackage.PACKAGE__CLASSES, PropertiesPackage.CLASS__PACKAGE);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyGenerator getGenerator() {
		if (eContainerFeatureID() != PropertiesPackage.PACKAGE__GENERATOR) return null;
		return (PropertyGenerator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(PropertyGenerator newGenerator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenerator, PropertiesPackage.PACKAGE__GENERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(PropertyGenerator newGenerator) {
		if (newGenerator != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.PACKAGE__GENERATOR && newGenerator != null)) {
			if (EcoreUtil.isAncestor(this, newGenerator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenerator != null)
				msgs = ((InternalEObject)newGenerator).eInverseAdd(this, PropertiesPackage.PROPERTY_GENERATOR__PACKAGES, PropertyGenerator.class, msgs);
			msgs = basicSetGenerator(newGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PACKAGE__GENERATOR, newGenerator, newGenerator));
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
			case PropertiesPackage.PACKAGE__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case PropertiesPackage.PACKAGE__GENERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenerator((PropertyGenerator)otherEnd, msgs);
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
			case PropertiesPackage.PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.PACKAGE__GENERATOR:
				return basicSetGenerator(null, msgs);
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
			case PropertiesPackage.PACKAGE__GENERATOR:
				return eInternalContainer().eInverseRemove(this, PropertiesPackage.PROPERTY_GENERATOR__PACKAGES, PropertyGenerator.class, msgs);
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
			case PropertiesPackage.PACKAGE__GEN_PACKAGE:
				if (resolve) return getGenPackage();
				return basicGetGenPackage();
			case PropertiesPackage.PACKAGE__CLASSES:
				return getClasses();
			case PropertiesPackage.PACKAGE__GENERATOR:
				return getGenerator();
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
			case PropertiesPackage.PACKAGE__GEN_PACKAGE:
				setGenPackage((GenPackage)newValue);
				return;
			case PropertiesPackage.PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends org.muml.ape.Class>)newValue);
				return;
			case PropertiesPackage.PACKAGE__GENERATOR:
				setGenerator((PropertyGenerator)newValue);
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
			case PropertiesPackage.PACKAGE__GEN_PACKAGE:
				setGenPackage((GenPackage)null);
				return;
			case PropertiesPackage.PACKAGE__CLASSES:
				getClasses().clear();
				return;
			case PropertiesPackage.PACKAGE__GENERATOR:
				setGenerator((PropertyGenerator)null);
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
			case PropertiesPackage.PACKAGE__GEN_PACKAGE:
				return genPackage != null;
			case PropertiesPackage.PACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case PropertiesPackage.PACKAGE__GENERATOR:
				return getGenerator() != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
