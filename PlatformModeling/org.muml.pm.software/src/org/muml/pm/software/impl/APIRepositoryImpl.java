/**
 */
package org.muml.pm.software.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.pm.software.APICommand;
import org.muml.pm.software.APIRepository;
import org.muml.pm.software.OperatingSystem;
import org.muml.pm.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.software.impl.APIRepositoryImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.pm.software.impl.APIRepositoryImpl#getApiCommands <em>Api Commands</em>}</li>
 *   <li>{@link org.muml.pm.software.impl.APIRepositoryImpl#getSwPlatform <em>Sw Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIRepositoryImpl extends NamedElementImpl implements APIRepository {
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
	 * The cached value of the '{@link #getApiCommands() <em>Api Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<APICommand> apiCommands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.API_REPOSITORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.API_REPOSITORY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APICommand> getApiCommands() {
		if (apiCommands == null) {
			apiCommands = new EObjectContainmentWithInverseEList<APICommand>(APICommand.class, this, SoftwarePackage.API_REPOSITORY__API_COMMANDS, SoftwarePackage.API_COMMAND__REPOSITORY);
		}
		return apiCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem getSwPlatform() {
		if (eContainerFeatureID() != SoftwarePackage.API_REPOSITORY__SW_PLATFORM) return null;
		return (OperatingSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwPlatform(OperatingSystem newSwPlatform, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSwPlatform, SoftwarePackage.API_REPOSITORY__SW_PLATFORM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwPlatform(OperatingSystem newSwPlatform) {
		if (newSwPlatform != eInternalContainer() || (eContainerFeatureID() != SoftwarePackage.API_REPOSITORY__SW_PLATFORM && newSwPlatform != null)) {
			if (EcoreUtil.isAncestor(this, newSwPlatform))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSwPlatform != null)
				msgs = ((InternalEObject)newSwPlatform).eInverseAdd(this, SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES, OperatingSystem.class, msgs);
			msgs = basicSetSwPlatform(newSwPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.API_REPOSITORY__SW_PLATFORM, newSwPlatform, newSwPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarePackage.API_REPOSITORY__API_COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApiCommands()).basicAdd(otherEnd, msgs);
			case SoftwarePackage.API_REPOSITORY__SW_PLATFORM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSwPlatform((OperatingSystem)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarePackage.API_REPOSITORY__API_COMMANDS:
				return ((InternalEList<?>)getApiCommands()).basicRemove(otherEnd, msgs);
			case SoftwarePackage.API_REPOSITORY__SW_PLATFORM:
				return basicSetSwPlatform(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SoftwarePackage.API_REPOSITORY__SW_PLATFORM:
				return eInternalContainer().eInverseRemove(this, SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES, OperatingSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.API_REPOSITORY__COMMENT:
				return getComment();
			case SoftwarePackage.API_REPOSITORY__API_COMMANDS:
				return getApiCommands();
			case SoftwarePackage.API_REPOSITORY__SW_PLATFORM:
				return getSwPlatform();
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
			case SoftwarePackage.API_REPOSITORY__COMMENT:
				setComment((String)newValue);
				return;
			case SoftwarePackage.API_REPOSITORY__API_COMMANDS:
				getApiCommands().clear();
				getApiCommands().addAll((Collection<? extends APICommand>)newValue);
				return;
			case SoftwarePackage.API_REPOSITORY__SW_PLATFORM:
				setSwPlatform((OperatingSystem)newValue);
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
			case SoftwarePackage.API_REPOSITORY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case SoftwarePackage.API_REPOSITORY__API_COMMANDS:
				getApiCommands().clear();
				return;
			case SoftwarePackage.API_REPOSITORY__SW_PLATFORM:
				setSwPlatform((OperatingSystem)null);
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
			case SoftwarePackage.API_REPOSITORY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case SoftwarePackage.API_REPOSITORY__API_COMMANDS:
				return apiCommands != null && !apiCommands.isEmpty();
			case SoftwarePackage.API_REPOSITORY__SW_PLATFORM:
				return getSwPlatform() != null;
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
				case SoftwarePackage.API_REPOSITORY__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return SoftwarePackage.API_REPOSITORY__COMMENT;
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

} //APIRepositoryImpl
