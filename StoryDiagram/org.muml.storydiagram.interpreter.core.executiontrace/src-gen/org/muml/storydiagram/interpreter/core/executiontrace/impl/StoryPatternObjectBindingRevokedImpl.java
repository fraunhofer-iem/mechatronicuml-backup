/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Object Binding Revoked</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBindingRevokedImpl#getPreviousValue <em>Previous Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoryPatternObjectBindingRevokedImpl<StoryPatternObjectType> extends StoryPatternObjectExecutionImpl<StoryPatternObjectType>
		implements StoryPatternObjectBindingRevoked<StoryPatternObjectType>
{
	/**
	 * The default value of the '{@link #getPreviousValue() <em>Previous Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPreviousValue()
	 * @generated
	 * @ordered
	 */
	protected static final String	PREVIOUS_VALUE_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getPreviousValue() <em>Previous Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPreviousValue()
	 * @generated
	 * @ordered
	 */
	protected String				previousValue			= PREVIOUS_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternObjectBindingRevokedImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExecutiontracePackage.Literals.STORY_PATTERN_OBJECT_BINDING_REVOKED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setStoryPatternObject(StoryPatternObjectType newStoryPatternObject) {
		super.setStoryPatternObject(newStoryPatternObject);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreviousValue()
	{
		return previousValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousValue(String newPreviousValue)
	{
		String oldPreviousValue = previousValue;
		previousValue = newPreviousValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE, oldPreviousValue, previousValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				return getPreviousValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				setPreviousValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				setPreviousValue(PREVIOUS_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE:
				return PREVIOUS_VALUE_EDEFAULT == null ? previousValue != null : !PREVIOUS_VALUE_EDEFAULT.equals(previousValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (previousValue: ");
		result.append(previousValue);
		result.append(')');
		return result.toString();
	}

} // StoryPatternObjectBindingRevokedImpl
