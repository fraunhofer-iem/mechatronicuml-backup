/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage;

import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Instance Story Diagram To Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ClockInstanceStoryDiagramToIdentifierImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ClockInstanceStoryDiagramToIdentifierImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockInstanceStoryDiagramToIdentifierImpl extends EObjectImpl implements BasicEMap.Entry<ClockInstanceStoryDiagram,EList<String>> {
	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected ClockInstanceStoryDiagram key;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockInstanceStoryDiagramToIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtautomatonPackage.Literals.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceStoryDiagram getTypedKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (ClockInstanceStoryDiagram)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceStoryDiagram basicGetTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(ClockInstanceStoryDiagram newKey) {
		ClockInstanceStoryDiagram oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTypedValue() {
		if (value == null) {
			value = new EDataTypeUniqueEList<String>(String.class, this, GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY:
				if (resolve) return getTypedKey();
				return basicGetTypedKey();
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__VALUE:
				return getTypedValue();
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
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY:
				setTypedKey((ClockInstanceStoryDiagram)newValue);
				return;
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__VALUE:
				getTypedValue().clear();
				getTypedValue().addAll((Collection<? extends String>)newValue);
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
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY:
				setTypedKey((ClockInstanceStoryDiagram)null);
				return;
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__VALUE:
				getTypedValue().clear();
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
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY:
				return key != null;
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__VALUE:
				return value != null && !value.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceStoryDiagram getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(ClockInstanceStoryDiagram key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> setValue(EList<String> value) {
		EList<String> oldValue = getValue();
		getTypedValue().clear();
		getTypedValue().addAll(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<ClockInstanceStoryDiagram, EList<String>> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<ClockInstanceStoryDiagram, EList<String>>)container.eGet(eContainmentFeature());
	}

} //ClockInstanceStoryDiagramToIdentifierImpl
