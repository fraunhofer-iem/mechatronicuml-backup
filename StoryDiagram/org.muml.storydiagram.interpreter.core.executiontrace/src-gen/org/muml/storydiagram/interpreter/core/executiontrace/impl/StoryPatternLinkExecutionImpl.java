/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Link Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternLinkExecutionImpl#getStoryPatternLink <em>Story Pattern Link</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternLinkExecutionImpl#getSourceStoryPatternObject <em>Source Story Pattern Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternLinkExecutionImpl#getTargetStoryPatternObject <em>Target Story Pattern Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternLinkExecutionImpl#getSourceObject <em>Source Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StoryPatternLinkExecutionImpl<StoryPatternLinkType, StoryPatternObjectType> extends ExecutionImpl implements
		StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * The cached value of the '{@link #getStoryPatternLink() <em>Story Pattern Link</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStoryPatternLink()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternLinkType		storyPatternLink;

	/**
	 * The cached value of the '{@link #getSourceStoryPatternObject() <em>Source Story Pattern Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStoryPatternObject()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternObjectType	sourceStoryPatternObject;

	/**
	 * The cached value of the '{@link #getTargetStoryPatternObject() <em>Target Story Pattern Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetStoryPatternObject()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternObjectType	targetStoryPatternObject;

	/**
	 * The default value of the '{@link #getSourceObject() <em>Source Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String		SOURCE_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected String					sourceObject			= SOURCE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternLinkExecutionImpl()
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
		return ExecutiontracePackage.Literals.STORY_PATTERN_LINK_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternLinkType getStoryPatternLink()
	{
		if (storyPatternLink != null && ((EObject)storyPatternLink).eIsProxy()) {
			InternalEObject oldStoryPatternLink = (InternalEObject)storyPatternLink;
			storyPatternLink = (StoryPatternLinkType)eResolveProxy(oldStoryPatternLink);
			if (storyPatternLink != oldStoryPatternLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK, oldStoryPatternLink, storyPatternLink));
			}
		}
		return storyPatternLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternLinkType basicGetStoryPatternLink()
	{
		return storyPatternLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoryPatternLink(StoryPatternLinkType newStoryPatternLink)
	{
		StoryPatternLinkType oldStoryPatternLink = storyPatternLink;
		storyPatternLink = newStoryPatternLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK, oldStoryPatternLink, storyPatternLink));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternObjectType getSourceStoryPatternObject()
	{
		if (sourceStoryPatternObject != null && ((EObject)sourceStoryPatternObject).eIsProxy()) {
			InternalEObject oldSourceStoryPatternObject = (InternalEObject)sourceStoryPatternObject;
			sourceStoryPatternObject = (StoryPatternObjectType)eResolveProxy(oldSourceStoryPatternObject);
			if (sourceStoryPatternObject != oldSourceStoryPatternObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT, oldSourceStoryPatternObject, sourceStoryPatternObject));
			}
		}
		return sourceStoryPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternObjectType basicGetSourceStoryPatternObject()
	{
		return sourceStoryPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceStoryPatternObject(StoryPatternObjectType newSourceStoryPatternObject)
	{
		StoryPatternObjectType oldSourceStoryPatternObject = sourceStoryPatternObject;
		sourceStoryPatternObject = newSourceStoryPatternObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT, oldSourceStoryPatternObject, sourceStoryPatternObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternObjectType getTargetStoryPatternObject()
	{
		if (targetStoryPatternObject != null && ((EObject)targetStoryPatternObject).eIsProxy()) {
			InternalEObject oldTargetStoryPatternObject = (InternalEObject)targetStoryPatternObject;
			targetStoryPatternObject = (StoryPatternObjectType)eResolveProxy(oldTargetStoryPatternObject);
			if (targetStoryPatternObject != oldTargetStoryPatternObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT, oldTargetStoryPatternObject, targetStoryPatternObject));
			}
		}
		return targetStoryPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternObjectType basicGetTargetStoryPatternObject()
	{
		return targetStoryPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetStoryPatternObject(StoryPatternObjectType newTargetStoryPatternObject)
	{
		StoryPatternObjectType oldTargetStoryPatternObject = targetStoryPatternObject;
		targetStoryPatternObject = newTargetStoryPatternObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT, oldTargetStoryPatternObject, targetStoryPatternObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceObject()
	{
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceObject(String newSourceObject)
	{
		String oldSourceObject = sourceObject;
		sourceObject = newSourceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT, oldSourceObject, sourceObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
				if (resolve) return getStoryPatternLink();
				return basicGetStoryPatternLink();
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
				if (resolve) return getSourceStoryPatternObject();
				return basicGetSourceStoryPatternObject();
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
				if (resolve) return getTargetStoryPatternObject();
				return basicGetTargetStoryPatternObject();
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				return getSourceObject();
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
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
				setStoryPatternLink((StoryPatternLinkType)newValue);
				return;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
				setSourceStoryPatternObject((StoryPatternObjectType)newValue);
				return;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
				setTargetStoryPatternObject((StoryPatternObjectType)newValue);
				return;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				setSourceObject((String)newValue);
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
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
				setStoryPatternLink((StoryPatternLinkType)null);
				return;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
				setSourceStoryPatternObject((StoryPatternObjectType)null);
				return;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
				setTargetStoryPatternObject((StoryPatternObjectType)null);
				return;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				setSourceObject(SOURCE_OBJECT_EDEFAULT);
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
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
				return storyPatternLink != null;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
				return sourceStoryPatternObject != null;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
				return targetStoryPatternObject != null;
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				return SOURCE_OBJECT_EDEFAULT == null ? sourceObject != null : !SOURCE_OBJECT_EDEFAULT.equals(sourceObject);
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
		result.append(" (sourceObject: ");
		result.append(sourceObject);
		result.append(')');
		return result.toString();
	}

} // StoryPatternLinkExecutionImpl
