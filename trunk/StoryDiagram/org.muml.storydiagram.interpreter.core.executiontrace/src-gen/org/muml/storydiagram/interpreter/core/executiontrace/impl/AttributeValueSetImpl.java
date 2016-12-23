/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Attribute Value Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.AttributeValueSetImpl#getStoryPatternObject <em>Story Pattern Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.AttributeValueSetImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.AttributeValueSetImpl#getInstanceObject <em>Instance Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.AttributeValueSetImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValueSetImpl<StoryPatternObjectType, FeatureType> extends ExecutionImpl implements
		AttributeValueSet<StoryPatternObjectType, FeatureType>
{
	/**
	 * The cached value of the '{@link #getStoryPatternObject() <em>Story Pattern Object</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStoryPatternObject()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternObjectType	storyPatternObject;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected FeatureType				feature;

	/**
	 * The default value of the '{@link #getInstanceObject() <em>Instance Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String		INSTANCE_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getInstanceObject() <em>Instance Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected String					instanceObject				= INSTANCE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected static final String		NEW_VALUE_EDEFAULT			= null;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected String					newValue					= NEW_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueSetImpl()
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
		return ExecutiontracePackage.Literals.ATTRIBUTE_VALUE_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternObjectType getStoryPatternObject()
	{
		if (storyPatternObject != null && ((EObject)storyPatternObject).eIsProxy()) {
			InternalEObject oldStoryPatternObject = (InternalEObject)storyPatternObject;
			storyPatternObject = (StoryPatternObjectType)eResolveProxy(oldStoryPatternObject);
			if (storyPatternObject != oldStoryPatternObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT, oldStoryPatternObject, storyPatternObject));
			}
		}
		return storyPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternObjectType basicGetStoryPatternObject()
	{
		return storyPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoryPatternObject(StoryPatternObjectType newStoryPatternObject)
	{
		StoryPatternObjectType oldStoryPatternObject = storyPatternObject;
		storyPatternObject = newStoryPatternObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT, oldStoryPatternObject, storyPatternObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public FeatureType getFeature()
	{
		if (feature != null && ((EObject)feature).eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (FeatureType)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.ATTRIBUTE_VALUE_SET__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType basicGetFeature()
	{
		return feature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(FeatureType newFeature)
	{
		FeatureType oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.ATTRIBUTE_VALUE_SET__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceObject()
	{
		return instanceObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceObject(String newInstanceObject)
	{
		String oldInstanceObject = instanceObject;
		instanceObject = newInstanceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT, oldInstanceObject, instanceObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewValue()
	{
		return newValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewValue(String newNewValue)
	{
		String oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE, oldNewValue, newValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT:
				if (resolve) return getStoryPatternObject();
				return basicGetStoryPatternObject();
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT:
				return getInstanceObject();
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE:
				return getNewValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT:
				setStoryPatternObject((StoryPatternObjectType)newValue);
				return;
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__FEATURE:
				setFeature((FeatureType)newValue);
				return;
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT:
				setInstanceObject((String)newValue);
				return;
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE:
				setNewValue((String)newValue);
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
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT:
				setStoryPatternObject((StoryPatternObjectType)null);
				return;
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__FEATURE:
				setFeature((FeatureType)null);
				return;
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT:
				setInstanceObject(INSTANCE_OBJECT_EDEFAULT);
				return;
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE:
				setNewValue(NEW_VALUE_EDEFAULT);
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
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT:
				return storyPatternObject != null;
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__FEATURE:
				return feature != null;
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT:
				return INSTANCE_OBJECT_EDEFAULT == null ? instanceObject != null : !INSTANCE_OBJECT_EDEFAULT.equals(instanceObject);
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE:
				return NEW_VALUE_EDEFAULT == null ? newValue != null : !NEW_VALUE_EDEFAULT.equals(newValue);
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
		result.append(" (instanceObject: ");
		result.append(instanceObject);
		result.append(", newValue: ");
		result.append(newValue);
		result.append(')');
		return result.toString();
	}

} // AttributeValueSetImpl
