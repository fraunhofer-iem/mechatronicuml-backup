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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.pm.software.APIRepository;
import org.muml.pm.software.EnumerationDataType;
import org.muml.pm.software.Import;
import org.muml.pm.software.OperatingSystem;
import org.muml.pm.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.software.impl.OperatingSystemImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.pm.software.impl.OperatingSystemImpl#getApirepositories <em>Apirepositories</em>}</li>
 *   <li>{@link org.muml.pm.software.impl.OperatingSystemImpl#getEnumerationDataTypes <em>Enumeration Data Types</em>}</li>
 *   <li>{@link org.muml.pm.software.impl.OperatingSystemImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingSystemImpl extends NamedElementImpl implements OperatingSystem {
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
	 * The cached value of the '{@link #getApirepositories() <em>Apirepositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApirepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<APIRepository> apirepositories;

	/**
	 * The cached value of the '{@link #getEnumerationDataTypes() <em>Enumeration Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationDataType> enumerationDataTypes;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.OPERATING_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.OPERATING_SYSTEM__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APIRepository> getApirepositories() {
		if (apirepositories == null) {
			apirepositories = new EObjectContainmentWithInverseEList<APIRepository>(APIRepository.class, this, SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES, SoftwarePackage.API_REPOSITORY__SW_PLATFORM);
		}
		return apirepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationDataType> getEnumerationDataTypes() {
		if (enumerationDataTypes == null) {
			enumerationDataTypes = new EObjectContainmentEList<EnumerationDataType>(EnumerationDataType.class, this, SoftwarePackage.OPERATING_SYSTEM__ENUMERATION_DATA_TYPES);
		}
		return enumerationDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, SoftwarePackage.OPERATING_SYSTEM__IMPORTS);
		}
		return imports;
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
			case SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApirepositories()).basicAdd(otherEnd, msgs);
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
			case SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES:
				return ((InternalEList<?>)getApirepositories()).basicRemove(otherEnd, msgs);
			case SoftwarePackage.OPERATING_SYSTEM__ENUMERATION_DATA_TYPES:
				return ((InternalEList<?>)getEnumerationDataTypes()).basicRemove(otherEnd, msgs);
			case SoftwarePackage.OPERATING_SYSTEM__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case SoftwarePackage.OPERATING_SYSTEM__COMMENT:
				return getComment();
			case SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES:
				return getApirepositories();
			case SoftwarePackage.OPERATING_SYSTEM__ENUMERATION_DATA_TYPES:
				return getEnumerationDataTypes();
			case SoftwarePackage.OPERATING_SYSTEM__IMPORTS:
				return getImports();
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
			case SoftwarePackage.OPERATING_SYSTEM__COMMENT:
				setComment((String)newValue);
				return;
			case SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES:
				getApirepositories().clear();
				getApirepositories().addAll((Collection<? extends APIRepository>)newValue);
				return;
			case SoftwarePackage.OPERATING_SYSTEM__ENUMERATION_DATA_TYPES:
				getEnumerationDataTypes().clear();
				getEnumerationDataTypes().addAll((Collection<? extends EnumerationDataType>)newValue);
				return;
			case SoftwarePackage.OPERATING_SYSTEM__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
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
			case SoftwarePackage.OPERATING_SYSTEM__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES:
				getApirepositories().clear();
				return;
			case SoftwarePackage.OPERATING_SYSTEM__ENUMERATION_DATA_TYPES:
				getEnumerationDataTypes().clear();
				return;
			case SoftwarePackage.OPERATING_SYSTEM__IMPORTS:
				getImports().clear();
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
			case SoftwarePackage.OPERATING_SYSTEM__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case SoftwarePackage.OPERATING_SYSTEM__APIREPOSITORIES:
				return apirepositories != null && !apirepositories.isEmpty();
			case SoftwarePackage.OPERATING_SYSTEM__ENUMERATION_DATA_TYPES:
				return enumerationDataTypes != null && !enumerationDataTypes.isEmpty();
			case SoftwarePackage.OPERATING_SYSTEM__IMPORTS:
				return imports != null && !imports.isEmpty();
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
				case SoftwarePackage.OPERATING_SYSTEM__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return SoftwarePackage.OPERATING_SYSTEM__COMMENT;
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

} //OperatingSystemImpl
