/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryPattern;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.patterns.impl.StoryPatternImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Story Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedStoryPatternImpl#isNonModifyingStoryPattern <em>Non Modifying Story Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedStoryPatternImpl extends StoryPatternImpl implements TimedStoryPattern {
	/**
	 * The cached setting delegate for the '{@link #isNonModifyingStoryPattern() <em>Non Modifying Story Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonModifyingStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NON_MODIFYING_STORY_PATTERN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TimedstorydiagramPackage.Literals.TIMED_STORY_PATTERN__NON_MODIFYING_STORY_PATTERN).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedStoryPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedstorydiagramPackage.Literals.TIMED_STORY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonModifyingStoryPattern() {
		return (Boolean)NON_MODIFYING_STORY_PATTERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimedstorydiagramPackage.TIMED_STORY_PATTERN__NON_MODIFYING_STORY_PATTERN:
				return isNonModifyingStoryPattern();
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
			case TimedstorydiagramPackage.TIMED_STORY_PATTERN__NON_MODIFYING_STORY_PATTERN:
				return NON_MODIFYING_STORY_PATTERN__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //TimedStoryPatternImpl
