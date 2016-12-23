/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Link Modification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl#getStoryPatternLink <em>Story Pattern Link</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl#getSourceStoryPatternObject <em>Source Story Pattern Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl#getTargetStoryPatternObject <em>Target Story Pattern Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl#getSourceInstanceObject <em>Source Instance Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl#getTargetInstanceObject <em>Target Instance Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstanceLinkModificationImpl<StoryPatternLinkType, StoryPatternObjectType> extends ExecutionImpl implements
		InstanceLinkModification<StoryPatternLinkType, StoryPatternObjectType>
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
	 * The default value of the '{@link #getSourceInstanceObject() <em>Source Instance Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSourceInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String		SOURCE_INSTANCE_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getSourceInstanceObject() <em>Source Instance Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSourceInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected String					sourceInstanceObject			= SOURCE_INSTANCE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetInstanceObject() <em>Target Instance Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTargetInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String		TARGET_INSTANCE_OBJECT_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getTargetInstanceObject() <em>Target Instance Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTargetInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected String					targetInstanceObject			= TARGET_INSTANCE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceLinkModificationImpl()
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
		return ExecutiontracePackage.Literals.INSTANCE_LINK_MODIFICATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK, oldStoryPatternLink, storyPatternLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK, oldStoryPatternLink, storyPatternLink));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT, oldSourceStoryPatternObject, sourceStoryPatternObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT, oldSourceStoryPatternObject, sourceStoryPatternObject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT, oldTargetStoryPatternObject, targetStoryPatternObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT, oldTargetStoryPatternObject, targetStoryPatternObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceInstanceObject()
	{
		return sourceInstanceObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceInstanceObject(String newSourceInstanceObject)
	{
		String oldSourceInstanceObject = sourceInstanceObject;
		sourceInstanceObject = newSourceInstanceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT, oldSourceInstanceObject, sourceInstanceObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetInstanceObject()
	{
		return targetInstanceObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetInstanceObject(String newTargetInstanceObject)
	{
		String oldTargetInstanceObject = targetInstanceObject;
		targetInstanceObject = newTargetInstanceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT, oldTargetInstanceObject, targetInstanceObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
				if (resolve) return getStoryPatternLink();
				return basicGetStoryPatternLink();
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
				if (resolve) return getSourceStoryPatternObject();
				return basicGetSourceStoryPatternObject();
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
				if (resolve) return getTargetStoryPatternObject();
				return basicGetTargetStoryPatternObject();
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
				return getSourceInstanceObject();
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				return getTargetInstanceObject();
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
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
				setStoryPatternLink((StoryPatternLinkType)newValue);
				return;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
				setSourceStoryPatternObject((StoryPatternObjectType)newValue);
				return;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
				setTargetStoryPatternObject((StoryPatternObjectType)newValue);
				return;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
				setSourceInstanceObject((String)newValue);
				return;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				setTargetInstanceObject((String)newValue);
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
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
				setStoryPatternLink((StoryPatternLinkType)null);
				return;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
				setSourceStoryPatternObject((StoryPatternObjectType)null);
				return;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
				setTargetStoryPatternObject((StoryPatternObjectType)null);
				return;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
				setSourceInstanceObject(SOURCE_INSTANCE_OBJECT_EDEFAULT);
				return;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				setTargetInstanceObject(TARGET_INSTANCE_OBJECT_EDEFAULT);
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
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK:
				return storyPatternLink != null;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT:
				return sourceStoryPatternObject != null;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT:
				return targetStoryPatternObject != null;
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT:
				return SOURCE_INSTANCE_OBJECT_EDEFAULT == null ? sourceInstanceObject != null : !SOURCE_INSTANCE_OBJECT_EDEFAULT.equals(sourceInstanceObject);
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT:
				return TARGET_INSTANCE_OBJECT_EDEFAULT == null ? targetInstanceObject != null : !TARGET_INSTANCE_OBJECT_EDEFAULT.equals(targetInstanceObject);
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
		result.append(" (sourceInstanceObject: ");
		result.append(sourceInstanceObject);
		result.append(", targetInstanceObject: ");
		result.append(targetInstanceObject);
		result.append(')');
		return result.toString();
	}

} // InstanceLinkModificationImpl
