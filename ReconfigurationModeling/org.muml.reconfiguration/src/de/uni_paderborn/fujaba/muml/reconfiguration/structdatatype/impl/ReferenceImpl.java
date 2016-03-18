/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Reference;
import de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructType;
import de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage;
import de.uni_paderborn.fujaba.muml.types.DataType;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.impl.ReferenceImpl#getStructType <em>Struct Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.impl.ReferenceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.impl.ReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends NamedElementImpl implements Reference {
	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructdatatypePackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructType getStructType() {
		if (eContainerFeatureID() != StructdatatypePackage.REFERENCE__STRUCT_TYPE) return null;
		return (StructType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructType(StructType newStructType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStructType, StructdatatypePackage.REFERENCE__STRUCT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructType(StructType newStructType) {
		if (newStructType != eInternalContainer() || (eContainerFeatureID() != StructdatatypePackage.REFERENCE__STRUCT_TYPE && newStructType != null)) {
			if (EcoreUtil.isAncestor(this, newStructType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStructType != null)
				msgs = ((InternalEObject)newStructType).eInverseAdd(this, StructdatatypePackage.STRUCT_TYPE__REFERENCES, StructType.class, msgs);
			msgs = basicSetStructType(newStructType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructdatatypePackage.REFERENCE__STRUCT_TYPE, newStructType, newStructType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructdatatypePackage.REFERENCE__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructdatatypePackage.REFERENCE__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructdatatypePackage.REFERENCE__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructdatatypePackage.REFERENCE__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructdatatypePackage.REFERENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructdatatypePackage.REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructdatatypePackage.REFERENCE__STRUCT_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStructType((StructType)otherEnd, msgs);
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
			case StructdatatypePackage.REFERENCE__STRUCT_TYPE:
				return basicSetStructType(null, msgs);
			case StructdatatypePackage.REFERENCE__CARDINALITY:
				return basicSetCardinality(null, msgs);
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
			case StructdatatypePackage.REFERENCE__STRUCT_TYPE:
				return eInternalContainer().eInverseRemove(this, StructdatatypePackage.STRUCT_TYPE__REFERENCES, StructType.class, msgs);
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
			case StructdatatypePackage.REFERENCE__STRUCT_TYPE:
				return getStructType();
			case StructdatatypePackage.REFERENCE__CARDINALITY:
				return getCardinality();
			case StructdatatypePackage.REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructdatatypePackage.REFERENCE__STRUCT_TYPE:
				setStructType((StructType)newValue);
				return;
			case StructdatatypePackage.REFERENCE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case StructdatatypePackage.REFERENCE__TYPE:
				setType((DataType)newValue);
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
			case StructdatatypePackage.REFERENCE__STRUCT_TYPE:
				setStructType((StructType)null);
				return;
			case StructdatatypePackage.REFERENCE__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case StructdatatypePackage.REFERENCE__TYPE:
				setType((DataType)null);
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
			case StructdatatypePackage.REFERENCE__STRUCT_TYPE:
				return getStructType() != null;
			case StructdatatypePackage.REFERENCE__CARDINALITY:
				return cardinality != null;
			case StructdatatypePackage.REFERENCE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
