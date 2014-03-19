/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceConfigurationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceConfigurationImpl#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceConfigurationImpl#getCommunicationMedia <em>Communication Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPlatformInstanceConfigurationImpl extends NamedElementImpl implements HWPlatformInstanceConfiguration {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHwplatformInstances() <em>Hwplatform Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatformInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPlatformInstance> hwplatformInstances;

	/**
	 * The cached value of the '{@link #getCommunicationMedia() <em>Communication Media</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationMedia> communicationMedia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformInstanceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPlatformInstance> getHwplatformInstances() {
		if (hwplatformInstances == null) {
			hwplatformInstances = new EObjectContainmentEList<HWPlatformInstance>(HWPlatformInstance.class, this, PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES);
		}
		return hwplatformInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationMedia> getCommunicationMedia() {
		if (communicationMedia == null) {
			communicationMedia = new EObjectContainmentEList<CommunicationMedia>(CommunicationMedia.class, this, PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA);
		}
		return communicationMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				return ((InternalEList<?>)getHwplatformInstances()).basicRemove(otherEnd, msgs);
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA:
				return ((InternalEList<?>)getCommunicationMedia()).basicRemove(otherEnd, msgs);
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
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT:
				return getComment();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				return getHwplatformInstances();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA:
				return getCommunicationMedia();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT:
				setComment((String)newValue);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				getHwplatformInstances().clear();
				getHwplatformInstances().addAll((Collection<? extends HWPlatformInstance>)newValue);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA:
				getCommunicationMedia().clear();
				getCommunicationMedia().addAll((Collection<? extends CommunicationMedia>)newValue);
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
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				getHwplatformInstances().clear();
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA:
				getCommunicationMedia().clear();
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
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				return hwplatformInstances != null && !hwplatformInstances.isEmpty();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA:
				return communicationMedia != null && !communicationMedia.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //HWPlatformInstanceConfigurationImpl
