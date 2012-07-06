/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Story Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryNodeImpl#getComponentStoryPattern <em>Component Story Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentStoryNodeImpl extends ActivityNodeImpl implements ComponentStoryNode {
	/**
	 * The cached value of the '{@link #getComponentStoryPattern() <em>Component Story Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected ComponentStoryPattern componentStoryPattern;

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
		return ControlflowPackage.Literals.COMPONENT_STORY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryPattern getComponentStoryPattern() {
		if (componentStoryPattern != null && componentStoryPattern.eIsProxy()) {
			InternalEObject oldComponentStoryPattern = (InternalEObject)componentStoryPattern;
			componentStoryPattern = (ComponentStoryPattern)eResolveProxy(oldComponentStoryPattern);
			if (componentStoryPattern != oldComponentStoryPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN, oldComponentStoryPattern, componentStoryPattern));
			}
		}
		return componentStoryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryPattern basicGetComponentStoryPattern() {
		return componentStoryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentStoryPattern(ComponentStoryPattern newComponentStoryPattern) {
		ComponentStoryPattern oldComponentStoryPattern = componentStoryPattern;
		componentStoryPattern = newComponentStoryPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN, oldComponentStoryPattern, componentStoryPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlflowPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				if (resolve) return getComponentStoryPattern();
				return basicGetComponentStoryPattern();
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
			case ControlflowPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				setComponentStoryPattern((ComponentStoryPattern)newValue);
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
			case ControlflowPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				setComponentStoryPattern((ComponentStoryPattern)null);
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
			case ControlflowPackage.COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN:
				return componentStoryPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentStoryNodeImpl
