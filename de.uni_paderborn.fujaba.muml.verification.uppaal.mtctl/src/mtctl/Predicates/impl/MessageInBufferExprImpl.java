/**
 */
package mtctl.Predicates.impl;

import mtctl.Predicates.MessageInBufferExpr;
import mtctl.Predicates.PredicatesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message In Buffer Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mtctl.Predicates.impl.MessageInBufferExprImpl#getRole <em>Role</em>}</li>
 *   <li>{@link mtctl.Predicates.impl.MessageInBufferExprImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageInBufferExprImpl extends DynamicPredicateExprImpl implements MessageInBufferExpr {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EObject role;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EObject message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageInBufferExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PredicatesPackage.Literals.MESSAGE_IN_BUFFER_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(EObject newRole) {
		EObject oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(EObject newMessage) {
		EObject oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__ROLE:
				setRole((EObject)newValue);
				return;
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__MESSAGE:
				setMessage((EObject)newValue);
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
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__ROLE:
				setRole((EObject)null);
				return;
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__MESSAGE:
				setMessage((EObject)null);
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
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__ROLE:
				return role != null;
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR__MESSAGE:
				return message != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageInBufferExprImpl
