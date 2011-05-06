/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fujaba Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getEmbeddingRegion <em>Embedding Region</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FujabaRealtimeStatechartImpl extends AbstractRealtimeStatechartImpl implements FujabaRealtimeStatechart {
	/**
	 * The cached value of the '{@link #getEmbeddingRegion() <em>Embedding Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddingRegion()
	 * @generated
	 * @ordered
	 */
	protected Region embeddingRegion;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EDataType> dataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FujabaRealtimeStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getEmbeddingRegion() {
		if (embeddingRegion != null && embeddingRegion.eIsProxy()) {
			InternalEObject oldEmbeddingRegion = (InternalEObject)embeddingRegion;
			embeddingRegion = (Region)eResolveProxy(oldEmbeddingRegion);
			if (embeddingRegion != oldEmbeddingRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION, oldEmbeddingRegion, embeddingRegion));
			}
		}
		return embeddingRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetEmbeddingRegion() {
		return embeddingRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddingRegion(Region newEmbeddingRegion, NotificationChain msgs) {
		Region oldEmbeddingRegion = embeddingRegion;
		embeddingRegion = newEmbeddingRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION, oldEmbeddingRegion, newEmbeddingRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddingRegion(Region newEmbeddingRegion) {
		if (newEmbeddingRegion != embeddingRegion) {
			NotificationChain msgs = null;
			if (embeddingRegion != null)
				msgs = ((InternalEObject)embeddingRegion).eInverseRemove(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
			if (newEmbeddingRegion != null)
				msgs = ((InternalEObject)newEmbeddingRegion).eInverseAdd(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
			msgs = basicSetEmbeddingRegion(newEmbeddingRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION, newEmbeddingRegion, newEmbeddingRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<EDataType>(EDataType.class, this, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EDataType> getTopLevelDataTypes() {
		if (embeddingRegion == null) {
			return getDataTypes();
		}
		de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart root = embeddingRegion
				.getParentState().getRootRealtimeStatechart();
		if (root instanceof FujabaRealtimeStatechart) {
			return ((FujabaRealtimeStatechart) root).getDataTypes();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				if (embeddingRegion != null)
					msgs = ((InternalEObject)embeddingRegion).eInverseRemove(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
				return basicSetEmbeddingRegion((Region)otherEnd, msgs);
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				return basicSetEmbeddingRegion(null, msgs);
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				if (resolve) return getEmbeddingRegion();
				return basicGetEmbeddingRegion();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__DATA_TYPES:
				return getDataTypes();
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)newValue);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends EDataType>)newValue);
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)null);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__DATA_TYPES:
				getDataTypes().clear();
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				return embeddingRegion != null;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART___GET_TOP_LEVEL_DATA_TYPES:
				return getTopLevelDataTypes();
		}
		return super.eInvoke(operationID, arguments);
	}


} //FujabaRealtimeStatechartImpl
