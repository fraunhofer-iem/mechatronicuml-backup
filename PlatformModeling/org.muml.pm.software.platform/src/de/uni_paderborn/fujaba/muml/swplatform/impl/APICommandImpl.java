/**
 */
package de.uni_paderborn.fujaba.muml.swplatform.impl;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;

import de.uni_paderborn.fujaba.muml.swplatform.APICommand;
import de.uni_paderborn.fujaba.muml.swplatform.APIRepository;
import de.uni_paderborn.fujaba.muml.swplatform.Constraint;
import de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage;

import de.uni_paderborn.fujaba.muml.types.DataType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.CommentableElement;
import org.muml.core.CorePackage;
import org.muml.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.impl.APICommandImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.impl.APICommandImpl#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.impl.APICommandImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.impl.APICommandImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.impl.APICommandImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APICommandImpl extends NamedElementImpl implements APICommand {
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
	 * The cached value of the '{@link #getReturnDataType() <em>Return Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnDataType;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APICommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwplatformPackage.Literals.API_COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwplatformPackage.API_COMMAND__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnDataType() {
		if (returnDataType != null && returnDataType.eIsProxy()) {
			InternalEObject oldReturnDataType = (InternalEObject)returnDataType;
			returnDataType = (DataType)eResolveProxy(oldReturnDataType);
			if (returnDataType != oldReturnDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwplatformPackage.API_COMMAND__RETURN_DATA_TYPE, oldReturnDataType, returnDataType));
			}
		}
		return returnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturnDataType() {
		return returnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnDataType(DataType newReturnDataType) {
		DataType oldReturnDataType = returnDataType;
		returnDataType = newReturnDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwplatformPackage.API_COMMAND__RETURN_DATA_TYPE, oldReturnDataType, returnDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, SwplatformPackage.API_COMMAND__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIRepository getRepository() {
		if (eContainerFeatureID() != SwplatformPackage.API_COMMAND__REPOSITORY) return null;
		return (APIRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(APIRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, SwplatformPackage.API_COMMAND__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(APIRepository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != SwplatformPackage.API_COMMAND__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, SwplatformPackage.API_REPOSITORY__API_COMMANDS, APIRepository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwplatformPackage.API_COMMAND__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, SwplatformPackage.API_COMMAND__CONSTRAINTS, SwplatformPackage.CONSTRAINT__API_COMMAND);
		}
		return constraints;
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
			case SwplatformPackage.API_COMMAND__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((APIRepository)otherEnd, msgs);
			case SwplatformPackage.API_COMMAND__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
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
			case SwplatformPackage.API_COMMAND__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case SwplatformPackage.API_COMMAND__REPOSITORY:
				return basicSetRepository(null, msgs);
			case SwplatformPackage.API_COMMAND__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case SwplatformPackage.API_COMMAND__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, SwplatformPackage.API_REPOSITORY__API_COMMANDS, APIRepository.class, msgs);
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
			case SwplatformPackage.API_COMMAND__COMMENT:
				return getComment();
			case SwplatformPackage.API_COMMAND__RETURN_DATA_TYPE:
				if (resolve) return getReturnDataType();
				return basicGetReturnDataType();
			case SwplatformPackage.API_COMMAND__PARAMETERS:
				return getParameters();
			case SwplatformPackage.API_COMMAND__REPOSITORY:
				return getRepository();
			case SwplatformPackage.API_COMMAND__CONSTRAINTS:
				return getConstraints();
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
			case SwplatformPackage.API_COMMAND__COMMENT:
				setComment((String)newValue);
				return;
			case SwplatformPackage.API_COMMAND__RETURN_DATA_TYPE:
				setReturnDataType((DataType)newValue);
				return;
			case SwplatformPackage.API_COMMAND__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case SwplatformPackage.API_COMMAND__REPOSITORY:
				setRepository((APIRepository)newValue);
				return;
			case SwplatformPackage.API_COMMAND__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case SwplatformPackage.API_COMMAND__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case SwplatformPackage.API_COMMAND__RETURN_DATA_TYPE:
				setReturnDataType((DataType)null);
				return;
			case SwplatformPackage.API_COMMAND__PARAMETERS:
				getParameters().clear();
				return;
			case SwplatformPackage.API_COMMAND__REPOSITORY:
				setRepository((APIRepository)null);
				return;
			case SwplatformPackage.API_COMMAND__CONSTRAINTS:
				getConstraints().clear();
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
			case SwplatformPackage.API_COMMAND__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case SwplatformPackage.API_COMMAND__RETURN_DATA_TYPE:
				return returnDataType != null;
			case SwplatformPackage.API_COMMAND__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SwplatformPackage.API_COMMAND__REPOSITORY:
				return getRepository() != null;
			case SwplatformPackage.API_COMMAND__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
				case SwplatformPackage.API_COMMAND__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return SwplatformPackage.API_COMMAND__COMMENT;
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

} //APICommandImpl
