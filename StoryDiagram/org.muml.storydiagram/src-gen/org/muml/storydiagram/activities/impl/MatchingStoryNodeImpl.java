/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.MatchingStoryNode;
import org.muml.storydiagram.patterns.MatchingPattern;
import org.muml.storydiagram.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Matching Story Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.impl.MatchingStoryNodeImpl#getOwnedPattern <em>Owned Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchingStoryNodeImpl extends StoryNodeImpl implements
		MatchingStoryNode {
	/**
	 * The cached value of the '{@link #getOwnedPattern() <em>Owned Pattern</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedPattern()
	 * @generated
	 * @ordered
	 */
	protected MatchingPattern ownedPattern;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingStoryNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.MATCHING_STORY_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingPattern getOwnedPattern() {
		return ownedPattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPattern(
			MatchingPattern newOwnedPattern, NotificationChain msgs) {
		MatchingPattern oldOwnedPattern = ownedPattern;
		ownedPattern = newOwnedPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, oldOwnedPattern, newOwnedPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPattern(MatchingPattern newOwnedPattern) {
		if (newOwnedPattern != ownedPattern) {
			NotificationChain msgs = null;
			if (ownedPattern != null)
				msgs = ((InternalEObject)ownedPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, null, msgs);
			if (newOwnedPattern != null)
				msgs = ((InternalEObject)newOwnedPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, null, msgs);
			msgs = basicSetOwnedPattern(newOwnedPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN, newOwnedPattern, newOwnedPattern));
	}

	/**
	 * The cached invocation delegate for the '{@link #getStoryPattern() <em>Get Story Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_STORY_PATTERN__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivitiesPackage.Literals.MATCHING_STORY_NODE___GET_STORY_PATTERN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getStoryPattern() {
		try {
			return (StoryPattern)GET_STORY_PATTERN__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				return basicSetOwnedPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				return getOwnedPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				setOwnedPattern((MatchingPattern)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				setOwnedPattern((MatchingPattern)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.MATCHING_STORY_NODE__OWNED_PATTERN:
				return ownedPattern != null;
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
			case ActivitiesPackage.MATCHING_STORY_NODE___GET_STORY_PATTERN:
				return getStoryPattern();
		}
		return super.eInvoke(operationID, arguments);
	}

} // MatchingStoryNodeImpl
