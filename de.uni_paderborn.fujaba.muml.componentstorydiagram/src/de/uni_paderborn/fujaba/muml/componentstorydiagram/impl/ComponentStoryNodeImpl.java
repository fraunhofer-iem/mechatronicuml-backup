/**
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Story Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.impl.ComponentStoryNodeImpl#getComponentStoryPattern <em>Component Story Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.impl.ComponentStoryNodeImpl#isForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentStoryNodeImpl extends ActivityNodeImpl implements ComponentStoryNode {
	/**
	 * The cached value of the '{@link #getComponentStoryPattern() <em>Component Story Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected ComponentStoryPattern componentStoryPattern;

	/**
	 * The default value of the '{@link #isForEach() <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForEach()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_EACH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForEach() <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForEach()
	 * @generated
	 * @ordered
	 */
	protected boolean forEach = FOR_EACH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentStoryNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorydiagramPackage.Literals.COMPONENT_STORY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryPattern getComponentStoryPattern() {
		return componentStoryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentStoryPattern(ComponentStoryPattern newComponentStoryPattern, NotificationChain msgs) {
		ComponentStoryPattern oldComponentStoryPattern = componentStoryPattern;
		componentStoryPattern = newComponentStoryPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN, oldComponentStoryPattern, newComponentStoryPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentStoryPattern(ComponentStoryPattern newComponentStoryPattern) {
		if (newComponentStoryPattern != componentStoryPattern) {
			NotificationChain msgs = null;
			if (componentStoryPattern != null)
				msgs = ((InternalEObject)componentStoryPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN, null, msgs);
			if (newComponentStoryPattern != null)
				msgs = ((InternalEObject)newComponentStoryPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN, null, msgs);
			msgs = basicSetComponentStoryPattern(newComponentStoryPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN, newComponentStoryPattern, newComponentStoryPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForEach() {
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForEach(boolean newForEach) {
		boolean oldForEach = forEach;
		forEach = newForEach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorydiagramPackage.COMPONENT_STORY_NODE__FOR_EACH, oldForEach, forEach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				return basicSetComponentStoryPattern(null, msgs);
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
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				return getComponentStoryPattern();
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__FOR_EACH:
				return isForEach();
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
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				setComponentStoryPattern((ComponentStoryPattern)newValue);
				return;
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__FOR_EACH:
				setForEach((Boolean)newValue);
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
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				setComponentStoryPattern((ComponentStoryPattern)null);
				return;
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__FOR_EACH:
				setForEach(FOR_EACH_EDEFAULT);
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
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				return componentStoryPattern != null;
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE__FOR_EACH:
				return forEach != FOR_EACH_EDEFAULT;
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
		result.append(" (forEach: ");
		result.append(forEach);
		result.append(')');
		return result.toString();
	}

} //ComponentStoryNodeImpl
