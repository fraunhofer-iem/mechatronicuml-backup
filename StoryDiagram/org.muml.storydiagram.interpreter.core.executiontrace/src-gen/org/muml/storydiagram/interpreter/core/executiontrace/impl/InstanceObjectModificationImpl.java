/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Object Modification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectModificationImpl#getStoryPatternObject <em>Story Pattern Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectModificationImpl#getInstanceObject <em>Instance Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstanceObjectModificationImpl<StoryPatternObjectType> extends ExecutionImpl implements
		InstanceObjectModification<StoryPatternObjectType>
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceObjectModificationImpl()
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
		return ExecutiontracePackage.Literals.INSTANCE_OBJECT_MODIFICATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT, oldStoryPatternObject, storyPatternObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT, oldStoryPatternObject, storyPatternObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT, oldInstanceObject, instanceObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT:
				if (resolve) return getStoryPatternObject();
				return basicGetStoryPatternObject();
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT:
				return getInstanceObject();
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
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT:
				setStoryPatternObject((StoryPatternObjectType)newValue);
				return;
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT:
				setInstanceObject((String)newValue);
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
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT:
				setStoryPatternObject((StoryPatternObjectType)null);
				return;
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT:
				setInstanceObject(INSTANCE_OBJECT_EDEFAULT);
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
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT:
				return storyPatternObject != null;
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT:
				return INSTANCE_OBJECT_EDEFAULT == null ? instanceObject != null : !INSTANCE_OBJECT_EDEFAULT.equals(instanceObject);
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
		result.append(')');
		return result.toString();
	}

} // InstanceObjectModificationImpl
