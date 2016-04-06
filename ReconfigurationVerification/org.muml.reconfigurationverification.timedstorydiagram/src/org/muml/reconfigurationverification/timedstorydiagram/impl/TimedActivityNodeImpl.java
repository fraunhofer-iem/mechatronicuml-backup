/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryPattern;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.activities.impl.ModifyingStoryNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedActivityNodeImpl#getOwnedTimedStoryPattern <em>Owned Timed Story Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedActivityNodeImpl extends ModifyingStoryNodeImpl implements TimedActivityNode {
	/**
	 * The cached setting delegate for the '{@link #getOwnedTimedStoryPattern() <em>Owned Timed Story Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTimedStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_TIMED_STORY_PATTERN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TimedstorydiagramPackage.Literals.TIMED_ACTIVITY_NODE__OWNED_TIMED_STORY_PATTERN).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedstorydiagramPackage.Literals.TIMED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStoryPattern getOwnedTimedStoryPattern() {
		return (TimedStoryPattern)OWNED_TIMED_STORY_PATTERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStoryPattern basicGetOwnedTimedStoryPattern() {
		return (TimedStoryPattern)OWNED_TIMED_STORY_PATTERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimedstorydiagramPackage.TIMED_ACTIVITY_NODE__OWNED_TIMED_STORY_PATTERN:
				if (resolve) return getOwnedTimedStoryPattern();
				return basicGetOwnedTimedStoryPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimedstorydiagramPackage.TIMED_ACTIVITY_NODE__OWNED_TIMED_STORY_PATTERN:
				return OWNED_TIMED_STORY_PATTERN__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //TimedActivityNodeImpl
